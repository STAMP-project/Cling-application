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
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classEmitter1.visitMethod((int) (short) 10, "hi!", "hi!", "hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1d63f6be");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
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
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray9 = new java.lang.String[] { "I", "hi!", "I" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter1.visitMethod((int) 'a', "", "", "hi!", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37532f09");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
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
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class class2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer3 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray1, class2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter1.visitField((int) (short) 10, "I", "(SSII)I", "I", (java.lang.Object) type6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter0.visitField(130, "", "hi!", "(SSII)I", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = classEmitter1.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37e49b91");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
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
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
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
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
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
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("I", "L1553700172");
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
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("I", "", "(SSII)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
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
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
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
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
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
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("(SSII)I", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
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
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1553700172");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field((int) (short) 10, "Lorg/mockito/asm/Type;", type6, (java.lang.Object) "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
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
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer5 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) 10, type2);
        int int5 = type2.getOpcode(10);
        int int6 = type2.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        boolean boolean23 = type2.equals((java.lang.Object) typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(SSII)I" + "'", str22, "(SSII)I");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField((int) (short) -1, "I", "", "L1553700172", (java.lang.Object) type7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray10 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "org/mockito/asm/Type", "Lorg/mockito/asm/Type;", "L1553700172" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod((int) (short) 0, "Lorg/mockito/asm/Type;", "hi!(SSII)I", "org/mockito/asm/Type", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1006bb67");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        java.lang.Class<?> wildcardClass18 = type6.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass1, wildcardClass18 };
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray33);
        java.lang.Class<?> wildcardClass35 = type23.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer37 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray20, (java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str36, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter1.visitField(128, "Lorg/mockito/asm/Type;", "org/mockito/asm/Type", "org/mockito/asm/Type", (java.lang.Object) classEmitter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.Class<?> wildcardClass14 = type2.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(0, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray29);
        java.lang.Class<?> wildcardClass31 = type19.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass14, wildcardClass31, wildcardClass34 };
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) (short) 0, type40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(0, type47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type42, type45, type47, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type40, typeArray50);
        java.lang.Class<?> wildcardClass52 = type40.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer54 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray37, (java.lang.Class) wildcardClass52);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/asm/Type" + "'", str32, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str35, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org/mockito/asm/Type" + "'", str36, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org/mockito/asm/Type" + "'", str53, "org/mockito/asm/Type");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@676fdf47");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(6, "hi!(SSII)I", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
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
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "(SSII)I", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(2, 2, "Lorg/mockito/asm/Type;", "I", "int", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray18);
        java.lang.String str20 = type8.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classEmitter1.visitField(153, "Lorg/mockito/asm/Type;", "", "I", (java.lang.Object) type8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "I" + "'", str20, "I");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "L1553700172", "int" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter0.visitMethod((int) 'a', "L1553700172", "hi!", "int", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@10249c41");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = classEmitter1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("int");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1638432716" + "'", str1, "L1638432716");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type7);
        org.mockito.asm.Type type9 = local8.getType();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(154, "Lorg/mockito/asm/Type;", type5, (java.lang.Object) local8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("int", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(0, type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray32);
        java.lang.String str34 = type22.getDescriptor();
        boolean boolean35 = signature19.equals((java.lang.Object) type22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor36 = classEmitter0.visitField((int) (short) -1, "int", "hi!(SSII)I", "hi!(SSII)I", (java.lang.Object) type22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "I" + "'", str34, "I");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
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
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.Class<?> wildcardClass14 = type2.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(0, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray29);
        java.lang.Class<?> wildcardClass31 = type19.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        java.lang.Class<?> wildcardClass48 = type36.getClass();
        java.lang.String str49 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass14, wildcardClass16, wildcardClass31, wildcardClass48 };
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) (short) 0, type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean58 = type56.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(0, type61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type59, type61, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type54, typeArray64);
        java.lang.Class<?> wildcardClass66 = type54.getClass();
        java.lang.String str67 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer69 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray51, (java.lang.Class) wildcardClass66);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/asm/Type" + "'", str32, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str33, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org/mockito/asm/Type" + "'", str49, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "org/mockito/asm/Type" + "'", str67, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type68);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        int int14 = type11.getOpcode(10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classAdapter4.visitField(128, "(SSII)I", "org/mockito/asm/Type", "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        java.lang.String str21 = signature20.getDescriptor();
        boolean boolean23 = signature20.equals((java.lang.Object) "");
        java.lang.String str24 = signature20.getName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter39 = classEmitter0.begin_method(5, signature20, typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2703481a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(SSII)I" + "'", str21, "(SSII)I");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "org/mockito/asm/Type" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classAdapter1.visitMethod(154, "L1553700172", "", "I", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@15308d8a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(10, "", "int", "org/mockito/asm/Type", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(8, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(0, "L1553700172", type4, (java.lang.Object) 8);
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
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 100L;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        label10.info = (byte) 10;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        java.lang.Object obj17 = label15.info;
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] { label9, label10, label15 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) (short) -1, 8, label6, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1494918253" + "'", str11, "L1494918253");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1746835140" + "'", str16, "L1746835140");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        int[] intArray7 = new int[] { '#', 5 };
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        java.lang.Object obj16 = label14.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray19 = new org.mockito.asm.Label[] { label8, label10, label13, label14, label17, label18 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray7, labelArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 5]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L140103155" + "'", str9, "L140103155");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L679003006" + "'", str11, "L679003006");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L107821970" + "'", str15, "L107821970");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(labelArray19);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("hi!", "F", "(SSII)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(154, "hi!(SSII)I", "hi!", "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(126, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber((int) (short) 100, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L616372451" + "'", str6, "L616372451");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        java.lang.String str22 = signature21.getDescriptor();
        java.lang.String str23 = signature21.toString();
        org.mockito.asm.Type[] typeArray24 = signature21.getArgumentTypes();
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray24);
        java.lang.Object[] objArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(3, 130, (java.lang.Object[]) typeArray24, 126, objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(SSII)I" + "'", str22, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!(SSII)I" + "'", str23, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(SSII)I" + "'", str25, "(SSII)I");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        int int9 = type7.getSort();
        int int10 = type7.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter0.visitField((int) '#', "L1553700172", "(SSII)I", "Lorg/mockito/asm/Type;", (java.lang.Object) type7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray15);
        java.lang.Class<?> wildcardClass17 = type5.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.Class<?> wildcardClass32 = type20.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(0, type44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray47);
        java.lang.Class<?> wildcardClass49 = type37.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local((int) (short) 0, type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean59 = type57.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local(0, type62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type57, type60, type62, type64 };
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("hi!", type55, typeArray65);
        java.lang.Class<?> wildcardClass67 = type55.getClass();
        java.lang.String str68 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass67);
        java.lang.String str69 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass67);
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass67);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass67);
        java.lang.Class[] classArray72 = new java.lang.Class[] { wildcardClass1, wildcardClass17, wildcardClass32, wildcardClass49, wildcardClass67 };
        org.mockito.asm.Type type75 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local76 = new org.mockito.cglib.core.Local((int) (short) 0, type75);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean79 = type77.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type82 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local83 = new org.mockito.cglib.core.Local(0, type82);
        org.mockito.asm.Type type84 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray85 = new org.mockito.asm.Type[] { type77, type80, type82, type84 };
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("hi!", type75, typeArray85);
        java.lang.Class<?> wildcardClass87 = type75.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer88 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray72, (java.lang.Class) wildcardClass87);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/Type" + "'", str33, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org/mockito/asm/Type" + "'", str50, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str51, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org/mockito/asm/Type" + "'", str52, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "org/mockito/asm/Type" + "'", str68, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str69, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "org/mockito/asm/Type" + "'", str70, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L2046542498" + "'", str5, "L2046542498");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(104, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L202728058" + "'", str6, "L202728058");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3b2c8481");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(124, "L1839661580");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(126, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(0, "L1839661580", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.toString();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        java.lang.String str21 = signature17.getName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = signature35.getDescriptor();
        java.lang.String str37 = signature35.toString();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter39 = classEmitter1.begin_method((int) ' ', signature17, typeArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@79caed0d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(SSII)I" + "'", str18, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!(SSII)I" + "'", str19, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(SSII)I" + "'", str36, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!(SSII)I" + "'", str37, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray38);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray13 = new java.lang.String[] { "(BZZ)I", "L5916778", "hi!(IIJV)Z", "(BZZ)I", "(BZZ)I", "L1553700172" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((int) 'a', (int) ' ', "L652832830", "I", "hi!(IIJV)Z", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray15);
        java.lang.Class<?> wildcardClass17 = type5.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter(classVisitor20);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.declare_field(116, "int", type19, (java.lang.Object) classEmitter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/Type" + "'", str18, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray14 = new java.lang.String[] { "(BZZ)I", "Lorg/mockito/asm/Type;", "L1839661580", "", "org/mockito/asm/Type", "int" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visit(7, 104, "(BZZ)I", "hi!(IIJV)Z", "hi!(SSII)I", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation((int) (byte) 0, "hi!(IIJV)Z", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!(SSII)I", "hi!(IIJV)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'hi!(SSII)I' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type6 = null;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        org.mockito.asm.Type type13 = local12.getType();
        int int15 = type13.getOpcode(112);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (byte) 10, type18);
        int int21 = type18.getOpcode(10);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(0, type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray38);
        java.lang.String str40 = signature39.getDescriptor();
        java.lang.String str41 = signature39.toString();
        org.mockito.asm.Type[] typeArray42 = signature39.getArgumentTypes();
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray42);
        java.lang.String str44 = type25.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean48 = type46.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type23, type25, type45, type46 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray49);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type9, type13, type18 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray51);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class((int) '4', (int) (short) 1, "I", type6, typeArray51, "(SSII)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 112 + "'", int15 == 112);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(SSII)I" + "'", str40, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!(SSII)I" + "'", str41, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(SSII)I" + "'", str43, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "int" + "'", str44, "int");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(BZZ)I" + "'", str52, "(BZZ)I");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        org.mockito.asm.Type type14 = local13.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classAdapter4.visitField(158, "hi!(SSII)I", "L5916778", "L1839661580", (java.lang.Object) type14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        label7.info = (byte) 10;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("(BZZ)I", "hi!", "F", label7, label12, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1603546483" + "'", str8, "L1603546483");
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1362331311" + "'", str13, "L1362331311");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
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
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray14);
        java.lang.Class<?> wildcardClass16 = type4.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[] { wildcardClass1, wildcardClass16 };
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = signature31.getDescriptor();
        java.lang.String str33 = signature31.toString();
        org.mockito.asm.Type[] typeArray34 = signature31.getArgumentTypes();
        java.lang.Class<?> wildcardClass35 = signature31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer36 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray17, (java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(SSII)I" + "'", str32, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!(SSII)I" + "'", str33, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation((int) (short) 10, "L1553700172", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray8 = new java.lang.String[] { "L1839661580" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(0, 8, "Lorg/mockito/asm/Type;", "", "hi!(IIJV)Z", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1553700172");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(2, "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(108, "", "Lorg/mockito/asm/Type;", "int", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        java.lang.Object obj8 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(0, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L2072814298" + "'", str6, "L2072814298");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray18);
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.toString();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (byte) 10, type28);
        org.mockito.asm.Type type30 = local29.getType();
        int int32 = type30.getOpcode(112);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) (byte) 10, type35);
        int int38 = type35.getOpcode(10);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((int) (short) 0, type45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean49 = type47.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(0, type52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type50, type52, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("hi!", type45, typeArray55);
        java.lang.String str57 = signature56.getDescriptor();
        java.lang.String str58 = signature56.toString();
        org.mockito.asm.Type[] typeArray59 = signature56.getArgumentTypes();
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray59);
        java.lang.String str61 = type42.getClassName();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean65 = type63.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type40, type42, type62, type63 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray66);
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type26, type30, type35 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray68);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(1, 100, (java.lang.Object[]) typeArray22, 7, (java.lang.Object[]) typeArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(SSII)I" + "'", str20, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!(SSII)I" + "'", str21, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 112 + "'", int32 == 112);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(SSII)I" + "'", str57, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!(SSII)I" + "'", str58, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(SSII)I" + "'", str60, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "int" + "'", str61, "int");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(BZZ)I" + "'", str69, "(BZZ)I");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(128, "F", "hi!", "org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "L1553700172", "L1839661580", "org/mockito/asm/Type", "org/mockito/asm/Type", "I" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classAdapter4.visitMethod(112, "hi!", "(BZZ)I", "", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6ed798fc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type10 = local9.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classAdapter2.visitField(157, "hi!", "L5916778", "int", (java.lang.Object) local9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        java.lang.Object obj7 = label4.info;
        int[] intArray8 = null;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.Object obj11 = label9.info;
        label9.info = (byte) 10;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 100L;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        label19.info = 100L;
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] { label9, label14, label16, label19 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray8, labelArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1188450636" + "'", str5, "L1188450636");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1925652506" + "'", str10, "L1925652506");
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1640577963" + "'", str15, "L1640577963");
        org.junit.Assert.assertNotNull(labelArray22);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(0, "L652832830");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label6 = null;
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] { label7 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(104, 5, label6, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1739409218" + "'", str8, "L1739409218");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation((int) ' ', "hi!(IIJV)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray15);
        java.lang.String str17 = signature16.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = signature31.getDescriptor();
        java.lang.String str33 = signature31.toString();
        org.mockito.asm.Type[] typeArray34 = signature31.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter35 = classEmitter0.begin_method(128, signature16, typeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6d49fdfd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(SSII)I" + "'", str17, "(SSII)I");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(SSII)I" + "'", str32, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!(SSII)I" + "'", str33, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        label7.info = (byte) 10;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        label12.info = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("I", "L1553700172", "hi!(IIJV)Z", label7, label12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L177034773" + "'", str8, "L177034773");
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L459331727" + "'", str13, "L459331727");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter1.visitField((int) ' ', "Lorg/mockito/asm/Type;", "int", "(SSII)I", (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/Type" + "'", str8, "org/mockito/asm/Type");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(0, "", "Lorg/mockito/asm/Type;", "(SSII)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(BZZ)I", "L1553700172");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(BZZ)I' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        label5.info = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) (byte) 1, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1569497279" + "'", str6, "L1569497279");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("(SSII)I", 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (byte) 10, type8);
        org.mockito.asm.Type type10 = local9.getType();
        int int11 = type10.getSort();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 104, int11 };
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.String str28 = signature27.getDescriptor();
        java.lang.String str29 = signature27.toString();
        org.mockito.asm.Type[] typeArray30 = signature27.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(112, (int) 'a', objArray12, 128, (java.lang.Object[]) typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[104, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[104, 1]");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(SSII)I" + "'", str28, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!(SSII)I" + "'", str29, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(157, "L5916778", "(SSII)I", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(112, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(108, "int");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classAdapter1.visitField((int) '4', "L1553700172", "L1839661580", "L5916778", (java.lang.Object) classEmitter12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(108, "L652832830", "hi!(SSII)I", "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(124, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(104, "Z", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.toString();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(SSII)I" + "'", str18, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!(SSII)I" + "'", str19, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((int) (byte) 10, "L1553700172");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitInnerClass("org/mockito/asm/Type", "(SSII)I", "L5916778", 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitOuterClass("hi!(IIJV)Z", "", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(5, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitInnerClass("", "", "L5916778", 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classAdapter4.visitField(0, "I", "hi!", "hi!(IIJV)Z", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1686564777" + "'", str1, "L1686564777");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(104, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("I", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 100L;
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label7, label8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L606013370" + "'", str9, "L606013370");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(8, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1653506910" + "'", str6, "L1653506910");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 100L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label7, label8, "hi!(IIJV)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1632014368" + "'", str5, "L1632014368");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray9 = new java.lang.String[] { "int", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((int) (byte) 10, 112, "", "org/mockito/asm/Type", "F", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray13);
        java.lang.Class<?> wildcardClass15 = type3.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer20 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str17, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/Type" + "'", str18, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (byte) 10, type7);
        int int10 = type7.getOpcode(10);
        java.lang.String str11 = type7.getDescriptor();
        java.lang.Object[] objArray12 = new java.lang.Object[] { type7 };
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (byte) 10, type15);
        int int18 = type15.getOpcode(10);
        int int19 = type15.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray33);
        boolean boolean36 = type15.equals((java.lang.Object) typeArray33);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (short) 0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean43 = type41.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(0, type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray49);
        java.lang.Class<?> wildcardClass51 = type39.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        java.lang.String str53 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        java.lang.String str54 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type58 = type57.getElementType();
        boolean boolean60 = type57.equals((java.lang.Object) (-1.0d));
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean63 = type61.equals((java.lang.Object) (short) 0);
        int int64 = type61.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter65);
        boolean boolean67 = type61.equals((java.lang.Object) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter69 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter68);
        java.lang.Object[] objArray70 = new java.lang.Object[] { typeArray33, wildcardClass51, type57, classEmitter65, classEmitter68 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) (byte) 1, (int) (byte) 100, objArray12, 126, (java.lang.Object[]) typeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[Z]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[Z]");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(SSII)I" + "'", str35, "(SSII)I");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org/mockito/asm/Type" + "'", str52, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str53, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org/mockito/asm/Type" + "'", str54, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 100L;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitSource("L5916778", "L1839661580");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(126, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L376659788" + "'", str6, "L376659788");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(153, "(BZZ)I", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        label8.info = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L652832830", "I", "L1839661580", label7, label8, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 112");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L716972364" + "'", str9, "L716972364");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(128, "hi!(IIJV)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn((int) (short) 100, "L1553700172", "I", "hi!(SSII)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        label4.info = (byte) 10;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.Object obj11 = label9.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray27);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        label12.info = type29;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label9, label12, "L1553700172");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1461385872" + "'", str5, "L1461385872");
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L531421659" + "'", str10, "L531421659");
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L668287257" + "'", str13, "L668287257");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 10, type4);
        int int7 = type4.getOpcode(10);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray24);
        java.lang.String str26 = signature25.getDescriptor();
        java.lang.String str27 = signature25.toString();
        org.mockito.asm.Type[] typeArray28 = signature25.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray28);
        java.lang.String str30 = type11.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type9, type11, type31, type32 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!(SSII)I", type1, typeArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'hi!(SSII)I' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(SSII)I" + "'", str26, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!(SSII)I" + "'", str27, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(SSII)I" + "'", str29, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "int" + "'", str30, "int");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L5916778");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
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
        java.lang.String[] strArray8 = new java.lang.String[] { "int" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(5, (int) (byte) 1, "Lorg/mockito/asm/Type;", "", "L1092460119", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("Lorg/mockito/asm/Type;", "hi!(SSII)I", "hi!(SSII)I", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("I", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L1839661580", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(7, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        label4.info = type21;
        int[] intArray26 = new int[] { 5, 116, (-1) };
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.String str28 = label27.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label27, label29 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray26, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L2039940891" + "'", str5, "L2039940891");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[5, 116, -1]");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1307499741" + "'", str28, "L1307499741");
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        org.mockito.asm.Label[] labelArray14 = new org.mockito.asm.Label[] { label10 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(100, 1, label6, labelArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1579546182" + "'", str7, "L1579546182");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L704587894" + "'", str11, "L704587894");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(labelArray14);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!(IIJV)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L5916778", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(112, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("hi!", "I", "hi!(SSII)I", label7, label10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L288442645" + "'", str8, "L288442645");
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L107127721" + "'", str11, "L107127721");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (byte) 10, type7);
        int int10 = type7.getOpcode(10);
        int int11 = type7.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        boolean boolean28 = type7.equals((java.lang.Object) typeArray25);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray42);
        java.lang.String str44 = signature43.getDescriptor();
        java.lang.String str45 = signature43.toString();
        org.mockito.asm.Type[] typeArray46 = signature43.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(154, 96, (java.lang.Object[]) typeArray25, (int) (byte) -1, (java.lang.Object[]) typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(SSII)I" + "'", str27, "(SSII)I");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(SSII)I" + "'", str44, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!(SSII)I" + "'", str45, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray46);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        label7.info = (byte) 10;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("(SSII)I", "L1839661580", "L5916778", label7, label12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L643892084" + "'", str8, "L643892084");
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1077312716" + "'", str13, "L1077312716");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.Class<?> wildcardClass14 = type2.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.Class<?> wildcardClass33 = type21.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getReturnType("I");
        java.lang.Class<?> wildcardClass37 = type36.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) (short) 0, type40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(0, type47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type42, type45, type47, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", type40, typeArray50);
        java.lang.Class<?> wildcardClass52 = type40.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) (short) 0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean61 = type59.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(0, type64);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type59, type62, type64, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type57, typeArray67);
        java.lang.Class<?> wildcardClass69 = type57.getClass();
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass69);
        java.lang.String str71 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass69);
        java.lang.String str72 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass69);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        java.lang.Class[] classArray74 = new java.lang.Class[] { wildcardClass14, wildcardClass33, wildcardClass37, wildcardClass52, wildcardClass69 };
        org.mockito.asm.Type type77 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local78 = new org.mockito.cglib.core.Local((int) (short) 0, type77);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean81 = type79.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type84 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local85 = new org.mockito.cglib.core.Local(0, type84);
        org.mockito.asm.Type type86 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray87 = new org.mockito.asm.Type[] { type79, type82, type84, type86 };
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("hi!", type77, typeArray87);
        java.lang.Class<?> wildcardClass89 = type77.getClass();
        java.lang.String str90 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass89);
        org.mockito.asm.Type type91 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass89);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer92 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray74, (java.lang.Class) wildcardClass89);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org/mockito/asm/Type" + "'", str34, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str53, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "org/mockito/asm/Type" + "'", str70, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str71, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org/mockito/asm/Type" + "'", str72, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(type86);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str90, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type91);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(126, "Z", "I", "(SSII)I");
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
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter1.visitMethod((int) (short) 1, "org/mockito/asm/Type", "L652832830", "L1553700172", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@70281b4c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn((int) (byte) -1, "L1092460119", "I", "hi!(IIJV)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("hi!(SSII)I", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1092460119", "", "Lorg/mockito/asm/Type;", label7, label8, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn((int) (byte) 10, "hi!(SSII)I", "(BZZ)I", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitSource("org/mockito/asm/Type", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        label5.info = type22;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(116, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1853920025" + "'", str6, "L1853920025");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
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
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 100L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1839661580", "hi!(SSII)I", "org/mockito/asm/Type", label7, label10, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 153");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L876446340" + "'", str8, "L876446340");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = classEmitter0.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        int[] intArray7 = new int[] {};
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 100L;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 100L;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 100L;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        int int21 = type19.getSort();
        label16.info = int21;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.String str24 = label23.toString();
        java.lang.Object obj25 = label23.info;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(0, type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray38);
        org.mockito.asm.Type type40 = signature39.getReturnType();
        label23.info = type40;
        org.mockito.asm.Label label42 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray43 = new org.mockito.asm.Label[] { label8, label11, label14, label16, label23, label42 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray7, labelArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L877039070" + "'", str5, "L877039070");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1606054134" + "'", str15, "L1606054134");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L2127856259" + "'", str24, "L2127856259");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(labelArray43);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(157, "hi!(IIJV)Z", "(BZZ)I", "L1839661580", (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(154, "hi!", "I", "L1553700172");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (byte) 10, type5);
        org.mockito.asm.Type type7 = local6.getType();
        int int9 = type7.getOpcode(112);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) (byte) 10, type12);
        int int15 = type12.getOpcode(10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(0, type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray32);
        java.lang.String str34 = signature33.getDescriptor();
        java.lang.String str35 = signature33.toString();
        org.mockito.asm.Type[] typeArray36 = signature33.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray36);
        java.lang.String str38 = type19.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean42 = type40.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type17, type19, type39, type40 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray43);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type3, type7, type12 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray45);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((int) (short) 0, type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean53 = type51.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(0, type56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type54, type56, type58 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray59);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!(IIJV)Z", type2, typeArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'hi!(IIJV)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(SSII)I" + "'", str34, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!(SSII)I" + "'", str35, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(SSII)I" + "'", str37, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "int" + "'", str38, "int");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(BZZ)I" + "'", str46, "(BZZ)I");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(typeArray59);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter1.visitField(104, "(BZZ)I", "L1092460119", "int", (java.lang.Object) 157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(7, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        int[] intArray12 = new int[] { 2, 154, ' ', '#', 128 };
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 100L;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 100L;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        int int25 = type23.getSort();
        label20.info = int25;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        label27.info = 100L;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        int int32 = type30.getSort();
        label27.info = int32;
        org.mockito.asm.Label[] labelArray34 = new org.mockito.asm.Label[] { label13, label15, label17, label20, label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray12, labelArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1236520379" + "'", str5, "L1236520379");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2, 154, 32, 35, 128]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L64437407" + "'", str14, "L64437407");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1014476478" + "'", str16, "L1014476478");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(labelArray34);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(2, "(SSII)I", "F", "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.String str14 = signature13.getDescriptor();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type[] typeArray16 = signature13.getArgumentTypes();
        java.lang.Class<?> wildcardClass17 = signature13.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.Class<?> wildcardClass32 = type20.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(0, type44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray47);
        java.lang.Class<?> wildcardClass49 = type37.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass54 = type53.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        java.lang.Class[] classArray56 = new java.lang.Class[] { wildcardClass17, wildcardClass32, wildcardClass49, wildcardClass51, wildcardClass54 };
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local((int) (short) 0, type59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean63 = type61.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local67 = new org.mockito.cglib.core.Local(0, type66);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type61, type64, type66, type68 };
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("hi!", type59, typeArray69);
        java.lang.Class<?> wildcardClass71 = type59.getClass();
        java.lang.String str72 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass71);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer73 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray56, (java.lang.Class) wildcardClass71);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(SSII)I" + "'", str14, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!(SSII)I" + "'", str15, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/mockito/asm/Type" + "'", str33, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str52, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org/mockito/asm/Type" + "'", str55, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org/mockito/asm/Type" + "'", str72, "org/mockito/asm/Type");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "L5916778", "org/mockito/asm/Type", "F" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(126, 112, "I", "org/mockito/asm/Type", "void", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "hi!(IIJV)Z");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter24 = classEmitter1.begin_method(6, signature7, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@e5c5197");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(SSII)I" + "'", str23, "(SSII)I");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 100L;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        label5.info = int10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(2, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        label7.info = (byte) 10;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 100L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("(SSII)Z", "org/mockito/asm/Type", "L1092460119", label7, label12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L237111462" + "'", str8, "L237111462");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(126, "L5916778", "L5916778", "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(SSII)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("F");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        java.lang.Object obj7 = label4.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = type24.getDescriptor();
        boolean boolean37 = signature21.equals((java.lang.Object) type24);
        org.mockito.asm.Type type38 = signature21.getReturnType();
        label4.info = type38;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1430490966" + "'", str5, "L1430490966");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "I" + "'", str36, "I");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(type38);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = null;
        int[] intArray11 = new int[] { 3, 154, 96, 5, 9, 9 };
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray42);
        java.lang.String str44 = type32.getDescriptor();
        boolean boolean45 = signature29.equals((java.lang.Object) type32);
        org.mockito.asm.Type type46 = signature29.getReturnType();
        label12.info = type46;
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        java.lang.String str49 = label48.toString();
        java.lang.Object obj50 = label48.info;
        java.lang.Object obj51 = label48.info;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) (short) 0, type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean58 = type56.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(0, type61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type59, type61, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type54, typeArray64);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) (short) 0, type68);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean72 = type70.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local76 = new org.mockito.cglib.core.Local(0, type75);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type70, type73, type75, type77 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type68, typeArray78);
        java.lang.String str80 = type68.getDescriptor();
        boolean boolean81 = signature65.equals((java.lang.Object) type68);
        org.mockito.asm.Type type82 = signature65.getReturnType();
        label48.info = type82;
        org.mockito.asm.Label label84 = new org.mockito.asm.Label();
        java.lang.String str85 = label84.toString();
        java.lang.Object obj86 = label84.info;
        label84.info = (byte) 10;
        org.mockito.asm.Label label89 = new org.mockito.asm.Label();
        label89.info = 100L;
        org.mockito.asm.Type type92 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int93 = type92.getSize();
        int int94 = type92.getSort();
        label89.info = int94;
        org.mockito.asm.Label[] labelArray96 = new org.mockito.asm.Label[] { label12, label48, label84, label89 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray11, labelArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3, 154, 96, 5, 9, 9]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L643715529" + "'", str13, "L643715529");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "I" + "'", str44, "I");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(type46);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L1314378715" + "'", str49, "L1314378715");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "I" + "'", str80, "I");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(type82);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "L1093215343" + "'", str85, "L1093215343");
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(labelArray96);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 100L;
        int[] intArray7 = new int[] {};
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 100L;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSort();
        label8.info = int13;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        java.lang.Object obj17 = label15.info;
        label15.info = (byte) 10;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.String str21 = label20.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.String str23 = label22.toString();
        java.lang.Object obj24 = label22.info;
        label22.info = (byte) 10;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.String str28 = label27.toString();
        java.lang.Object obj29 = label27.info;
        java.lang.Object obj30 = label27.info;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (short) 0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean43 = type41.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local(0, type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type44, type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray49);
        java.lang.String str51 = signature50.getDescriptor();
        java.lang.String str52 = signature50.toString();
        org.mockito.asm.Type[] typeArray53 = signature50.getArgumentTypes();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type32, typeArray53);
        label27.info = type32;
        org.mockito.asm.Label[] labelArray57 = new org.mockito.asm.Label[] { label8, label15, label20, label22, label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray7, labelArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1442335992" + "'", str16, "L1442335992");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1409400894" + "'", str21, "L1409400894");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L335611815" + "'", str23, "L335611815");
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L416213665" + "'", str28, "L416213665");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(SSII)I" + "'", str51, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!(SSII)I" + "'", str52, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(SSII)I" + "'", str54, "(SSII)I");
        org.junit.Assert.assertNotNull(labelArray57);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("(SSII)Z", "L652832830", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(0, "org/mockito/asm/Type(SSII)Z", "I", "org/mockito/asm/Type(SSII)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type8, typeArray24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (byte) 10, type32);
        org.mockito.asm.Type type34 = local33.getType();
        int int36 = type34.getOpcode(112);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (byte) 10, type39);
        int int42 = type39.getOpcode(10);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((int) (short) 0, type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean53 = type51.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(0, type56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type54, type56, type58 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray59);
        java.lang.String str61 = signature60.getDescriptor();
        java.lang.String str62 = signature60.toString();
        org.mockito.asm.Type[] typeArray63 = signature60.getArgumentTypes();
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray63);
        java.lang.String str65 = type46.getClassName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean69 = type67.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type44, type46, type66, type67 };
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray70);
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type30, type34, type39 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray72);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter74 = classEmitter1.begin_method(153, signature27, typeArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@11252ec6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(SSII)I" + "'", str26, "(SSII)I");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 112 + "'", int36 == 112);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(SSII)I" + "'", str61, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!(SSII)I" + "'", str62, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(SSII)I" + "'", str64, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "int" + "'", str65, "int");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(BZZ)I" + "'", str73, "(BZZ)I");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("hi!(IIJV)Z", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(124, "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("(BZZ)I", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(BZZ)I", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(BZZ)I' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) (byte) 100, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        label4.info = wildcardClass7;
        int[] intArray13 = new int[] { '#', 154, '4', (-1) };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        java.lang.Object obj16 = label14.info;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        label14.info = type17;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.String str20 = label19.toString();
        java.lang.Object obj21 = label19.info;
        java.lang.Object obj22 = label19.info;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.String str24 = label23.toString();
        java.lang.Object obj25 = label23.info;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(0, type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray38);
        org.mockito.asm.Type type40 = signature39.getReturnType();
        label23.info = type40;
        org.mockito.asm.Label label42 = new org.mockito.asm.Label();
        java.lang.String str43 = label42.toString();
        java.lang.Object obj44 = label42.info;
        label42.info = (byte) 10;
        org.mockito.asm.Label label47 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] { label14, label19, label23, label42, label47 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray13, labelArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L184426166" + "'", str5, "L184426166");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 154, 52, -1]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1159385169" + "'", str15, "L1159385169");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(type17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L535858271" + "'", str20, "L535858271");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L2102441866" + "'", str24, "L2102441866");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type40);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L338349509" + "'", str43, "L338349509");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(labelArray48);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L1946254240", 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L822689388");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lorg.mockito.asm.Type;", "int" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classAdapter4.visitMethod(104, "L5916778", "(BZZ)I", "(SSII)I", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@20623c1b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(8, "", "Lorg/mockito/asm/Type;", "L822689388");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        java.lang.Object obj7 = label4.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.String str28 = signature27.getDescriptor();
        java.lang.String str29 = signature27.toString();
        org.mockito.asm.Type[] typeArray30 = signature27.getArgumentTypes();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type9, typeArray30);
        label4.info = type9;
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        label34.info = 100L;
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.String str38 = label37.toString();
        java.lang.Object obj39 = label37.info;
        java.lang.Object obj40 = label37.info;
        java.lang.Object obj41 = label37.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label34, label37, "hi!(SSII)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1696715140" + "'", str5, "L1696715140");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(SSII)I" + "'", str28, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!(SSII)I" + "'", str29, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(SSII)I" + "'", str31, "(SSII)I");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L314698675" + "'", str38, "L314698675");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("(BZZ)I", false);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(112, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitOuterClass("org/mockito/asm/Type(SSII)Z", "L822689388", "L652832830");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = new java.lang.String[] { "L1839661580" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(4, 8, "Lorg.mockito.asm.Type;", "org/mockito/asm/Type", "hi!", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (short) 0);
        int int3 = type0.getSize();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (short) 0);
        int int12 = type9.getSize();
        java.lang.Class<?> wildcardClass13 = type9.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.Class<?> wildcardClass28 = type16.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass4, wildcardClass6, wildcardClass13, wildcardClass28 };
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass31 = type30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer32 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray29, (java.lang.Class) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type7, typeArray17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.String str33 = type21.getDescriptor();
        boolean boolean34 = signature18.equals((java.lang.Object) type21);
        java.lang.String str35 = signature18.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        int int39 = type37.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (short) 0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean47 = type45.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type45, type48, type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", type43, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray53);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type37, typeArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter57 = classEmitter0.begin_method((int) (byte) 100, signature18, typeArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@44b82f7d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "I" + "'", str33, "I");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(SSII)I" + "'", str35, "(SSII)I");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(SSII)I" + "'", str55, "(SSII)I");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("void", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) '4', 128);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray24);
        java.lang.String str26 = signature25.getDescriptor();
        java.lang.String str27 = signature25.toString();
        org.mockito.asm.Type[] typeArray28 = signature25.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type7, typeArray28);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(0, type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", type34, typeArray44);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local((int) (short) 0, type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(0, type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type50, type53, type55, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type48, typeArray58);
        java.lang.String str60 = type48.getDescriptor();
        boolean boolean61 = signature45.equals((java.lang.Object) type48);
        org.mockito.asm.Type[] typeArray62 = signature45.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) 'a', (int) (byte) 10, (java.lang.Object[]) typeArray28, 116, (java.lang.Object[]) typeArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(SSII)I" + "'", str26, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!(SSII)I" + "'", str27, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(SSII)I" + "'", str29, "(SSII)I");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "I" + "'", str60, "I");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typeArray62);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitSource("void", "L1553700172");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 100L;
        java.lang.Object obj7 = label4.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label8, label12, "org/mockito/asm/Type(SSII)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L238732027" + "'", str9, "L238732027");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 100L;
        java.lang.Object obj14 = label11.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("Lorg.mockito.asm.Type;", "Lorg.mockito.asm.Type;", "org/mockito/asm/Type", label7, label11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L759863268" + "'", str8, "L759863268");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100L + "'", obj14, 100L);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type9, typeArray25);
        int int29 = type9.getSort();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(104, type9);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) (short) 0, type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(0, type42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type40, type42, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray45);
        java.lang.String str47 = signature46.getDescriptor();
        java.lang.String str48 = signature46.toString();
        org.mockito.asm.Type[] typeArray49 = signature46.getArgumentTypes();
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray49);
        java.lang.String str51 = type32.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field(108, "(BZZ)I", type9, (java.lang.Object) type32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(SSII)I" + "'", str27, "(SSII)I");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(SSII)I" + "'", str47, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!(SSII)I" + "'", str48, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(SSII)I" + "'", str50, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "int" + "'", str51, "int");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(5, 0);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 100L;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSort();
        label8.info = int13;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        java.lang.Object obj17 = label15.info;
        label15.info = (byte) 10;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 100L;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        int int25 = type23.getSort();
        label20.info = int25;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.String str28 = label27.toString();
        java.lang.Object obj29 = label27.info;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray42);
        org.mockito.asm.Type type44 = signature43.getReturnType();
        label27.info = type44;
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        java.lang.String str47 = label46.toString();
        java.lang.Object obj48 = label46.info;
        java.lang.Object obj49 = label46.info;
        org.mockito.asm.Label label50 = new org.mockito.asm.Label();
        label50.info = 100L;
        java.lang.Object obj53 = label50.info;
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] { label8, label15, label20, label27, label46, label50 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(153, 156, label6, labelArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1944325694" + "'", str7, "L1944325694");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L628948475" + "'", str16, "L628948475");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L682634192" + "'", str28, "L682634192");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L1278281544" + "'", str47, "L1278281544");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100L + "'", obj53, 100L);
        org.junit.Assert.assertNotNull(labelArray54);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) (byte) -1, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        java.lang.Object obj8 = label5.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray27);
        java.lang.String str29 = signature28.getDescriptor();
        java.lang.String str30 = signature28.toString();
        org.mockito.asm.Type[] typeArray31 = signature28.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type10, typeArray31);
        label5.info = type10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(1, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1975878320" + "'", str6, "L1975878320");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(SSII)I" + "'", str29, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!(SSII)I" + "'", str30, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(SSII)I" + "'", str32, "(SSII)I");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) ' ', "org/mockito/asm/Type", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitAttribute(attribute6);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(157, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(8, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        label8.info = type11;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        label13.info = wildcardClass16;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1919555830", "org/mockito/asm/Type", "L1553700172", label8, label13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L515510805" + "'", str9, "L515510805");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(type11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L376592055" + "'", str14, "L376592055");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) (byte) 1, (-1));
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L652832830");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn((int) (byte) 100, "I", "", "L822689388");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter7.visitField(157, "L1553700172", "L1919555830", "L5916778", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((int) (short) 0, "L5916778");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L652832830", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray33);
        java.lang.String str35 = type23.getDescriptor();
        boolean boolean36 = signature20.equals((java.lang.Object) type23);
        org.mockito.asm.Type[] typeArray37 = signature20.getArgumentTypes();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (byte) 10, type43);
        org.mockito.asm.Type type45 = local44.getType();
        int int47 = type45.getOpcode(112);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (byte) 10, type50);
        int int53 = type50.getOpcode(10);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local((int) (short) 0, type60);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean64 = type62.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local(0, type67);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type62, type65, type67, type69 };
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("hi!", type60, typeArray70);
        java.lang.String str72 = signature71.getDescriptor();
        java.lang.String str73 = signature71.toString();
        org.mockito.asm.Type[] typeArray74 = signature71.getArgumentTypes();
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray74);
        java.lang.String str76 = type57.getClassName();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean80 = type78.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type55, type57, type77, type78 };
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray81);
        org.mockito.asm.Type[] typeArray83 = new org.mockito.asm.Type[] { type41, type45, type50 };
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray83);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(104, (int) (short) 1, (java.lang.Object[]) typeArray37, 9, (java.lang.Object[]) typeArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "I" + "'", str35, "I");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 112 + "'", int47 == 112);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(SSII)I" + "'", str72, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!(SSII)I" + "'", str73, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(SSII)I" + "'", str75, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "int" + "'", str76, "int");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "(BZZ)I" + "'", str84, "(BZZ)I");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(0, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray37);
        java.lang.String str39 = type27.getDescriptor();
        boolean boolean40 = signature24.equals((java.lang.Object) type27);
        java.lang.String str41 = signature24.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) (byte) 10, type44);
        int int47 = type44.getOpcode(10);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) (short) 0, type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean58 = type56.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(0, type61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type59, type61, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type54, typeArray64);
        java.lang.String str66 = signature65.getDescriptor();
        java.lang.String str67 = signature65.toString();
        org.mockito.asm.Type[] typeArray68 = signature65.getArgumentTypes();
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray68);
        java.lang.String str70 = type51.getClassName();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean74 = type72.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type49, type51, type71, type72 };
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("hi!", type44, typeArray75);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter77 = classEmitter7.begin_method(116, signature24, typeArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7c79a8a5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "I" + "'", str39, "I");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(SSII)I" + "'", str41, "(SSII)I");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(SSII)I" + "'", str66, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!(SSII)I" + "'", str67, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(SSII)I" + "'", str69, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "int" + "'", str70, "int");
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(typeArray75);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        label4.info = type7;
        int[] intArray14 = new int[] { (byte) -1, 10, '4', 124, (byte) 1 };
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray14, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1527560102" + "'", str5, "L1527560102");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 52, 124, 1]");
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature13.equals((java.lang.Object) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.visitOuterClass("org/mockito/asm/Type(SSII)Z", "org/mockito/asm/Type", "L1655322812");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation((int) (byte) 0, "Lint;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray33);
        java.lang.String str35 = type23.getDescriptor();
        boolean boolean36 = signature20.equals((java.lang.Object) type23);
        org.mockito.asm.Type[] typeArray37 = signature20.getArgumentTypes();
        org.mockito.asm.Type[] typeArray40 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(153, 96, (java.lang.Object[]) typeArray37, 157, (java.lang.Object[]) typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "I" + "'", str35, "I");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
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
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (byte) 10, type18);
        org.mockito.asm.Type type20 = local19.getType();
        int int22 = type20.getOpcode(112);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (byte) 10, type25);
        int int28 = type25.getOpcode(10);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((int) (short) 0, type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(0, type42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type40, type42, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray45);
        java.lang.String str47 = signature46.getDescriptor();
        java.lang.String str48 = signature46.toString();
        org.mockito.asm.Type[] typeArray49 = signature46.getArgumentTypes();
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray49);
        java.lang.String str51 = type32.getClassName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean55 = type53.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type30, type32, type52, type53 };
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray56);
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type16, type20, type25 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor60 = classEmitter7.visitField((int) (short) 1, "L1946254240", "org/mockito/asm/Type(SSII)Z", "L1655322812", (java.lang.Object) typeArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 112 + "'", int22 == 112);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(SSII)I" + "'", str47, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!(SSII)I" + "'", str48, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(SSII)I" + "'", str50, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "int" + "'", str51, "int");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(BZZ)I" + "'", str59, "(BZZ)I");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        java.lang.Object obj10 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber((int) (byte) 0, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L743917949" + "'", str7, "L743917949");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "void", "Lint;", "I" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(157, "org/mockito/asm/Type", "L652832830", "org/mockito/asm/Type(SSII)Z", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@419a880a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1553700172", "L1655322812", "L783288789", "Z", "L5916778" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(9, 108, "char", "org/mockito/asm/Type", "Lint;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter3.visitParameterAnnotation((int) (short) 10, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        org.mockito.asm.Attribute attribute45 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter43.visitAttribute(attribute45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1993287058" + "'", str1, "L1993287058");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "I" + "'", str32, "I");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("org/mockito/asm/Type", 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
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
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray25);
        java.lang.Class<?> wildcardClass27 = type15.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (byte) 10, type34);
        org.mockito.asm.Type type36 = local35.getType();
        int int38 = type36.getOpcode(112);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) (byte) 10, type41);
        int int44 = type41.getOpcode(10);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) (short) 0, type51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean55 = type53.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(0, type58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type53, type56, type58, type60 };
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("hi!", type51, typeArray61);
        java.lang.String str63 = signature62.getDescriptor();
        java.lang.String str64 = signature62.toString();
        org.mockito.asm.Type[] typeArray65 = signature62.getArgumentTypes();
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray65);
        java.lang.String str67 = type48.getClassName();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean71 = type69.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type46, type48, type68, type69 };
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!", type41, typeArray72);
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type32, type36, type41 };
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray74);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.begin_class(104, (-1), "(SSII)Z", type29, typeArray74, "L1655322812");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/asm/Type" + "'", str28, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 112 + "'", int38 == 112);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(SSII)I" + "'", str63, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!(SSII)I" + "'", str64, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(SSII)I" + "'", str66, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "int" + "'", str67, "int");
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(BZZ)I" + "'", str75, "(BZZ)I");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitSource("hi!(IIJV)Z", "L822689388");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(0, 157);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn((int) (short) 0, "(IIJV)Z", "F", "L5916778");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "Z", "L783288789", "L1839661580", "void" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classAdapter4.visitMethod((-1), "hi!", "char", "L1839661580", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@59704025");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(116, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@e006631");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "I", "L1655322812" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter0.visitMethod(104, "(SSII)J", "Lorg.mockito.asm.Type;", "hi!(IIJV)Z", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(SSII)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = signature31.getDescriptor();
        java.lang.String str33 = signature31.toString();
        org.mockito.asm.Type[] typeArray34 = signature31.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type13, typeArray34);
        label8.info = type13;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("(BZZ)I", "char", "F", label7, label8, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L2130769283" + "'", str9, "L2130769283");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(SSII)I" + "'", str32, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!(SSII)I" + "'", str33, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(SSII)I" + "'", str35, "(SSII)I");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L1553700172", (int) (byte) -1);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 100L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("I", "(BZZ)I", "L652832830", label8, label10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1231558526" + "'", str9, "L1231558526");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 100L;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(130, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100L + "'", obj9, 100L);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(7, 156, "Lint;", "L1839661580", "(SSII)Z", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(130, "(SSII)J", "L824714731", "L230405251");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("(SSII)J", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 100L;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSort();
        label8.info = int13;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("F", "org/mockito/asm/Type", "L824714731", label8, label15, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 156");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.Class<?> wildcardClass9 = classEmitter8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer10 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ClassEmitter.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        java.lang.Object obj7 = label4.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = type24.getDescriptor();
        boolean boolean37 = signature21.equals((java.lang.Object) type24);
        org.mockito.asm.Type type38 = signature21.getReturnType();
        label4.info = type38;
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter40.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classAdapter44);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter44);
        label4.info = classEmitter47;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) classEmitter47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1926156502" + "'", str5, "L1926156502");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "I" + "'", str36, "I");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(157, (int) 'a');
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (byte) 10, type8);
        int int11 = type8.getOpcode(10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray28);
        java.lang.String str30 = signature29.getDescriptor();
        java.lang.String str31 = signature29.toString();
        org.mockito.asm.Type[] typeArray32 = signature29.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        java.lang.String str34 = type15.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type13, type15, type35, type36 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("int", type8, typeArray42);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter44.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter44);
        boolean boolean48 = signature43.equals((java.lang.Object) classAdapter47);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) boolean48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(SSII)I" + "'", str30, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!(SSII)I" + "'", str31, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(SSII)I" + "'", str33, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "int" + "'", str34, "int");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 100L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(7, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L5916778", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter3.visitParameterAnnotation(108, "Lint;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (byte) 10, type3);
        int int6 = type3.getOpcode(10);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.String str29 = type10.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type8, type10, type30, type31 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("int", type3, typeArray37);
        java.lang.String str39 = type3.getClassName();
        int int40 = type3.getSort();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(SSII)I" + "'", str25, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!(SSII)I" + "'", str26, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(SSII)I" + "'", str28, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "int" + "'", str29, "int");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "boolean" + "'", str39, "boolean");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L240028556" + "'", str6, "L240028556");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor22 = classEmitter6.visitMethod((int) (short) -1, "L5916778", "boolean", "", strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@352d6690");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1554132935" + "'", str1, "L1554132935");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7af222cc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 100L;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        label6.info = int11;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(2, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(126, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(158, 2);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        java.lang.Object obj13 = label11.info;
        java.lang.Object obj14 = label11.info;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (short) 0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean35 = type33.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(0, type38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type33, type36, type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray41);
        java.lang.String str43 = type31.getDescriptor();
        boolean boolean44 = signature28.equals((java.lang.Object) type31);
        org.mockito.asm.Type type45 = signature28.getReturnType();
        label11.info = type45;
        org.mockito.asm.Label label47 = new org.mockito.asm.Label();
        java.lang.String str48 = label47.toString();
        org.mockito.asm.Label label49 = new org.mockito.asm.Label();
        java.lang.String str50 = label49.toString();
        java.lang.Object obj51 = label49.info;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) (short) 0, type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean58 = type56.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local(0, type61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type56, type59, type61, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type54, typeArray64);
        org.mockito.asm.Type type66 = signature65.getReturnType();
        label49.info = type66;
        org.mockito.asm.Label label68 = new org.mockito.asm.Label();
        java.lang.String str69 = label68.toString();
        java.lang.Object obj70 = label68.info;
        java.lang.Object obj71 = label68.info;
        java.lang.Object obj72 = label68.info;
        org.mockito.asm.Label[] labelArray73 = new org.mockito.asm.Label[] { label11, label47, label49, label68 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) '4', 0, label7, labelArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1183976488" + "'", str8, "L1183976488");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L4520395" + "'", str12, "L4520395");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "I" + "'", str43, "I");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(type45);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L124680656" + "'", str48, "L124680656");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L638797061" + "'", str50, "L638797061");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(type66);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "L1891040931" + "'", str69, "L1891040931");
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(labelArray73);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation(156, "L783288789", true);
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
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classEmitter0.visitMethod(10, "L1655322812", "void", "(SSII)J", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@35379df3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 100L;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(6, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100L + "'", obj9, 100L);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 0, "char", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray30);
        java.lang.String str32 = type20.getDescriptor();
        boolean boolean33 = signature17.equals((java.lang.Object) type20);
        org.mockito.asm.Type type34 = signature17.getReturnType();
        label0.info = type34;
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        label0.info = classEmitter43;
        java.lang.String[] strArray54 = new java.lang.String[] { "L1946254240", "L1839661580", "boolean", "hi!(IIJV)Z", "L1092460119" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor55 = classEmitter43.visitMethod(126, "(SSII)J", "L1092460119", "F", strArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(SSII)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L597445528" + "'", str1, "L597445528");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "I" + "'", str32, "I");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (short) 10, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
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
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classAdapter2.visitMethod(1, "L1277466335", "L5916778", "(SSII)Z", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7e903151");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L5916778");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        label5.info = (byte) 10;
        java.lang.String str10 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(156, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1897833013" + "'", str6, "L1897833013");
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1897833013" + "'", str10, "L1897833013");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        int[] intArray11 = new int[] { (byte) 1, 126, 128, (byte) 0, (byte) 0, 1 };
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.String str13 = label12.toString();
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(0, type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray42);
        java.lang.String str44 = type32.getDescriptor();
        boolean boolean45 = signature29.equals((java.lang.Object) type32);
        org.mockito.asm.Type type46 = signature29.getReturnType();
        label12.info = type46;
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classAdapter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter52);
        label12.info = classEmitter55;
        org.mockito.asm.Label label57 = new org.mockito.asm.Label();
        java.lang.String str58 = label57.toString();
        java.lang.Object obj59 = label57.info;
        java.lang.Object obj60 = label57.info;
        org.mockito.asm.Label label61 = new org.mockito.asm.Label();
        java.lang.String str62 = label61.toString();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass64 = type63.getClass();
        label61.info = wildcardClass64;
        org.mockito.asm.Label label66 = new org.mockito.asm.Label();
        java.lang.String str67 = label66.toString();
        java.lang.Object obj68 = label66.info;
        org.mockito.asm.Label[] labelArray69 = new org.mockito.asm.Label[] { label12, label57, label61, label66 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray11, labelArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 126, 128, 0, 0, 1]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1409289201" + "'", str13, "L1409289201");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "I" + "'", str44, "I");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "L1977535671" + "'", str58, "L1977535671");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "L299165695" + "'", str62, "L299165695");
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(wildcardClass64);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "L314510461" + "'", str67, "L314510461");
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(labelArray69);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1946254240");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        label6.info = (byte) 10;
        java.lang.String str11 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(0, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1579301664" + "'", str7, "L1579301664");
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1579301664" + "'", str11, "L1579301664");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        label5.info = wildcardClass8;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(0, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1093694624" + "'", str6, "L1093694624");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(9, "Lorg/mockito/asm/Type;", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray23);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        label8.info = type25;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L783288789", "", "L824714731", label7, label8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1871989473" + "'", str9, "L1871989473");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray25);
        java.lang.String str27 = signature26.getDescriptor();
        java.lang.String str28 = signature26.toString();
        org.mockito.asm.Type[] typeArray29 = signature26.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type8, typeArray29);
        java.lang.Object[] objArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(153, 156, (java.lang.Object[]) typeArray29, 5, objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(SSII)I" + "'", str27, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!(SSII)I" + "'", str28, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(SSII)I" + "'", str30, "(SSII)I");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(7, "(IIJV)Z", "L230405251", "");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        java.lang.Object obj8 = label5.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray27);
        java.lang.String str29 = signature28.getDescriptor();
        java.lang.String str30 = signature28.toString();
        org.mockito.asm.Type[] typeArray31 = signature28.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type10, typeArray31);
        label5.info = type10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(0, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1454674742" + "'", str6, "L1454674742");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(SSII)I" + "'", str29, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!(SSII)I" + "'", str30, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(SSII)I" + "'", str32, "(SSII)I");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn((int) (byte) 1);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(5, (int) '4');
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
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (byte) 10, type11);
        int int14 = type11.getOpcode(10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray31);
        java.lang.String str33 = signature32.getDescriptor();
        java.lang.String str34 = signature32.toString();
        org.mockito.asm.Type[] typeArray35 = signature32.getArgumentTypes();
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        java.lang.String str37 = type18.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type16, type18, type38, type39 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("int", type11, typeArray45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter47.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        boolean boolean51 = signature46.equals((java.lang.Object) classAdapter50);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor52 = classEmitter0.visitField((int) (byte) -1, "(SSII)Z", "org/mockito/asm/Type", "hi!(IIJV)Z", (java.lang.Object) signature46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(SSII)I" + "'", str33, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!(SSII)I" + "'", str34, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(SSII)I" + "'", str36, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "int" + "'", str37, "int");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(155, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 100L;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSort();
        label6.info = int11;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 100L;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        int int18 = type16.getSort();
        label13.info = int18;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label5, label6, label13, "int");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 100L;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        int int12 = type10.getSort();
        label7.info = int12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        label16.info = wildcardClass19;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.String str22 = label21.toString();
        java.lang.Object obj23 = label21.info;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        label21.info = type24;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.String str27 = label26.toString();
        label26.info = 156;
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label14, label15, label16, label21, label26 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(156, 8, label7, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L2059869379" + "'", str17, "L2059869379");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L2109280843" + "'", str22, "L2109280843");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(type24);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L353950229" + "'", str27, "L353950229");
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = classEmitter3.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitInnerClass("L1919555830", "L652832830", "L1839661580", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        java.lang.Object obj10 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(130, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1413550420" + "'", str7, "L1413550420");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer4 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        java.lang.Class<?> wildcardClass18 = type6.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.lang.String str21 = type20.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str21, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn((int) (short) 0, "L1839661580", "L783288789", "L1919555830");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(96, "I", "L1919555830", "(IIJV)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
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
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        label5.info = type8;
        int[] intArray12 = new int[] { 130, 130 };
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        java.lang.Object obj15 = label13.info;
        java.lang.Object obj16 = label13.info;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray35);
        java.lang.String str37 = signature36.getDescriptor();
        java.lang.String str38 = signature36.toString();
        org.mockito.asm.Type[] typeArray39 = signature36.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type18, typeArray39);
        label13.info = type18;
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        java.lang.String str44 = label43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass46 = type45.getClass();
        label43.info = wildcardClass46;
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        java.lang.String str49 = label48.toString();
        java.lang.Object obj50 = label48.info;
        label48.info = (byte) 10;
        java.lang.String str53 = label48.toString();
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] { label13, label43, label48 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray12, labelArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1580138844" + "'", str6, "L1580138844");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[130, 130]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L447570299" + "'", str14, "L447570299");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(SSII)I" + "'", str37, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!(SSII)I" + "'", str38, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(SSII)I" + "'", str40, "(SSII)I");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "L1228583655" + "'", str44, "L1228583655");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(wildcardClass46);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L657735981" + "'", str49, "L657735981");
        org.junit.Assert.assertNull(obj50);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L657735981" + "'", str53, "L657735981");
        org.junit.Assert.assertNotNull(labelArray54);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter6.visitField((int) '#', "L1092460119", "L652832830", "L652832830", (java.lang.Object) "L230405251");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(0, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(154);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn(100, "hi!", "L1092460119", "");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 100L;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        label5.info = int10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) '4', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 100L;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(4, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100L + "'", obj9, 100L);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (byte) 10, type13);
        int int16 = type13.getOpcode(10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter7.visitField(4, "", "(SSII)J", "(SSII)I", (java.lang.Object) type13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(156, "L1057178490", "char", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(116, type15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray35);
        java.lang.String str37 = signature36.getDescriptor();
        java.lang.String str38 = signature36.toString();
        org.mockito.asm.Type[] typeArray39 = signature36.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type18, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class((int) (byte) 100, (int) (byte) 1, "L5916778", type15, typeArray39, "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(SSII)I" + "'", str37, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!(SSII)I" + "'", str38, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(SSII)I" + "'", str40, "(SSII)I");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        label4.info = (byte) 10;
        java.lang.String str9 = label4.toString();
        java.lang.String str10 = label4.toString();
        int[] intArray11 = null;
        org.mockito.asm.Label[] labelArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray11, labelArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1734386202" + "'", str5, "L1734386202");
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1734386202" + "'", str9, "L1734386202");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1734386202" + "'", str10, "L1734386202");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        java.lang.Object obj8 = label5.info;
        java.lang.Object obj9 = label5.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label10, label14, "hi!(IIJV)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1931878745" + "'", str6, "L1931878745");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1645572485" + "'", str11, "L1645572485");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1520155617" + "'", str15, "L1520155617");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        label6.info = wildcardClass9;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(0, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1030191440" + "'", str7, "L1030191440");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        java.lang.Object obj8 = label5.info;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray35);
        java.lang.String str37 = type25.getDescriptor();
        boolean boolean38 = signature22.equals((java.lang.Object) type25);
        org.mockito.asm.Type type39 = signature22.getReturnType();
        label5.info = type39;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L2011809880" + "'", str6, "L2011809880");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "I" + "'", str37, "I");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(type39);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter2.visitAnnotation("L1839661580", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.lang.Class[] classArray3 = new java.lang.Class[] { wildcardClass2 };
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray16);
        java.lang.Class<?> wildcardClass18 = type6.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer21 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray3, (java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/Type" + "'", str19, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter3.visitParameterAnnotation(1, "L5916778", true);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((int) (short) 10, "L822689388");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.Object obj9 = label7.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 100L;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSort();
        label10.info = int15;
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] { label7, label10 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(1, 9, label6, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L873712656" + "'", str8, "L873712656");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn((int) (short) 0);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(96, "", "void", "Lorg.mockito.asm.Type;");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("I", 116);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (short) -1, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        java.lang.Object obj7 = label4.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = type24.getDescriptor();
        boolean boolean37 = signature21.equals((java.lang.Object) type24);
        org.mockito.asm.Type type38 = signature21.getReturnType();
        label4.info = type38;
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        label4.info = classEmitter40;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L632010084" + "'", str5, "L632010084");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "I" + "'", str36, "I");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNull(classInfo41);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(155, "char", "", "L5916778");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter0.visitField(7, "org/mockito/cglib/core/Signature", "L1946254240", "L652832830(SSII)Z", (java.lang.Object) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = 156;
        int[] intArray15 = new int[] { (byte) 0, 112, 4, 5, '#', 8 };
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        java.lang.Object obj18 = label16.info;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        label16.info = type19;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.String str22 = label21.toString();
        java.lang.Object obj23 = label21.info;
        label21.info = (byte) 10;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.String str27 = label26.toString();
        java.lang.Object obj28 = label26.info;
        java.lang.Object obj29 = label26.info;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        java.lang.Object obj32 = label30.info;
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", type36, typeArray46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((int) (short) 0, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type52, type55, type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray60);
        java.lang.String str62 = type50.getDescriptor();
        boolean boolean63 = signature47.equals((java.lang.Object) type50);
        org.mockito.asm.Type type64 = signature47.getReturnType();
        label30.info = type64;
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        label30.info = classEmitter66;
        org.mockito.asm.Label label69 = new org.mockito.asm.Label();
        java.lang.String str70 = label69.toString();
        java.lang.Object obj71 = label69.info;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local75 = new org.mockito.cglib.core.Local((int) (short) 0, type74);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean78 = type76.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local82 = new org.mockito.cglib.core.Local(0, type81);
        org.mockito.asm.Type type83 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray84 = new org.mockito.asm.Type[] { type76, type79, type81, type83 };
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("hi!", type74, typeArray84);
        org.mockito.asm.Type type86 = signature85.getReturnType();
        label69.info = type86;
        label69.info = "L1839661580";
        org.mockito.asm.Label[] labelArray90 = new org.mockito.asm.Label[] { label16, label21, label26, label30, label69 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray15, labelArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L511713834" + "'", str6, "L511713834");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 112, 4, 5, 35, 8]");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1494888878" + "'", str17, "L1494888878");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(type19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L287372175" + "'", str22, "L287372175");
        org.junit.Assert.assertNull(obj23);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1350699729" + "'", str27, "L1350699729");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1326248857" + "'", str31, "L1326248857");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "I" + "'", str62, "I");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNull(classInfo67);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "L1192443031" + "'", str70, "L1192443031");
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertNotNull(type86);
        org.junit.Assert.assertNotNull(labelArray90);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L652832830(SSII)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("L1839661580", "(SSII)I");
        org.mockito.asm.Type[] typeArray10 = signature9.getArgumentTypes();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (byte) 10, type14);
        int int17 = type14.getOpcode(10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray34);
        java.lang.String str36 = signature35.getDescriptor();
        java.lang.String str37 = signature35.toString();
        org.mockito.asm.Type[] typeArray38 = signature35.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray38);
        java.lang.String str40 = type21.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type19, type21, type41, type42 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray45);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(0, 116, (java.lang.Object[]) typeArray10, 158, (java.lang.Object[]) typeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(SSII)I" + "'", str36, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!(SSII)I" + "'", str37, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(SSII)I" + "'", str39, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "int" + "'", str40, "int");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typeArray45);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "(IIJV)Z", "void", "L19896701", "L1655322812", "boolean" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(155, (int) (short) 10, "L1946254240", "(SSII)I", "L1057178490", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray25);
        java.lang.String str27 = signature26.getDescriptor();
        java.lang.String str28 = signature26.toString();
        org.mockito.asm.Type[] typeArray29 = signature26.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type8, typeArray29);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean41 = type39.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(0, type44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type37, typeArray47);
        java.lang.String str49 = signature48.getDescriptor();
        java.lang.String str50 = signature48.toString();
        org.mockito.asm.Type[] typeArray51 = signature48.getArgumentTypes();
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray51);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(9, 153, (java.lang.Object[]) typeArray32, (int) (byte) 1, (java.lang.Object[]) typeArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(SSII)I" + "'", str27, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!(SSII)I" + "'", str28, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(SSII)I" + "'", str30, "(SSII)I");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(SSII)I" + "'", str49, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!(SSII)I" + "'", str50, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(SSII)J" + "'", str52, "(SSII)J");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        label5.info = type22;
        int[] intArray29 = new int[] { 6, 108, 126, 4, 116 };
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray29, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1880004159" + "'", str6, "L1880004159");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[6, 108, 126, 4, 116]");
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray20);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        label5.info = type22;
        label5.info = "L1839661580";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L625917099" + "'", str6, "L625917099");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        label8.info = (byte) 10;
        java.lang.String str13 = label8.toString();
        java.lang.String str14 = label8.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        java.lang.Object obj17 = label15.info;
        label15.info = (byte) 10;
        java.lang.String str20 = label15.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.String str22 = label21.toString();
        java.lang.Object obj23 = label21.info;
        java.lang.Object obj24 = label21.info;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) (short) 0, type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean37 = type35.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(0, type40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type35, type38, type40, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray43);
        java.lang.String str45 = signature44.getDescriptor();
        java.lang.String str46 = signature44.toString();
        org.mockito.asm.Type[] typeArray47 = signature44.getArgumentTypes();
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type26, typeArray47);
        label21.info = type26;
        org.mockito.asm.Label[] labelArray51 = new org.mockito.asm.Label[] { label8, label15, label21 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(96, 100, label7, labelArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L363952160" + "'", str9, "L363952160");
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L363952160" + "'", str13, "L363952160");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L363952160" + "'", str14, "L363952160");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1309987480" + "'", str16, "L1309987480");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1309987480" + "'", str20, "L1309987480");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1352347103" + "'", str22, "L1352347103");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(SSII)I" + "'", str45, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!(SSII)I" + "'", str46, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(SSII)I" + "'", str48, "(SSII)I");
        org.junit.Assert.assertNotNull(labelArray51);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("L1057178490", "org/mockito/asm/Type(SSII)Z", "Lint;", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L67478519" + "'", str6, "L67478519");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        label6.info = type23;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(153, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1431654635" + "'", str7, "L1431654635");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classAdapter2.visitMethod(112, "L230405251", "", "(SSII)J", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@13fcc60e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        java.lang.Object obj7 = label4.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray26);
        java.lang.String str28 = signature27.getDescriptor();
        java.lang.String str29 = signature27.toString();
        org.mockito.asm.Type[] typeArray30 = signature27.getArgumentTypes();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type9, typeArray30);
        label4.info = type9;
        java.lang.String str34 = label4.toString();
        java.lang.String str35 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L210099330" + "'", str5, "L210099330");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(SSII)I" + "'", str28, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!(SSII)I" + "'", str29, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(SSII)I" + "'", str31, "(SSII)I");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L210099330" + "'", str34, "L210099330");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L210099330" + "'", str35, "L210099330");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 100L;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        label5.info = int10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) (short) -1, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) ' ', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray12);
        java.lang.Class<?> wildcardClass14 = type2.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("I");
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray35);
        java.lang.Class<?> wildcardClass37 = type25.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) (byte) 10, type40);
        int int43 = type40.getOpcode(10);
        int int44 = type40.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local((int) (short) 0, type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(0, type55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type50, type53, type55, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type48, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray58);
        boolean boolean61 = type40.equals((java.lang.Object) typeArray58);
        java.lang.Class<?> wildcardClass62 = typeArray58.getClass();
        java.lang.Class[] classArray63 = new java.lang.Class[] { wildcardClass14, wildcardClass19, wildcardClass21, wildcardClass37, wildcardClass62 };
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter65 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        java.lang.Class<?> wildcardClass67 = classEmitter64.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer68 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray63, (java.lang.Class) wildcardClass67);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ClassEmitter.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str15, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str22, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str38, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(SSII)I" + "'", str60, "(SSII)I");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 100L;
        java.lang.Object obj11 = label8.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 100L;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSort();
        label12.info = int17;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("F", "(SSII)S", "L1277466335", label8, label12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100L + "'", obj11, 100L);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitSource("Lorg.mockito.asm.Type;", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        java.lang.Object obj8 = label6.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        label6.info = type9;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber((-1), label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1858416297" + "'", str7, "L1858416297");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(0, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
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
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(128, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "F", "org/mockito/cglib/core/ClassEmitter", "L19896701", "L822689388", "L652832830(SSII)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter1.visitMethod((int) (short) 1, "L19896701", "L1277466335", "Lorg.mockito.asm.Type;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@504bf120");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        java.lang.Object obj12 = label8.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        label13.info = wildcardClass16;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("L1553700172", "L1946254240", "L1817833920", label8, label13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L938248351" + "'", str9, "L938248351");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L73277003" + "'", str14, "L73277003");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local((int) (byte) 10, type8);
        int int11 = type8.getOpcode(10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type18, typeArray28);
        java.lang.String str30 = signature29.getDescriptor();
        java.lang.String str31 = signature29.toString();
        org.mockito.asm.Type[] typeArray32 = signature29.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        java.lang.String str34 = type15.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type13, type15, type35, type36 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray39);
        java.lang.String str41 = signature40.getDescriptor();
        org.mockito.asm.Type[] typeArray42 = signature40.getArgumentTypes();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) (byte) 10, type47);
        int int50 = type47.getOpcode(10);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local((int) (short) 0, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean61 = type59.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(0, type64);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type59, type62, type64, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type57, typeArray67);
        java.lang.String str69 = signature68.getDescriptor();
        java.lang.String str70 = signature68.toString();
        org.mockito.asm.Type[] typeArray71 = signature68.getArgumentTypes();
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray71);
        java.lang.String str73 = type54.getClassName();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean77 = type75.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type52, type54, type74, type75 };
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("hi!", type47, typeArray78);
        org.mockito.asm.Type[] typeArray81 = org.mockito.asm.Type.getArgumentTypes("(SSII)I");
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("int", type47, typeArray81);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) (byte) 1, 130, (java.lang.Object[]) typeArray42, (int) (byte) 1, (java.lang.Object[]) typeArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(SSII)I" + "'", str30, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!(SSII)I" + "'", str31, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(SSII)I" + "'", str33, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "int" + "'", str34, "int");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(IIJV)Z" + "'", str41, "(IIJV)Z");
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(SSII)I" + "'", str69, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!(SSII)I" + "'", str70, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(SSII)I" + "'", str72, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "int" + "'", str73, "int");
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray81);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        java.lang.Object obj8 = label5.info;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type25, typeArray35);
        java.lang.String str37 = type25.getDescriptor();
        boolean boolean38 = signature22.equals((java.lang.Object) type25);
        org.mockito.asm.Type type39 = signature22.getReturnType();
        label5.info = type39;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L713714587" + "'", str6, "L713714587");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "I" + "'", str37, "I");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(type39);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(0, "L230405251", "(BZZ)I", "(SSII)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("L652832830(SSII)Z", "F", "L971768301");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classAdapter4.visitField(100, "L1380537372", "", "L1817833920", obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(1, "", "org/mockito/asm/Type(SSII)Z", "L230405251");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = 156;
        int[] intArray15 = new int[] { 158, 126, 9, 130, 108, 10 };
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 100L;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.String str20 = label19.toString();
        java.lang.Object obj21 = label19.info;
        java.lang.Object obj22 = label19.info;
        java.lang.Object obj23 = label19.info;
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] { label16, label19 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray15, labelArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L897694951" + "'", str6, "L897694951");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[158, 126, 9, 130, 108, 10]");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1345419556" + "'", str20, "L1345419556");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(labelArray24);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1839661580");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        java.lang.Object obj6 = label4.info;
        label4.info = (byte) 10;
        java.lang.String str9 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1245389800" + "'", str5, "L1245389800");
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1245389800" + "'", str9, "L1245389800");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray21);
        java.lang.Class<?> wildcardClass23 = type11.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor27 = classEmitter0.visitField(0, "L1380537372", "L652832830(SSII)Z", "", (java.lang.Object) type26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/asm/Type" + "'", str24, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitAnnotation("L652832830(SSII)Z", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) (short) 100, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.Object obj11 = label9.info;
        label9.info = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1380537372", "(SSII)J", "hi!(SSII)I", label8, label9, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 128");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1611206061" + "'", str10, "L1611206061");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1380537372");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(157, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        label0.info = wildcardClass3;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L393182727" + "'", str1, "L393182727");
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray11 = new java.lang.String[] { "(SSII)Z", "L783288789", "L979286802", "L19896701" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter1.visitMethod((int) (short) 10, "", "Z", "L652832830", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@700c3139");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("L824714731", (int) (byte) 10);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn((int) 'a');
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.String str10 = label9.toString();
        java.lang.Object obj11 = label9.info;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        label9.info = type12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        java.lang.Object obj16 = label14.info;
        label14.info = (byte) 10;
        java.lang.String str19 = label14.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("void", "org/mockito/asm/Type", "L1380537372", label9, label14, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 158");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1376052529" + "'", str10, "L1376052529");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(type12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L68605499" + "'", str15, "L68605499");
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L68605499" + "'", str19, "L68605499");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(128, "Lorg.mockito.asm.Type;", "org/mockito/cglib/core/Signature", "L1817833920");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
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
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("hi!(IIJV)Z");
        java.lang.String str6 = type5.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitEnd();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter4.visitAnnotationDefault();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
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
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(0, type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type31, type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", type26, typeArray36);
        java.lang.String str38 = signature37.getDescriptor();
        java.lang.String str39 = signature37.toString();
        org.mockito.asm.Type[] typeArray40 = signature37.getArgumentTypes();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((int) (short) 0, type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean53 = type51.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(0, type56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type51, type54, type56, type58 };
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray59);
        java.lang.String str61 = signature60.getDescriptor();
        java.lang.String str62 = signature60.toString();
        org.mockito.asm.Type[] typeArray63 = signature60.getArgumentTypes();
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type42, typeArray63);
        java.lang.String str66 = signature65.getDescriptor();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) (short) 0, type68);
        int int70 = local69.getIndex();
        boolean boolean71 = signature65.equals((java.lang.Object) local69);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        java.lang.Class<?> wildcardClass74 = type73.getClass();
        java.lang.Object[] objArray75 = new java.lang.Object[] { ' ', 100.0f, typeArray40, boolean71, type73 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) (short) 1, 112, (java.lang.Object[]) typeArray19, 0, (java.lang.Object[]) typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(SSII)I" + "'", str38, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!(SSII)I" + "'", str39, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(SSII)I" + "'", str61, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!(SSII)I" + "'", str62, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(SSII)I" + "'", str64, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(SSII)S" + "'", str66, "(SSII)S");
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[ , 100.0, [S, S, I, I], false, Lorg/mockito/asm/Type;]");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter6.visitField(4, "L19896701", "", "org/mockito/asm/Type", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        java.lang.String str12 = label8.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        label13.info = 156;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.String str18 = label17.toString();
        java.lang.Object obj19 = label17.info;
        java.lang.Object obj20 = label17.info;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) (short) 0, type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(0, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray39);
        java.lang.String str41 = signature40.getDescriptor();
        java.lang.String str42 = signature40.toString();
        org.mockito.asm.Type[] typeArray43 = signature40.getArgumentTypes();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type22, typeArray43);
        label17.info = type22;
        java.lang.String str47 = label17.toString();
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        java.lang.String str49 = label48.toString();
        label48.info = 156;
        org.mockito.asm.Label[] labelArray52 = new org.mockito.asm.Label[] { label13, label17, label48 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn(155, (int) (byte) 0, label8, labelArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L265592285" + "'", str9, "L265592285");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L265592285" + "'", str12, "L265592285");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1160035941" + "'", str14, "L1160035941");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1627278226" + "'", str18, "L1627278226");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(SSII)I" + "'", str41, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!(SSII)I" + "'", str42, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(SSII)I" + "'", str44, "(SSII)I");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L1627278226" + "'", str47, "L1627278226");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L212165970" + "'", str49, "L212165970");
        org.junit.Assert.assertNotNull(labelArray52);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray33);
        java.lang.String str35 = type23.getDescriptor();
        boolean boolean36 = signature20.equals((java.lang.Object) type23);
        org.mockito.asm.Type type37 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray38 = signature20.getArgumentTypes();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((int) (byte) 10, type42);
        int int45 = type42.getOpcode(10);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("I");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local((int) (short) 0, type52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean56 = type54.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(0, type59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type54, type57, type59, type61 };
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("hi!", type52, typeArray62);
        java.lang.String str64 = signature63.getDescriptor();
        java.lang.String str65 = signature63.toString();
        org.mockito.asm.Type[] typeArray66 = signature63.getArgumentTypes();
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray66);
        java.lang.String str68 = type49.getClassName();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean72 = type70.equals((java.lang.Object) (short) 0);
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type47, type49, type69, type70 };
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("hi!", type42, typeArray73);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(7, 4, (java.lang.Object[]) typeArray38, (int) (short) 1, (java.lang.Object[]) typeArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "I" + "'", str35, "I");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(SSII)I" + "'", str64, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!(SSII)I" + "'", str65, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(SSII)I" + "'", str67, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "int" + "'", str68, "int");
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(typeArray73);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(0, "L1738126850", "org/mockito/cglib/core/ClassEmitter", "hi!(IIJV)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(112, 157);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(156, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1499111751" + "'", str6, "L1499111751");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn((int) (byte) 0, "(IIJV)Z", "void", "(SSII)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "(SSII)I", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType("I");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(0, type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray32);
        java.lang.String str34 = signature33.getDescriptor();
        java.lang.String str35 = signature33.toString();
        org.mockito.asm.Type[] typeArray36 = signature33.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type15, typeArray36);
        label10.info = type15;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("(SSII)S", "L1553700172", "L1817833920", label8, label10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L2047114412" + "'", str9, "L2047114412");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L891099409" + "'", str11, "L891099409");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(SSII)I" + "'", str34, "(SSII)I");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!(SSII)I" + "'", str35, "hi!(SSII)I");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(SSII)I" + "'", str37, "(SSII)I");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter6.visitField(126, "L1839661580", "L5916778", "L1919555830", (java.lang.Object) classInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo12);
    }
}
