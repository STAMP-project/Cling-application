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
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@49faf815");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type6 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class((int) (byte) 100, 112, "hi!", type5, typeArray7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray13 = new java.lang.String[] { "J", "hi!", "", "hi!", "J", "J" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(0, 100, "J", "", "J", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray8 = new java.lang.String[] { "J", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter1.visitMethod(10, "hi!", "", "", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4f8cdeb4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitOuterClass("J", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
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
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(7, "J", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classAdapter2.visitMethod(4, "J", "hi!", "J", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("J", "J", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type7 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class(10, 7, "", type5, typeArray8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
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
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "Z", "", "org/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod(104, "J", "Z", "J", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6043dfeb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "");
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter2.begin_method(9, signature7, typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@59887a08");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
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
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter2.visitMethod(7, "", "Z", "Z", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5dd86add");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.toString();
        java.lang.String str10 = type8.toString();
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.Class<?> wildcardClass14 = classEmitter12.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type8, type16 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(7, 9, "org/mockito/cglib/core/ClassEmitter", type7, typeArray17, "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "J" + "'", str9, "J");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "J" + "'", str10, "J");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
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
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean8 = signature6.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        int int13 = type12.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        java.lang.Class<?> wildcardClass19 = classEmitter17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type9, type10, type11, type12, type14, type21 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter2.begin_method((int) (short) 10, signature6, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@39ef7b76");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
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
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("J", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("J", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        int int8 = type7.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter1.visitField((int) (short) 1, "", "J", "(ZZFJZ)C", (java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("Z", "hi!", "(ZZFJZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField((int) (byte) 100, "org/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/ClassEmitter", "C", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter2.visitField((int) (byte) 1, "", "C", "(ZZFJZ)C", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("Z", "org/mockito/cglib/core/ClassEmitter", "J", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "org/mockito/cglib/core/ClassEmitter", "(ZZFJZ)C", "C", "C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classAdapter3.visitMethod(112, "hi!", "Z", "org/mockito/cglib/core/ClassEmitter", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4429e633");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
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
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("C", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
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
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(6, 124, "(ZZFJZ)C", "org/mockito/cglib/core/ClassEmitter", "C", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
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
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "hi!", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray12 = new java.lang.String[] { "boolean", "I", "", "boolean", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = fieldProviderTransformer1.visitMethod(100, "J", "boolean", "org/mockito/cglib/core/ClassEmitter", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@733d3af9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("C", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter4.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSort();
        java.lang.String str23 = type21.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        java.lang.String str30 = type27.toString();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type20, type21, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.begin_class((int) (byte) 0, 116, "C", type14, typeArray31, "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "J" + "'", str19, "J");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Z" + "'", str28, "Z");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(ZZZZ)J" + "'", str32, "(ZZZZ)J");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter4.visitField(124, "J", "boolean", "boolean", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray19 = new java.lang.String[] { "(ZZFJZ)C", "J", "" };
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.visit((int) (short) 0, 0, "org/mockito/cglib/core/ClassEmitter", "(ZZZZ)J", "(ZZFJZ)C", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        boolean boolean5 = signature2.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter2.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("I", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "(ZZFJZ)C", "C", "", "Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter4.visitMethod(4, "boolean", "Lorg/mockito/cglib/core/Local;", "", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3f0abb5b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = classEmitter2.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter2.visitMethod(4, "Z", "C", "J", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2aaa4f90");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "I", "(ZZZZ)J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter1.visitMethod((int) (byte) 1, "", "boolean", "Lorg/mockito/asm/Type;", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@69846ca");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = fieldProviderTransformer1.visitAnnotation("Lorg/mockito/cglib/core/Local;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = fieldProviderTransformer0.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("Z", "org/mockito/cglib/core/ClassEmitter", "J", 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "(ZZFJZ)C", "I", "(ZZFJZ)C", "(ZZFJZ)C", "Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter4.visitMethod((int) '4', "I", "J", "(ZZFJZ)C", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@698fa83");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        java.lang.String[] strArray14 = new java.lang.String[] { "(ZZZZ)J" };
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visit(154, (int) (byte) 100, "hi!", "Lorg/mockito/asm/Type;", "org/mockito/cglib/core/ClassEmitter", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        boolean boolean6 = signature2.equals((java.lang.Object) 124);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("I", "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = fieldProviderTransformer0.visitField(0, "Lorg/mockito/asm/Type;", "C", "", (java.lang.Object) classEmitter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(5, "org/mockito/cglib/core/ClassEmitter", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray7 = new java.lang.String[] { "C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter1.visitMethod(6, "org/mockito/cglib/core/ClassEmitter", "hi!", "J", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5b1a4fca");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 0, type6);
        org.mockito.asm.Type type9 = local8.getType();
        java.lang.Class<?> wildcardClass10 = local8.getClass();
        boolean boolean11 = signature2.equals((java.lang.Object) local8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type12 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
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
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        java.lang.Class<?> wildcardClass15 = classEmitter13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type11, type17, type18, type21, type23 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter26 = classEmitter5.begin_method(3, signature10, typeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@281caef8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean" + "'", str22, "boolean");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Attribute attribute1 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitAttribute(attribute1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = classEmitter7.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter1.begin_method(7, signature5, typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6b527189");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSort();
        java.lang.String str22 = type20.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        java.lang.String str29 = type26.toString();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type19, type20, type23, type26 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray30);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.begin_class(104, (-1), "", type14, typeArray30, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "J" + "'", str18, "J");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Z" + "'", str29, "Z");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZZZZ)J" + "'", str31, "(ZZZZ)J");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
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
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@624e682b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "org/mockito/cglib/core/Signature", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitInnerClass("org/mockito/cglib/core/Signature", "(ZZZZ)J", "Z", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.getName();
        boolean boolean17 = signature14.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 0, type20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSort();
        int int26 = type23.getOpcode(100);
        int int27 = type23.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSort();
        int int34 = type31.getOpcode(100);
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type20, type23, type28, type29, type31 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter37 = classEmitter7.begin_method((int) (byte) -1, signature14, typeArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3daa68c2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "J" + "'", str30, "J");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(ZZFJZ)C" + "'", str36, "(ZZFJZ)C");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@39e31b9e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(100);
        int int14 = type9.getOpcode(104);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSort();
        int int18 = type15.getOpcode(100);
        int int19 = type15.getSize();
        java.lang.Class<?> wildcardClass20 = type15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.declare_field((int) (short) 1, "org/mockito/cglib/core/ClassEmitter", type9, (java.lang.Object) type15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("(ZZZZ)J", "boolean", "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "I", "(ZZZZ)J", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "C" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter8.visit(5, 7, "org/mockito/cglib/core/Signature", "J", "Z", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "org/mockito/cglib/core/ClassEmitter", "Lorg/mockito/asm/Type;", "boolean", "C", "boolean" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(8, 104, "org/mockito/cglib/core/ClassEmitter", "J", "hi!", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        java.lang.String[] strArray9 = new java.lang.String[] { "C", "C", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "(ZZZZ)J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = fieldProviderTransformer0.visitMethod(130, "", "Lorg/mockito/cglib/core/Local;", "org/mockito/cglib/core/ClassEmitter", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@1af12d4f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = fieldProviderTransformer0.getStaticHook();
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
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str11 = signature10.getName();
        boolean boolean13 = signature10.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = signature10.getDescriptor();
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter17 = classEmitter5.begin_method(2, signature10, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7b91c81e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
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
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSort();
        int int10 = type7.getOpcode(100);
        int int11 = type7.getSize();
        int int13 = type7.getOpcode((int) (short) 10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        java.lang.String str16 = type14.getDescriptor();
        java.lang.String str17 = type14.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(100, "C", type7, (java.lang.Object) type14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter4.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        boolean boolean6 = signature2.equals((java.lang.Object) 124);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter4.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "double" + "'", str1, "double");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray12 = new org.mockito.asm.Label[] { label8, label9, label10, label11 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(0, (int) (short) 0, label6, labelArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(labelArray12);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(2, 104);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
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
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(104, 128);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label4 = null;
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label5, label7, "double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter5.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        java.lang.Class<?> wildcardClass13 = classEmitter11.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        java.lang.String str22 = type19.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type19, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        java.lang.Object[] objArray26 = new java.lang.Object[] { classAdapter9, type15 };
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSort();
        java.lang.String str33 = type31.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        java.lang.String str40 = type37.toString();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type30, type31, type34, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) (byte) 100, 9, objArray26, 108, (java.lang.Object[]) typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str25, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "J" + "'", str29, "J");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Z" + "'", str35, "Z");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Z" + "'", str38, "Z");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Z" + "'", str40, "Z");
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(ZZZZ)J" + "'", str42, "(ZZZZ)J");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.visit(0, 2, "org/mockito/cglib/core/Signature", "double", "boolean", strArray8);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(130, "org/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(0, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter12.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter(classVisitor26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        java.lang.Class<?> wildcardClass29 = classEmitter27.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.lang.Object[] objArray31 = new java.lang.Object[] { type6, classEmitter12, classEmitter19, str25, wildcardClass29 };
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        java.lang.String str38 = type36.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        java.lang.String str45 = type42.toString();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type35, type36, type39, type42 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray46);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(108, (int) (short) 10, objArray31, (int) (byte) 0, (java.lang.Object[]) typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "double" + "'", str7, "double");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "I" + "'", str23, "I");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str25, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str30, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "J" + "'", str34, "J");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Z" + "'", str38, "Z");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Z" + "'", str40, "Z");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Z" + "'", str43, "Z");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Z" + "'", str45, "Z");
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(ZZZZ)J" + "'", str47, "(ZZZZ)J");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = localVariablesSorter3.visitAnnotationDefault();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitInnerClass("hi!", "J", "Lorg/mockito/cglib/core/Local;", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "J", "C");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] { label9, label10 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) (byte) 0, 116, label6, labelArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(labelArray13);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        java.lang.String str5 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(156, "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "J", "org/mockito/cglib/core/Signature" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(0, 153, "(ZZFJZ)C", "org/mockito/cglib/core/Signature", "I", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = classEmitter4.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label7, label8, label9, "Lorg/mockito/cglib/core/Local;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn((int) (short) -1, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(155, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs((int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("(ZZZZ)J");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = fieldProviderTransformer0.visitField(10, "(ZZFJZ)C", "org/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/ClassEmitter", (java.lang.Object) type6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitSource("org/mockito/cglib/core/ClassEmitter", "Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label7, label10, label12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        org.mockito.asm.Label[] labelArray9 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(126, 155, label6, labelArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(labelArray9);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter6.visitAttribute(attribute8);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = fieldProviderTransformer1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] { label12, label14 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn(108, (int) ' ', label9, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(4, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((int) (short) 0, type19);
        java.lang.String str22 = type19.toString();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type12, type13, type16, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(154, 96, (java.lang.Object[]) typeArray8, (int) '4', (java.lang.Object[]) typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "J" + "'", str11, "J");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(ZZZZ)J" + "'", str24, "(ZZZZ)J");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(104, "Z", "I", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn(156, 100);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(0, 130, (java.lang.Object[]) typeArray7, 124, (java.lang.Object[]) typeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = fieldProviderTransformer0.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = fieldProviderTransformer1.visitField((-1), "(ZZFJZ)C", "(ZZZZ)J", "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        classEmitter2.setTarget(classVisitor3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = fieldProviderTransformer1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@69fa5394");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitAnnotation("Lorg/mockito/cglib/core/Local;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter6.visitAnnotation("Z", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn(124, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) type7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMultiANewArrayInsn("double", 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.Object obj15 = label13.info;
        java.lang.Object obj16 = label13.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("C", "I", "J", label10, label13, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 126");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        java.lang.String str2 = type1.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J" + "'", str2, "J");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label7, label9, label12, "L1750106643");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1000350949" + "'", str15, "L1000350949");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField(156, "Z", "hi!", "", (java.lang.Object) 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean12 = type9.equals((java.lang.Object) "(ZZFJZ)C");
        label7.info = type9;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label4 = null;
        int[] intArray5 = new int[] {};
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean14 = type11.equals((java.lang.Object) "(ZZFJZ)C");
        label9.info = type11;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.Object obj19 = label16.info;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray21 = new org.mockito.asm.Label[] { label6, label9, label16, label20 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray5, labelArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(labelArray21);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn((int) (short) 1, "", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "org/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        int[] intArray16 = new int[] { 8, 2, 112, (short) 1, (byte) 1, 8 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label7, intArray16, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[8, 2, 112, 1, 1, 8]");
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        org.mockito.asm.Type type17 = local16.getType();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.declare_field((-1), "hi!", type17, (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("C");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(112, "L1750106643");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray15 = new java.lang.String[] { "(ZZFJZ)C", "org/mockito/cglib/core/Signature", "Z", "Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter5.visitMethod(130, "(ZZFJZ)C", "L1750106643", "L1750106643", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(ZZFJZ)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter1.visitMethod(116, "Z", "(ZZZZ)J", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1a371923");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type1.getSort();
        org.mockito.asm.Type[] typeArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitInnerClass("double", "double", "Lorg/mockito/asm/Type;", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean12 = type9.equals((java.lang.Object) "(ZZFJZ)C");
        label7.info = type9;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("C", "J", "(ZZZZ)J", 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.Object obj15 = label13.info;
        java.lang.String str16 = label13.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label7, label10, label13, "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1129973227" + "'", str16, "L1129973227");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitInnerClass("L1750106643", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "Z", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation(1, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
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
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray18 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "org/mockito/cglib/core/ClassEmitter", "L1750106643" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = fieldProviderTransformer1.visitMethod(0, "hi!", "I", "double", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@35b287ed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn(128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("hi!", "L1750106643");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        java.lang.String[] strArray10 = new java.lang.String[] { "boolean", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "Lorg/mockito/cglib/core/Local;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = fieldProviderTransformer1.visitMethod((-1), "org/mockito/cglib/core/Signature", "org/mockito/cglib/core/ClassEmitter", "hi!", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@117afa6c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@779db0d5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean16 = signature14.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        org.mockito.asm.Type type21 = local20.getType();
        java.lang.Class<?> wildcardClass22 = local20.getClass();
        boolean boolean23 = signature14.equals((java.lang.Object) local20);
        java.lang.String str24 = signature14.toString();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field(155, "Z", type11, (java.lang.Object) str24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        int[] intArray11 = new int[] { (short) 100, '4', 128, 0, 155, 7 };
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean17 = type14.equals((java.lang.Object) "(ZZFJZ)C");
        label12.info = type14;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray23 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean24 = type21.equals((java.lang.Object) "(ZZFJZ)C");
        label19.info = type21;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] { label12, label19, label26, label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray11, labelArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 128, 0, 155, 7]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(labelArray28);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.Object obj6 = label4.info;
        java.lang.Object obj7 = label4.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.Object obj12 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label8, label9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter1.visitMethod(1, "Z", "C", "double", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4fffc0c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSort();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field(8, "Lorg/mockito/cglib/core/Local;", type3, (java.lang.Object) classEmitter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn((int) (byte) 100, "(ZZFJZ)C", "org/mockito/cglib/core/Signature", "L1750106643");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
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
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(157, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn((-1), "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter4.visitAnnotation("Lorg/mockito/cglib/core/Signature;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L1750106643", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter7.visitParameterAnnotation(128, "Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(108, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        boolean boolean5 = signature2.equals((java.lang.Object) (byte) 100);
        java.lang.String str6 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = fieldProviderTransformer1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("LLorg/mockito/cglib/core/Signature;;", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str7 = signature6.getName();
        java.lang.String str8 = signature6.getName();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean16 = signature14.equals((java.lang.Object) 100.0f);
        java.lang.String str17 = signature14.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        boolean boolean24 = type19.equals((java.lang.Object) local23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type26 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter28 = classEmitter7.begin_method(126, signature14, typeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3d84e934");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs(6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter9.visitField(7, "J", "C", "(ZZZZ)J", (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean8 = signature6.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((int) (short) 0, type10);
        org.mockito.asm.Type type13 = local12.getType();
        java.lang.Class<?> wildcardClass14 = local12.getClass();
        boolean boolean15 = signature6.equals((java.lang.Object) local12);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray20 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type17, typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter22 = fieldProviderTransformer0.begin_method(3, signature6, typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@26ca96ad");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter6.visitParameterAnnotation(156, "Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(100);
        int int19 = type14.getOpcode(104);
        int int21 = type14.getOpcode(10);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.begin_class((int) (short) -1, (int) (byte) 1, "org/mockito/cglib/core/Signature", type14, typeArray22, "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(156, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn(104);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(2, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitInnerClass("I", "", "Lorg/mockito/cglib/core/Local;", 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
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
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str8 = signature7.getName();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.Class<?> wildcardClass12 = classEmitter10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        java.lang.String str21 = type18.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter25 = classEmitter3.begin_method(154, signature7, typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@77720b25");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str24, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitCode();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation((int) (short) 10, "Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        int[] intArray15 = new int[] { 153 };
        org.mockito.asm.Label[] labelArray16 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label10, intArray15, labelArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[153]");
        org.junit.Assert.assertNotNull(labelArray16);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "(ZZZZ)J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter5.visitMethod(108, "Lorg/mockito/cglib/core/Local;", "org/mockito/cglib/core/ClassEmitter", "L1750106643", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2d920bff");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label5, label8, "Lorg/mockito/cglib/core/Local;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
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
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean11 = signature9.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass12 = signature9.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter1.visitField((int) (byte) -1, "I", "(ZZFJZ)C", "C", (java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str13, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str14, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn((int) (short) 100, label11);
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
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field((int) (byte) 100, "L1750106643", type9, (java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label5, label6, label7, "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean8 = signature6.equals((java.lang.Object) 100.0f);
        java.lang.String str9 = signature6.getName();
        java.lang.String str10 = signature6.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) (short) 0, type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int20 = type16.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSort();
        int int27 = type24.getOpcode(100);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type13, type16, type21, type22, type24 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter30 = classEmitter1.begin_method(124, signature6, typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2d4fb7fe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "J" + "'", str23, "J");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(ZZFJZ)C" + "'", str29, "(ZZFJZ)C");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("C", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = fieldProviderTransformer0.visitMethod((int) (byte) 100, "Lorg/mockito/cglib/core/Signature;", "Lorg/mockito/asm/Type;", "boolean", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@3320b371");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitOuterClass("L1750106643", "Lorg/mockito/asm/Type;", "Lorg/mockito/cglib/core/Local;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLabel(label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray16 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "C", "C", "(ZZZZ)J", "boolean" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(158, 157, "Lorg/mockito/cglib/core/Signature;", "hi!", "", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", type7, typeArray10);
        label4.info = "";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        int[] intArray14 = null;
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label10, intArray14, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1549883396" + "'", str13, "L1549883396");
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray15 = new java.lang.String[] { "double", "org/mockito/cglib/core/Signature", "double" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit((int) (short) -1, 154, "Lorg/mockito/cglib/core/Signature;", "LLorg/mockito/cglib/core/Signature;;", "hi!", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitOuterClass("hi!", "(ZZFJZ)C", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("J", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter9.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(128, "hi!", "org/mockito/cglib/core/Signature", "char");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter15.getClassInfo();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray25 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type22, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(100);
        int int33 = type28.getOpcode(104);
        int int35 = type28.getOpcode(10);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (short) 0, type38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSort();
        int int44 = type41.getOpcode(100);
        int int45 = type41.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str48 = type47.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int50 = type49.getSort();
        int int52 = type49.getOpcode(100);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type38, type41, type46, type47, type49 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("L1750106643", type28, typeArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter56 = classEmitter15.begin_method(154, signature26, typeArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@360170ad");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 104 + "'", int33 == 104);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Z" + "'", str39, "Z");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "J" + "'", str48, "J");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(ZZFJZ)C" + "'", str54, "(ZZFJZ)C");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("org/mockito/cglib/core/ClassEmitter", "(ZZZZ)J");
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
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("J");
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(104, "org/mockito/cglib/core/ClassEmitter", type7, (java.lang.Object) type10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("org/mockito/cglib/core/ClassEmitter", 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter7.visitAnnotation("Lorg/mockito/cglib/core/Local;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((int) '4', "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        java.lang.String str19 = type16.toString();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type10, type13, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSort();
        int int26 = type23.getOpcode(100);
        int int28 = type23.getOpcode(104);
        int int30 = type23.getOpcode(10);
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter(classVisitor31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        java.lang.Class<?> wildcardClass34 = classEmitter32.getClass();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local((int) (short) 0, type40);
        java.lang.String str43 = type40.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type40, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type23, typeArray45);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(100, (int) (short) 10, "boolean", type7, typeArray45, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "J" + "'", str8, "J");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(ZZZZ)J" + "'", str21, "(ZZZZ)J");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 104 + "'", int28 == 104);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Z" + "'", str38, "Z");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Z" + "'", str41, "Z");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Z" + "'", str43, "Z");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str46, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        java.lang.Class<?> wildcardClass15 = classEmitter13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        label11.info = type16;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn((int) ' ', label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        int[] intArray15 = new int[] { 153, '4', (-1) };
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.Class<?> wildcardClass20 = classEmitter18.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        label16.info = type21;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.Object obj30 = label28.info;
        java.lang.String str31 = label28.toString();
        org.mockito.asm.Label[] labelArray32 = new org.mockito.asm.Label[] { label16, label23, label25, label27, label28 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label10, intArray15, labelArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[153, 52, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L977530646" + "'", str31, "L977530646");
        org.junit.Assert.assertNotNull(labelArray32);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitAttribute(attribute11);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("Z", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = classAdapter9.visitAnnotation("(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(112, "Lorg/mockito/cglib/core/Local;", "boolean", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray13 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type10, typeArray13);
        label7.info = "";
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label16, label18, "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = classAdapter8.visitAnnotation("Lorg/mockito/cglib/core/Local;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter6.visitParameterAnnotation((int) (short) 10, "org/mockito/cglib/core/Signature", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("(ZZZZ)J", "L1750106643", "char");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "D", "(ZZFJZ)C", "I", "L1750106643" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit((int) '4', (int) '4', "(ZZZZ)J", "I", "(ZZZZ)J", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(158, "C", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter15.getClassInfo();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type24, typeArray27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSort();
        java.lang.String str33 = type31.getDescriptor();
        java.lang.String str34 = type31.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        java.lang.String str37 = type35.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str39 = type38.toString();
        java.lang.String str40 = type38.toString();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type29, type31, type35, type38 };
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.begin_class(6, (int) (byte) -1, "(ZZZZ)J", type24, typeArray41, "LLorg/mockito/cglib/core/Signature;;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean" + "'", str34, "boolean");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "J" + "'", str36, "J");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "J" + "'", str37, "J");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "J" + "'", str39, "J");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "J" + "'", str40, "J");
        org.junit.Assert.assertNotNull(typeArray41);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMaxs((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn((int) (short) 1, (int) '#');
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) '4', 5);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.Class<?> wildcardClass10 = classEmitter8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        java.lang.String str19 = type16.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type16, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((int) (short) 0, type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int33 = type29.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        int int40 = type37.getOpcode(100);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type34, type35, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(104, (int) (byte) 1, (java.lang.Object[]) typeArray21, 0, (java.lang.Object[]) typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str22, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "J" + "'", str36, "J");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(ZZFJZ)C" + "'", str42, "(ZZFJZ)C");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter15.getClassInfo();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitSource("L1750106643", "Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo18);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean12 = type9.equals((java.lang.Object) "(ZZFJZ)C");
        label7.info = type9;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        java.lang.Class<?> wildcardClass11 = classEmitter9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        label7.info = type12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean19 = type16.equals((java.lang.Object) "(ZZFJZ)C");
        label14.info = type16;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.Object obj23 = label21.info;
        java.lang.String str24 = label21.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label14, label21, "Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L357338405" + "'", str24, "L357338405");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean19 = type16.equals((java.lang.Object) "(ZZFJZ)C");
        label14.info = type16;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("char", "boolean", "org/mockito/cglib/core/ClassEmitter", label13, label14, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 130");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitInnerClass("LLorg/mockito/cglib/core/Signature;;", "Lorg/mockito/asm/Type;", "boolean", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        java.lang.String str7 = type5.getDescriptor();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean12 = signature10.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass13 = signature10.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(116, "double", type5, (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str14, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str15, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str16, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        org.mockito.asm.Label[] labelArray16 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTableSwitchInsn(104, 153, label12, labelArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(labelArray16);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = localVariablesSorter3.visitAnnotationDefault();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(112, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray17 = new java.lang.String[] { "org/mockito/cglib/core/Signature", "org/mockito/cglib/core/ClassEmitter", "Lorg/mockito/asm/Type;", "", "C" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((int) (short) 100, 156, "(ZZZZ)J", "(ZZFJZ)C", "hi!", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("J");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean25 = type22.equals((java.lang.Object) type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(100);
        int int32 = type27.getOpcode(104);
        int int34 = type27.getOpcode(10);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((int) (short) 0, type37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(100);
        int int44 = type40.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str47 = type46.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type48.getSort();
        int int51 = type48.getOpcode(100);
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type37, type40, type45, type46, type48 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("L1750106643", type27, typeArray52);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type22, typeArray52);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter13.begin_class(0, 157, "double", type20, typeArray52, "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 104 + "'", int32 == 104);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Z" + "'", str38, "Z");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "J" + "'", str47, "J");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(ZZFJZ)C" + "'", str53, "(ZZFJZ)C");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(96, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type13, typeArray16);
        label10.info = "";
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("", "(ZZFJZ)C", "I", label10, label19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "Lorg/mockito/cglib/core/Local;", "C", "Lorg/mockito/cglib/core/Signature;", "Z" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(8, 4, "D", "D", "org/mockito/cglib/core/ClassEmitter", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        int int6 = type5.getSize();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("char");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMethodInsn((int) (byte) 100, "J", "", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitCode();
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
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer12.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        fieldProviderTransformer12.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter(classVisitor20);
        fieldProviderTransformer12.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter2.visitField(157, "", "Z", "org/mockito/cglib/core/ClassEmitter", (java.lang.Object) classEmitter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSort();
        int int14 = type11.getOpcode(100);
        int int15 = type11.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(100);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type8, type11, type16, type17, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)J");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(155, 130, (java.lang.Object[]) typeArray23, 2, (java.lang.Object[]) typeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "J" + "'", str18, "J");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(ZZFJZ)C" + "'", str24, "(ZZFJZ)C");
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn((int) (byte) 1, "C", "(ZZFJZ)C", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean16 = type13.equals((java.lang.Object) "(ZZFJZ)C");
        label11.info = type13;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitJumpInsn(154, label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        classEmitter2.setTarget(classVisitor3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitInnerClass("Lorg/mockito/asm/Type;", "D", "char", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getName();
        java.lang.String str6 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitVarInsn(96, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSort();
        int int13 = type10.getOpcode(100);
        int int15 = type10.getOpcode(104);
        int int17 = type10.getOpcode(10);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        java.lang.Class<?> wildcardClass21 = classEmitter19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        java.lang.String str30 = type27.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type27, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type10, typeArray32);
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)J");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(4, 108, (java.lang.Object[]) typeArray32, 100, (java.lang.Object[]) typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Z" + "'", str28, "Z");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str33, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("J", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.Class<?> wildcardClass8 = classEmitter6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter0.visitField(5, "org/mockito/cglib/core/Signature", "org/mockito/cglib/core/ClassEmitter", "double", (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSort();
        java.lang.String str26 = type24.getDescriptor();
        boolean boolean27 = type23.equals((java.lang.Object) str26);
        int int28 = type23.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor29 = classEmitter1.visitField((int) '#', "", "L1750106643", "Lorg/mockito/cglib/core/Local;", (java.lang.Object) type23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean10 = type7.equals((java.lang.Object) "(ZZFJZ)C");
        label5.info = type7;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type18, typeArray21);
        label15.info = "";
        java.lang.Object obj24 = label15.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label12, label15, "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(1, 0, "", "Lorg/mockito/cglib/core/Local;", "Lorg/mockito/cglib/core/Local;", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(8, "Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMultiANewArrayInsn("Lorg/mockito/cglib/core/Local;", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        boolean boolean21 = type15.equals((java.lang.Object) classEmitter19);
        int int22 = type15.getSort();
        org.mockito.asm.Type[] typeArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.begin_class(0, 157, "B", type15, typeArray23, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray15 = new java.lang.String[] { "B", "B", "Z", "D", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(0, 0, "Lorg/mockito/cglib/core/Signature;", "", "boolean", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("(ZZZZ)J", "(ZZZZ)J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMaxs(0, 157);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(100, "C", "Z", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        java.lang.Class<?> wildcardClass19 = classEmitter17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        label15.info = type20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray28 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type25, typeArray28);
        label22.info = "";
        org.mockito.asm.Label[] labelArray31 = new org.mockito.asm.Label[] { label15, label22 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTableSwitchInsn((-1), 128, label12, labelArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(labelArray31);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classEmitter1.visitMethod(0, "(ZZZZ)J", "D", "Lorg/mockito/cglib/core/Signature;", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(ZZZZ)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter6.visitParameterAnnotation((int) '4', "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        java.lang.Class<?> wildcardClass11 = classEmitter9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        label7.info = type12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] { label14 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) 'a', 0, label7, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean16 = signature2.equals((java.lang.Object) classEmitter12);
        java.lang.String[] strArray23 = new java.lang.String[] { "LLorg/mockito/cglib/core/Signature;;", "L1750106643" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter12.visitMethod(7, "D", "org/mockito/cglib/core/ClassEmitter", "D", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@57fc35c4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
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
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod((int) (short) 100, "C", "Z", "", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@70302624");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        int[] intArray18 = new int[] { (short) 0, 7, 9, 4 };
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.Object obj21 = label19.info;
        java.lang.Object obj22 = label19.info;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type[] typeArray31 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type28, typeArray31);
        label25.info = "";
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        java.lang.Object obj35 = label34.info;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type[] typeArray40 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type37, typeArray40);
        label34.info = "";
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        java.lang.Object obj44 = label43.info;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray47 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean48 = type45.equals((java.lang.Object) "(ZZFJZ)C");
        label43.info = type45;
        org.mockito.asm.Label label50 = new org.mockito.asm.Label();
        java.lang.Object obj51 = label50.info;
        java.lang.Object obj52 = label50.info;
        org.mockito.asm.Label[] labelArray53 = new org.mockito.asm.Label[] { label19, label23, label25, label34, label43, label50 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label10, intArray18, labelArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 7, 9, 4]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(labelArray53);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("", 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        int int7 = type0.getSort();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = type0.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getDescriptor();
        boolean boolean14 = type10.equals((java.lang.Object) str13);
        int int15 = type10.getSort();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLdcInsn((java.lang.Object) type10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean13 = type10.equals((java.lang.Object) "(ZZFJZ)C");
        label8.info = type10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn(112, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "(ZZZZ)J" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(2, 156, "(ZZZZ)J", "Z", "D", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn((int) (byte) 0, "org/mockito/cglib/core/Signature", "boolean", "B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fieldProviderTransformer1.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter5.visitParameterAnnotation(130, "I", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean5 = type2.equals((java.lang.Object) "(ZZFJZ)C");
        label0.info = type2;
        java.lang.Object obj7 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "B");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter7.visitAnnotation("J", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("Lorg/mockito/asm/Type;", true);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Label label11 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("B", "Z", "org/mockito/cglib/core/Signature", label7, label11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 97");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.begin_class(126, 5, "org/mockito/cglib/core/ClassEmitter", type14, typeArray18, "L1750106643");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "J" + "'", str16, "J");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type16 = classEmitter13.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        int[] intArray12 = new int[] {};
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.Class<?> wildcardClass17 = classEmitter15.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        label13.info = type18;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type23, typeArray26);
        label20.info = "";
        org.mockito.asm.Label[] labelArray29 = new org.mockito.asm.Label[] { label13, label20 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label10, intArray12, labelArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(labelArray29);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        java.lang.Class<?> wildcardClass11 = classEmitter9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        label7.info = type12;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray22 = new java.lang.String[] { "boolean", "LLorg/mockito/cglib/core/Signature;;", "boolean", "J", "", "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor23 = fieldProviderTransformer0.visitMethod((int) (short) -1, "L1750106643", "(ZZZZ)J", "(ZZFJZ)C", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@57046f49");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter16);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        int int25 = type23.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter1.visitField((int) (byte) 0, "char", "(ZZFJZ)C", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) int25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@66b3ea67");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMultiANewArrayInsn("D", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter15.getClassInfo();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str23 = type22.toString();
        java.lang.String str24 = type22.toString();
        boolean boolean26 = type22.equals((java.lang.Object) 124);
        int int27 = type22.getSort();
        int int29 = type22.getOpcode(9);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 0, type31);
        org.mockito.asm.Type type34 = local33.getType();
        java.lang.Class<?> wildcardClass35 = local33.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.declare_field((int) (short) 1, "I", type22, (java.lang.Object) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "J" + "'", str23, "J");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "J" + "'", str24, "J");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Z" + "'", str32, "Z");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Lorg/mockito/cglib/core/Local;" + "'", str36, "Lorg/mockito/cglib/core/Local;");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Lorg/mockito/cglib/core/Local;" + "'", str37, "Lorg/mockito/cglib/core/Local;");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(156, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray11 = new java.lang.String[] { "LLorg/mockito/cglib/core/Signature;;", "char", "char", "" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visit(112, 130, "C", "", "I", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter7.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.String str8 = label5.toString();
        int[] intArray9 = new int[] {};
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.Class<?> wildcardClass17 = classEmitter15.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        label13.info = type18;
        java.lang.Object obj20 = label13.info;
        org.mockito.asm.Label[] labelArray21 = new org.mockito.asm.Label[] { label10, label13 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray9, labelArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1774334130" + "'", str8, "L1774334130");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(labelArray21);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitInnerClass("(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", "char", "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter15.getClassInfo();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitInnerClass("Lorg/mockito/asm/Type;", "org/mockito/cglib/core/Signature", "(ZZZZ)J", 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo18);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean12 = type9.equals((java.lang.Object) "(ZZFJZ)C");
        label7.info = type9;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.String str17 = label14.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean23 = type20.equals((java.lang.Object) "(ZZFJZ)C");
        label18.info = type20;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean30 = type27.equals((java.lang.Object) "(ZZFJZ)C");
        label25.info = type27;
        java.lang.Object obj32 = label25.info;
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        java.lang.Object obj34 = label33.info;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean38 = type35.equals((java.lang.Object) "(ZZFJZ)C");
        label33.info = type35;
        org.mockito.asm.Label[] labelArray40 = new org.mockito.asm.Label[] { label14, label18, label25, label33 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) '4', 0, label7, labelArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L549633306" + "'", str17, "L549633306");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "B");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(labelArray40);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        boolean boolean6 = type0.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = classAdapter8.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter6.visitParameterAnnotation(158, "D", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        int[] intArray11 = null;
        org.mockito.asm.Label[] labelArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label7, intArray11, labelArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1614180553" + "'", str10, "L1614180553");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.getName();
        boolean boolean17 = signature14.equals((java.lang.Object) (byte) 100);
        boolean boolean18 = type11.equals((java.lang.Object) (byte) 100);
        label6.info = boolean18;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(155, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation(158, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter9.visitParameterAnnotation(104, "org/mockito/cglib/core/Signature", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSort();
        int int11 = type8.getOpcode(100);
        int int13 = type8.getOpcode(104);
        int int15 = type8.getOpcode(10);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        java.lang.Class<?> wildcardClass19 = classEmitter17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        java.lang.String str28 = type25.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type25, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type8, typeArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter2.visitField(157, "Lorg/mockito/asm/Type;", "Lorg/mockito/cglib/core/Signature;", "I", (java.lang.Object) type8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Z" + "'", str28, "Z");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str31, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
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
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn((int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("hi!", "org/mockito/cglib/core/ClassEmitter", "char", 2);
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
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter1.visitMethod(1, "J", "(ZZZZ)J", "B", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5d0dfce4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.Class<?> wildcardClass12 = classEmitter10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((int) (short) 0, type18);
        java.lang.String str21 = type18.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type18, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray23);
        int int25 = type14.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer26 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer27 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer26.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer27);
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter(classVisitor29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        fieldProviderTransformer26.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer34 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer35 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer34.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor39 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter(classVisitor39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        boolean boolean43 = type37.equals((java.lang.Object) classEmitter41);
        fieldProviderTransformer35.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor47 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter(classVisitor47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter49.getClassInfo();
        boolean boolean51 = type45.equals((java.lang.Object) classEmitter49);
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter49.getClassInfo();
        fieldProviderTransformer35.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        fieldProviderTransformer26.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer35);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field((int) (byte) 100, "(ZZZZ)J", type14, (java.lang.Object) fieldProviderTransformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str24, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Z" + "'", str38, "Z");
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Z" + "'", str46, "Z");
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(classInfo52);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn((-1), label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str9 = signature8.getName();
        boolean boolean11 = signature8.equals((java.lang.Object) (byte) 100);
        boolean boolean12 = type5.equals((java.lang.Object) (byte) 100);
        label0.info = boolean12;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        int[] intArray16 = new int[] { 156, 5 };
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        java.lang.Class<?> wildcardClass21 = classEmitter19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        label17.info = type22;
        java.lang.Object obj24 = label17.info;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray32 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean33 = type30.equals((java.lang.Object) "(ZZFJZ)C");
        label28.info = type30;
        java.lang.Object obj35 = label28.info;
        java.lang.String str36 = label28.toString();
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor38 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter(classVisitor38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        java.lang.Class<?> wildcardClass41 = classEmitter39.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        label37.info = type42;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor45 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter(classVisitor45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        java.lang.Class<?> wildcardClass48 = classEmitter46.getClass();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        label44.info = type49;
        java.lang.Object obj51 = label44.info;
        org.mockito.asm.Label[] labelArray52 = new org.mockito.asm.Label[] { label17, label25, label27, label28, label37, label44 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label10, intArray16, labelArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[156, 5]");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "B");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1483497729" + "'", str36, "L1483497729");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(labelArray52);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray10 = new java.lang.String[] { "L1605053548", "B(ZZFJZ)J", "(ZZZZ)Z" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visit(153, (int) (byte) 0, "(ZZZZ)J", "(ZZFJZ)C", "org/mockito/cglib/core/ClassEmitter", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean10 = type7.equals((java.lang.Object) "(ZZFJZ)C");
        label5.info = type7;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(156, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean13 = type10.equals((java.lang.Object) "(ZZFJZ)C");
        label8.info = type10;
        java.lang.Object obj15 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber((int) (byte) 1, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "B");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
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
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(108, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("Z", "(ZZFJZ)C", "Lorg/mockito/cglib/core/Local;", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) 'a', 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.Object obj17 = label14.info;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str23 = signature22.getName();
        boolean boolean25 = signature22.equals((java.lang.Object) (byte) 100);
        boolean boolean26 = type19.equals((java.lang.Object) (byte) 100);
        label14.info = boolean26;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLocalVariable("double", "Lorg/mockito/asm/Type;", "Lorg/mockito/cglib/core/Signature;", label13, label14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter5.visitParameterAnnotation((int) (byte) 0, "B(ZZFJZ)J", true);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("Z", "(ZZZZ)Z", "Lorg/mockito/asm/Type;", label7, label8, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("Z", "org/mockito/cglib/core/Signature", "(ZZZZ)Z", label7, label11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L953271368" + "'", str10, "L953271368");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("Lorg/mockito/asm/Type;", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter15.getClassInfo();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        fieldProviderTransformer1.setTarget(classVisitor20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.toString();
        java.lang.String str26 = type24.toString();
        boolean boolean28 = type24.equals((java.lang.Object) 124);
        int int29 = type24.getSort();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        int int33 = type31.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSort();
        java.lang.String str39 = type37.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) (short) 0, type43);
        java.lang.String str46 = type43.toString();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type36, type37, type40, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("D", type31, typeArray47);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer1.declare_field(153, "Lorg/mockito/cglib/core/Local;", type24, (java.lang.Object) signature49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "J" + "'", str26, "J");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Z" + "'", str32, "Z");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "J" + "'", str35, "J");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Z" + "'", str39, "Z");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Z" + "'", str41, "Z");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Z" + "'", str44, "Z");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Z" + "'", str46, "Z");
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(ZZZZ)J" + "'", str48, "(ZZZZ)J");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitAnnotation("Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean16 = signature2.equals((java.lang.Object) classEmitter12);
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type24 = local23.getType();
        java.lang.Class<?> wildcardClass25 = local23.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.declare_field(10, "hi!", type19, (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Lorg/mockito/cglib/core/Local;" + "'", str26, "Lorg/mockito/cglib/core/Local;");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lorg/mockito/cglib/core/Local;" + "'", str27, "Lorg/mockito/cglib/core/Local;");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type8, typeArray11);
        label5.info = "";
        java.lang.Object obj14 = label5.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label15, label18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str19 = signature18.getName();
        boolean boolean21 = signature18.equals((java.lang.Object) (byte) 100);
        boolean boolean22 = type15.equals((java.lang.Object) (byte) 100);
        label10.info = boolean22;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label5, label8, label10, "(ZZZZ)J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type[] typeArray19 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type16, typeArray19);
        label13.info = "";
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.Object obj25 = label22.info;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter(classVisitor27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        java.lang.Class<?> wildcardClass30 = classEmitter28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        label26.info = type31;
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        java.lang.Object obj34 = label33.info;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean38 = type35.equals((java.lang.Object) "(ZZFJZ)C");
        label33.info = type35;
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        java.lang.Object obj42 = label40.info;
        java.lang.String str43 = label40.toString();
        org.mockito.asm.Label[] labelArray44 = new org.mockito.asm.Label[] { label13, label22, label26, label33, label40 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn(158, 96, label9, labelArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L161189344" + "'", str12, "L161189344");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L724026805" + "'", str43, "L724026805");
        org.junit.Assert.assertNotNull(labelArray44);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        boolean boolean14 = type8.equals((java.lang.Object) classEmitter12);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean16 = signature2.equals((java.lang.Object) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = classEmitter12.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitInnerClass("LLorg/mockito/cglib/core/Signature;;", "D", "J", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "J");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean11 = type8.equals((java.lang.Object) "(ZZFJZ)C");
        label6.info = type8;
        java.lang.Object obj13 = label6.info;
        java.lang.String str14 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(112, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "B");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L359162224" + "'", str14, "L359162224");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(7, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L532293806" + "'", str11, "L532293806");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.toString();
        java.lang.String str11 = type9.toString();
        int int12 = type9.getSort();
        boolean boolean14 = type9.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean20 = type17.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(100);
        int int27 = type22.getOpcode(104);
        int int29 = type22.getOpcode(10);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((int) (short) 0, type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(100);
        int int39 = type35.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSort();
        int int46 = type43.getOpcode(100);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type32, type35, type40, type41, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("L1750106643", type22, typeArray47);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type17, typeArray47);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("B", type9, typeArray47);
        org.mockito.asm.Type[] typeArray52 = signature51.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) typeArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "J" + "'", str10, "J");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "J" + "'", str11, "J");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 104 + "'", int27 == 104);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "J" + "'", str42, "J");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(ZZFJZ)C" + "'", str48, "(ZZFJZ)C");
        org.junit.Assert.assertNotNull(typeArray52);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(154, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        boolean boolean9 = type3.equals((java.lang.Object) classEmitter7);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = classEmitter7.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(158, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
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
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitFieldInsn((int) (byte) 0, "org/mockito/cglib/core/ClassEmitter", "", "(ZZFJZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(108, "(ZZZZ)Z", "(ZZZZ)Z", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type19.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter23.getClassInfo();
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter(classVisitor31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        boolean boolean35 = type29.equals((java.lang.Object) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter33.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter33.visitInnerClass("org/mockito/asm/Type", "(ZZZZ)Z", "I", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(classInfo36);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = classEmitter1.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.Object obj17 = label14.info;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str23 = signature22.getName();
        boolean boolean25 = signature22.equals((java.lang.Object) (byte) 100);
        boolean boolean26 = type19.equals((java.lang.Object) (byte) 100);
        label14.info = boolean26;
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter(classVisitor29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        java.lang.Class<?> wildcardClass32 = classEmitter30.getClass();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        label28.info = type33;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTryCatchBlock(label10, label14, label28, "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1362849305" + "'", str13, "L1362849305");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(type33);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.asm.MethodVisitor methodVisitor8 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(158, "org/mockito/cglib/core/Signature", (org.mockito.asm.MethodVisitor) localVariablesSorter11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.Class<?> wildcardClass12 = classEmitter10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        label8.info = type13;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Object obj17 = label15.info;
        java.lang.String str18 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("LLorg/mockito/cglib/core/Signature;;", "hi!", "LLorg/mockito/cglib/core/Signature;;", label8, label15, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L960958897" + "'", str18, "L960958897");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.toString();
        java.lang.String str22 = type20.toString();
        int int23 = type20.getSort();
        boolean boolean25 = type20.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean31 = type28.equals((java.lang.Object) type30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSort();
        int int36 = type33.getOpcode(100);
        int int38 = type33.getOpcode(104);
        int int40 = type33.getOpcode(10);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) (short) 0, type43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSort();
        int int49 = type46.getOpcode(100);
        int int50 = type46.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str53 = type52.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSort();
        int int57 = type54.getOpcode(100);
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type43, type46, type51, type52, type54 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray58);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("L1750106643", type33, typeArray58);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type28, typeArray58);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("B", type20, typeArray58);
        org.mockito.asm.ClassVisitor classVisitor63 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter(classVisitor63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter64);
        java.lang.Class<?> wildcardClass66 = classEmitter64.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str70 = type69.getDescriptor();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str73 = type72.toString();
        org.mockito.cglib.core.Local local74 = new org.mockito.cglib.core.Local((int) (short) 0, type72);
        java.lang.String str75 = type72.toString();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type69, type72, type76 };
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray77);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter79 = classEmitter16.begin_method((int) (byte) 10, signature62, typeArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6a308ecb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "J" + "'", str21, "J");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "J" + "'", str22, "J");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 104 + "'", int38 == 104);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Z" + "'", str44, "Z");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "J" + "'", str53, "J");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(ZZFJZ)C" + "'", str59, "(ZZFJZ)C");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Z" + "'", str70, "Z");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Z" + "'", str73, "Z");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Z" + "'", str75, "Z");
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str78, "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(124, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type19.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter23.getClassInfo();
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter(classVisitor31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        boolean boolean35 = type29.equals((java.lang.Object) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter33.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(classInfo36);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type11.equals((java.lang.Object) classEmitter15);
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type19.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter23.getClassInfo();
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter(classVisitor31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        boolean boolean35 = type29.equals((java.lang.Object) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter33.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter38 = classEmitter33.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(classInfo36);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (byte) 100, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean13 = type10.equals((java.lang.Object) "(ZZFJZ)C");
        label8.info = type10;
        java.lang.Object obj15 = label8.info;
        java.lang.String str16 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn((int) '#', label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "B");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L2006682919" + "'", str16, "L2006682919");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitVarInsn((-1), 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type14 = null;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field((-1), "org/mockito/asm/Type", type14, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.end_class();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(9, "Z", "double", "Lorg.mockito.asm.Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = type14.equals(obj16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSort();
        java.lang.String str23 = type21.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        java.lang.String str30 = type27.toString();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type20, type21, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) (byte) 10, 130, "Lorg/mockito/asm/Type;", type14, typeArray31, "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "J" + "'", str19, "J");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Z" + "'", str28, "Z");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(ZZZZ)J" + "'", str32, "(ZZZZ)J");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(0, "(ZZFJZ)C", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "(ZZS)Lorg/mockito/cglib/core/ClassEmitter;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        int[] intArray13 = new int[] { 154, 157 };
        org.mockito.asm.Label[] labelArray14 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLookupSwitchInsn(label7, intArray13, labelArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L444671724" + "'", str10, "L444671724");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[154, 157]");
        org.junit.Assert.assertNotNull(labelArray14);
    }
}
