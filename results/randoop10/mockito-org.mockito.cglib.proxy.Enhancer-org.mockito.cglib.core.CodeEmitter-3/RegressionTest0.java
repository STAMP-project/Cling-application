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
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(0, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        org.mockito.cglib.proxy.Callback callback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray2, callback3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
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
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray1 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks(class0, callbackArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray1);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
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
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = methodAdapter1.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation((int) '4', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
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
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs((int) (short) -1, 0);
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
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("", "", "", label5, label6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label3, label4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber((int) (short) -1, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
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
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
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
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) (byte) -1, "");
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
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber((int) (byte) 10, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("", 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
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
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(1, label3);
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
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature2 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type3, type4 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter0.begin_method(100, signature2, typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7abce8c4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.mockito.cglib.core.AbstractClassGenerator abstractClassGenerator0 = org.mockito.cglib.core.AbstractClassGenerator.getCurrent();
        org.junit.Assert.assertNull(abstractClassGenerator0);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("V", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitInnerClass("", "", "V", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitSource("(VZVDDZ)V", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
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
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        boolean boolean10 = type7.equals((java.lang.Object) classVisitor8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        boolean boolean18 = type15.equals((java.lang.Object) classVisitor16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type6, type7, type11, type13, type14, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.declare_field((int) (byte) 0, "L752058665", type4, (java.lang.Object) typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "V" + "'", str12, "V");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(VZVDDZ)V" + "'", str20, "(VZVDDZ)V");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber((int) (short) 1, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray10 = new org.mockito.asm.Label[] { label6, label8, label9 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(153, (int) 'a', label4, labelArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1734118700" + "'", str5, "L1734118700");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L881097041" + "'", str7, "L881097041");
        org.junit.Assert.assertNotNull(labelArray10);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        java.lang.Object[] objArray9 = new java.lang.Object[] { type4, 10L, (short) -1, type7 };
        java.lang.Object[] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) (short) 10, 2, objArray9, 157, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "V" + "'", str8, "V");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Z, 10, -1, V]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Z, 10, -1, V]");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn(0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@33c70215");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(6, "Z", "L752058665", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(VZVDDZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type6, type10, type12, type13, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) (byte) 100, 157, (java.lang.Object[]) typeArray18, 0, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V" + "'", str11, "V");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(VZVDDZ)V" + "'", str19, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, -1, -1]");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber((int) (byte) 10, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1899822928" + "'", str4, "L1899822928");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
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
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] { label5, label7, label9, label11 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(157, 126, label4, labelArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L252375957" + "'", str6, "L252375957");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L337651455" + "'", str8, "L337651455");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L387527006" + "'", str10, "L387527006");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1208060347" + "'", str12, "L1208060347");
        org.junit.Assert.assertNotNull(labelArray13);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation(8, "(VZVDDZ)V", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation((int) (short) 100, "double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(0, "L1504852975", "L752058665", "L1504852975", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label10.info = label12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label16.info = label18;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.String str21 = label20.toString();
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] { label8, label12, label14, label18, label20 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn((int) 'a', 108, label4, labelArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1642977481" + "'", str5, "L1642977481");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L769030183" + "'", str9, "L769030183");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L161018610" + "'", str11, "L161018610");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L618928163" + "'", str15, "L618928163");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L725657574" + "'", str17, "L725657574");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L894035433" + "'", str21, "L894035433");
        org.junit.Assert.assertNotNull(labelArray22);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classAdapter1.visitMethod(100, "V", "L752058665", "(VZVDDZ)V", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = methodAdapter1.visitAnnotation("L1504852975", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs(8, (int) (byte) 0);
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
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type6, type10, type12, type13, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        int int25 = type23.getSort();
        java.lang.String str26 = type23.getClassName();
        org.mockito.asm.ClassVisitor classVisitor28 = null;
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter(classVisitor28);
        java.lang.Class<?> wildcardClass30 = classAdapter29.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        java.lang.Object[] objArray34 = new java.lang.Object[] { type21, str26, 157, str32, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) (short) 1, 0, (java.lang.Object[]) typeArray18, (int) (short) -1, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V" + "'", str11, "V");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(VZVDDZ)V" + "'", str19, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "double" + "'", str26, "double");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str31, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str32, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[B, double, 157, org/mockito/asm/ClassAdapter, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[B, double, 157, org/mockito/asm/ClassAdapter, a]");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label5.info = label7;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label9.info = label11;
        java.lang.Object[] objArray13 = new java.lang.Object[] { type2, (-1), label7, label9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = enhancer0.create(classArray1, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1754796466" + "'", str6, "L1754796466");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1329688967" + "'", str10, "L1329688967");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[Z, -1, L1631202560, L1329688967]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[Z, -1, L1631202560, L1329688967]");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = methodAdapter1.visitAnnotation("double", false);
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
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type6, type10, type12, type13, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        java.lang.Object[] objArray22 = new java.lang.Object[] { 126 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) ' ', (int) (short) 10, (java.lang.Object[]) typeArray18, 8, objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V" + "'", str11, "V");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(VZVDDZ)V" + "'", str19, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[126]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[126]");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(10, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(108);
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
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classAdapter2.visitField(112, "hi!", "(VZVDDZ)V", "", (java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "V" + "'", str8, "V");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation((int) 'a', "", true);
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
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type6, type10, type12, type13, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(1, (int) (short) 10, (java.lang.Object[]) typeArray18, (int) (byte) 1, objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V" + "'", str11, "V");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(VZVDDZ)V" + "'", str19, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type7);
        int int9 = type7.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter0.visitField(157, "L752058665", "", "double", (java.lang.Object) type7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) "(VZVDDZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.String str8 = label6.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.String str11 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("org/mockito/asm/ClassAdapter", "org/mockito/asm/ClassAdapter", "", label6, label9, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L53526689" + "'", str7, "L53526689");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L53526689" + "'", str8, "L53526689");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1623766607" + "'", str10, "L1623766607");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1623766607" + "'", str11, "L1623766607");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        java.lang.Class<?> wildcardClass9 = classAdapter8.getClass();
        boolean boolean10 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass9, wildcardClass13, wildcardClass17 };
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = enhancer0.create(classArray20, objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Label[] labelArray8 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn((int) (byte) 100, 104, label6, labelArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L284680089" + "'", str5, "L284680089");
        org.junit.Assert.assertNotNull(labelArray8);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        java.lang.Class<?> wildcardClass5 = classAdapter4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        java.lang.Class<?> wildcardClass15 = classAdapter14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        java.lang.Class<?> wildcardClass19 = classAdapter18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        java.lang.Class<?> wildcardClass24 = classAdapter23.getClass();
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        java.lang.Class<?> wildcardClass27 = classAdapter26.getClass();
        boolean boolean28 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass5, wildcardClass10, wildcardClass15, wildcardClass19, wildcardClass24, wildcardClass27 };
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str7, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str12, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str16, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str20, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str21, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(classArray29);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        java.lang.String str5 = label3.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(0, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L2124081430" + "'", str4, "L2124081430");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L2124081430" + "'", str5, "L2124081430");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        java.lang.Class<?> wildcardClass7 = classAdapter6.getClass();
        boolean boolean8 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        java.lang.Class<?> wildcardClass11 = classAdapter10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        java.lang.Class<?> wildcardClass15 = classAdapter14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        java.lang.Class<?> wildcardClass20 = classAdapter19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        java.lang.Class<?> wildcardClass25 = classAdapter24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass20, wildcardClass25 };
        org.mockito.cglib.proxy.Callback callback29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray28, callback29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str4, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str16, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str17, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str21, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str22, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str26, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str27, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(classArray28);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        int[] intArray7 = new int[] { 8, 100, '#' };
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label10.info = label12;
        org.mockito.asm.Label[] labelArray14 = new org.mockito.asm.Label[] { label8, label12 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray7, labelArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[8, 100, 35]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1268828835" + "'", str9, "L1268828835");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1700599417" + "'", str11, "L1700599417");
        org.junit.Assert.assertNotNull(labelArray14);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("hi!", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        boolean boolean7 = type4.equals((java.lang.Object) classVisitor5);
        int int9 = type4.getOpcode(116);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        enhancer10.setCallback(callback13);
        enhancer10.setSerialVersionUID((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.declare_field(156, "L752058665", type4, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 116 + "'", int9 == 116);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label6.info = label8;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("L752058665", "org/mockito/asm/ClassAdapter", "V", label8, label10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1142191036" + "'", str7, "L1142191036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1491302055" + "'", str11, "L1491302055");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type6, type10, type12, type13, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("L1504852975", type3, typeArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("org/mockito/asm/ClassAdapter", type1, typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V" + "'", str11, "V");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(VZVDDZ)V" + "'", str19, "(VZVDDZ)V");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) classAdapter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
            methodAdapter1.visitTypeInsn((int) ' ', "L1504852975");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(126, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visit((int) (short) -1, (int) (short) -1, "L1504852975", "L1504852975", "Z", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn((int) (short) 10, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField(6, "Z", "double", "hi!", (java.lang.Object) 157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField((int) (short) 10, "org/mockito/asm/ClassAdapter", "org/mockito/asm/ClassAdapter", "L1743707293", (java.lang.Object) "Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitVarInsn(1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor6 = classEmitter0.visitField((int) (short) 1, "Lorg/mockito/asm/ClassAdapter;", "(VZVDDZ)V", "(VZVDDZ)V", (java.lang.Object) 108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        java.lang.String str7 = label3.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label8.info = label10;
        java.lang.String str12 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label3, label8, "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L17241977" + "'", str4, "L17241977");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L17241977" + "'", str7, "L17241977");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1463301332" + "'", str9, "L1463301332");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1463301332" + "'", str12, "L1463301332");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn(156, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        enhancer1.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        java.lang.Class<?> wildcardClass6 = classAdapter5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        java.lang.Class<?> wildcardClass14 = classAdapter13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass6, wildcardClass10, wildcardClass14, wildcardClass18 };
        enhancer1.setInterfaces(classArray20);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str7, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str15, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(classArray20);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("V", 2);
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
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn((int) (byte) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        int int11 = type6.getOpcode(116);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        boolean boolean25 = type22.equals((java.lang.Object) classVisitor23);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type13, type14, type18, type20, type21, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("V", type6, typeArray26);
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) (byte) 10, (int) ' ', (java.lang.Object[]) typeArray26, 9, objArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 116 + "'", int11 == 116);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "V" + "'", str19, "V");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(VZVDDZ)V" + "'", str27, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
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
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.String str8 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("org/mockito/asm/ClassAdapter", "V", "L752058665", label5, label6, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L2127469268" + "'", str7, "L2127469268");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L2127469268" + "'", str8, "L2127469268");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn((int) (byte) 0, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn((-1), (int) (short) 100);
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
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber(96, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L636434768" + "'", str5, "L636434768");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        boolean boolean6 = type3.equals((java.lang.Object) classVisitor4);
        int int8 = type3.getOpcode(116);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        boolean boolean14 = type11.equals((java.lang.Object) classVisitor12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        boolean boolean22 = type19.equals((java.lang.Object) classVisitor20);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type10, type11, type15, type17, type18, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("V", type3, typeArray23);
        java.lang.String str26 = signature25.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        boolean boolean34 = type31.equals((java.lang.Object) classVisitor32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor40 = null;
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter(classVisitor40);
        boolean boolean42 = type39.equals((java.lang.Object) classVisitor40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type30, type31, type35, type37, type38, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L1504852975", type28, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter46 = classEmitter0.begin_method(100, signature25, typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2adeb0f5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 116 + "'", int8 == 116);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "V" + "'", str16, "V");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(VZVDDZ)V" + "'", str24, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(VZVDDZ)Z" + "'", str26, "(VZVDDZ)Z");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "V" + "'", str36, "V");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(VZVDDZ)V" + "'", str44, "(VZVDDZ)V");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 10.0f;
        int[] intArray7 = new int[] { (byte) 1 };
        org.mockito.asm.Label[] labelArray8 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLookupSwitchInsn(label3, intArray7, labelArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(labelArray8);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(158, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("org/mockito/asm/ClassAdapter", "L752058665");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        int int11 = type6.getOpcode(116);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        boolean boolean25 = type22.equals((java.lang.Object) classVisitor23);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type13, type14, type18, type20, type21, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("V", type6, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter29 = classEmitter0.begin_method((int) (byte) -1, signature4, typeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@552aa8f9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 116 + "'", int11 == 116);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "V" + "'", str19, "V");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(VZVDDZ)V" + "'", str27, "(VZVDDZ)V");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(2);
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
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer4.setCallback(callback7);
        enhancer4.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass11 = enhancer4.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass11 };
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass2, classArray12, list13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray12);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn((int) (byte) 1, "Lorg/mockito/asm/ClassAdapter;", "B", "L366761034");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter2.visitField(104, "org/mockito/asm/ClassAdapter", "L752058665", "org/mockito/asm/ClassAdapter", (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str12, "org/mockito/asm/ClassAdapter");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
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
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(158, "L366761034", "org/mockito/asm/ClassAdapter", "hi!", (java.lang.Object) 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        org.mockito.cglib.proxy.Callback[] callbackArray3 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbacks(callbackArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray3);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLabel(label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn((int) (short) 10, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
            methodAdapter1.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        boolean boolean12 = type9.equals((java.lang.Object) classVisitor10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        boolean boolean20 = type17.equals((java.lang.Object) classVisitor18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type8, type9, type13, type15, type16, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L1504852975", type6, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        boolean boolean29 = type26.equals((java.lang.Object) classVisitor27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        boolean boolean37 = type34.equals((java.lang.Object) classVisitor35);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25, type26, type30, type32, type33, type34 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray38);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter(classVisitor44);
        boolean boolean46 = type43.equals((java.lang.Object) classVisitor44);
        int int48 = type43.getOpcode(116);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor52 = null;
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter(classVisitor52);
        boolean boolean54 = type51.equals((java.lang.Object) classVisitor52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor60 = null;
        org.mockito.asm.ClassAdapter classAdapter61 = new org.mockito.asm.ClassAdapter(classVisitor60);
        boolean boolean62 = type59.equals((java.lang.Object) classVisitor60);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type50, type51, type55, type57, type58, type59 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("V", type43, typeArray63);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(156, 155, (java.lang.Object[]) typeArray38, (int) (short) 0, (java.lang.Object[]) typeArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(VZVDDZ)V" + "'", str22, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "V" + "'", str31, "V");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(VZVDDZ)V" + "'", str39, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(VZVDDZ)F" + "'", str40, "(VZVDDZ)F");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 116 + "'", int48 == 116);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "V" + "'", str56, "V");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(VZVDDZ)V" + "'", str64, "(VZVDDZ)V");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn((int) (short) -1, 2);
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
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Callback callback5 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray6 = new org.mockito.cglib.proxy.Callback[] { callback5 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass2, callbackArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.ClassAdapter is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str4, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(callbackArray6);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
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
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn(157, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("(VZVDDZ)V", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn(9, "L1504852975");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        java.lang.Class<?> wildcardClass9 = classAdapter8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass9, wildcardClass13, wildcardClass17, wildcardClass21 };
        enhancer4.setInterfaces(classArray23);
        org.mockito.cglib.proxy.Callback callback25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray23, callback25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str10, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(classArray23);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        boolean boolean12 = type9.equals((java.lang.Object) classVisitor10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        boolean boolean20 = type17.equals((java.lang.Object) classVisitor18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type8, type9, type13, type15, type16, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L1504852975", type6, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        boolean boolean29 = type26.equals((java.lang.Object) classVisitor27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        boolean boolean37 = type34.equals((java.lang.Object) classVisitor35);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25, type26, type30, type32, type33, type34 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter(classVisitor44);
        boolean boolean46 = type43.equals((java.lang.Object) classVisitor44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor52 = null;
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter(classVisitor52);
        boolean boolean54 = type51.equals((java.lang.Object) classVisitor52);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type42, type43, type47, type49, type50, type51 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray55);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class(156, 116, "(VZVDDZ)B", type6, typeArray55, "double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(VZVDDZ)V" + "'", str22, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "V" + "'", str31, "V");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(VZVDDZ)V" + "'", str39, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(VZVDDZ)F" + "'", str40, "(VZVDDZ)F");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "V" + "'", str48, "V");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(VZVDDZ)V" + "'", str56, "(VZVDDZ)V");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(5, (int) '#', "double", "(VZVDDZ)V", "(VZVDDZ)Z", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray7 = new java.lang.String[] { "(VZVDDZ)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classAdapter1.visitMethod((-1), "L1743707293", "L1504852975", "org/mockito/asm/ClassAdapter", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
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
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitAnnotation("B", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        org.mockito.cglib.proxy.Callback callback3 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray4 = new org.mockito.cglib.proxy.Callback[] { callback3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass2, callbackArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.ClassAdapter is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(callbackArray4);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn(156, "(VZVDDZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
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
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs(104, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
            methodAdapter2.visitVarInsn(0, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "V(VZVDDZ)Z" };
        java.lang.Object[] objArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(108, 155, objArray6, (int) (short) 100, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[V(VZVDDZ)Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[V(VZVDDZ)Z]");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn((int) (short) 0, "V", "hi!", "(VZVDDZ)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
            methodAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(3, "(VZVDDZ)Z", "(VZVDDZ)F", "B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
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
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.Object[] objArray4 = null;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        boolean boolean13 = type10.equals((java.lang.Object) classVisitor11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        boolean boolean21 = type18.equals((java.lang.Object) classVisitor19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type9, type10, type14, type16, type17, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("L1504852975", type7, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor28 = null;
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter(classVisitor28);
        boolean boolean30 = type27.equals((java.lang.Object) classVisitor28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter(classVisitor36);
        boolean boolean38 = type35.equals((java.lang.Object) classVisitor36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type26, type27, type31, type33, type34, type35 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(155, 9, objArray4, 8, (java.lang.Object[]) typeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(VZVDDZ)V" + "'", str23, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "V" + "'", str32, "V");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(VZVDDZ)V" + "'", str40, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(VZVDDZ)F" + "'", str41, "(VZVDDZ)F");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        java.lang.Class<?> wildcardClass9 = classAdapter8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str10, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str11, "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray6 = new java.lang.String[] { "Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classEmitter0.visitMethod(104, "L268445913", "boolean", "", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@bbd8de4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
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
            methodAdapter2.visitMethodInsn((int) (short) -1, "L1504852975", "boolean", "Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        boolean boolean7 = type4.equals((java.lang.Object) classVisitor5);
        java.lang.String str8 = type4.getDescriptor();
        java.lang.String str9 = type4.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.declare_field((int) (short) 1, "org/mockito/asm/ClassAdapter", type4, (java.lang.Object) type10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Z" + "'", str8, "Z");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V" + "'", str11, "V");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        java.lang.String str7 = label3.toString();
        java.lang.String str8 = label3.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber((int) (short) 0, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L567741810" + "'", str4, "L567741810");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L567741810" + "'", str7, "L567741810");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L567741810" + "'", str8, "L567741810");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(108, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn(2, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6ca704e1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray14 = new java.lang.String[] { "org/mockito/asm/ClassAdapter", "L366761034", "(VZVDDZ)Z", "org/mockito/asm/ClassAdapter", "(VZVDDZ)V", "double" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visit(8, (int) (byte) 10, "(VZVDDZ)F", "Z", "L752058665", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(116, "L268445913", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        enhancer5.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        enhancer5.setCallbackFilter(callbackFilter10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        enhancer12.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        java.lang.Class<?> wildcardClass25 = classAdapter24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        java.lang.Class<?> wildcardClass29 = classAdapter28.getClass();
        boolean boolean30 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass29);
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass17, wildcardClass21, wildcardClass25, wildcardClass29 };
        enhancer12.setInterfaces(classArray31);
        enhancer5.setInterfaces(classArray31);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter34 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray35 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray31, callbackFilter34, callbackArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str4, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str22, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str26, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(callbackArray35);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        boolean boolean10 = type7.equals((java.lang.Object) classVisitor8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        boolean boolean18 = type15.equals((java.lang.Object) classVisitor16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type6, type7, type11, type13, type14, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("L1504852975", type4, typeArray19);
        java.lang.String str22 = signature21.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        boolean boolean27 = type24.equals((java.lang.Object) classVisitor25);
        int int29 = type24.getOpcode(116);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor33 = null;
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter(classVisitor33);
        boolean boolean35 = type32.equals((java.lang.Object) classVisitor33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor41 = null;
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter(classVisitor41);
        boolean boolean43 = type40.equals((java.lang.Object) classVisitor41);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type31, type32, type36, type38, type39, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("V", type24, typeArray44);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter47 = classEmitter0.begin_method((int) (short) 0, signature21, typeArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@8596c0e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "V" + "'", str12, "V");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(VZVDDZ)V" + "'", str20, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1504852975(VZVDDZ)F" + "'", str22, "L1504852975(VZVDDZ)F");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 116 + "'", int29 == 116);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "V" + "'", str37, "V");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VZVDDZ)V" + "'", str45, "(VZVDDZ)V");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.String str6 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(157, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L293986144" + "'", str5, "L293986144");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L293986144" + "'", str6, "L293986144");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("", 112);
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
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(0, "I", "(VZVDDZ)Z", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        boolean boolean3 = type0.equals((java.lang.Object) classVisitor1);
        java.lang.String str4 = type0.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = type0.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        java.lang.Class<?> wildcardClass5 = classAdapter4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer9.setCallback(callback12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer9.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.proxy.Callback callback16 = null;
        enhancer9.setCallback(callback16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback21 = null;
        enhancer18.setCallback(callback21);
        enhancer18.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass25 = enhancer18.getClass();
        enhancer9.setSuperclass((java.lang.Class) wildcardClass25);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        java.lang.Class<?> wildcardClass29 = classAdapter28.getClass();
        boolean boolean30 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass29);
        boolean boolean31 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.ClassVisitor classVisitor33 = null;
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter(classVisitor33);
        java.lang.Class<?> wildcardClass35 = classAdapter34.getClass();
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter(classVisitor36);
        java.lang.Class<?> wildcardClass38 = classAdapter37.getClass();
        boolean boolean39 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass38);
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.Class[] classArray42 = new java.lang.Class[] { wildcardClass5, wildcardClass25, wildcardClass29, wildcardClass35, wildcardClass38 };
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str7, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str8, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(classArray42);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Callback callback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, callback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str4, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str5, "org/mockito/asm/ClassAdapter");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn((int) (short) 10, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(0, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray10 = new java.lang.String[] { "V" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter0.visitMethod(154, "org/mockito/asm/ClassAdapter", "", "V", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5165df33");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("Lorg/mockito/asm/ClassAdapter;", true);
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
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(6, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1097961902" + "'", str4, "L1097961902");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter1.visitParameterAnnotation(130, "(VZVDDZ)D", true);
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
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        boolean boolean9 = type6.equals((java.lang.Object) classVisitor7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type6, type10, type12, type13, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        java.lang.String str20 = type4.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (byte) 100, type23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter(classVisitor31);
        boolean boolean33 = type30.equals((java.lang.Object) classVisitor31);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor39 = null;
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter(classVisitor39);
        boolean boolean41 = type38.equals((java.lang.Object) classVisitor39);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type29, type30, type34, type36, type37, type38 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("L1504852975", type27, typeArray42);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray42);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray42);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor51 = null;
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter(classVisitor51);
        boolean boolean53 = type50.equals((java.lang.Object) classVisitor51);
        int int55 = type50.getOpcode(116);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor59 = null;
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter(classVisitor59);
        boolean boolean61 = type58.equals((java.lang.Object) classVisitor59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor67 = null;
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter(classVisitor67);
        boolean boolean69 = type66.equals((java.lang.Object) classVisitor67);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type57, type58, type62, type64, type65, type66 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("V", type50, typeArray70);
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray70);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(112, (int) (byte) 100, (java.lang.Object[]) typeArray42, 126, (java.lang.Object[]) typeArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V" + "'", str11, "V");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(VZVDDZ)V" + "'", str19, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V" + "'", str20, "V");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "V" + "'", str35, "V");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(VZVDDZ)V" + "'", str43, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VZVDDZ)D" + "'", str45, "(VZVDDZ)D");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(VZVDDZ)V" + "'", str46, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 116 + "'", int55 == 116);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "V" + "'", str63, "V");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(VZVDDZ)V" + "'", str71, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(VZVDDZ)B" + "'", str73, "(VZVDDZ)B");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(108, "L752058665", "double", "(VZVDDZ)V", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6d8f0e7b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        boolean boolean10 = type7.equals((java.lang.Object) classVisitor8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        boolean boolean18 = type15.equals((java.lang.Object) classVisitor16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type6, type7, type11, type13, type14, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (byte) 100, type24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        boolean boolean34 = type31.equals((java.lang.Object) classVisitor32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor40 = null;
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter(classVisitor40);
        boolean boolean42 = type39.equals((java.lang.Object) classVisitor40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type30, type31, type35, type37, type38, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L1504852975", type28, typeArray43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame((int) '#', (int) (short) 1, (java.lang.Object[]) typeArray19, 154, (java.lang.Object[]) typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "V" + "'", str12, "V");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(VZVDDZ)V" + "'", str20, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "V" + "'", str36, "V");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(VZVDDZ)V" + "'", str44, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(VZVDDZ)D" + "'", str46, "(VZVDDZ)D");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation(0, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.String str3 = label2.toString();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label2.info = label4;
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label6.info = label8;
        java.lang.String str10 = label6.toString();
        java.lang.String str11 = label6.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.String str14 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label4, label6, label12, "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L318566287" + "'", str3, "L318566287");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L708164185" + "'", str7, "L708164185");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L708164185" + "'", str10, "L708164185");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L708164185" + "'", str11, "L708164185");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L685366367" + "'", str13, "L685366367");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L685366367" + "'", str14, "L685366367");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L752058665");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray13 = new java.lang.String[] { "double", "(VZVDDZ)V", "I", "V", "L366761034", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visit(8, 155, "boolean", "L752058665", "(VZVDDZ)F", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn((int) 'a', 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        java.lang.Class<?> wildcardClass5 = classAdapter4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        java.lang.Class<?> wildcardClass9 = classAdapter8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass5, wildcardClass9, wildcardClass13, wildcardClass17 };
        enhancer0.setInterfaces(classArray19);
        boolean boolean21 = enhancer0.getUseCache();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str10, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo24);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        boolean boolean8 = type5.equals((java.lang.Object) classVisitor6);
        int int10 = type5.getOpcode(116);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        boolean boolean16 = type13.equals((java.lang.Object) classVisitor14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        boolean boolean24 = type21.equals((java.lang.Object) classVisitor22);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type12, type13, type17, type19, type20, type21 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("V", type5, typeArray25);
        java.lang.String str28 = signature27.getDescriptor();
        java.lang.String str29 = signature27.getName();
        java.lang.String str30 = signature27.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter(classVisitor34);
        boolean boolean36 = type33.equals((java.lang.Object) classVisitor34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor42 = null;
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter(classVisitor42);
        boolean boolean44 = type41.equals((java.lang.Object) classVisitor42);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type32, type33, type37, type39, type40, type41 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray45);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter47 = classEmitter0.begin_method(116, signature27, typeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@f2bf56");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 116 + "'", int10 == 116);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "V" + "'", str18, "V");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(VZVDDZ)V" + "'", str26, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(VZVDDZ)Z" + "'", str28, "(VZVDDZ)Z");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "V" + "'", str29, "V");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "V(VZVDDZ)Z" + "'", str30, "V(VZVDDZ)Z");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "V" + "'", str38, "V");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(VZVDDZ)V" + "'", str46, "(VZVDDZ)V");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(96, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L266051057" + "'", str4, "L266051057");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        java.lang.Class<?> wildcardClass5 = classAdapter4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        java.lang.Class<?> wildcardClass15 = classAdapter14.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass5, wildcardClass7, wildcardClass10, wildcardClass15, wildcardClass18, wildcardClass21 };
        org.mockito.cglib.proxy.Callback callback23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray22, callback23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str12, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray22);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        boolean boolean10 = type7.equals((java.lang.Object) classVisitor8);
        int int12 = type7.getOpcode(116);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        boolean boolean18 = type15.equals((java.lang.Object) classVisitor16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        boolean boolean26 = type23.equals((java.lang.Object) classVisitor24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type14, type15, type19, type21, type22, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("V", type7, typeArray27);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray27);
        org.mockito.asm.MethodVisitor methodVisitor31 = null;
        org.mockito.asm.MethodAdapter methodAdapter32 = new org.mockito.asm.MethodAdapter(methodVisitor31);
        org.mockito.asm.MethodAdapter methodAdapter33 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter32);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.declare_field((int) (short) 100, "(VZVDDZ)V", type5, (java.lang.Object) methodAdapter33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 116 + "'", int12 == 116);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V" + "'", str20, "V");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(VZVDDZ)V" + "'", str28, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VZVDDZ)B" + "'", str30, "(VZVDDZ)B");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer9.setCallback(callback12);
        enhancer9.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass16 = enhancer9.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class18 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor7);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
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
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer2.setCallback(callback5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer2.setCallback(callback7);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer2.getStrategy();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        boolean boolean11 = generatorStrategy9.equals((java.lang.Object) label10);
        int[] intArray14 = new int[] { 7, 100 };
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 10.0f;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 10.0f;
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback24 = null;
        enhancer21.setCallback(callback24);
        org.mockito.cglib.proxy.Callback callback26 = null;
        enhancer21.setCallback(callback26);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer21.getStrategy();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        boolean boolean30 = generatorStrategy28.equals((java.lang.Object) label29);
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.String str32 = label31.toString();
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        label31.info = label33;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.String str36 = label35.toString();
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        label35.info = label37;
        java.lang.String str39 = label35.toString();
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        label40.info = 10.0f;
        org.mockito.asm.Label[] labelArray43 = new org.mockito.asm.Label[] { label15, label18, label29, label31, label35, label40 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label10, intArray14, labelArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[7, 100]");
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1523413931" + "'", str32, "L1523413931");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1138740558" + "'", str36, "L1138740558");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L1138740558" + "'", str39, "L1138740558");
        org.junit.Assert.assertNotNull(labelArray43);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(100, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L747026709" + "'", str5, "L747026709");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        java.lang.Class<?> wildcardClass9 = classAdapter8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass9, wildcardClass13, wildcardClass17, wildcardClass21 };
        enhancer4.setInterfaces(classArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor28 = null;
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter(classVisitor28);
        boolean boolean30 = type27.equals((java.lang.Object) classVisitor28);
        int int32 = type27.getOpcode(116);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter(classVisitor36);
        boolean boolean38 = type35.equals((java.lang.Object) classVisitor36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter(classVisitor44);
        boolean boolean46 = type43.equals((java.lang.Object) classVisitor44);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type34, type35, type39, type41, type42, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("V", type27, typeArray47);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(126, 100, (java.lang.Object[]) classArray23, 0, (java.lang.Object[]) typeArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str10, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 116 + "'", int32 == 116);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "V" + "'", str40, "V");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(VZVDDZ)V" + "'", str48, "(VZVDDZ)V");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor6 = classEmitter0.visitField(157, "L1743707293", "L366761034", "(VZVDDZ)V", (java.lang.Object) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = label2.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L452970948" + "'", str1, "L452970948");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) classInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit(0, 7, "boolean", "L1504852975(VZVDDZ)F", "double", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(0, "V", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn((int) (short) -1, "L752058665", "I", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
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
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type8);
        label3.info = 0;
        int[] intArray13 = new int[] { 155, 155 };
        org.mockito.asm.Label[] labelArray14 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLookupSwitchInsn(label3, intArray13, labelArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L740546474" + "'", str4, "L740546474");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[155, 155]");
        org.junit.Assert.assertNotNull(labelArray14);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        enhancer3.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        java.lang.Class<?> wildcardClass8 = classAdapter7.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        java.lang.Class<?> wildcardClass12 = classAdapter11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        java.lang.Class<?> wildcardClass16 = classAdapter15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        java.lang.Class<?> wildcardClass20 = classAdapter19.getClass();
        boolean boolean21 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass8, wildcardClass12, wildcardClass16, wildcardClass20 };
        enhancer3.setInterfaces(classArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        boolean boolean29 = type26.equals((java.lang.Object) classVisitor27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        boolean boolean37 = type34.equals((java.lang.Object) classVisitor35);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25, type26, type30, type32, type33, type34 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        java.lang.String str40 = type24.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) (byte) 100, type43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor51 = null;
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter(classVisitor51);
        boolean boolean53 = type50.equals((java.lang.Object) classVisitor51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor59 = null;
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter(classVisitor59);
        boolean boolean61 = type58.equals((java.lang.Object) classVisitor59);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type49, type50, type54, type56, type57, type58 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("L1504852975", type47, typeArray62);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray62);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = enhancer0.create(classArray22, (java.lang.Object[]) typeArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str9, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str13, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str17, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "V" + "'", str31, "V");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(VZVDDZ)V" + "'", str39, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "V" + "'", str40, "V");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "V" + "'", str55, "V");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(VZVDDZ)V" + "'", str63, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(VZVDDZ)D" + "'", str65, "(VZVDDZ)D");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(VZVDDZ)V" + "'", str66, "(VZVDDZ)V");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("L1504852975(VZVDDZ)F", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/ClassAdapter");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        label4.info = 0;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitJumpInsn(155, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1131716836" + "'", str5, "L1131716836");
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        java.lang.Class<?> wildcardClass14 = classAdapter13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        java.lang.Class<?> wildcardClass22 = classAdapter21.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass10, wildcardClass14, wildcardClass18, wildcardClass22 };
        enhancer5.setInterfaces(classArray24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(0, type29);
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((int) (byte) 100, type29);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor37 = null;
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter(classVisitor37);
        boolean boolean39 = type36.equals((java.lang.Object) classVisitor37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor45 = null;
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter(classVisitor45);
        boolean boolean47 = type44.equals((java.lang.Object) classVisitor45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type35, type36, type40, type42, type43, type44 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("L1504852975", type33, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray48);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame((int) (short) -1, 112, (java.lang.Object[]) classArray24, 0, (java.lang.Object[]) typeArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str15, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "V" + "'", str41, "V");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(VZVDDZ)V" + "'", str49, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(VZVDDZ)D" + "'", str51, "(VZVDDZ)D");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1db39c73");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        boolean boolean10 = type7.equals((java.lang.Object) classVisitor8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        boolean boolean18 = type15.equals((java.lang.Object) classVisitor16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type6, type7, type11, type13, type14, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        boolean boolean26 = type23.equals((java.lang.Object) classVisitor24);
        int int28 = type23.getOpcode(116);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        boolean boolean34 = type31.equals((java.lang.Object) classVisitor32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor40 = null;
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter(classVisitor40);
        boolean boolean42 = type39.equals((java.lang.Object) classVisitor40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type30, type31, type35, type37, type38, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("V", type23, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(112, 5, (java.lang.Object[]) typeArray19, (int) ' ', (java.lang.Object[]) typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "V" + "'", str12, "V");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(VZVDDZ)V" + "'", str20, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 116 + "'", int28 == 116);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "V" + "'", str36, "V");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(VZVDDZ)V" + "'", str44, "(VZVDDZ)V");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        boolean boolean11 = type8.equals((java.lang.Object) classVisitor9);
        int int13 = type8.getOpcode(116);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        boolean boolean19 = type16.equals((java.lang.Object) classVisitor17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        boolean boolean27 = type24.equals((java.lang.Object) classVisitor25);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type15, type16, type20, type22, type23, type24 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("V", type8, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        boolean boolean37 = type34.equals((java.lang.Object) classVisitor35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor43 = null;
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter(classVisitor43);
        boolean boolean45 = type42.equals((java.lang.Object) classVisitor43);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type33, type34, type38, type40, type41, type42 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter48 = classEmitter0.begin_method(7, signature31, typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@58fbe8c6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 116 + "'", int13 == 116);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "V" + "'", str21, "V");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(VZVDDZ)V" + "'", str29, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "V" + "'", str39, "V");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(VZVDDZ)V" + "'", str47, "(VZVDDZ)V");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L1743707293", "boolean", "L2099206551" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visit(5, 154, "(VZVDDZ)V", "org/mockito/asm/ClassAdapter", "L1504852975(VZVDDZ)F", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn((int) (short) 100, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(10, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        java.lang.Class<?> wildcardClass7 = classAdapter6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        java.lang.Class<?> wildcardClass11 = classAdapter10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        java.lang.Class<?> wildcardClass15 = classAdapter14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        java.lang.Class<?> wildcardClass19 = classAdapter18.getClass();
        boolean boolean20 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        java.lang.Class[] classArray21 = new java.lang.Class[] { wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19 };
        enhancer2.setInterfaces(classArray21);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter23 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray24 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass1, classArray21, callbackFilter23, callbackArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str8, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str12, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str16, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(callbackArray24);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        java.lang.String str8 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(96, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L840369400" + "'", str5, "L840369400");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L840369400" + "'", str8, "L840369400");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Callback[] callbackArray7 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbacks(callbackArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray7);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass2, callbackArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.ClassAdapter is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(callbackArray5);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn(3, "(VZVDDZ)F", "hi!", "(VZVDDZ)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(0, "Lorg/mockito/cglib/proxy/Enhancer;", "(VZVDDZ)V", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        boolean boolean8 = type5.equals((java.lang.Object) classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField((int) (short) 1, "Lorg/mockito/asm/ClassAdapter;", "V(VZVDDZ)Z", "L1504852975(VZVDDZ)F", (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn(0, "L2099206551", "V", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMultiANewArrayInsn("L752058665", 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer4.setCallback(callback7);
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer4.setCallback(callback9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer4.getStrategy();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        boolean boolean13 = generatorStrategy11.equals((java.lang.Object) label12);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitJumpInsn((int) (byte) 10, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type7);
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (byte) 100, type7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        boolean boolean25 = type22.equals((java.lang.Object) classVisitor23);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type13, type14, type18, type20, type21, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1504852975", type11, typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray26);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter(classVisitor36);
        boolean boolean38 = type35.equals((java.lang.Object) classVisitor36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter(classVisitor44);
        boolean boolean46 = type43.equals((java.lang.Object) classVisitor44);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type34, type35, type39, type41, type42, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("L1504852975", type32, typeArray47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor53 = null;
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter(classVisitor53);
        boolean boolean55 = type52.equals((java.lang.Object) classVisitor53);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor61 = null;
        org.mockito.asm.ClassAdapter classAdapter62 = new org.mockito.asm.ClassAdapter(classVisitor61);
        boolean boolean63 = type60.equals((java.lang.Object) classVisitor61);
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type51, type52, type56, type58, type59, type60 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray64);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(2, 0, (java.lang.Object[]) typeArray26, (int) (byte) 100, (java.lang.Object[]) typeArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "V" + "'", str19, "V");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(VZVDDZ)V" + "'", str27, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(VZVDDZ)D" + "'", str29, "(VZVDDZ)D");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "V" + "'", str40, "V");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(VZVDDZ)V" + "'", str48, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "V" + "'", str57, "V");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(VZVDDZ)V" + "'", str65, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(VZVDDZ)F" + "'", str66, "(VZVDDZ)F");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        boolean boolean12 = type9.equals((java.lang.Object) classVisitor10);
        int int14 = type9.getOpcode(116);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        boolean boolean20 = type17.equals((java.lang.Object) classVisitor18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        boolean boolean28 = type25.equals((java.lang.Object) classVisitor26);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type16, type17, type21, type23, type24, type25 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("V", type9, typeArray29);
        int int33 = type9.getOpcode((-1));
        int int35 = type9.getOpcode(100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor36 = classEmitter2.visitField(2, "V(VZVDDZ)Z", "Lorg/mockito/cglib/proxy/Enhancer;", "Z", (java.lang.Object) type9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 116 + "'", int14 == 116);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "V" + "'", str22, "V");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VZVDDZ)V" + "'", str30, "(VZVDDZ)V");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter1.visitParameterAnnotation(1, "void", true);
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
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Callback callback5 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray6 = new org.mockito.cglib.proxy.Callback[] { callback5 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass2, callbackArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.ClassAdapter is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str4, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(callbackArray6);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        java.lang.String str8 = label4.toString();
        java.lang.String str9 = label4.toString();
        org.mockito.asm.Label[] labelArray10 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(154, (int) '4', label4, labelArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L901252969" + "'", str5, "L901252969");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L901252969" + "'", str8, "L901252969");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L901252969" + "'", str9, "L901252969");
        org.junit.Assert.assertNotNull(labelArray10);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer2.setCallback(callback5);
        enhancer2.setAttemptLoad(false);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) enhancer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(100, "L752058665", "V", "(VZVDDZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitAnnotation("(VZVDDZ)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        java.lang.Class<?> wildcardClass3 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        enhancer4.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Callback callback9 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray10 = new org.mockito.cglib.proxy.Callback[] { callback9 };
        enhancer4.setCallbacks(callbackArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass3, callbackArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(callbackArray10);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
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
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
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
            methodAdapter1.visitIincInsn((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        java.lang.String str8 = label4.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTryCatchBlock(label3, label4, label9, "(VZVDDZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1384217838" + "'", str5, "L1384217838");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1384217838" + "'", str8, "L1384217838");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1771251701" + "'", str10, "L1771251701");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(112, "L2099206551", "(VZVDDZ)D", "L366761034");
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
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.Class[] classArray6 = null;
        org.mockito.cglib.proxy.CallbackFilter callbackFilter7 = null;
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setUseFactory(true);
        enhancer8.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer8.setCallbacks(callbackArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray6, callbackFilter7, callbackArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str4, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str5, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(callbackArray14);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("org/mockito/asm/ClassAdapter", "L752058665");
        org.mockito.cglib.core.Predicate predicate15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = namingPolicy9.getClassName("Z", "", (java.lang.Object) "L752058665", predicate15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy9);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter7.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn((int) (short) -1, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = classEmitter0.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label0.info = label2;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        boolean boolean11 = type8.equals((java.lang.Object) classVisitor9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        boolean boolean19 = type16.equals((java.lang.Object) classVisitor17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type7, type8, type12, type14, type15, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L1504852975", type5, typeArray20);
        label2.info = type5;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = label2.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L47925548" + "'", str1, "L47925548");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "V" + "'", str13, "V");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(VZVDDZ)V" + "'", str21, "(VZVDDZ)V");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass7 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        java.lang.Class<?> wildcardClass25 = classAdapter24.getClass();
        boolean boolean26 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass13, wildcardClass17, wildcardClass21, wildcardClass25 };
        enhancer8.setInterfaces(classArray27);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter29 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray30 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass7, classArray27, callbackFilter29, callbackArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str22, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(callbackArray30);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        enhancer5.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        java.lang.Class<?> wildcardClass15 = classAdapter14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        java.lang.Class<?> wildcardClass19 = classAdapter18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        java.lang.Class<?> wildcardClass23 = classAdapter22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        java.lang.Class<?> wildcardClass27 = classAdapter26.getClass();
        boolean boolean28 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass15, wildcardClass19, wildcardClass23, wildcardClass27 };
        enhancer10.setInterfaces(classArray29);
        enhancer5.setInterfaces(classArray29);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str16, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str20, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str24, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(classArray29);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setUseFactory(true);
        enhancer6.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter11 = null;
        enhancer6.setCallbackFilter(callbackFilter11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        java.lang.Class<?> wildcardClass22 = classAdapter21.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        java.lang.Class<?> wildcardClass26 = classAdapter25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.asm.ClassVisitor classVisitor28 = null;
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter(classVisitor28);
        java.lang.Class<?> wildcardClass30 = classAdapter29.getClass();
        boolean boolean31 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass30);
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass18, wildcardClass22, wildcardClass26, wildcardClass30 };
        enhancer13.setInterfaces(classArray32);
        enhancer6.setInterfaces(classArray32);
        org.mockito.cglib.proxy.Callback callback35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray32, callback35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str23, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str27, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(classArray32);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        boolean boolean11 = type8.equals((java.lang.Object) classVisitor9);
        int int13 = type8.getOpcode(116);
        boolean boolean14 = generatorStrategy7.equals((java.lang.Object) 116);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer15.setCallback(callback18);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter20 = null;
        enhancer15.setCallbackFilter(callbackFilter20);
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer15.setCallback(callback22);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) enhancer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 116 + "'", int13 == 116);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        int[] intArray9 = new int[] { 2, 112 };
        org.mockito.asm.Label[] labelArray10 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label5, intArray9, labelArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L90947575" + "'", str4, "L90947575");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2, 112]");
        org.junit.Assert.assertNotNull(labelArray10);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer4.setCallback(callback7);
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer4.setCallback(callback9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer4.getStrategy();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        boolean boolean13 = generatorStrategy11.equals((java.lang.Object) label12);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber((int) (byte) -1, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        java.lang.Class<?> wildcardClass14 = classAdapter13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        java.lang.Class<?> wildcardClass22 = classAdapter21.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass10, wildcardClass14, wildcardClass18, wildcardClass22 };
        enhancer5.setInterfaces(classArray24);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        enhancer27.setUseFactory(true);
        enhancer27.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        enhancer32.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        java.lang.Class<?> wildcardClass37 = classAdapter36.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        org.mockito.asm.ClassVisitor classVisitor39 = null;
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter(classVisitor39);
        java.lang.Class<?> wildcardClass41 = classAdapter40.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        org.mockito.asm.ClassVisitor classVisitor43 = null;
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter(classVisitor43);
        java.lang.Class<?> wildcardClass45 = classAdapter44.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass45);
        org.mockito.asm.ClassVisitor classVisitor47 = null;
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter(classVisitor47);
        java.lang.Class<?> wildcardClass49 = classAdapter48.getClass();
        boolean boolean50 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass49);
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass37, wildcardClass41, wildcardClass45, wildcardClass49 };
        enhancer32.setInterfaces(classArray51);
        enhancer27.setInterfaces(classArray51);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(158, 155, (java.lang.Object[]) classArray24, (int) (byte) 100, (java.lang.Object[]) classArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str15, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str38, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str42, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str46, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(classArray51);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        boolean boolean11 = type8.equals((java.lang.Object) classVisitor9);
        int int13 = type8.getOpcode(116);
        boolean boolean14 = generatorStrategy7.equals((java.lang.Object) 116);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer15.setCallback(callback18);
        enhancer15.setAttemptLoad(false);
        boolean boolean22 = enhancer15.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) enhancer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 116 + "'", int13 == 116);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label6.info = label8;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        boolean boolean25 = type22.equals((java.lang.Object) classVisitor23);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type13, type14, type18, type20, type21, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1504852975", type11, typeArray26);
        label8.info = type11;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        label30.info = label32;
        java.lang.String str34 = label30.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("(VZVDDZ)B", "", "(VZVDDZ)F", label8, label30, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L16607011" + "'", str7, "L16607011");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "V" + "'", str19, "V");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(VZVDDZ)V" + "'", str27, "(VZVDDZ)V");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1129251352" + "'", str31, "L1129251352");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1129251352" + "'", str34, "L1129251352");
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
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("I", true);
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
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        boolean boolean14 = type11.equals((java.lang.Object) classVisitor12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        boolean boolean22 = type19.equals((java.lang.Object) classVisitor20);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type10, type11, type15, type17, type18, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("L1504852975", type8, typeArray23);
        label5.info = type8;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1535970033" + "'", str4, "L1535970033");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "V" + "'", str16, "V");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(VZVDDZ)V" + "'", str24, "(VZVDDZ)V");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label6.info = label8;
        java.lang.String str10 = label6.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 10.0f;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("org/mockito/asm/ClassAdapter", "L366761034", "double", label6, label11, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1983865342" + "'", str7, "L1983865342");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1983865342" + "'", str10, "L1983865342");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label5.info = label7;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type10);
        label5.info = 0;
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTableSwitchInsn(4, 112, label5, labelArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L487518925" + "'", str6, "L487518925");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(labelArray13);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        enhancer4.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        enhancer9.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        java.lang.Class<?> wildcardClass14 = classAdapter13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        java.lang.Class<?> wildcardClass22 = classAdapter21.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        java.lang.Class<?> wildcardClass26 = classAdapter25.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass14, wildcardClass18, wildcardClass22, wildcardClass26 };
        enhancer9.setInterfaces(classArray28);
        enhancer4.setInterfaces(classArray28);
        org.mockito.cglib.proxy.Callback callback31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray28, callback31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str15, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str23, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(classArray28);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        boolean boolean14 = type11.equals((java.lang.Object) classVisitor12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        boolean boolean22 = type19.equals((java.lang.Object) classVisitor20);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type10, type11, type15, type17, type18, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("L1504852975", type8, typeArray23);
        label5.info = type8;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.String str28 = label27.toString();
        java.lang.Object obj29 = label27.info;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        label30.info = label32;
        java.lang.String str34 = label30.toString();
        java.lang.String str35 = label30.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTryCatchBlock(label5, label27, label30, "L752058665");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L142275428" + "'", str4, "L142275428");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "V" + "'", str16, "V");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(VZVDDZ)V" + "'", str24, "(VZVDDZ)V");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L724327110" + "'", str28, "L724327110");
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1392883164" + "'", str31, "L1392883164");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1392883164" + "'", str34, "L1392883164");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1392883164" + "'", str35, "L1392883164");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer7.setCallback(callback10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer7.setCallbackFilter(callbackFilter12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer7.setCallback(callback14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setUseFactory(true);
        enhancer18.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        enhancer23.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        java.lang.Class<?> wildcardClass28 = classAdapter27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        java.lang.Class<?> wildcardClass32 = classAdapter31.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter(classVisitor34);
        java.lang.Class<?> wildcardClass36 = classAdapter35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        org.mockito.asm.ClassVisitor classVisitor38 = null;
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter(classVisitor38);
        java.lang.Class<?> wildcardClass40 = classAdapter39.getClass();
        boolean boolean41 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray42 = new java.lang.Class[] { wildcardClass28, wildcardClass32, wildcardClass36, wildcardClass40 };
        enhancer23.setInterfaces(classArray42);
        enhancer18.setInterfaces(classArray42);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str29, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str33, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str37, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(classArray42);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(104, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(10, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        boolean boolean3 = type0.equals((java.lang.Object) classVisitor1);
        int int5 = type0.getOpcode(116);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = type0.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 116 + "'", int5 == 116);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        java.lang.Class<?> wildcardClass5 = classAdapter4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        java.lang.Class<?> wildcardClass9 = classAdapter8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass5, wildcardClass9, wildcardClass13, wildcardClass17 };
        enhancer0.setInterfaces(classArray19);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        java.lang.Class<?> wildcardClass23 = classAdapter22.getClass();
        boolean boolean24 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass23);
        boolean boolean25 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str10, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNull(classInfo29);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn((int) 'a', 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        boolean boolean14 = type11.equals((java.lang.Object) classVisitor12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        boolean boolean22 = type19.equals((java.lang.Object) classVisitor20);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type10, type11, type15, type17, type18, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("L1504852975", type8, typeArray23);
        label5.info = type8;
        int[] intArray27 = null;
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label5, intArray27, labelArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1341829111" + "'", str4, "L1341829111");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "V" + "'", str16, "V");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(VZVDDZ)V" + "'", str24, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(labelArray28);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        label4.info = 0;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] { label12 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(130, 5, label4, labelArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1666276988" + "'", str5, "L1666276988");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(labelArray13);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.Predicate predicate13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = namingPolicy9.getClassName("Lorg/mockito/asm/ClassAdapter;", "L2099206551", (java.lang.Object) 100, predicate13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy9);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(116, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1896746537" + "'", str5, "L1896746537");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber(0, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1271087438" + "'", str5, "L1271087438");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
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
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType("Lorg/mockito/asm/ClassAdapter;");
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) type3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@31060d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(124, "org/mockito/asm/ClassAdapter", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label10.info = label12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 10.0f;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.String str19 = label18.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.String str21 = label20.toString();
        java.lang.Object obj22 = label20.info;
        org.mockito.asm.Label[] labelArray23 = new org.mockito.asm.Label[] { label8, label12, label14, label15, label18, label20 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn((int) (short) 10, 6, label4, labelArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1726647553" + "'", str5, "L1726647553");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L407919823" + "'", str9, "L407919823");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L321619374" + "'", str11, "L321619374");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L731935633" + "'", str19, "L731935633");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L428892513" + "'", str21, "L428892513");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(labelArray23);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
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
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L268445913");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "(VZVDDZ)Z", "Z", "L2099206551" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter0.visitMethod((-1), "L752058665", "(VZVDDZ)B", "boolean", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7531afb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer9.setCallback(callback12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer9.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.proxy.Callback callback16 = null;
        enhancer9.setCallback(callback16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback21 = null;
        enhancer18.setCallback(callback21);
        enhancer18.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass25 = enhancer18.getClass();
        enhancer9.setSuperclass((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        java.lang.Class<?> wildcardClass32 = classAdapter31.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter(classVisitor36);
        java.lang.Class<?> wildcardClass38 = classAdapter37.getClass();
        boolean boolean39 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass38);
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.ClassVisitor classVisitor43 = null;
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter(classVisitor43);
        java.lang.Class<?> wildcardClass45 = classAdapter44.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass45);
        org.mockito.asm.ClassVisitor classVisitor47 = null;
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter(classVisitor47);
        java.lang.Class<?> wildcardClass49 = classAdapter48.getClass();
        boolean boolean50 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass49);
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass25, wildcardClass29, wildcardClass32, wildcardClass38, wildcardClass45, wildcardClass49 };
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        enhancer52.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor55 = null;
        org.mockito.asm.ClassAdapter classAdapter56 = new org.mockito.asm.ClassAdapter(classVisitor55);
        java.lang.Class<?> wildcardClass57 = classAdapter56.getClass();
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass57);
        org.mockito.asm.ClassVisitor classVisitor59 = null;
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter(classVisitor59);
        java.lang.Class<?> wildcardClass61 = classAdapter60.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        org.mockito.asm.ClassVisitor classVisitor63 = null;
        org.mockito.asm.ClassAdapter classAdapter64 = new org.mockito.asm.ClassAdapter(classVisitor63);
        java.lang.Class<?> wildcardClass65 = classAdapter64.getClass();
        java.lang.String str66 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass65);
        org.mockito.asm.ClassVisitor classVisitor67 = null;
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter(classVisitor67);
        java.lang.Class<?> wildcardClass69 = classAdapter68.getClass();
        boolean boolean70 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass69);
        java.lang.Class[] classArray71 = new java.lang.Class[] { wildcardClass57, wildcardClass61, wildcardClass65, wildcardClass69 };
        enhancer52.setInterfaces(classArray71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = enhancer0.create(classArray51, (java.lang.Object[]) classArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str27, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str33, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str34, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str35, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str46, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str58, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str62, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str66, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(classArray71);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        boolean boolean19 = type16.equals((java.lang.Object) classVisitor17);
        int int21 = type16.getOpcode(116);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        boolean boolean27 = type24.equals((java.lang.Object) classVisitor25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor33 = null;
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter(classVisitor33);
        boolean boolean35 = type32.equals((java.lang.Object) classVisitor33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type23, type24, type28, type30, type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("V", type16, typeArray36);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.begin_class(153, (int) 'a', "(VZVDDZ)D", type13, typeArray36, "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 116 + "'", int21 == 116);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "V" + "'", str29, "V");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(VZVDDZ)V" + "'", str37, "(VZVDDZ)V");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn((int) (short) 0, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        boolean boolean4 = type1.equals((java.lang.Object) classVisitor2);
        int int6 = type1.getOpcode(116);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        boolean boolean12 = type9.equals((java.lang.Object) classVisitor10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        boolean boolean20 = type17.equals((java.lang.Object) classVisitor18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type8, type9, type13, type15, type16, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("V", type1, typeArray21);
        int int25 = type1.getOpcode((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = type1.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 116 + "'", int6 == 116);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(VZVDDZ)V" + "'", str22, "(VZVDDZ)V");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        java.lang.Class<?> wildcardClass6 = classAdapter5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs(96, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("(VZVDDZ)Z", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(5, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor3 = methodAdapter2.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L721774646");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type8);
        label3.info = 0;
        int[] intArray14 = new int[] { 5, 5, (short) 1 };
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 10.0f;
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] { label15 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray14, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L658614395" + "'", str4, "L658614395");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[5, 5, 1]");
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("L2099206551", "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass7 = enhancer0.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.cglib.proxy.Callback[] callbackArray9 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass7, callbackArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str8, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(callbackArray9);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn((int) '4', "L1992969913", "void", "(VZVDDZ)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setUseFactory(true);
        enhancer14.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        java.lang.Class<?> wildcardClass24 = classAdapter23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        java.lang.Class<?> wildcardClass28 = classAdapter27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        java.lang.Class<?> wildcardClass32 = classAdapter31.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter(classVisitor34);
        java.lang.Class<?> wildcardClass36 = classAdapter35.getClass();
        boolean boolean37 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass36);
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass24, wildcardClass28, wildcardClass32, wildcardClass36 };
        enhancer19.setInterfaces(classArray38);
        enhancer14.setInterfaces(classArray38);
        org.mockito.asm.ClassVisitor classVisitor41 = null;
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter(classVisitor41);
        java.lang.Class<?> wildcardClass43 = classAdapter42.getClass();
        java.lang.String str44 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        java.lang.String str45 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass43);
        org.mockito.asm.ClassVisitor classVisitor46 = null;
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter(classVisitor46);
        java.lang.Class<?> wildcardClass48 = classAdapter47.getClass();
        boolean boolean49 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        boolean boolean50 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass43, wildcardClass48 };
        enhancer14.setInterfaces(classArray51);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor53 = classEmitter7.visitField((int) ' ', "(VZVDDZ)Z", "V(VZVDDZ)Z", "L721774646", (java.lang.Object) classArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str25, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str29, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str33, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str44, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str45, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(classArray51);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(1, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.String str3 = label2.toString();
        int[] intArray9 = new int[] { ' ', 'a', 154, 10, 126 };
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 10.0f;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.String str18 = label17.toString();
        java.lang.Object obj19 = label17.info;
        org.mockito.asm.Label[] labelArray20 = new org.mockito.asm.Label[] { label10, label12, label14, label17 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label2, intArray9, labelArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L311865137" + "'", str3, "L311865137");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 97, 154, 10, 126]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1430213705" + "'", str11, "L1430213705");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L692631696" + "'", str13, "L692631696");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1236796267" + "'", str18, "L1236796267");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(labelArray20);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitVarInsn((int) (short) 1, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) str4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "V" + "'", str4, "V");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        int[] intArray12 = new int[] { (byte) 1, (-1), 9, (-1), 156 };
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label13.info = label15;
        java.lang.String str17 = label13.toString();
        java.lang.String str18 = label13.toString();
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.String str20 = label19.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label19.info = label21;
        java.lang.String str23 = label19.toString();
        java.lang.String str24 = label19.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.String str26 = label25.toString();
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        label25.info = label27;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter(classVisitor34);
        boolean boolean36 = type33.equals((java.lang.Object) classVisitor34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor42 = null;
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter(classVisitor42);
        boolean boolean44 = type41.equals((java.lang.Object) classVisitor42);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type32, type33, type37, type39, type40, type41 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1504852975", type30, typeArray45);
        label27.info = type30;
        org.mockito.asm.Label[] labelArray49 = new org.mockito.asm.Label[] { label13, label19, label27 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray12, labelArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L158504158" + "'", str4, "L158504158");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 9, -1, 156]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1580137630" + "'", str14, "L1580137630");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1580137630" + "'", str17, "L1580137630");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1580137630" + "'", str18, "L1580137630");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L414081503" + "'", str20, "L414081503");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L414081503" + "'", str23, "L414081503");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L414081503" + "'", str24, "L414081503");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1381287657" + "'", str26, "L1381287657");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "V" + "'", str38, "V");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(VZVDDZ)V" + "'", str46, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(labelArray49);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.String str3 = label2.toString();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.String str10 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label4, label8, "L2008666061");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L132846879" + "'", str3, "L132846879");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1702454220" + "'", str5, "L1702454220");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1653350259" + "'", str9, "L1653350259");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1653350259" + "'", str10, "L1653350259");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
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
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1743707293", "L2099206551");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1743707293L2099206551" + "'", str3, "L1743707293L2099206551");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        java.lang.Class<?> wildcardClass14 = classAdapter13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        java.lang.Class<?> wildcardClass22 = classAdapter21.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass10, wildcardClass14, wildcardClass18, wildcardClass22 };
        enhancer5.setInterfaces(classArray24);
        enhancer0.setInterfaces(classArray24);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        java.lang.Class<?> wildcardClass29 = classAdapter28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        java.lang.Class<?> wildcardClass34 = classAdapter33.getClass();
        boolean boolean35 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass29, wildcardClass34 };
        enhancer0.setInterfaces(classArray37);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.asm.ClassVisitor classVisitor41 = null;
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter(classVisitor41);
        java.lang.Class<?> wildcardClass43 = classAdapter42.getClass();
        boolean boolean44 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass43);
        boolean boolean45 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass43);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str15, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str30, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str31, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(126, 0, "boolean", "org/mockito/cglib/proxy/Enhancer", "org/mockito/asm/ClassAdapter", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer7.setCallback(callback10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer7.setCallbackFilter(callbackFilter12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer7.setCallback(callback14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy16);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        java.lang.Class<?> wildcardClass20 = classAdapter19.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Callback callback23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass20, callback23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L752058665", "(VZVDDZ)F", "(VZVDDZ)F" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visit(108, 157, "L1992969913", "(VZVDDZ)F", "L366761034", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L366761034");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = classEmitter0.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray17 = new java.lang.String[] { "L366761034", "org/mockito/asm/ClassAdapter" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit((int) '4', 156, "void", "L2099206551", "(VZVDDZ)V", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer14.setCallback(callback17);
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer14.setCallback(callback19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer14.getStrategy();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        boolean boolean23 = generatorStrategy21.equals((java.lang.Object) label22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter7.visitField(158, "(VZVDDZ)F", "L2008666061", "(VZVDDZ)D", (java.lang.Object) label22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(0, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter2.visitAnnotation("org/mockito/asm/ClassAdapter", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classAdapter2.visitField((int) (short) 1, "(VZVDDZ)Z", "L268445913", "L2008666061", (java.lang.Object) classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitInnerClass("org/mockito/asm/ClassAdapter", "void", "L721774646", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type8);
        label3.info = 0;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label3, label11, "L721774646");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L766893191" + "'", str4, "L766893191");
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitJumpInsn((int) (short) 10, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks(class0, callbackArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitOuterClass("V", "(VZVDDZ)V", "L1504852975(VZVDDZ)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        boolean boolean11 = type8.equals((java.lang.Object) classVisitor9);
        int int13 = type8.getOpcode(116);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        boolean boolean19 = type16.equals((java.lang.Object) classVisitor17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        boolean boolean27 = type24.equals((java.lang.Object) classVisitor25);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type15, type16, type20, type22, type23, type24 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("V", type8, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray28);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type34);
        int int36 = type34.getSort();
        java.lang.String str37 = type34.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(0, type40);
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) (byte) 100, type40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor48 = null;
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter(classVisitor48);
        boolean boolean50 = type47.equals((java.lang.Object) classVisitor48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor56 = null;
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter(classVisitor56);
        boolean boolean58 = type55.equals((java.lang.Object) classVisitor56);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type46, type47, type51, type53, type54, type55 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("L1504852975", type44, typeArray59);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray59);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/ClassAdapter;", type34, typeArray59);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class((int) (byte) 0, 156, "org/mockito/asm/ClassAdapter", type6, typeArray59, "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 116 + "'", int13 == 116);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "V" + "'", str21, "V");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(VZVDDZ)V" + "'", str29, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(VZVDDZ)B" + "'", str31, "(VZVDDZ)B");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "double" + "'", str37, "double");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "V" + "'", str52, "V");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(VZVDDZ)V" + "'", str60, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(VZVDDZ)D" + "'", str62, "(VZVDDZ)D");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = null;
        org.mockito.asm.Label label4 = null;
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label3, label4, label5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L888818534" + "'", str6, "L888818534");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(8, "L721774646", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L721774646");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classAdapter3.visitField(9, "(VZVDDZ)Z", "L721774646", "L752058665", (java.lang.Object) classEmitter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitInnerClass("boolean", "L268445913", "boolean", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L2099206551");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitOuterClass("Z", "B", "Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Callback callback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass1, callback3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = methodAdapter1.visitAnnotation("(VZVDDZ)B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label6.info = label8;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label13.info = label15;
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] { label6, label10, label15 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTableSwitchInsn(10, (int) '#', label5, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L578807427" + "'", str7, "L578807427");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L983257039" + "'", str11, "L983257039");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L933211465" + "'", str14, "L933211465");
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn(7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        java.lang.String str7 = label3.toString();
        int[] intArray13 = new int[] { 8, 0, (short) 0, 3, 96 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 10.0f;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.String str19 = label18.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label18.info = label20;
        java.lang.String str22 = label18.toString();
        java.lang.String str23 = label18.toString();
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.String str25 = label24.toString();
        java.lang.String str26 = label24.toString();
        org.mockito.asm.Label[] labelArray27 = new org.mockito.asm.Label[] { label14, label17, label18, label24 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLookupSwitchInsn(label3, intArray13, labelArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1939904892" + "'", str4, "L1939904892");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1939904892" + "'", str7, "L1939904892");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[8, 0, 0, 3, 96]");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L854435282" + "'", str19, "L854435282");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L854435282" + "'", str22, "L854435282");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L854435282" + "'", str23, "L854435282");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1836125147" + "'", str25, "L1836125147");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1836125147" + "'", str26, "L1836125147");
        org.junit.Assert.assertNotNull(labelArray27);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod((int) (byte) -1, "hi!", "Lorg/mockito/asm/ClassAdapter;", "L752058665", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@62a395ae");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/cglib/proxy/Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitInnerClass("L721774646", "(VZVDDZ)F", "", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn(7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn((int) (byte) 100, "L2008666061", "boolean", "L268445913");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs((int) (short) 1, 0);
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
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(0, "L366761034", "V", "L721774646");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        java.lang.ClassLoader classLoader7 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer8.setCallback(callback11);
        enhancer8.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass15 = enhancer8.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str16, "Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer7.setCallback(callback10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer7.setCallbackFilter(callbackFilter12);
        enhancer7.setSerialVersionUID((java.lang.Long) 0L);
        enhancer7.setUseCache(false);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field((int) (byte) 0, "L752058665", type6, (java.lang.Object) enhancer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray16 = new java.lang.String[] { "L2008666061" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit(0, 124, "V(VZVDDZ)Z", "L752058665", "L268445913", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn(112, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        enhancer3.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback6 = null;
        enhancer3.setCallback(callback6);
        org.mockito.cglib.proxy.Callback callback8 = null;
        enhancer3.setCallback(callback8);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer3.getStrategy();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        boolean boolean12 = generatorStrategy10.equals((java.lang.Object) label11);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLabel(label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        boolean boolean10 = type7.equals((java.lang.Object) classVisitor8);
        int int12 = type7.getOpcode(116);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        boolean boolean18 = type15.equals((java.lang.Object) classVisitor16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        boolean boolean26 = type23.equals((java.lang.Object) classVisitor24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type14, type15, type19, type21, type22, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("V", type7, typeArray27);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray27);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type34);
        int int36 = type34.getSort();
        java.lang.String str37 = type34.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(0, type40);
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) (byte) 100, type40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor48 = null;
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter(classVisitor48);
        boolean boolean50 = type47.equals((java.lang.Object) classVisitor48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor56 = null;
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter(classVisitor56);
        boolean boolean58 = type55.equals((java.lang.Object) classVisitor56);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type46, type47, type51, type53, type54, type55 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("L1504852975", type44, typeArray59);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray59);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/ClassAdapter;", type34, typeArray59);
        org.mockito.asm.Type[] typeArray64 = signature63.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(156, (int) (short) -1, (java.lang.Object[]) typeArray27, (int) (short) 100, (java.lang.Object[]) typeArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 116 + "'", int12 == 116);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V" + "'", str20, "V");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(VZVDDZ)V" + "'", str28, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VZVDDZ)B" + "'", str30, "(VZVDDZ)B");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "double" + "'", str37, "double");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "V" + "'", str52, "V");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(VZVDDZ)V" + "'", str60, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(VZVDDZ)D" + "'", str62, "(VZVDDZ)D");
        org.junit.Assert.assertNotNull(typeArray64);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn(153, "L1743707293L2099206551");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitOuterClass("void", "boolean", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter0.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1504852975(VZVDDZ)F");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        boolean boolean15 = type12.equals((java.lang.Object) classVisitor13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        boolean boolean23 = type20.equals((java.lang.Object) classVisitor21);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type11, type12, type16, type18, type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("L1504852975", type9, typeArray24);
        label6.info = type9;
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        enhancer28.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer28.setCallback(callback31);
        org.mockito.cglib.proxy.Callback callback33 = null;
        enhancer28.setCallback(callback33);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer28.getStrategy();
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        boolean boolean37 = generatorStrategy35.equals((java.lang.Object) label36);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTryCatchBlock(label3, label6, label36, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L546382321" + "'", str5, "L546382321");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "V" + "'", str17, "V");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VZVDDZ)V" + "'", str25, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        enhancer5.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        enhancer5.setCallbackFilter(callbackFilter10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        enhancer12.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        java.lang.Class<?> wildcardClass25 = classAdapter24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        java.lang.Class<?> wildcardClass29 = classAdapter28.getClass();
        boolean boolean30 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass29);
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass17, wildcardClass21, wildcardClass25, wildcardClass29 };
        enhancer12.setInterfaces(classArray31);
        enhancer5.setInterfaces(classArray31);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor38 = null;
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter(classVisitor38);
        boolean boolean40 = type37.equals((java.lang.Object) classVisitor38);
        int int42 = type37.getOpcode(116);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor46 = null;
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter(classVisitor46);
        boolean boolean48 = type45.equals((java.lang.Object) classVisitor46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor54 = null;
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter(classVisitor54);
        boolean boolean56 = type53.equals((java.lang.Object) classVisitor54);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type44, type45, type49, type51, type52, type53 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("V", type37, typeArray57);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray57);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(6, 157, (java.lang.Object[]) classArray31, 157, (java.lang.Object[]) typeArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str22, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str26, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 116 + "'", int42 == 116);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "V" + "'", str50, "V");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(VZVDDZ)V" + "'", str58, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(VZVDDZ)B" + "'", str60, "(VZVDDZ)B");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (byte) 100, type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        boolean boolean19 = type16.equals((java.lang.Object) classVisitor17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        boolean boolean27 = type24.equals((java.lang.Object) classVisitor25);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type15, type16, type20, type22, type23, type24 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("L1504852975", type13, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray28);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray28);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor40 = null;
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter(classVisitor40);
        boolean boolean42 = type39.equals((java.lang.Object) classVisitor40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor48 = null;
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter(classVisitor48);
        boolean boolean50 = type47.equals((java.lang.Object) classVisitor48);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type38, type39, type43, type45, type46, type47 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("L1504852975", type36, typeArray51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor59 = null;
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter(classVisitor59);
        boolean boolean61 = type58.equals((java.lang.Object) classVisitor59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor67 = null;
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter(classVisitor67);
        boolean boolean69 = type66.equals((java.lang.Object) classVisitor67);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type57, type58, type62, type64, type65, type66 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("L1504852975", type55, typeArray70);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type36, typeArray70);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(156, 100, (java.lang.Object[]) typeArray28, 0, (java.lang.Object[]) typeArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "B" + "'", str6, "B");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "V" + "'", str21, "V");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(VZVDDZ)V" + "'", str29, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(VZVDDZ)D" + "'", str31, "(VZVDDZ)D");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(VZVDDZ)B" + "'", str32, "(VZVDDZ)B");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "V" + "'", str44, "V");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(VZVDDZ)V" + "'", str52, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "V" + "'", str63, "V");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(VZVDDZ)V" + "'", str71, "(VZVDDZ)V");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "boolean", "(VZVDDZ)B", "double" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classAdapter3.visitMethod((int) (byte) 10, "org/mockito/asm/Type", "L1504852975(VZVDDZ)F", "L1504852975(VZVDDZ)F", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn(158, "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass7 = enhancer0.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass7);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        java.lang.Class<?> wildcardClass15 = classAdapter14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        java.lang.Class<?> wildcardClass19 = classAdapter18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        java.lang.Class<?> wildcardClass23 = classAdapter22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        java.lang.Class<?> wildcardClass27 = classAdapter26.getClass();
        boolean boolean28 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass15, wildcardClass19, wildcardClass23, wildcardClass27 };
        enhancer10.setInterfaces(classArray29);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter31 = null;
        enhancer10.setCallbackFilter(callbackFilter31);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        enhancer33.setUseFactory(true);
        enhancer33.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Callback callback38 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray39 = new org.mockito.cglib.proxy.Callback[] { callback38 };
        enhancer33.setCallbacks(callbackArray39);
        enhancer10.setCallbacks(callbackArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass7, callbackArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str8, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str16, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str20, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str24, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(callbackArray39);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        boolean boolean12 = type9.equals((java.lang.Object) classVisitor10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        boolean boolean20 = type17.equals((java.lang.Object) classVisitor18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type8, type9, type13, type15, type16, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L1504852975", type6, typeArray21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        boolean boolean32 = type29.equals((java.lang.Object) classVisitor30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor38 = null;
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter(classVisitor38);
        boolean boolean40 = type37.equals((java.lang.Object) classVisitor38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type28, type29, type33, type35, type36, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("L1504852975", type26, typeArray41);
        java.lang.String str44 = signature43.toString();
        org.mockito.asm.Type[] typeArray45 = signature43.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(10, 4, (java.lang.Object[]) typeArray21, 96, (java.lang.Object[]) typeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(VZVDDZ)V" + "'", str22, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "V" + "'", str34, "V");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(VZVDDZ)V" + "'", str42, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "L1504852975(VZVDDZ)F" + "'", str44, "L1504852975(VZVDDZ)F");
        org.junit.Assert.assertNotNull(typeArray45);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn(1, "org/mockito/cglib/proxy/Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setUseFactory(true);
        enhancer6.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        enhancer11.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        java.lang.Class<?> wildcardClass16 = classAdapter15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        java.lang.Class<?> wildcardClass20 = classAdapter19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        java.lang.Class<?> wildcardClass24 = classAdapter23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        java.lang.Class<?> wildcardClass28 = classAdapter27.getClass();
        boolean boolean29 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass16, wildcardClass20, wildcardClass24, wildcardClass28 };
        enhancer11.setInterfaces(classArray30);
        enhancer6.setInterfaces(classArray30);
        org.mockito.cglib.proxy.Callback callback33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray30, callback33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str4, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str5, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str17, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str21, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str25, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classArray30);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        boolean boolean11 = type8.equals((java.lang.Object) classVisitor9);
        int int13 = type8.getOpcode(116);
        boolean boolean14 = generatorStrategy7.equals((java.lang.Object) 116);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer15.setCallback(callback18);
        org.mockito.cglib.proxy.Callback callback20 = null;
        enhancer15.setCallback(callback20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        enhancer22.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        java.lang.Class<?> wildcardClass27 = classAdapter26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter(classVisitor29);
        java.lang.Class<?> wildcardClass31 = classAdapter30.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        org.mockito.asm.ClassVisitor classVisitor33 = null;
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter(classVisitor33);
        java.lang.Class<?> wildcardClass35 = classAdapter34.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        org.mockito.asm.ClassVisitor classVisitor37 = null;
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter(classVisitor37);
        java.lang.Class<?> wildcardClass39 = classAdapter38.getClass();
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass39);
        java.lang.Class[] classArray41 = new java.lang.Class[] { wildcardClass27, wildcardClass31, wildcardClass35, wildcardClass39 };
        enhancer22.setInterfaces(classArray41);
        enhancer15.setInterfaces(classArray41);
        boolean boolean44 = generatorStrategy7.equals((java.lang.Object) enhancer15);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        enhancer45.setUseFactory(true);
        enhancer45.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter50 = null;
        enhancer45.setCallbackFilter(callbackFilter50);
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        enhancer52.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor55 = null;
        org.mockito.asm.ClassAdapter classAdapter56 = new org.mockito.asm.ClassAdapter(classVisitor55);
        java.lang.Class<?> wildcardClass57 = classAdapter56.getClass();
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass57);
        org.mockito.asm.ClassVisitor classVisitor59 = null;
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter(classVisitor59);
        java.lang.Class<?> wildcardClass61 = classAdapter60.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        org.mockito.asm.ClassVisitor classVisitor63 = null;
        org.mockito.asm.ClassAdapter classAdapter64 = new org.mockito.asm.ClassAdapter(classVisitor63);
        java.lang.Class<?> wildcardClass65 = classAdapter64.getClass();
        java.lang.String str66 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass65);
        org.mockito.asm.ClassVisitor classVisitor67 = null;
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter(classVisitor67);
        java.lang.Class<?> wildcardClass69 = classAdapter68.getClass();
        boolean boolean70 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass69);
        java.lang.Class[] classArray71 = new java.lang.Class[] { wildcardClass57, wildcardClass61, wildcardClass65, wildcardClass69 };
        enhancer52.setInterfaces(classArray71);
        enhancer45.setInterfaces(classArray71);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("Z", "(VZVDDZ)Z");
        org.mockito.asm.Type[] typeArray77 = signature76.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = enhancer15.create(classArray71, (java.lang.Object[]) typeArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 116 + "'", int13 == 116);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str28, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str32, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str36, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str58, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str62, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str66, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertNotNull(typeArray77);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
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
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor6 = classEmitter0.visitField(8, "org/mockito/asm/ClassAdapter", "boolean", "V(VZVDDZ)Z", (java.lang.Object) "L1743707293");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        boolean boolean5 = type2.equals((java.lang.Object) classVisitor3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        boolean boolean13 = type10.equals((java.lang.Object) classVisitor11);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type1, type2, type6, type8, type9, type10 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        java.lang.String str16 = type0.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type19);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (byte) 100, type19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        boolean boolean29 = type26.equals((java.lang.Object) classVisitor27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        boolean boolean37 = type34.equals((java.lang.Object) classVisitor35);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25, type26, type30, type32, type33, type34 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L1504852975", type23, typeArray38);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray38);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray38);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = type0.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "V" + "'", str7, "V");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(VZVDDZ)V" + "'", str15, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "V" + "'", str16, "V");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "V" + "'", str31, "V");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(VZVDDZ)V" + "'", str39, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(VZVDDZ)D" + "'", str41, "(VZVDDZ)D");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(VZVDDZ)V" + "'", str42, "(VZVDDZ)V");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1743707293", "L2099206551");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn((int) (byte) 10, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(155, "V", false);
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
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer0.getStrategy();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        boolean boolean11 = type8.equals((java.lang.Object) classVisitor9);
        int int13 = type8.getOpcode(116);
        boolean boolean14 = generatorStrategy7.equals((java.lang.Object) 116);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer15.setCallback(callback18);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter20 = null;
        enhancer15.setCallbackFilter(callbackFilter20);
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer15.setCallback(callback22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer24.setCallback(callback27);
        enhancer24.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass31 = enhancer24.getClass();
        enhancer15.setSuperclass((java.lang.Class) wildcardClass31);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray33 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) enhancer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 116 + "'", int13 == 116);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMultiANewArrayInsn("void", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "(VZVDDZ)F", "(VZVDDZ)Z", "L366761034", "D", "org/mockito/asm/Type", "Lorg/mockito/cglib/proxy/Enhancer;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter0.visitMethod((int) (short) 0, "V", "L721774646", "(VZVDDZ)V", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@62c378bd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLabel(label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1673170189" + "'", str4, "L1673170189");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass7 = enhancer0.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass7);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer10.setCallback(callback11);
        java.lang.Class<?> wildcardClass13 = enhancer10.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[] { wildcardClass13, wildcardClass15 };
        org.mockito.cglib.proxy.CallbackFilter callbackFilter17 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray18 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass7, classArray16, callbackFilter17, callbackArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str8, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(callbackArray18);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        java.lang.Class<?> wildcardClass14 = classAdapter13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        java.lang.Class<?> wildcardClass22 = classAdapter21.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass10, wildcardClass14, wildcardClass18, wildcardClass22 };
        enhancer5.setInterfaces(classArray24);
        enhancer0.setInterfaces(classArray24);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        java.lang.Class<?> wildcardClass29 = classAdapter28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        java.lang.Class<?> wildcardClass34 = classAdapter33.getClass();
        boolean boolean35 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass29, wildcardClass34 };
        enhancer0.setInterfaces(classArray37);
        java.lang.ClassLoader classLoader39 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        enhancer41.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback44 = null;
        enhancer41.setCallback(callback44);
        org.mockito.cglib.proxy.Callback callback46 = null;
        enhancer41.setCallback(callback46);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer41.getStrategy();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor50 = null;
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter(classVisitor50);
        boolean boolean52 = type49.equals((java.lang.Object) classVisitor50);
        int int54 = type49.getOpcode(116);
        boolean boolean55 = generatorStrategy48.equals((java.lang.Object) 116);
        enhancer40.setStrategy(generatorStrategy48);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(0, type59);
        int int61 = type59.getSort();
        java.lang.String str62 = type59.getClassName();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(0, type65);
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local((int) (byte) 100, type65);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor73 = null;
        org.mockito.asm.ClassAdapter classAdapter74 = new org.mockito.asm.ClassAdapter(classVisitor73);
        boolean boolean75 = type72.equals((java.lang.Object) classVisitor73);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str77 = type76.getDescriptor();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor81 = null;
        org.mockito.asm.ClassAdapter classAdapter82 = new org.mockito.asm.ClassAdapter(classVisitor81);
        boolean boolean83 = type80.equals((java.lang.Object) classVisitor81);
        org.mockito.asm.Type[] typeArray84 = new org.mockito.asm.Type[] { type71, type72, type76, type78, type79, type80 };
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type70, typeArray84);
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("L1504852975", type69, typeArray84);
        java.lang.String str87 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray84);
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/ClassAdapter;", type59, typeArray84);
        boolean boolean89 = generatorStrategy48.equals((java.lang.Object) signature88);
        enhancer0.setStrategy(generatorStrategy48);
        org.mockito.cglib.core.ClassEmitter classEmitter91 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor92 = null;
        org.mockito.asm.ClassAdapter classAdapter93 = new org.mockito.asm.ClassAdapter(classVisitor92);
        org.mockito.asm.ClassAdapter classAdapter94 = new org.mockito.asm.ClassAdapter(classVisitor92);
        classEmitter91.setTarget((org.mockito.asm.ClassVisitor) classAdapter94);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str15, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str30, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str31, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 116 + "'", int54 == 116);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "double" + "'", str62, "double");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "V" + "'", str77, "V");
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "(VZVDDZ)V" + "'", str85, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "(VZVDDZ)D" + "'", str87, "(VZVDDZ)D");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer9.setCallback(callback12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer9.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.proxy.Callback callback16 = null;
        enhancer9.setCallback(callback16);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer9.getNamingPolicy();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        int int22 = type20.getSort();
        java.lang.String str23 = type20.getClassName();
        java.lang.String str24 = type20.getClassName();
        boolean boolean25 = namingPolicy18.equals((java.lang.Object) type20);
        enhancer8.setNamingPolicy(namingPolicy18);
        java.lang.Class<?> wildcardClass27 = namingPolicy18.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter(classVisitor29);
        java.lang.Class<?> wildcardClass31 = classAdapter30.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        java.lang.Class[] classArray33 = new java.lang.Class[] { wildcardClass27, wildcardClass31 };
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor37 = null;
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter(classVisitor37);
        boolean boolean39 = type36.equals((java.lang.Object) classVisitor37);
        int int41 = type36.getOpcode(116);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor45 = null;
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter(classVisitor45);
        boolean boolean47 = type44.equals((java.lang.Object) classVisitor45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor53 = null;
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter(classVisitor53);
        boolean boolean55 = type52.equals((java.lang.Object) classVisitor53);
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type43, type44, type48, type50, type51, type52 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray56);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("V", type36, typeArray56);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = enhancer0.create(classArray33, (java.lang.Object[]) typeArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(namingPolicy18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "double" + "'", str23, "double");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "double" + "'", str24, "double");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/cglib/core/DefaultNamingPolicy;" + "'", str28, "Lorg/mockito/cglib/core/DefaultNamingPolicy;");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str32, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 116 + "'", int41 == 116);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "V" + "'", str49, "V");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(VZVDDZ)V" + "'", str57, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(VZVDDZ)B" + "'", str59, "(VZVDDZ)B");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        boolean boolean12 = type9.equals((java.lang.Object) classVisitor10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        boolean boolean20 = type17.equals((java.lang.Object) classVisitor18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type8, type9, type13, type15, type16, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("L1504852975", type6, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        boolean boolean29 = type26.equals((java.lang.Object) classVisitor27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        boolean boolean37 = type34.equals((java.lang.Object) classVisitor35);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25, type26, type30, type32, type33, type34 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray38);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        enhancer42.setUseFactory(true);
        enhancer42.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        enhancer47.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor50 = null;
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter(classVisitor50);
        java.lang.Class<?> wildcardClass52 = classAdapter51.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        org.mockito.asm.ClassVisitor classVisitor54 = null;
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter(classVisitor54);
        java.lang.Class<?> wildcardClass56 = classAdapter55.getClass();
        java.lang.String str57 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass56);
        org.mockito.asm.ClassVisitor classVisitor58 = null;
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter(classVisitor58);
        java.lang.Class<?> wildcardClass60 = classAdapter59.getClass();
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        org.mockito.asm.ClassVisitor classVisitor62 = null;
        org.mockito.asm.ClassAdapter classAdapter63 = new org.mockito.asm.ClassAdapter(classVisitor62);
        java.lang.Class<?> wildcardClass64 = classAdapter63.getClass();
        boolean boolean65 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass64);
        java.lang.Class[] classArray66 = new java.lang.Class[] { wildcardClass52, wildcardClass56, wildcardClass60, wildcardClass64 };
        enhancer47.setInterfaces(classArray66);
        enhancer42.setInterfaces(classArray66);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame((int) '#', (int) (byte) 10, (java.lang.Object[]) typeArray38, (int) '#', (java.lang.Object[]) classArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(VZVDDZ)V" + "'", str22, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "V" + "'", str31, "V");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(VZVDDZ)V" + "'", str39, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(VZVDDZ)F" + "'", str40, "(VZVDDZ)F");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str53, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str57, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str61, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(classArray66);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        label4.info = 0;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(126, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L993700796" + "'", str5, "L993700796");
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Callback callback9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, callback9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str7, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str8, "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn(2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label4.info = label6;
        java.lang.String str8 = label4.toString();
        java.lang.String str9 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber((int) '#', label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1425322434" + "'", str5, "L1425322434");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1425322434" + "'", str8, "L1425322434");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1425322434" + "'", str9, "L1425322434");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("L130596860", "org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        boolean boolean6 = type3.equals((java.lang.Object) classVisitor4);
        java.lang.String str7 = type3.getDescriptor();
        java.lang.String str8 = type3.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Z" + "'", str8, "Z");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        enhancer9.setUseFactory(true);
        enhancer9.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        java.lang.Class<?> wildcardClass19 = classAdapter18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        java.lang.Class<?> wildcardClass23 = classAdapter22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        java.lang.Class<?> wildcardClass27 = classAdapter26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter(classVisitor29);
        java.lang.Class<?> wildcardClass31 = classAdapter30.getClass();
        boolean boolean32 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass31);
        java.lang.Class[] classArray33 = new java.lang.Class[] { wildcardClass19, wildcardClass23, wildcardClass27, wildcardClass31 };
        enhancer14.setInterfaces(classArray33);
        enhancer9.setInterfaces(classArray33);
        java.util.List list36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass2, classArray33, list36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str7, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str8, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str20, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str24, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str28, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classArray33);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classAdapter3.visitMethod(126, "(VZVDDZ)B", "double", "hi!", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor6);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(128, 100, "L36687257", "B", "I", strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs(108, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "(VZVDDZ)V", "L2008666061", "B", "L366761034", "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter0.visitMethod((int) '4', "L1992969913", "org/mockito/cglib/proxy/Enhancer", "org/mockito/cglib/proxy/Enhancer", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@28af89dc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        enhancer5.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Callback callback10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] { callback10 };
        enhancer5.setCallbacks(callbackArray11);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setUseFactory(true);
        enhancer14.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        java.lang.Class<?> wildcardClass24 = classAdapter23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        java.lang.Class<?> wildcardClass28 = classAdapter27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        java.lang.Class<?> wildcardClass32 = classAdapter31.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter(classVisitor34);
        java.lang.Class<?> wildcardClass36 = classAdapter35.getClass();
        boolean boolean37 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass36);
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass24, wildcardClass28, wildcardClass32, wildcardClass36 };
        enhancer19.setInterfaces(classArray38);
        enhancer14.setInterfaces(classArray38);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(116, (int) (short) -1, (java.lang.Object[]) callbackArray11, 116, (java.lang.Object[]) classArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray11);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str25, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str29, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str33, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(classArray38);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = classEmitter0.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        boolean boolean7 = type4.equals((java.lang.Object) classVisitor5);
        int int9 = type4.getOpcode(116);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        boolean boolean17 = type14.equals((java.lang.Object) classVisitor15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        boolean boolean25 = type22.equals((java.lang.Object) classVisitor23);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type13, type14, type18, type20, type21, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1504852975", type11, typeArray26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        boolean boolean34 = type31.equals((java.lang.Object) classVisitor32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor40 = null;
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter(classVisitor40);
        boolean boolean42 = type39.equals((java.lang.Object) classVisitor40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type30, type31, type35, type37, type38, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class(104, (int) (short) 1, "I", type4, typeArray43, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 116 + "'", int9 == 116);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "V" + "'", str19, "V");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(VZVDDZ)V" + "'", str27, "(VZVDDZ)V");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "V" + "'", str36, "V");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(VZVDDZ)V" + "'", str44, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(VZVDDZ)F" + "'", str45, "(VZVDDZ)F");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        java.lang.Class<?> wildcardClass25 = classAdapter24.getClass();
        boolean boolean26 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass13, wildcardClass17, wildcardClass21, wildcardClass25 };
        enhancer8.setInterfaces(classArray27);
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter(classVisitor29);
        java.lang.Class<?> wildcardClass31 = classAdapter30.getClass();
        boolean boolean32 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass31);
        boolean boolean33 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        enhancer8.setSuperclass((java.lang.Class) wildcardClass31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor36 = classEmitter0.visitField((int) (byte) 10, "L1992969913", "L366761034", "boolean", (java.lang.Object) enhancer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str22, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type34);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
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
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classAdapter2.visitField(10, "L1992969913", "L2099206551", "L268445913", (java.lang.Object) 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn(2, "double", "Lorg/mockito/cglib/core/DefaultNamingPolicy;", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer0.getNamingPolicy();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        boolean boolean10 = namingPolicy7.equals((java.lang.Object) str9);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        enhancer14.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer14.setCallback(callback17);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter19 = null;
        enhancer14.setCallbackFilter(callbackFilter19);
        org.mockito.cglib.proxy.Callback callback21 = null;
        enhancer14.setCallback(callback21);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer14.getNamingPolicy();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(0, type25);
        int int27 = type25.getSort();
        java.lang.String str28 = type25.getClassName();
        java.lang.String str29 = type25.getClassName();
        boolean boolean30 = namingPolicy23.equals((java.lang.Object) type25);
        enhancer13.setNamingPolicy(namingPolicy23);
        org.mockito.cglib.core.Predicate predicate32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = namingPolicy7.getClassName("L2008666061", "(VZVDDZ)F", (java.lang.Object) namingPolicy23, predicate32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L152734154" + "'", str9, "L152734154");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(namingPolicy23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "double" + "'", str28, "double");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "double" + "'", str29, "double");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod(0, "(VZVDDZ)F", "L1504852975(VZVDDZ)F", "(VZVDDZ)D", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(VZVDDZ)F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L366761034", "L2099206551", "L2008666061", "L36687257", "L366761034", "org/mockito/cglib/proxy/Enhancer" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visit(128, 128, "L1504852975(VZVDDZ)F", "(VZVDDZ)D", "(VZVDDZ)D", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label6.info = label8;
        java.lang.String str10 = label6.toString();
        java.lang.String str11 = label6.toString();
        java.lang.Object obj12 = label6.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label13.info = label15;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("L1992969913", "L1504852975", "L366761034", label6, label13, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1159413514" + "'", str7, "L1159413514");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1159413514" + "'", str10, "L1159413514");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1159413514" + "'", str11, "L1159413514");
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "L1346774970");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "L1346774970");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "L1346774970");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1027821634" + "'", str14, "L1027821634");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(154, "L1992969913", "org/mockito/asm/Type", "L1504852975(VZVDDZ)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(9, "V", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        java.lang.Class<?> wildcardClass12 = classAdapter11.getClass();
        boolean boolean13 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        boolean boolean14 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str16, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str17, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str18, "Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor6);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray24 = new java.lang.String[] { "Lorg/mockito/cglib/proxy/Enhancer;", "L268445913", "(VZVDDZ)D", "org/mockito/cglib/proxy/Enhancer" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor25 = classEmitter5.visitMethod(128, "L1743707293", "(VZVDDZ)D", "L130596860", strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@24c0b6f3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer8.setCallback(callback11);
        org.mockito.cglib.proxy.Callback callback13 = null;
        enhancer8.setCallback(callback13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        java.lang.Class<?> wildcardClass20 = classAdapter19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        java.lang.Class<?> wildcardClass24 = classAdapter23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        java.lang.Class<?> wildcardClass28 = classAdapter27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        java.lang.Class<?> wildcardClass32 = classAdapter31.getClass();
        boolean boolean33 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass32);
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass20, wildcardClass24, wildcardClass28, wildcardClass32 };
        enhancer15.setInterfaces(classArray34);
        enhancer8.setInterfaces(classArray34);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter37 = null;
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        enhancer38.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer38.setCallback(callback41);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        enhancer43.setUseFactory(true);
        enhancer43.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Callback callback48 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray49 = new org.mockito.cglib.proxy.Callback[] { callback48 };
        enhancer43.setCallbacks(callbackArray49);
        enhancer38.setCallbacks(callbackArray49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray34, callbackFilter37, callbackArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str7, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str21, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str25, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str29, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(callbackArray49);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        java.lang.Class<?> wildcardClass10 = classAdapter9.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        java.lang.Class<?> wildcardClass14 = classAdapter13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        java.lang.Class<?> wildcardClass18 = classAdapter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        java.lang.Class<?> wildcardClass22 = classAdapter21.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass10, wildcardClass14, wildcardClass18, wildcardClass22 };
        enhancer5.setInterfaces(classArray24);
        enhancer0.setInterfaces(classArray24);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        java.lang.Class<?> wildcardClass29 = classAdapter28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        java.lang.Class<?> wildcardClass34 = classAdapter33.getClass();
        boolean boolean35 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass29, wildcardClass34 };
        enhancer0.setInterfaces(classArray37);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        enhancer40.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback43 = null;
        enhancer40.setCallback(callback43);
        enhancer40.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        enhancer47.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback50 = null;
        enhancer47.setCallback(callback50);
        enhancer47.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = enhancer47.getNamingPolicy();
        enhancer40.setNamingPolicy(namingPolicy54);
        enhancer40.setInterceptDuringConstruction(true);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray58 = generatorStrategy39.generate((org.mockito.cglib.core.ClassGenerator) enhancer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str11, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str15, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str19, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str30, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str31, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(namingPolicy54);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("V", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn(7, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitSource("void", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn(0, "L1657710914");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn((int) (short) 1, "L1322174323", "L1484054928", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "Lorg/mockito/asm/ClassAdapter;", "L366761034", "(VZVDDZ)V", "hi!", "L366761034", "(VZVDDZ)D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter0.visitMethod(104, "Z", "org/mockito/asm/ClassAdapter", "Lorg/mockito/cglib/core/DefaultNamingPolicy;", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@27a6770a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label5.info = label7;
        java.lang.String str9 = label5.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label10.info = label12;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type15);
        label10.info = 0;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.String str19 = label18.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label18.info = label20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.String str23 = label22.toString();
        java.lang.String str24 = label22.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.String str26 = label25.toString();
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        label25.info = label27;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.String str30 = label29.toString();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label29.info = label31;
        org.mockito.asm.Label[] labelArray33 = new org.mockito.asm.Label[] { label10, label18, label22, label25, label29 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTableSwitchInsn(5, (int) (short) 100, label5, labelArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L933224468" + "'", str6, "L933224468");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L933224468" + "'", str9, "L933224468");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1373123223" + "'", str11, "L1373123223");
        org.junit.Assert.assertNotNull(type15);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L105328549" + "'", str19, "L105328549");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1584122078" + "'", str23, "L1584122078");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1584122078" + "'", str24, "L1584122078");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L381422663" + "'", str26, "L381422663");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L107010189" + "'", str30, "L107010189");
        org.junit.Assert.assertNotNull(labelArray33);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor6);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = classEmitter0.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitVarInsn((int) (short) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn((int) ' ', 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.mockito.cglib.proxy.CallbackFilter callbackFilter6 = null;
        org.mockito.cglib.proxy.Callback callback7 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray8 = new org.mockito.cglib.proxy.Callback[] { callback7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass2, classArray5, callbackFilter6, callbackArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str3, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str4, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(callbackArray8);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer7.setCallback(callback10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer7.setCallbackFilter(callbackFilter12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer7.setCallback(callback14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy16);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        java.lang.Class<?> wildcardClass20 = classAdapter19.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        boolean boolean22 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter23 = null;
        enhancer0.setCallbackFilter(callbackFilter23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        java.lang.Class<?> wildcardClass27 = classAdapter26.getClass();
        boolean boolean28 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        boolean boolean29 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        java.lang.Class<?> wildcardClass34 = classAdapter33.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        enhancer38.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer38.setCallback(callback41);
        enhancer38.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass45 = enhancer38.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass27, wildcardClass34, wildcardClass45 };
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor51 = null;
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter(classVisitor51);
        boolean boolean53 = type50.equals((java.lang.Object) classVisitor51);
        int int55 = type50.getOpcode(116);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor59 = null;
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter(classVisitor59);
        boolean boolean61 = type58.equals((java.lang.Object) classVisitor59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor67 = null;
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter(classVisitor67);
        boolean boolean69 = type66.equals((java.lang.Object) classVisitor67);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type57, type58, type62, type64, type65, type66 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("V", type50, typeArray70);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!", type48, typeArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = enhancer0.create(classArray46, (java.lang.Object[]) typeArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str31, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str35, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str36, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str37, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 116 + "'", int55 == 116);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "V" + "'", str63, "V");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(VZVDDZ)V" + "'", str71, "(VZVDDZ)V");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer7.setCallback(callback10);
        enhancer7.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy14);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer18.setCallback(callback19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        enhancer22.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback25 = null;
        enhancer22.setCallback(callback25);
        org.mockito.cglib.proxy.Callback callback27 = null;
        enhancer22.setCallback(callback27);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer22.getStrategy();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter(classVisitor31);
        boolean boolean33 = type30.equals((java.lang.Object) classVisitor31);
        int int35 = type30.getOpcode(116);
        boolean boolean36 = generatorStrategy29.equals((java.lang.Object) 116);
        enhancer21.setStrategy(generatorStrategy29);
        enhancer18.setStrategy(generatorStrategy29);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        enhancer39.setUseFactory(true);
        enhancer39.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter44 = null;
        enhancer39.setCallbackFilter(callbackFilter44);
        java.lang.ClassLoader classLoader46 = enhancer39.getClassLoader();
        enhancer18.setClassLoader(classLoader46);
        org.mockito.cglib.core.Predicate predicate48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = namingPolicy14.getClassName("I", "double", (java.lang.Object) classLoader46, predicate48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 116 + "'", int35 == 116);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(classLoader46);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitOuterClass("", "D", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("I");
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        boolean boolean10 = type7.equals((java.lang.Object) classVisitor8);
        int int12 = type7.getOpcode(116);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        boolean boolean18 = type15.equals((java.lang.Object) classVisitor16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor24);
        boolean boolean26 = type23.equals((java.lang.Object) classVisitor24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type14, type15, type19, type21, type22, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("V", type7, typeArray27);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray27);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("L1992969913", type2, typeArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = type2.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 116 + "'", int12 == 116);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V" + "'", str20, "V");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(VZVDDZ)V" + "'", str28, "(VZVDDZ)V");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
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
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray16 = new java.lang.String[] { "L2008666061" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit((int) (byte) 10, 7, "org/mockito/cglib/proxy/Enhancer", "Lorg/mockito/cglib/proxy/Enhancer;", "(VZVDDZ)V", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitOuterClass("L268445913", "B", "B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer6.setCallback(callback9);
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer6.setCallback(callback11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer6.getStrategy();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        boolean boolean15 = generatorStrategy13.equals((java.lang.Object) label14);
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label16.info = label18;
        java.lang.String str20 = label16.toString();
        java.lang.String str21 = label16.toString();
        java.lang.Object obj22 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("Lorg/mockito/cglib/proxy/Enhancer;", "Lorg/mockito/cglib/proxy/Enhancer;", "L130596860", label14, label16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1801221933" + "'", str17, "L1801221933");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1801221933" + "'", str20, "L1801221933");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1801221933" + "'", str21, "L1801221933");
        org.junit.Assert.assertNotNull(obj22);
// flaky:         org.junit.Assert.assertEquals(obj22.toString(), "L1722260489");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "L1722260489");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "L1722260489");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("boolean", "", "L366761034", label6, label7, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1510289108" + "'", str8, "L1510289108");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        enhancer1.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer1.setCallback(callback4);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter6 = null;
        enhancer1.setCallbackFilter(callbackFilter6);
        org.mockito.cglib.proxy.Callback callback8 = null;
        enhancer1.setCallback(callback8);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer1.getNamingPolicy();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type12);
        int int14 = type12.getSort();
        java.lang.String str15 = type12.getClassName();
        java.lang.String str16 = type12.getClassName();
        boolean boolean17 = namingPolicy10.equals((java.lang.Object) type12);
        enhancer0.setNamingPolicy(namingPolicy10);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setUseFactory(true);
        enhancer19.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        java.lang.Class<?> wildcardClass29 = classAdapter28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter(classVisitor31);
        java.lang.Class<?> wildcardClass33 = classAdapter32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter(classVisitor35);
        java.lang.Class<?> wildcardClass37 = classAdapter36.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        org.mockito.asm.ClassVisitor classVisitor39 = null;
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter(classVisitor39);
        java.lang.Class<?> wildcardClass41 = classAdapter40.getClass();
        boolean boolean42 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass41);
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass29, wildcardClass33, wildcardClass37, wildcardClass41 };
        enhancer24.setInterfaces(classArray43);
        enhancer19.setInterfaces(classArray43);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.ClassAdapter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "double" + "'", str15, "double");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "double" + "'", str16, "double");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str30, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str34, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str38, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(classArray43);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMultiANewArrayInsn("B", 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        java.lang.Class<?> wildcardClass5 = classAdapter4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        java.lang.Class<?> wildcardClass9 = classAdapter8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass5, wildcardClass9, wildcardClass13, wildcardClass17 };
        enhancer0.setInterfaces(classArray19);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        enhancer0.setCallbackFilter(callbackFilter21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter(classVisitor23);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str10, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classArray19);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        java.lang.Class<?> wildcardClass3 = enhancer0.getClass();
        org.mockito.cglib.proxy.Callback callback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, callback4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L721774646");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
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
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        java.lang.String str7 = label3.toString();
        java.lang.String str8 = label3.toString();
        java.lang.String str9 = label3.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label10.info = label12;
        java.lang.String str14 = label10.toString();
        java.lang.String str15 = label10.toString();
        label3.info = label10;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.String str18 = label17.toString();
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        label17.info = label19;
        java.lang.String str21 = label17.toString();
        java.lang.String str22 = label17.toString();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.String str24 = label23.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        label23.info = label25;
        java.lang.String str27 = label23.toString();
        java.lang.String str28 = label23.toString();
        java.lang.String str29 = label23.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTryCatchBlock(label3, label17, label23, "Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L2002083542" + "'", str4, "L2002083542");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L2002083542" + "'", str7, "L2002083542");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L2002083542" + "'", str8, "L2002083542");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L2002083542" + "'", str9, "L2002083542");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L885623670" + "'", str11, "L885623670");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L885623670" + "'", str14, "L885623670");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L885623670" + "'", str15, "L885623670");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1936365179" + "'", str18, "L1936365179");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1936365179" + "'", str21, "L1936365179");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1936365179" + "'", str22, "L1936365179");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L975814418" + "'", str24, "L975814418");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L975814418" + "'", str27, "L975814418");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L975814418" + "'", str28, "L975814418");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L975814418" + "'", str29, "L975814418");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        int[] intArray11 = new int[] { (short) 100, 154, 157, 156 };
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label12.info = label14;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label16.info = label18;
        java.lang.String str20 = label16.toString();
        java.lang.String str21 = label16.toString();
        java.lang.Object obj22 = label16.info;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.String str24 = label23.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        label25.info = 10.0f;
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.String str29 = label28.toString();
        java.lang.String str30 = label28.toString();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.String str32 = label31.toString();
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        label31.info = label33;
        java.lang.String str35 = label31.toString();
        java.lang.String str36 = label31.toString();
        java.lang.String str37 = label31.toString();
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        java.lang.String str39 = label38.toString();
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        label38.info = label40;
        java.lang.String str42 = label38.toString();
        java.lang.String str43 = label38.toString();
        label31.info = label38;
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] { label12, label16, label23, label25, label28, label38 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label5, intArray11, labelArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1634252007" + "'", str4, "L1634252007");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 154, 157, 156]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L657242604" + "'", str13, "L657242604");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1346252407" + "'", str17, "L1346252407");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1346252407" + "'", str20, "L1346252407");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1346252407" + "'", str21, "L1346252407");
        org.junit.Assert.assertNotNull(obj22);
// flaky:         org.junit.Assert.assertEquals(obj22.toString(), "L1177189401");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "L1177189401");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "L1177189401");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L2063613639" + "'", str24, "L2063613639");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1609265868" + "'", str29, "L1609265868");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1609265868" + "'", str30, "L1609265868");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L491406084" + "'", str32, "L491406084");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L491406084" + "'", str35, "L491406084");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L491406084" + "'", str36, "L491406084");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L491406084" + "'", str37, "L491406084");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L1017551692" + "'", str39, "L1017551692");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1017551692" + "'", str42, "L1017551692");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1017551692" + "'", str43, "L1017551692");
        org.junit.Assert.assertNotNull(labelArray45);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("hi!", 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.Object[] objArray5 = null;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        boolean boolean12 = type9.equals((java.lang.Object) classVisitor10);
        int int14 = type9.getOpcode(116);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        boolean boolean20 = type17.equals((java.lang.Object) classVisitor18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        boolean boolean28 = type25.equals((java.lang.Object) classVisitor26);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type16, type17, type21, type23, type24, type25 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("V", type9, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(130, 6, objArray5, 108, (java.lang.Object[]) typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 116 + "'", int14 == 116);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "V" + "'", str22, "V");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VZVDDZ)V" + "'", str30, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(VZVDDZ)B" + "'", str32, "(VZVDDZ)B");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.String str4 = label3.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label3.info = label5;
        java.lang.String str7 = label3.toString();
        java.lang.String str8 = label3.toString();
        java.lang.Object obj9 = label3.info;
        int[] intArray10 = new int[] {};
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label11.info = label13;
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] { label13 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLookupSwitchInsn(label3, intArray10, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1934628618" + "'", str4, "L1934628618");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1934628618" + "'", str7, "L1934628618");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1934628618" + "'", str8, "L1934628618");
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "L985357820");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "L985357820");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "L985357820");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L336572113" + "'", str12, "L336572113");
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass7 = enhancer0.getClass();
        org.mockito.cglib.proxy.Callback callback8 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray9 = new org.mockito.cglib.proxy.Callback[] { callback8 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass7, callbackArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(callbackArray9);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        enhancer7.setCallback(callback10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer7.setCallbackFilter(callbackFilter12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer7.setCallback(callback14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy16);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        java.lang.Class<?> wildcardClass20 = classAdapter19.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        enhancer22.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        java.lang.Class<?> wildcardClass27 = classAdapter26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter(classVisitor29);
        java.lang.Class<?> wildcardClass31 = classAdapter30.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        org.mockito.asm.ClassVisitor classVisitor33 = null;
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter(classVisitor33);
        java.lang.Class<?> wildcardClass35 = classAdapter34.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        org.mockito.asm.ClassVisitor classVisitor37 = null;
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter(classVisitor37);
        java.lang.Class<?> wildcardClass39 = classAdapter38.getClass();
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass39);
        java.lang.Class[] classArray41 = new java.lang.Class[] { wildcardClass27, wildcardClass31, wildcardClass35, wildcardClass39 };
        enhancer22.setInterfaces(classArray41);
        org.mockito.cglib.proxy.Callback callback43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass20, classArray41, callback43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str28, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str32, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str36, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(classArray41);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("void", true);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 0, "(VZVDDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        java.lang.Class<?> wildcardClass7 = classAdapter6.getClass();
        boolean boolean8 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass7);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLdcInsn((java.lang.Object) type11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Callback callback5 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray6 = new org.mockito.cglib.proxy.Callback[] { callback5 };
        enhancer0.setCallbacks(callbackArray6);
        boolean boolean8 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor10);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer4.setCallback(callback7);
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer4.setCallback(callback9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer4.getStrategy();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        boolean boolean15 = type12.equals((java.lang.Object) classVisitor13);
        int int17 = type12.getOpcode(116);
        boolean boolean18 = generatorStrategy11.equals((java.lang.Object) 116);
        enhancer3.setStrategy(generatorStrategy11);
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        enhancer21.setUseFactory(true);
        enhancer21.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter26 = null;
        enhancer21.setCallbackFilter(callbackFilter26);
        java.lang.ClassLoader classLoader28 = enhancer21.getClassLoader();
        enhancer0.setClassLoader(classLoader28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class30 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 116 + "'", int17 == 116);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classLoader28);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 0, "(VZVDDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        boolean boolean13 = type10.equals((java.lang.Object) classVisitor11);
        int int15 = type10.getOpcode(116);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        boolean boolean21 = type18.equals((java.lang.Object) classVisitor19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter(classVisitor27);
        boolean boolean29 = type26.equals((java.lang.Object) classVisitor27);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type17, type18, type22, type24, type25, type26 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("V", type10, typeArray30);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor38 = null;
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter(classVisitor38);
        boolean boolean40 = type37.equals((java.lang.Object) classVisitor38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor46 = null;
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter(classVisitor46);
        boolean boolean48 = type45.equals((java.lang.Object) classVisitor46);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type36, type37, type41, type43, type44, type45 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray49);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame((int) (short) 1, 10, (java.lang.Object[]) typeArray30, 0, (java.lang.Object[]) typeArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 116 + "'", int15 == 116);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "V" + "'", str23, "V");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(VZVDDZ)V" + "'", str31, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(VZVDDZ)B" + "'", str33, "(VZVDDZ)B");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "V" + "'", str42, "V");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(VZVDDZ)V" + "'", str50, "(VZVDDZ)V");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        boolean boolean3 = type0.equals((java.lang.Object) classVisitor1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = type0.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn((int) ' ', "L1504852975(VZVDDZ)F", "L1657710914", "Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 0, "(VZVDDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(0, type5);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (byte) 100, type5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        boolean boolean15 = type12.equals((java.lang.Object) classVisitor13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        boolean boolean23 = type20.equals((java.lang.Object) classVisitor21);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type11, type12, type16, type18, type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("L1504852975", type9, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "V" + "'", str17, "V");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(VZVDDZ)V" + "'", str25, "(VZVDDZ)V");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(VZVDDZ)D" + "'", str27, "(VZVDDZ)D");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(157, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.Class<?> wildcardClass2 = classAdapter1.getClass();
        boolean boolean3 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        java.lang.Class<?> wildcardClass13 = classAdapter12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        java.lang.Class<?> wildcardClass17 = classAdapter16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        java.lang.Class<?> wildcardClass21 = classAdapter20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        java.lang.Class<?> wildcardClass25 = classAdapter24.getClass();
        boolean boolean26 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass13, wildcardClass17, wildcardClass21, wildcardClass25 };
        enhancer8.setInterfaces(classArray27);
        boolean boolean29 = enhancer8.getAttemptLoad();
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        java.lang.Class<?> wildcardClass32 = classAdapter31.getClass();
        boolean boolean33 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass32);
        boolean boolean34 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass32);
        enhancer8.setSuperclass((java.lang.Class) wildcardClass32);
        java.lang.Class[] classArray36 = new java.lang.Class[] { wildcardClass32 };
        java.util.List list37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass2, classArray36, list37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str6, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str7, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str14, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str18, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/ClassAdapter" + "'", str22, "org/mockito/asm/ClassAdapter");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classArray36);
    }
}
