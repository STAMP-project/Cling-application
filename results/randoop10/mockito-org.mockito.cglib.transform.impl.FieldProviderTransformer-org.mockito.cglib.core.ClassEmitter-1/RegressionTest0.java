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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor6 = fieldProviderTransformer0.visitField(5, "Z", "hi!", "", (java.lang.Object) 112);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.Signature signature2 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type3.getOpcode((int) (byte) 1);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = fieldProviderTransformer0.begin_method(10, signature2, typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@5f382a22");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("J");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter1.visitField((int) ' ', "Z", "long", "J", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature2 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type3.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type7, type9, type10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter13 = classEmitter0.begin_method((int) (short) 10, signature2, typeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6a5e8bbf");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "J" + "'", str11, "J");
        org.junit.Assert.assertNotNull(typeArray12);
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
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.Signature signature2 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type4, type6, type7, type8, type9 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter12 = fieldProviderTransformer0.begin_method(100, signature2, typeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@b86f1e0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "J" + "'", str5, "J");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "long", "", "long", "hi!", "long", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter0.visitMethod((int) (short) 1, "Z", "", "J", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@73052628");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
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
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray14 = new java.lang.String[] { "J", "", "long", "J", "J", "Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter3.visitMethod(156, "hi!", "long", "J", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2bcf720d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type[] typeArray12 = signature11.getArgumentTypes();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray22 = signature20.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter1.begin_method(6, signature11, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@43b07960");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long" + "'", str17, "long");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter0.visitField(5, "S", "(JC)Z", "J", (java.lang.Object) classEmitter9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter1.visitField(100, "J", "", "", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = fieldProviderTransformer0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@522a8ddb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] { "org/mockito/cglib/core/ClassEmitter", "J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter0.visitMethod(101, "J", "", "Z", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6df88698");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray7 = new java.lang.String[] { "boolean", "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod(9, "org/mockito/cglib/core/ClassEmitter", "hi!", "D", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@53656e90");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
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
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Object obj6 = null;
        boolean boolean7 = type5.equals(obj6);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field(1, "S", type5, (java.lang.Object) "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter1.visitField(9, "D", "(JC)C", "(JC)C", (java.lang.Object) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("S");
        int int3 = type1.getOpcode((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.toString();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field((int) ' ', "Z", type4, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Z" + "'", str5, "Z");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = classInfo2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(JC)C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@135fe4ae");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass9 = classEmitter8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter1.visitField((int) (short) 100, "Z", "", "S", (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@57d91a04");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "long", "Z(JC)Z", "boolean", "S", "hi!", "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter1.visitMethod((int) '#', "J", "hi!", "", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7c6e853d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray11 = new java.lang.String[] { "(JC)Z", "D", "(JC)L(JC)C;", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod((int) (short) 0, "(JC)L(JC)C;", "org/mockito/cglib/core/ClassEmitter", "(JC)L(JC)C;", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)L(JC)C;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(128, "long", "(JC)C", "D", (java.lang.Object) 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z(JC)Z", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(100, 2, "(JC)Z", "boolean", "J", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "(JC)L(JC)C;", "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod(5, "char", "", "(JC)C", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@38d7c7fe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray14 = new java.lang.String[] { "boolean", "D", "", "(JC)Z", "org/mockito/cglib/core/ClassEmitter", "S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter1.visitMethod(1, "(JC)C", "Lg/mockito/cglib/core/ClassEmitter;", "(JC)L(JC)C;", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = new java.lang.String[] { "S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter1.visitMethod(0, "char", "", "", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@23962387");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
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
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "(JC)C", "Lorg/mockito/cglib/core/ClassEmitter;", "D", "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter0.visitMethod(104, "", "J", "Lorg/mockito/cglib/core/ClassEmitter;", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@411c2990");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Z", type9, typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        java.lang.String str17 = signature15.getDescriptor();
        java.lang.String str18 = signature15.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("Z(JC)Z");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType("Z");
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type25, typeArray30);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        int int34 = type23.getSort();
        int int35 = type23.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass37 = classEmitter36.getClass();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type20, type22, type23, type38 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter40 = classEmitter1.begin_method(7, signature15, typeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4ffcd955");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z" + "'", str10, "Z");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(JC)Z" + "'", str17, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z(JC)Z" + "'", str18, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "long" + "'", str28, "long");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(JC)C" + "'", str33, "(JC)C");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((int) ' ', 100, "Lg/mockito/cglib/core/ClassEmitter;", "J", "boolean", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JC)C", "org/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = fieldProviderTransformer3.visitAnnotation("Lg/mockito/cglib/core/ClassEmitter;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter1.visitField(124, "Lorg/mockito/cglib/core/ClassEmitter;", "char", "LJ;", (java.lang.Object) 124);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "J", "char", "(JC)L(JC)C;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod(4, "org/mockito/cglib/core/ClassEmitter", "boolean", "Lorg/mockito/cglib/core/ClassEmitter;", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@96a304f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitInnerClass("hi!", "Lg/mockito/cglib/core/ClassEmitter;", "long", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
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
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter3.visitMethod((int) (byte) -1, "Lg/mockito/cglib/core/ClassEmitter;", "LJ;", "Z", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@49f54c48");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("Z", type4, typeArray9);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        java.lang.String str12 = signature10.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter22 = fieldProviderTransformer0.begin_method(8, signature10, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@fa54812");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Z" + "'", str5, "Z");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "long" + "'", str7, "long");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JC)Z" + "'", str12, "(JC)Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long" + "'", str17, "long");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "LJ;", "(JC)C", "Lg/mockito/cglib/core/ClassEmitter;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter3.visitMethod(0, "J", "(JC)L(JC)C;", "(JC)L(JC)C;", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@39891cdf");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Z", type2, typeArray7);
        org.mockito.asm.Type[] typeArray9 = signature8.getArgumentTypes();
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        int int11 = type0.getSort();
        int int12 = type0.getSize();
        int int13 = type0.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = type0.equals(obj14);
        org.mockito.asm.Type[] typeArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Z" + "'", str3, "Z");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(JC)C" + "'", str10, "(JC)C");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter3.visitMethod((int) '4', "Lorg/mockito/cglib/core/ClassEmitter;", "boolean", "void", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@fb1550f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Object obj2 = null;
        boolean boolean3 = type1.equals(obj2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray15 = new java.lang.String[] { "char", "LJ;", "D", "(JC)L(JC)C;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classAdapter6.visitMethod((int) (byte) 100, "(JC)L(JC)C;", "hi!", "LJ;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)L(JC)C;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@46191e80");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = fieldProviderTransformer0.visitMethod(7, "Z(JC)Z", "(JC)L(JC)C;", "", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("char");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = fieldProviderTransformer3.visitAnnotation("void", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod((int) (short) 0, "org/mockito/cglib/core/ClassEmitter", "hi!", "Z(JC)Z", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6cfe70f5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@fc6ffc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.begin_class(157, 108, "LJ;", type5, typeArray13, "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "long" + "'", str11, "long");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(JC)D" + "'", str15, "(JC)D");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
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
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] { "(JC)D", "S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter3.visitMethod(108, "(JC)Z", "boolean", "Z", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = fieldProviderTransformer3.visitAnnotation("(JC)C", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        java.lang.String[] strArray18 = new java.lang.String[] { "boolean", "J", "org/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/ClassEmitter", "char" };
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visit(156, 104, "(JC)C", "Lg/mockito/cglib/core/ClassEmitter;", "(JC)D", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "(JC)C", "J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter2.visitMethod(101, "", "boolean", "void", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@22ca3608");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "org/mockito/cglib/core/ClassEmitter", "(JC)C", "Z(JC)Z", "void", "boolean" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classAdapter1.visitMethod(116, "Z(JC)Z", "S", "char", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "Z", "LJ;", "Z", "Lg/mockito/cglib/core/ClassEmitter;", "Z", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter3.visitMethod((int) (short) 0, "boolean", "g.mockito.cglib.core.ClassEmitter", "g.mockito.cglib.core.ClassEmitter", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4de530bc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("boolean", "Z");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Z", type9, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter17 = classEmitter2.begin_method(2, signature6, typeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@44bd2bc9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z" + "'", str10, "Z");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JC)D" + "'", str16, "(JC)D");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
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
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = signature11.getReturnType();
        boolean boolean15 = signature11.equals((java.lang.Object) 104);
        java.lang.String str16 = signature11.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Z", type19, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter27 = classEmitter1.begin_method((int) (short) 1, signature11, typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4a5ddd79");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z(JC)Z" + "'", str16, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "long" + "'", str22, "long");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(JC)D" + "'", str26, "(JC)D");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter2.visitField(126, "(JC)D", "long", "J", (java.lang.Object) 154);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor6 = fieldProviderTransformer0.visitField(8, "Z", "boolean", "long", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitAttribute(attribute2);
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
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter1.visitField(156, "long", "Lg/mockito/cglib/core/ClassEmitter;", "J", obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(5, 5, "g.mockito.cglib.core.ClassEmitter", "g.mockito.cglib.core.ClassEmitter", "hi!", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "org.mockito.cglib.core.ClassEmitter", "(JC)C", "Z(JC)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter3.visitMethod(112, "(JC)C", "(JC)D", "D", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classAdapter12.visitMethod(116, "hi!", "J", "org/mockito/asm/Type", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@76f081e2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
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
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] { "(JC)C", "char" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter4.visitMethod(116, "S", "(JC)C", "g.mockito.cglib.core.ClassEmitter", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@61ce523a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray10 = new java.lang.String[] { "Z", "org/mockito/asm/Type", "S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = fieldProviderTransformer0.visitMethod(116, "J", "", "(JC)C", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@2092d33a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "org/mockito/asm/Type", "Lorg/mockito/cglib/core/ClassEmitter;", "J", "boolean", "J", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter2.visitMethod(9, "(JC)Z", "long", "g.mockito.cglib.core.ClassEmitter", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter6.visitField((int) (short) 0, "Z", "org.mockito.cglib.core.ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) classInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.Class<?> wildcardClass19 = signature17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor20 = classAdapter5.visitField((int) (short) 10, "J", "char", "(JC)L(JC)C;", (java.lang.Object) signature17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type[] typeArray12 = signature11.getArgumentTypes();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        boolean boolean22 = signature11.equals((java.lang.Object) signature20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type26, typeArray31);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter35 = classEmitter2.begin_method(108, signature20, typeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@604e96e6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long" + "'", str17, "long");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "long" + "'", str29, "long");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JC)L(JC)C;" + "'", str34, "(JC)L(JC)C;");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = fieldProviderTransformer3.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3df79268");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        java.lang.String[] strArray14 = new java.lang.String[] { "void", "Lg/mockito/cglib/core/ClassEmitter;", "hi!", "org/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter1.visitMethod(3, "D", "D", "S", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@27bfb335");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("D");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@16e3c967");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray11 = new java.lang.String[] { "LJ;", "", "Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter1.visitMethod(124, "long", "S", "(JC)C", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@184bfa39");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Object obj14 = null;
        boolean boolean15 = type13.equals(obj14);
        java.lang.String str16 = type13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = fieldProviderTransformer3.visitField(3, "J", "org/mockito/asm/Type", "Lorg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) type13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LJ;" + "'", str16, "LJ;");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        java.lang.String[] strArray23 = new java.lang.String[] { "Lorg/mockito/cglib/core/ClassEmitter;", "", "org/mockito/asm/Type", "long", "(JC)D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = fieldProviderTransformer3.visitMethod(105, "(JC)L(JC)C;", "", "(JC)L(JC)C;", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)L(JC)C;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(8, 8, "org.mockito.cglib.core.ClassEmitter", "", "double", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] { "D", "org/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter1.visitMethod(5, "", "char", "S", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@64553d05");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
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
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray10 = new java.lang.String[] { "void" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter4.visitMethod((-1), "J", "hi!", "", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5fda736b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField(157, "J", "Lg/mockito/cglib/core/ClassEmitter;", "(JC)D", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer15.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter4.visitField((int) 'a', "hi!", "long", "Z(JC)Z", (java.lang.Object) classEmitter13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        java.lang.String[] strArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod((int) ' ', "double", "J", "", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3d16d915");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter2.visitField(158, "Z(JC)Z", "(JC)D", "long", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2fd7276d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        java.lang.Class<?> wildcardClass8 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "long" + "'", str4, "long");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
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
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str14 = type13.getInternalName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type16, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type13, typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor25 = classEmitter4.visitField((int) (short) 10, "", "hi!", "Lorg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "S" + "'", str14, "S");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long" + "'", str19, "long");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("J");
        org.mockito.asm.Type[] typeArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.begin_class(6, (int) (short) 0, "", type9, typeArray10, "(JC)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Z", type10, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter3.visitField((int) ' ', "void", "long", "double", (java.lang.Object) str32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "long" + "'", str25, "long");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JC)L(JC)C;" + "'", str30, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JC)Z" + "'", str31, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(JC)Z" + "'", str32, "(JC)Z");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter1.visitField((int) (short) -1, "Lorg/mockito/cglib/core/ClassEmitter;", "g.mockito.cglib.core.ClassEmitter", "V", (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z(JC)Z");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] { "V", "g.mockito.cglib.core.ClassEmitter", "long" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(0, "void", "long", "long", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@255a57b6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter1.visitMethod(9, "S", "LJ;", "char", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5354dd65");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z(JC)Z", "(JC)D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Z", type9, typeArray14);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type type17 = signature15.getReturnType();
        java.lang.String str18 = signature15.toString();
        org.mockito.asm.Type type19 = signature15.getReturnType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray29);
        java.lang.String str31 = type19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor32 = classEmitter2.visitField(6, "(JC)D", "g.mockito.cglib.core.ClassEmitter", "", (java.lang.Object) str31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z" + "'", str10, "Z");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z(JC)Z" + "'", str18, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "long" + "'", str24, "long");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JC)Z" + "'", str30, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classAdapter4.visitMethod(100, "org/mockito/asm/Type", "hi!", "", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@59ffb847");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("S");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JC)C", "Lg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
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
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray8 = new java.lang.String[] { "V" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = fieldProviderTransformer0.visitMethod(0, "Lorg/mockito/cglib/core/ClassEmitter;", "boolean", "org.mockito.cglib.core.ClassEmitter", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@5313a0ef");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type26, typeArray31);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter37 = classEmitter8.begin_method(0, signature12, typeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2f0fe445");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long" + "'", str17, "long");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "long" + "'", str29, "long");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JC)L(JC)C;" + "'", str34, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JC)Z" + "'", str35, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(JC)Z" + "'", str36, "(JC)Z");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray9 = new java.lang.String[] { "(JC)Z", "Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = fieldProviderTransformer0.visitMethod((int) (short) 10, "org.mockito.cglib.core.ClassEmitter", "long", "org/mockito/cglib/core/ClassEmitter", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@7a925488");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray14 = new java.lang.String[] { "Z(JC)Z", "double", "hi!", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "", "char" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter3.visitMethod(130, "V", "Z(JC)Z", "J", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@305307fe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter2.visitMethod(153, "Z(JC)Z", "S", "org/mockito/asm/Type", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter2.visitMethod((-1), "long", "long", "(JC)Z", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4cac908d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        java.lang.String str3 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "D" + "'", str3, "D");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("J");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField((int) (byte) 100, "(JC)D", "", "void", (java.lang.Object) type8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Object obj8 = null;
        boolean boolean9 = type7.equals(obj8);
        java.lang.String str10 = type7.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = signature18.getDescriptor();
        java.lang.String str21 = signature18.toString();
        java.lang.String str22 = signature18.getName();
        org.mockito.asm.Type type23 = signature18.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field(8, "double", type7, (java.lang.Object) type23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LJ;" + "'", str10, "LJ;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "long" + "'", str15, "long");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(JC)Z" + "'", str20, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z(JC)Z" + "'", str21, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type23);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray17 = new java.lang.String[] { "org.mockito.cglib.core.ClassEmitter", "g.mockito.cglib.core.ClassEmitter", "hi!", "org/mockito/cglib/core/ClassEmitter", "Z(JC)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor18 = classEmitter7.visitMethod((-1), "org/mockito/asm/Type", "char", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@22ac483c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter7.visitAttribute(attribute9);
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("char");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = new java.lang.String[] { "J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter3.visitMethod((int) (short) 10, "char", "S", "(JC)C", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@46fb19a9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Z", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer5.begin_class(153, 9, "C", type13, typeArray24, "Z(JC)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "long" + "'", str20, "long");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(JC)L(JC)C;" + "'", str25, "(JC)L(JC)C;");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
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
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer13.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter8.visitField((int) (byte) -1, "org/mockito/asm/Type", "Z(JC)Z", "char", (java.lang.Object) classInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter1.visitMethod((int) (byte) -1, "char", "g.mockito.cglib.core.ClassEmitter", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@72ee4709");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
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
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = fieldProviderTransformer5.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@2c387e89");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("D", "LJ;");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type8, typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter2.begin_method((int) (byte) -1, signature6, typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37bdc2ad");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(JC)C" + "'", str21, "(JC)C");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@379bfd7a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.lang.String str10 = type9.getInternalName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = fieldProviderTransformer0.visitField(104, "(JC)L(JC)C;", "", "char", (java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/Type" + "'", str10, "org/mockito/asm/Type");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = fieldProviderTransformer3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
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
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Z", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type12, typeArray24);
        int int28 = type12.getOpcode((int) (short) -1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str30 = type29.getClassName();
        boolean boolean31 = type12.equals((java.lang.Object) type29);
        int int33 = type29.getOpcode((int) (short) 10);
        org.mockito.asm.Type[] typeArray35 = org.mockito.asm.Type.getArgumentTypes("(JC)Z");
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.begin_class((int) (short) -1, 108, "(JC)D", type29, typeArray35, "LS;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "long" + "'", str20, "long");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(JC)C" + "'", str25, "(JC)C");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "void" + "'", str30, "void");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("double", "LJ;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type[] typeArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("(JC)Lorg/mockito/cglib/core/ClassEmitter;", type1, typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Type type22 = signature20.getReturnType();
        java.lang.String str23 = signature20.toString();
        org.mockito.asm.Type type24 = signature20.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type26, typeArray31);
        org.mockito.asm.Type type33 = signature32.getReturnType();
        org.mockito.asm.Type[] typeArray34 = signature32.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray34);
        java.lang.String str36 = type24.toString();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer5.declare_field((int) (byte) 100, "Lorg/mockito/cglib/core/ClassEmitter;", type12, (java.lang.Object) str36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long" + "'", str17, "long");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z(JC)Z" + "'", str23, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "long" + "'", str29, "long");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JC)Z" + "'", str35, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Z" + "'", str36, "Z");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.toString();
        java.lang.String str21 = signature17.getDescriptor();
        org.mockito.asm.Type type22 = signature17.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter31 = classEmitter0.begin_method(0, signature17, typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@64dcc488");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JC)Z" + "'", str19, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z(JC)Z" + "'", str20, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(JC)Z" + "'", str21, "(JC)Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "long" + "'", str27, "long");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("void");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classAdapter12.visitField((int) '4', "C", "boolean", "boolean", (java.lang.Object) "Lg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter7.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
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
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "D", "org/mockito/cglib/core/ClassEmitter", "g.mockito.cglib.core.ClassEmitter", "S", "C", "long" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = fieldProviderTransformer0.visitMethod(4, "void", "(JC)L(JC)C;", "C", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@185792e0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        java.lang.String[] strArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(15, 2, "g.mockito.cglib.core.ClassEmitter", "boolean", "C", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer19 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo20 = fieldProviderTransformer19.getClassInfo();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer19);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        fieldProviderTransformer13.setTarget((org.mockito.asm.ClassVisitor) classAdapter22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter0.visitField((int) (short) 100, "boolean", "org/mockito/asm/Type", "Lg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) classAdapter22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo20);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "J", "(JC)D", "D", "(JC)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter4.visitMethod((-1), "long", "V", "LJ;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7a84c6db");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Z", type6, typeArray11);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        java.lang.String str15 = signature12.toString();
        java.lang.String str16 = signature12.getDescriptor();
        java.lang.String str17 = signature12.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("org.mockito.cglib.core.ClassEmitter");
        int int20 = type19.getDimensions();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        java.lang.String str23 = type21.toString();
        int int24 = type21.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("D");
        boolean boolean27 = type21.equals((java.lang.Object) "D");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass30 = type29.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        java.lang.String str32 = type31.getInternalName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType("Z");
        int int35 = type34.getSort();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type19, type21, type31, type34 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter37 = classEmitter3.begin_method(130, signature12, typeArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3eaaa993");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long" + "'", str9, "long");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z(JC)Z" + "'", str15, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JC)Z" + "'", str16, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z(JC)Z" + "'", str17, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "S" + "'", str22, "S");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "S" + "'", str23, "S");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/asm/Type" + "'", str32, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter2.visitMethod(7, "org.mockito.cglib.core.ClassEmitter", "char", "(JC)C", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2636a0a7");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str3 = type2.getInternalName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type[] typeArray12 = signature11.getArgumentTypes();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type2, typeArray12);
        java.lang.String str14 = type2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = type2.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LS;" + "'", str14, "LS;");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitOuterClass("org.mockito.cglib.core.ClassEmitter", "org/mockito/cglib/core/ClassEmitter", "LJ;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray14 = new java.lang.String[] { "C", "org.mockito.cglib.core.ClassEmitter", "g.mockito.cglib.core.ClassEmitter", "", "long", "Lg/mockito/cglib/core/ClassEmitter;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classAdapter3.visitMethod((int) ' ', "Z", "hi!", "Z", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3ebd463a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(1, "Lorg/mockito/cglib/core/ClassEmitter;", type5, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "org/mockito/cglib/core/ClassEmitter", "C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter1.visitMethod(130, "hi!", "org/mockito/cglib/core/ClassEmitter", "long", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@57d2c8a0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
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
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("LJ;");
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(JC)C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("Z(JC)Z", type2, typeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classAdapter1.visitField((int) (short) 100, "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "LS;", "org/mockito/asm/Type", obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classAdapter3.visitField((int) (byte) 1, "org/mockito/cglib/core/ClassEmitter", "", "org/mockito/cglib/core/ClassEmitter", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] { "LJ;", "(JC)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = fieldProviderTransformer0.visitMethod(100, "org/mockito/cglib/core/ClassEmitter(JC)C", "org/mockito/cglib/core/ClassEmitter(JC)C", "LS;", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'org/mockito/cglib/core/ClassEmitter(JC)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
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
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "LS;", "(JC)Z", "J", "Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter3.visitMethod(10, "hi!", "long", "V", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@206dac7a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit((int) (short) 10, 0, "org/mockito/cglib/core/ClassEmitter", "Lg/mockito/cglib/core/ClassEmitter;", "double", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Z", type6, typeArray11);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        java.lang.String str15 = signature12.toString();
        java.lang.String str16 = signature12.getDescriptor();
        java.lang.String str17 = signature12.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Z", type19, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        java.lang.String str27 = signature25.getDescriptor();
        org.mockito.asm.Type[] typeArray28 = signature25.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter29 = classEmitter2.begin_method((int) ' ', signature12, typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@414d2017");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long" + "'", str9, "long");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z(JC)Z" + "'", str15, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JC)Z" + "'", str16, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z(JC)Z" + "'", str17, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "long" + "'", str22, "long");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(JC)Z" + "'", str27, "(JC)Z");
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classEmitter0.visitMethod(3, "org.mockito.cglib.core.ClassEmitter", "C", "J", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7a80eac7");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Z", type6, typeArray11);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.String str14 = signature12.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type16, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter31 = classEmitter2.begin_method(130, signature12, typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@256758e9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long" + "'", str9, "long");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JC)Z" + "'", str14, "(JC)Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "long" + "'", str24, "long");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JC)C" + "'", str29, "(JC)C");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "JZ(JC)Z", "org/mockito/asm/Type", "", "org/mockito/asm/Type", "org/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter2.visitMethod(130, "Z", "C", "", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6d87f445");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("boolean", "Z");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Z", type10, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter33 = classEmitter4.begin_method(155, signature8, typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@26b24db4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "long" + "'", str25, "long");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JC)L(JC)C;" + "'", str30, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JC)Z" + "'", str31, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(JC)Z" + "'", str32, "(JC)Z");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
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
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("J");
        java.lang.String str12 = type11.getInternalName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.declare_field((int) (byte) -1, "LS;", type11, (java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "J" + "'", str12, "J");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("Z", type3, typeArray8);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = signature9.getReturnType();
        java.lang.String str12 = signature9.toString();
        java.lang.String str13 = signature9.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Z", type15, typeArray20);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.String str23 = signature21.getName();
        org.mockito.asm.Type[] typeArray24 = signature21.getArgumentTypes();
        java.lang.String str25 = signature21.getDescriptor();
        org.mockito.asm.Type type26 = signature21.getReturnType();
        org.mockito.asm.Type[] typeArray27 = signature21.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter28 = classEmitter0.begin_method(2, signature9, typeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@67609798");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z(JC)Z" + "'", str12, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JC)Z" + "'", str13, "(JC)Z");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "long" + "'", str18, "long");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(JC)Z" + "'", str25, "(JC)Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type5.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Z", type10, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type5, typeArray17);
        int int21 = type5.getOpcode((int) (short) -1);
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field((int) (short) 10, "char", type5, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(JC)C" + "'", str18, "(JC)C");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        org.mockito.asm.Type type15 = signature14.getReturnType();
        org.mockito.asm.Type[] typeArray17 = org.mockito.asm.Type.getArgumentTypes("(JC)C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter4.begin_method((int) (byte) 10, signature14, typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@79b889ec");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "long" + "'", str11, "long");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray17);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", "LS;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter2.visitField(0, "D", "org.mockito.cglib.core.ClassEmitter", "JZ(JC)Z", (java.lang.Object) "LS;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
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
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Object obj12 = null;
        boolean boolean13 = type11.equals(obj12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Z", type15, typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(130, 116, "Z(JC)Z", type11, typeArray20, "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "long" + "'", str18, "long");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("Z(JC)Z", type2, typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = signature18.getDescriptor();
        java.lang.String str21 = signature18.toString();
        java.lang.String str22 = signature18.getName();
        org.mockito.asm.Type type23 = signature18.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature18.getArgumentTypes();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type27, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter35 = fieldProviderTransformer5.begin_method(124, signature18, typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@36a3f01a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "long" + "'", str15, "long");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(JC)Z" + "'", str20, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z(JC)Z" + "'", str21, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Z" + "'", str28, "Z");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "long" + "'", str30, "long");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JC)D" + "'", str34, "(JC)D");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter1.visitField((int) (short) -1, "org/mockito/cglib/core/ClassEmitter(JC)C", "(JC)D", "JZ(JC)Z", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter4.visitField(2, "Z", "org/mockito/cglib/core/ClassEmitter", "LS;", (java.lang.Object) type10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass2 = classEmitter1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type4 = type3.getElementType();
        java.lang.String str5 = type3.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean7 = type3.equals((java.lang.Object) type6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("D");
        boolean boolean10 = type3.equals((java.lang.Object) "D");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type12, typeArray17);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.asm.Type type20 = signature18.getReturnType();
        java.lang.String str21 = signature18.toString();
        org.mockito.asm.Type type22 = signature18.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type type31 = signature30.getReturnType();
        org.mockito.asm.Type[] typeArray32 = signature30.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("(JC)C", type3, typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str5, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "long" + "'", str15, "long");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z(JC)Z" + "'", str21, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "long" + "'", str27, "long");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(JC)Z" + "'", str33, "(JC)Z");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod((int) (short) 1, "D", "D", "Lorg/mockito/cglib/core/ClassEmitter;", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@63fef666");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute7);
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
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = signature20.getDescriptor();
        java.lang.String str23 = signature20.toString();
        java.lang.String str24 = signature20.getDescriptor();
        org.mockito.asm.Type type25 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.begin_class(0, (int) (short) 0, "org.mockito.cglib.core.ClassEmitter", type25, typeArray26, "LJ;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long" + "'", str17, "long");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(JC)Z" + "'", str22, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z(JC)Z" + "'", str23, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JC)Z" + "'", str24, "(JC)Z");
        org.junit.Assert.assertNotNull(type25);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray13 = new java.lang.String[] { "LJ;", "(JC)S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = fieldProviderTransformer0.visitMethod((int) (short) -1, "Z", "g.mockito.cglib.core.ClassEmitter", "(JC)S", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@da090b1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass1 = classEmitter0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = type2.getElementType();
        java.lang.String str4 = type2.toString();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        boolean boolean10 = type2.equals((java.lang.Object) classAdapter9);
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str4, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "(JC)S", "org.mockito.cglib.core.ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = fieldProviderTransformer0.visitMethod(130, "LJ;", "(JC)D", "org/mockito/cglib/core/ClassEmitter(JC)C", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@6a3e702b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray10 = new java.lang.String[] { "Lorg/mockito/cglib/core/ClassEmitter;", "char", "org/mockito/asm/Type", "org/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = fieldProviderTransformer0.visitMethod((int) '#', "g.mockito.cglib.core.ClassEmitter", "double", "(JC)C", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@7adc04d3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@12f2f1ff");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@176a174");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter8.visitField(9, "", "double", "(JC)C", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.mockito.cglib.core.ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classAdapter1.visitMethod(8, "J", "org.mockito.cglib.core.ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@706318ee");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1713664a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray11 = new java.lang.String[] { "(JC)S", "org/mockito/cglib/core/ClassEmitter", "(JC)LJ;", "org/mockito/cglib/core/ClassEmitter(JC)C", "(JC)D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter1.visitMethod((int) (short) 0, "org/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/ClassEmitter(JC)C", "D", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@30346f21");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lg/mockito/cglib/core/ClassEmitter;", "boolean");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "g.mockito.cglib.core.ClassEmitter", "(JC)Z", "Lorg/mockito/asm/Type;", "int" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter4.visitMethod(2, "", "Z", "LS;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@231ea5bf");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] { "Lg/mockito/cglib/core/ClassEmitter;", "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter3.visitMethod(2, "", "", "hi!", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1371d0c0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter7.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.Type type11 = null;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field(0, "(JC)Z", type11, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = fieldProviderTransformer3.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = fieldProviderTransformer3.visitField(134, "org/mockito/cglib/core/ClassEmitter(JC)C", "int", "Z", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = fieldProviderTransformer3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@1fd56a74");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        int int20 = type9.getSort();
        int int21 = type9.getSize();
        int int22 = type9.getSize();
        java.lang.Object obj23 = null;
        boolean boolean24 = type9.equals(obj23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type27.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("Z", type32, typeArray37);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type27, typeArray39);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type43.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("Z", type48, typeArray53);
        org.mockito.asm.Type[] typeArray55 = signature54.getArgumentTypes();
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", type43, typeArray55);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("S", type27, typeArray55);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) (byte) 1, 134, "hi!", type9, typeArray55, "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JC)C" + "'", str19, "(JC)C");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "long" + "'", str35, "long");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(JC)C" + "'", str40, "(JC)C");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Z" + "'", str49, "Z");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "long" + "'", str51, "long");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(JC)C" + "'", str56, "(JC)C");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter14 = fieldProviderTransformer7.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("Z");
        int int3 = type2.getSort();
        org.mockito.asm.Type[] typeArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("(JC)LJ;", type2, typeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "void", "(JC)C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod(0, "(JC)Z", "boolean", "(JC)S", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = fieldProviderTransformer3.visitMethod((int) (byte) 1, "D", "hi!", "g.mockito.cglib.core.ClassEmitter", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@7b4529ec");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod(124, "char", "hi!", "(JC)C", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@57a27245");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "g.mockito.cglib.core.ClassEmitter", "(JC)Z", "J", "(JC)LJ;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter5.visitMethod(96, "Lg/mockito/cglib/core/ClassEmitter;", "J", "hi!", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3ce1cd41");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        java.lang.String[] strArray18 = new java.lang.String[] { "Z", "S", "Z", "(JC)L(JC)C;", "C" };
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visit(0, 0, "(JC)D", "org/mockito/cglib/core/ClassEmitter", "V", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter4.visitField((int) (short) 0, "Z(JC)Z", "(JC)Z", "Lorg/mockito/asm/Type;", (java.lang.Object) "(JC)Lorg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "(JC)Z", "(JC)L(JC)C;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter5.visitMethod(153, "J", "", "int", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7889fdac");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = fieldProviderTransformer5.visitMethod(104, "void", "double", "C", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@e010825");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "Z", "long", "(JC)Z", "V" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter5.visitMethod(15, "Lg/mockito/cglib/core/ClassEmitter;", "(JC)L(JC)C;", "Lorg/mockito/asm/Type;", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@510a3c4a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type8, typeArray20);
        java.lang.String str23 = signature22.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type25.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("Z", type30, typeArray35);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type25, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter40 = classEmitter2.begin_method(8, signature22, typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7ed7af0c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(JC)C" + "'", str21, "(JC)C");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(JC)Z" + "'", str23, "(JC)Z");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(JC)C" + "'", str38, "(JC)C");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classAdapter4.visitMethod(126, "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "J", "org/mockito/asm/Type", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Lorg/mockito/cglib/core/ClassEmitter;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("long", "D");
        java.lang.String str8 = signature7.getDescriptor();
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(JC)Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter3.begin_method((int) '4', signature7, typeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@aa3fd04");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type6 = null;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field(0, "V", type6, (java.lang.Object) type7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visitSource("org/mockito/cglib/core/ClassEmitter(JC)C", "(JC)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("g.mockito.cglib.core.ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("Z", type4, typeArray9);
        org.mockito.asm.Type[] typeArray11 = signature10.getArgumentTypes();
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Z" + "'", str5, "Z");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "long" + "'", str7, "long");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JC)L(JC)C;" + "'", str12, "(JC)L(JC)C;");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = fieldProviderTransformer3.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray19 = new java.lang.String[] { "(JC)LJ;", "JZ(JC)Z", "org/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classEmitter3.visitMethod((-1), "", "hi!", "Lorg/mockito/cglib/core/ClassEmitter;", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@712c8fba");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        java.lang.String str2 = type1.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.mockito.cglib.core.ClassEmitter" + "'", str2, "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = classEmitter15.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(134, 0, "hi!", "Z(JC)Z", "C", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
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
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(JC)C");
        int int3 = type2.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Z", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        java.lang.String str16 = type5.getClassName();
        int int18 = type5.getOpcode((int) (short) -1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("Z", type20, typeArray25);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        java.lang.String str28 = signature26.getDescriptor();
        java.lang.String str29 = signature26.toString();
        java.lang.String str30 = signature26.getName();
        org.mockito.asm.Type type31 = signature26.getReturnType();
        org.mockito.asm.Type[] typeArray32 = signature26.getArgumentTypes();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("LJ;", type5, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("Z(JC)Z", type2, typeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Z" + "'", str8, "Z");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(JC)C" + "'", str15, "(JC)C");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "char" + "'", str16, "char");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "long" + "'", str23, "long");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(JC)Z" + "'", str28, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Z(JC)Z" + "'", str29, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass23 = classEmitter22.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = type24.getElementType();
        java.lang.String str26 = type24.toString();
        boolean boolean27 = type21.equals((java.lang.Object) type24);
        org.mockito.asm.Type type28 = type24.getElementType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer29 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer29);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer34 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer34);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer7.declare_field(1, "org/mockito/cglib/core/ClassEmitter", type28, (java.lang.Object) classEmitter33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str26, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNull(classInfo32);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Z", type9, typeArray14);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray28);
        int int32 = type16.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter3.visitField(101, "(JC)LJ;", "org/mockito/cglib/core/ClassEmitter", "LJ;", (java.lang.Object) type16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z" + "'", str10, "Z");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "long" + "'", str24, "long");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JC)L(JC)C;" + "'", str29, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JC)Z" + "'", str30, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JC)Z" + "'", str31, "(JC)Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JC)Lorg/mockito/asm/Type;", "Lg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = classEmitter3.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        int int20 = type9.getDimensions();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classAdapter1.visitField(101, "org/mockito/cglib/core/ClassEmitter(JC)C", "(JC)C", "Lg/mockito/cglib/core/ClassEmitter;", (java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JC)L(JC)C;" + "'", str19, "(JC)L(JC)C;");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1f6f7616");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) 1);
        int int4 = type0.getOpcode(7);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str8 = type7.getInternalName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Z", type10, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type7, typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        boolean boolean20 = type0.equals((java.lang.Object) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "S" + "'", str8, "S");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str21, "[Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter4.visitMethod(96, "long", "(JC)Lorg/mockito/asm/Type;", "LJ;", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@27ef197e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "(JC)S", "D", "Z(JC)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter2.visitMethod(156, "(JC)Lorg/mockito/asm/Type;", "", "(JC)V", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        java.lang.String[] strArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visit(9, (int) (short) 10, "(JC)Z", "(JC)J", "", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type[] typeArray14 = signature11.getArgumentTypes();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type16, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = signature22.getDescriptor();
        java.lang.String str25 = signature22.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        boolean boolean30 = signature22.equals((java.lang.Object) type29);
        boolean boolean31 = signature11.equals((java.lang.Object) boolean30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("Z", type36, typeArray41);
        org.mockito.asm.Type[] typeArray43 = signature42.getArgumentTypes();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter46 = classEmitter0.begin_method(0, signature11, typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@443b7f22");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long" + "'", str19, "long");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JC)Z" + "'", str24, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z(JC)Z" + "'", str25, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Z" + "'", str37, "Z");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "long" + "'", str39, "long");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(JC)L(JC)C;" + "'", str44, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(JC)Z" + "'", str45, "(JC)Z");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Z", type15, typeArray20);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        java.lang.String str24 = signature21.toString();
        org.mockito.asm.Type type25 = signature21.getReturnType();
        java.lang.String str26 = signature21.toString();
        org.mockito.asm.Type type27 = signature21.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor28 = fieldProviderTransformer3.visitField(158, "(JC)V", "void", "org/mockito/cglib/core/ClassEmitter(JC)C", (java.lang.Object) type27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "long" + "'", str18, "long");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z(JC)Z" + "'", str24, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z(JC)Z" + "'", str26, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type27);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "(JC)C", "S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod(124, "V", "double", "", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2c2515eb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass2 = classEmitter1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type4 = type3.getElementType();
        java.lang.String str5 = type3.toString();
        boolean boolean6 = type0.equals((java.lang.Object) type3);
        java.lang.String str7 = type3.getInternalName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str5, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str7, "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        boolean boolean14 = type7.equals((java.lang.Object) classAdapter13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter2.visitField(3, "org.mockito.cglib.core.ClassEmitter", "hi!", "(JC)LJ;", (java.lang.Object) type7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] { "(JC)S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter2.visitMethod(105, "char", "V", "org/mockito/cglib/core/ClassEmitter", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6b9fb3ca");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/cglib/core/ClassEmitter(JC)C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray18 = new java.lang.String[] { "JZ(JC)Z", "g.mockito.cglib.core.ClassEmitter", "char", "Z(JC)Z", "(JC)S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classEmitter7.visitMethod(126, "Z(JC)Z", "org/mockito/asm/Type", "(JC)L(JC)C;", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("char", "Lg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod(0, "Z", "JZ(JC)Z", "S", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@504aedb9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        java.lang.String[] strArray17 = new java.lang.String[] { "LS;", "V", "org/mockito/cglib/core/ClassEmitter", "Z(JC)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor18 = fieldProviderTransformer3.visitMethod(126, "(JC)Z", "org/mockito/asm/Type", "Lorg/mockito/cglib/core/ClassEmitter;", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass14 = classEmitter13.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = type15.getElementType();
        java.lang.String str17 = type15.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean19 = type15.equals((java.lang.Object) type18);
        int int21 = type15.getOpcode(130);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field((int) 'a', "long", type12, (java.lang.Object) 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str17, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 134 + "'", int21 == 134);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("void");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Z", type19, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.begin_class(96, 10, "LJ;", type12, typeArray26, "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "long" + "'", str22, "long");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(JC)L(JC)C;" + "'", str27, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(JC)Z" + "'", str28, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JC)J" + "'", str29, "(JC)J");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer7.visitSource("Z(JC)Z", "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("LS;");
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
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("g.mockito.cglib.core.ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter10.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter0.visitField((int) '4', "(JC)S", "Lg/mockito/cglib/core/ClassEmitter;", "char", (java.lang.Object) classInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        int int2 = type1.getSort();
        java.lang.Object obj3 = null;
        boolean boolean4 = type1.equals(obj3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "Lg/mockito/cglib/core/ClassEmitter;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter5.visitMethod(157, "LJ;", "(JC)D", "S", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@54fad908");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod(10, "boolean", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "org/mockito/cglib/core/ClassEmitter", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4a044a9e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.String[] strArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor18 = classEmitter4.visitMethod((int) (short) 100, "g.mockito.cglib.core.ClassEmitter", "org/mockito/cglib/core/ClassEmitter", "(JC)Z", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@28e0d156");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        fieldProviderTransformer8.setTarget(classVisitor11);
        org.mockito.cglib.core.ClassInfo classInfo13 = fieldProviderTransformer8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass20 = classEmitter19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = type21.getElementType();
        java.lang.String str23 = type21.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean25 = type21.equals((java.lang.Object) type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("D");
        boolean boolean28 = type21.equals((java.lang.Object) "D");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("Z", type30, typeArray35);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        org.mockito.asm.Type[] typeArray38 = signature36.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) ' ', (-1), "", type21, typeArray38, "org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str23, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = fieldProviderTransformer3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Z", type9, typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.begin_class(15, 112, "void", type7, typeArray14, "(JC)Lorg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z" + "'", str10, "Z");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter3.visitMethod(0, "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "Z", "org/mockito/cglib/core/Signature", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Lorg/mockito/cglib/core/ClassEmitter;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
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
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("double", "LJ;");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        int int20 = type9.getSort();
        int int21 = type9.getSize();
        int int22 = type9.getSize();
        java.lang.Object obj23 = null;
        boolean boolean24 = type9.equals(obj23);
        java.lang.String str25 = type9.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("Z", type30, typeArray35);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray37);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("void", type9, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter41 = classEmitter1.begin_method(153, signature7, typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@43396769");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JC)C" + "'", str19, "(JC)C");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "C" + "'", str25, "C");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(JC)L(JC)C;" + "'", str38, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(JC)Z" + "'", str39, "(JC)Z");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.visitAttribute(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type[] typeArray12 = signature11.getArgumentTypes();
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        int int14 = type3.getSort();
        int int15 = type3.getSize();
        int int16 = type3.getSize();
        java.lang.Object obj17 = null;
        boolean boolean18 = type3.equals(obj17);
        java.lang.String str19 = type3.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("void", type3, typeArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("double", type1, typeArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JC)C" + "'", str13, "(JC)C");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "C" + "'", str19, "C");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "long" + "'", str27, "long");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(JC)L(JC)C;" + "'", str32, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(JC)Z" + "'", str33, "(JC)Z");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        java.lang.String[] strArray17 = new java.lang.String[] { "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "L(JC)C;", "(JC)C", "(JC)Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor18 = classAdapter7.visitMethod((int) '4', "", "(JC)D", "V", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@156feba");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "LS;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37119962");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray12 = new java.lang.String[] { "[Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter5.visitMethod(0, "C", "org/mockito/cglib/core/Signature", "g/mockito/cglib/core/ClassEmitter", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7e8c1f6f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "org/mockito/asm/Type", "void", "org.mockito.cglib.core.ClassEmitter", "hi!", "org/mockito/cglib/core/ClassEmitter", "Lg/mockito/cglib/core/ClassEmitter;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = fieldProviderTransformer0.visitMethod((int) (short) -1, "org/mockito/cglib/core/ClassEmitter", "char", "", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@2bde02f6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter5);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter5.visitMethod(128, "(JC)S", "J", "void", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S" + "'", str2, "S");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
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
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter10 = fieldProviderTransformer0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@2c910124");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter5.visitMethod((int) (byte) 100, "Lg/mockito/cglib/core/ClassEmitter;", "(JC)S", "char", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37235bb9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = fieldProviderTransformer7.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classEmitter14.visitMethod(9, "hi!", "(JC)Lorg/mockito/asm/Type;", "LS;", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6de42023");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        fieldProviderTransformer16.setTarget(classVisitor19);
        org.mockito.cglib.core.ClassInfo classInfo21 = fieldProviderTransformer16.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter22);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visit(0, 154, "double", "org/mockito/asm/Type", "g/mockito/cglib/core/ClassEmitter", strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter5.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@59c32cda");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S" + "'", str2, "S");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = new java.lang.String[] { "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter1.visitMethod(100, "D", "(JC)LJ;", "Lorg/mockito/asm/Type;", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@492e2071");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(JC)V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("void");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass12 = classEmitter11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer20 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer23 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo24 = fieldProviderTransformer23.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer23);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        fieldProviderTransformer23.setTarget(classVisitor26);
        org.mockito.cglib.core.ClassInfo classInfo28 = fieldProviderTransformer23.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer23);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer30 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        fieldProviderTransformer23.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field(128, "long", type15, (java.lang.Object) classEmitter31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str14, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo32);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Z", type6, typeArray11);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str18 = type17.getInternalName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("Z", type20, typeArray25);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type17, typeArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter29 = classEmitter1.begin_method((int) (byte) 10, signature12, typeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6c340cfe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long" + "'", str9, "long");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "S" + "'", str18, "S");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "long" + "'", str23, "long");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter15.getClassInfo();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer25 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        boolean boolean31 = type24.equals((java.lang.Object) classAdapter30);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter30.visitSource("org/mockito/cglib/core/ClassEmitter", "JZ(JC)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        int int11 = type9.getOpcode(2);
        int int12 = type9.getSize();
        int int14 = type9.getOpcode(1);
        int int15 = type9.getSize();
        int int16 = type9.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        org.mockito.asm.Type type28 = signature24.getReturnType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type31.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type40 };
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("Z", type36, typeArray41);
        org.mockito.asm.Type[] typeArray43 = signature42.getArgumentTypes();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type31, typeArray43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type47.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str53 = type52.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type54, type56 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("Z", type52, typeArray57);
        org.mockito.asm.Type[] typeArray59 = signature58.getArgumentTypes();
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type47, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("S", type31, typeArray59);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray59);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray59);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor65 = classEmitter3.visitField(4, "(JC)LJ;", "boolean", "J", (java.lang.Object) typeArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "long" + "'", str21, "long");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Z" + "'", str37, "Z");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "long" + "'", str39, "long");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(JC)C" + "'", str44, "(JC)C");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Z" + "'", str53, "Z");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "long" + "'", str55, "long");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(JC)C" + "'", str60, "(JC)C");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(JC)Z" + "'", str63, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(JC)S" + "'", str64, "(JC)S");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Z", type7, typeArray12);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.String str15 = signature13.getName();
        java.lang.String str16 = signature13.getDescriptor();
        java.lang.String str17 = signature13.getName();
        java.lang.String str18 = signature13.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray29);
        int int31 = type20.getSort();
        int int32 = type20.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Z", type34, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type20, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter42 = classEmitter4.begin_method(155, signature13, typeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@366af7fe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Z" + "'", str8, "Z");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JC)Z" + "'", str16, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z(JC)Z" + "'", str18, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "long" + "'", str25, "long");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JC)C" + "'", str30, "(JC)C");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Z" + "'", str35, "Z");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "long" + "'", str37, "long");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("S");
        int int3 = type1.getOpcode((int) 'a');
        int int5 = type1.getOpcode(101);
        int int6 = type1.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer14.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        fieldProviderTransformer14.setTarget(classVisitor17);
        org.mockito.cglib.core.ClassInfo classInfo19 = fieldProviderTransformer14.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter10.getClassInfo();
        boolean boolean23 = type1.equals((java.lang.Object) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter24 = classEmitter10.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@cabb9eb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 105 + "'", int5 == 105);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "g.mockito.cglib.core.ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter5.visitMethod((int) (short) 1, "int", "", "char", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@39c7158a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter12.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
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
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("I", "Z(JC)Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("Z", type3, typeArray8);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = signature9.getReturnType();
        java.lang.String str12 = signature9.toString();
        org.mockito.asm.Type type13 = signature9.getReturnType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Z", type15, typeArray20);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type[] typeArray23 = signature21.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("(JC)J", type1, typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z(JC)Z" + "'", str12, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "long" + "'", str18, "long");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JC)Z" + "'", str24, "(JC)Z");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("void");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass18 = classEmitter17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("Z", type23, typeArray28);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        boolean boolean33 = signature29.equals((java.lang.Object) 104);
        java.lang.String str34 = signature29.getDescriptor();
        org.mockito.asm.Type[] typeArray35 = signature29.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.begin_class((int) 'a', 154, "Z", type21, typeArray35, "JZ(JC)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str19, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "long" + "'", str26, "long");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JC)Z" + "'", str34, "(JC)Z");
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        java.lang.String[] strArray25 = new java.lang.String[] { "[Lorg/mockito/asm/Type;", "J", "(JC)D", "(JC)Lorg/mockito/asm/Type;", "g/mockito/cglib/core/ClassEmitter", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(130, (-1), "double", "(JC)L(JC)C;", "Lg/mockito/cglib/core/ClassEmitter;", strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter15.getClassInfo();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer25 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        boolean boolean31 = type24.equals((java.lang.Object) classAdapter30);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter30);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter30.visitInnerClass("D", "boolean", "(JC)D", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        java.lang.String[] strArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit((int) (short) 10, 9, "", "(JC)Z", "mockito/cglib/core/ClassEmitter", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        int int9 = type7.getSort();
        int int10 = type7.getSort();
        int int11 = type7.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter2.visitField(10, "g/mockito/cglib/core/ClassEmitter", "void", "void", (java.lang.Object) type7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        org.mockito.asm.Type type23 = signature19.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type26.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("Z", type31, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type26, typeArray38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type42.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("Z", type47, typeArray52);
        org.mockito.asm.Type[] typeArray54 = signature53.getArgumentTypes();
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type42, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("S", type26, typeArray54);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray54);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor59 = classEmitter2.visitField((int) (short) 100, "Lg/mockito/cglib/core/ClassEmitter;", "double", "Lorg/mockito/asm/Type;", (java.lang.Object) typeArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Z" + "'", str32, "Z");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "long" + "'", str34, "long");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(JC)C" + "'", str39, "(JC)C");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Z" + "'", str48, "Z");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "long" + "'", str50, "long");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(JC)C" + "'", str55, "(JC)C");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(JC)Z" + "'", str58, "(JC)Z");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("S");
        int int3 = type1.getOpcode((int) 'a');
        int int5 = type1.getOpcode(101);
        int int6 = type1.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer14.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        fieldProviderTransformer14.setTarget(classVisitor17);
        org.mockito.cglib.core.ClassInfo classInfo19 = fieldProviderTransformer14.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter10.getClassInfo();
        boolean boolean23 = type1.equals((java.lang.Object) classEmitter10);
        java.lang.String[] strArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor29 = classEmitter10.visitMethod(108, "Lg/mockito/cglib/core/ClassEmitter;", "(JC)C", "(JC)C", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1f1823eb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 105 + "'", int5 == 105);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visitOuterClass("g/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/Signature", "(JC)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type19, typeArray31);
        java.lang.String str34 = signature33.toString();
        java.lang.String str35 = signature33.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = signature33.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor37 = fieldProviderTransformer3.visitField(108, "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "J", "C", (java.lang.Object) typeArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "long" + "'", str27, "long");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(JC)C" + "'", str32, "(JC)C");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JC)Z" + "'", str34, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JC)Z" + "'", str35, "(JC)Z");
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean23 = signature2.equals((java.lang.Object) fieldProviderTransformer11);
        org.mockito.asm.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer11.visitAttribute(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        org.mockito.asm.Type type24 = signature22.getReturnType();
        boolean boolean26 = signature22.equals((java.lang.Object) 104);
        java.lang.String str27 = signature22.getName();
        java.lang.String str28 = signature22.getName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        boolean boolean32 = type29.equals((java.lang.Object) 155);
        java.lang.String str33 = type29.getClassName();
        java.lang.String str34 = type29.getDescriptor();
        boolean boolean35 = signature22.equals((java.lang.Object) type29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor36 = classEmitter10.visitField(108, "g/mockito/cglib/core/ClassEmitter", "D", "org/mockito/cglib/core/ClassEmitter", (java.lang.Object) type29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long" + "'", str19, "long");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Z" + "'", str28, "Z");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "long" + "'", str30, "long");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "J" + "'", str34, "J");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Z", type6, typeArray11);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.String str14 = signature12.getName();
        org.mockito.asm.Type[] typeArray15 = signature12.getArgumentTypes();
        org.mockito.asm.Type type16 = signature12.getReturnType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type19, typeArray31);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type35.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type42, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("Z", type40, typeArray45);
        org.mockito.asm.Type[] typeArray47 = signature46.getArgumentTypes();
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type35, typeArray47);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("S", type19, typeArray47);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray47);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type3, typeArray47);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("(JC)Lorg/mockito/cglib/core/ClassEmitter;", type1, typeArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "void" + "'", str4, "void");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long" + "'", str9, "long");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "long" + "'", str27, "long");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(JC)C" + "'", str32, "(JC)C");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Z" + "'", str41, "Z");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "long" + "'", str43, "long");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(JC)C" + "'", str48, "(JC)C");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(JC)Z" + "'", str51, "(JC)Z");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        java.lang.String[] strArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter16.visit(100, (int) (short) -1, "Z", "(JC)Z", "(JC)Z", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.cglib.core.ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter2.visitField(0, "(JC)L(JC)C;", "I", "org/mockito/cglib/core/Signature", obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor27 = classAdapter17.visitField(116, "S", "(JC)Z", "mockito/cglib/core/ClassEmitter", (java.lang.Object) classAdapter26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type[] typeArray14 = signature11.getArgumentTypes();
        java.lang.String str15 = signature11.getDescriptor();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer20 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo21 = fieldProviderTransformer20.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer20);
        java.lang.Class<?> wildcardClass23 = classEmitter18.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("Z", type32, typeArray37);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray39);
        int int41 = type30.getSort();
        int int42 = type30.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("Z", type44, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type30, typeArray49);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type28, typeArray49);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter53 = classEmitter1.begin_method(0, signature11, typeArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@13c46e95");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(JC)Z" + "'", str15, "(JC)Z");
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str24, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str26, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "long" + "'", str35, "long");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(JC)C" + "'", str40, "(JC)C");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Z" + "'", str45, "Z");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "long" + "'", str47, "long");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5489ba78");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JC)Z", "LJ;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter8.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6ed2c986");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode(104);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "long" + "'", str1, "long");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 105 + "'", int6 == 105);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean23 = signature2.equals((java.lang.Object) fieldProviderTransformer11);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("Z", type29, typeArray34);
        org.mockito.asm.Type type36 = signature35.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor37 = fieldProviderTransformer11.visitField(155, "org/mockito/cglib/core/ClassEmitter(JC)C", "Lg/mockito/cglib/core/ClassEmitter;", "long", (java.lang.Object) signature35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "long" + "'", str32, "long");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type type9 = signature7.getReturnType();
        boolean boolean11 = signature7.equals((java.lang.Object) 104);
        java.lang.String str12 = signature7.toString();
        java.lang.String str13 = signature7.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "long" + "'", str4, "long");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z(JC)Z" + "'", str12, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z(JC)Z" + "'", str13, "Z(JC)Z");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JC)LJ;", "(JC)L(JC)C;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)LJ;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(JC)C");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer19 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer19);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo23 = fieldProviderTransformer22.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field(96, "long", type18, (java.lang.Object) classEmitter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo23);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type[] typeArray8 = signature7.getArgumentTypes();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Z", type10, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        boolean boolean18 = signature7.equals((java.lang.Object) signature16);
        java.lang.String str19 = signature7.getName();
        java.lang.String str20 = signature7.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "long" + "'", str4, "long");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z(JC)Z" + "'", str20, "Z(JC)Z");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("char", "(JC)Z", "g/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.String[] strArray18 = new java.lang.String[] { "Z(JC)Z", "LS;", "J", "mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = fieldProviderTransformer5.visitMethod(157, "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", "boolean", "S", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@15e6843d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2d5c08f3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "short", "J" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter3.visitMethod(100, "V", "org/mockito/cglib/core/ClassEmitter", "(JC)LJ;", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@35610a79");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray18 = new java.lang.String[] { "boolean", "org/mockito/cglib/core/ClassEmitter(JC)C", "(JC)V", "Lmockito/cglib/core/ClassEmitter;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classEmitter1.visitMethod(105, "(JC)L(JC)C;", "org/mockito/asm/Type", "g/mockito/cglib/core/ClassEmitter", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)L(JC)C;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter13.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter5.visitField(4, "char", "(JC)D", "S", (java.lang.Object) classInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("S");
        int int13 = type11.getOpcode((int) 'a');
        java.lang.String str14 = type11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classAdapter5.visitField((int) 'a', "long", "(JC)S", "(JC)V", (java.lang.Object) type11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LS;" + "'", str14, "LS;");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass7 = classEmitter6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str14 = type13.toString();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("g.mockito.cglib.core.ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;");
        boolean boolean18 = type13.equals((java.lang.Object) signature17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass20 = classEmitter19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = type21.getElementType();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type[] typeArray25 = org.mockito.asm.Type.getArgumentTypes("(JC)Z");
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter27 = classEmitter3.begin_method(153, signature17, typeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@68fdf6f4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str9, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str11, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str14, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.mockito.cglib.core.ClassEmitter" + "'", str23, "org.mockito.cglib.core.ClassEmitter");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(JC)Lorg/mockito/cglib/core/ClassEmitter;" + "'", str26, "(JC)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "Z(JC)Z", "L(JC)C;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod((int) (short) 0, "", "I", "org/mockito/cglib/core/Signature", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@749db395");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray11 = new java.lang.String[] { "(JC)LJ;", "booleanZ", "J", "(JC)LJ;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classAdapter2.visitMethod(160, "(JC)Lorg/mockito/asm/Type;", "I", "J", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type3 = type2.getElementType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type5.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Z", type10, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type5, typeArray17);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        boolean boolean21 = type3.equals((java.lang.Object) type20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("Z", type23, typeArray28);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        java.lang.String str31 = signature29.getName();
        org.mockito.asm.Type[] typeArray32 = signature29.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", type3, typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(JC)C" + "'", str18, "(JC)C");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "long" + "'", str26, "long");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitAttribute(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        fieldProviderTransformer16.setTarget(classVisitor19);
        org.mockito.cglib.core.ClassInfo classInfo21 = fieldProviderTransformer16.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter22);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitOuterClass("Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", "mockito/cglib/core/ClassEmitter", "(JC)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo21);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = signature14.getName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("Z", type20, typeArray25);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        int int29 = type18.getSort();
        int int30 = type18.getSize();
        int int31 = type18.getSize();
        java.lang.Object obj32 = null;
        boolean boolean33 = type18.equals(obj32);
        java.lang.String str34 = type18.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("Z", type39, typeArray44);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray46);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("void", type18, typeArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter50 = classEmitter3.begin_method(6, signature14, typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6d155b1c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "long" + "'", str11, "long");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "long" + "'", str23, "long");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(JC)C" + "'", str28, "(JC)C");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "C" + "'", str34, "C");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Z" + "'", str40, "Z");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "long" + "'", str42, "long");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(JC)L(JC)C;" + "'", str47, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(JC)Z" + "'", str48, "(JC)Z");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit((int) (byte) -1, (int) (byte) 0, "Z(JC)Z", "org/mockito/cglib/core/ClassEmitter(JC)C", "L(JC)C;", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("booleanZ");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass17 = classEmitter16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = type18.getElementType();
        java.lang.String str20 = type18.getClassName();
        int int21 = type18.getSize();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("boolean", "Z");
        java.lang.Class<?> wildcardClass25 = signature24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.declare_field(105, "[Lorg/mockito/asm/Type;", type18, (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.mockito.cglib.core.ClassEmitter" + "'", str20, "org.mockito.cglib.core.ClassEmitter");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type[] typeArray14 = signature11.getArgumentTypes();
        java.lang.String str15 = signature11.getDescriptor();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter17 = fieldProviderTransformer0.begin_method((-1), signature11, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@2d377a6b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Z" + "'", str6, "Z");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(JC)Z" + "'", str15, "(JC)Z");
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean23 = signature2.equals((java.lang.Object) fieldProviderTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer11.visitSource("[Lorg/mockito/asm/Type;", "booleanZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass11 = classEmitter10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.lang.String str18 = type17.toString();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("g.mockito.cglib.core.ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;");
        boolean boolean22 = type17.equals((java.lang.Object) signature21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter2.visitField((int) (short) 10, "Lorg/mockito/asm/Type;", "boolean", "Z(JC)Z", (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str13, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str15, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str18, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = fieldProviderTransformer0.visitField(124, "Lmockito/cglib/core/ClassEmitter;", "boolean", "Lg/mockito/cglib/core/ClassEmitter;", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray18 = new java.lang.String[] { "Lorg/mockito/cglib/core/ClassEmitter;", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "(JC)Z", "(JC)LJ;", "mockito/cglib/core/ClassEmitter", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classEmitter2.visitMethod((int) (byte) 0, "(JC)S", "(JC)C", "int", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7668304e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = signature18.getDescriptor();
        java.lang.String str21 = signature18.toString();
        org.mockito.asm.Type type22 = signature18.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter2.visitField(112, "L(JC)C;", "long", "Z(JC)Z", (java.lang.Object) signature18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "long" + "'", str15, "long");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(JC)Z" + "'", str20, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z(JC)Z" + "'", str21, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        java.lang.String[] strArray15 = new java.lang.String[] { "org/mockito/asm/Type", "boolean", "g/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classAdapter6.visitMethod(112, "g.mockito.cglib.core.ClassEmitter", "LJ;", "(JC)L(JC)C;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@23c17acc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean23 = signature2.equals((java.lang.Object) fieldProviderTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer11.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;");
        int int2 = type1.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.visit(154, 9, "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "L(JC)C;", "mockito/cglib/core/ClassEmitter", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter8.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@285862f2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        java.lang.String str20 = signature17.toString();
        java.lang.String str21 = signature17.getDescriptor();
        java.lang.String str22 = signature17.toString();
        org.mockito.asm.Type type23 = signature17.getReturnType();
        java.lang.String str24 = signature17.toString();
        java.lang.Class<?> wildcardClass25 = signature17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter3.visitField((int) (byte) 100, "LS;", "org/mockito/cglib/core/Signature", "longD", (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z(JC)Z" + "'", str20, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(JC)Z" + "'", str21, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z(JC)Z" + "'", str22, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z(JC)Z" + "'", str24, "Z(JC)Z");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("int");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
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
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JC)D");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        java.lang.String str19 = signature17.getName();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        java.lang.String str21 = signature17.getDescriptor();
        org.mockito.asm.Type type22 = signature17.getReturnType();
        java.lang.String str23 = signature17.getDescriptor();
        java.lang.String str24 = signature17.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type26, typeArray31);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        java.lang.String str34 = signature32.getDescriptor();
        java.lang.String str35 = signature32.toString();
        org.mockito.asm.Type[] typeArray36 = signature32.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter37 = classEmitter4.begin_method(108, signature17, typeArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@359c492c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(JC)Z" + "'", str21, "(JC)Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(JC)Z" + "'", str23, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z(JC)Z" + "'", str24, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "long" + "'", str29, "long");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JC)Z" + "'", str34, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Z(JC)Z" + "'", str35, "Z(JC)Z");
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter17.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type[] typeArray8 = signature7.getArgumentTypes();
        java.lang.Class<?> wildcardClass9 = signature7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "long" + "'", str4, "long");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str11, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType("Z");
        int int20 = type19.getSort();
        java.lang.String str21 = type19.getClassName();
        java.lang.String str22 = type19.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = fieldProviderTransformer7.visitField(108, "double", "g.mockito.cglib.core.ClassEmitter", "(JC)Lorg/mockito/asm/Type;", (java.lang.Object) type19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean" + "'", str22, "boolean");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray27 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "(JC)J", "", "int" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor28 = classEmitter15.visitMethod(0, "Lmockito/cglib/core/ClassEmitter;", "double", "mockito/cglib/core/ClassEmitter", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@ec790de");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str2 = type1.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLorg/mockito/cglib/core/ClassEmitter;;" + "'", str2, "LLorg/mockito/cglib/core/ClassEmitter;;");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        java.lang.String str16 = type14.toString();
        int int17 = type14.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer21 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo22 = fieldProviderTransformer21.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer21);
        boolean boolean24 = type14.equals((java.lang.Object) classEmitter19);
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor28 = classAdapter9.visitField((int) (short) 0, "(JC)V", "", "", (java.lang.Object) str27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "S" + "'", str15, "S");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "S" + "'", str16, "S");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(JC)S" + "'", str27, "(JC)S");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("S");
        int int3 = type1.getOpcode((int) 'a');
        int int5 = type1.getOpcode(101);
        int int6 = type1.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer14.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        fieldProviderTransformer14.setTarget(classVisitor17);
        org.mockito.cglib.core.ClassInfo classInfo19 = fieldProviderTransformer14.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter10.getClassInfo();
        boolean boolean23 = type1.equals((java.lang.Object) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 105 + "'", int5 == 105);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("LS;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("g/mockito/cglib/core/ClassEmitter", "JZ(JC)Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter15.getClassInfo();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer25 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        boolean boolean31 = type24.equals((java.lang.Object) classAdapter30);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter30.visitSource("Lg/mockito/cglib/core/ClassEmitter;", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean23 = signature2.equals((java.lang.Object) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo24 = fieldProviderTransformer11.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer11.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(classInfo24);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("g/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitSource("L(JC)C;", "Lg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type type9 = signature7.getReturnType();
        java.lang.String str10 = signature7.toString();
        java.lang.String str11 = signature7.getDescriptor();
        java.lang.String str12 = signature7.toString();
        org.mockito.asm.Type type13 = signature7.getReturnType();
        int int14 = type13.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "long" + "'", str4, "long");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z(JC)Z" + "'", str10, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JC)Z" + "'", str11, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z(JC)Z" + "'", str12, "Z(JC)Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        java.lang.String[] strArray19 = new java.lang.String[] { "L(JC)C;", "g.mockito.cglib.core.ClassEmitter", "(JC)L(JC)C;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classEmitter8.visitMethod(156, "", "Lorg/mockito/asm/Type;", "(JC)LJ;", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@65e87996");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        fieldProviderTransformer16.setTarget(classVisitor19);
        org.mockito.cglib.core.ClassInfo classInfo21 = fieldProviderTransformer16.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter22);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray36 = new java.lang.String[] { "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", "Lorg/mockito/asm/Type;", "(JC)LJ;", "J", "Lorg/mockito/asm/Type;", "L(JC)C;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(104, 96, "(JC)D", "(JC)L(JC)C;", "int", strArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        java.lang.String str16 = type15.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = fieldProviderTransformer3.visitField(124, "I", "Z", "V", (java.lang.Object) type15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean23 = signature2.equals((java.lang.Object) fieldProviderTransformer11);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("Z", type30, typeArray35);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray37);
        int int39 = type28.getDimensions();
        java.lang.String str40 = type28.getInternalName();
        org.mockito.asm.Type[] typeArray42 = org.mockito.asm.Type.getArgumentTypes("(JC)C");
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer11.begin_class(7, (int) (short) 100, "[Lorg/mockito/asm/Type;", type28, typeArray42, "g/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(JC)L(JC)C;" + "'", str38, "(JC)L(JC)C;");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(JC)C" + "'", str40, "(JC)C");
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "short", "JZ(JC)Z", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classAdapter2.visitMethod(105, "(JC)J", "", "L(JC)C;", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass11 = classEmitter10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = type12.getElementType();
        java.lang.String str14 = type12.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter5.visitField(158, "[Lorg/mockito/asm/Type;", "long", "char", (java.lang.Object) type12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.mockito.cglib.core.ClassEmitter" + "'", str14, "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7eab4fc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type5 = null;
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("long", "int");
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer0.declare_field(158, "V", type5, (java.lang.Object) "long");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass18 = classEmitter17.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = type19.getElementType();
        java.lang.String str21 = type19.toString();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean27 = type19.equals((java.lang.Object) classAdapter26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("Z", type31, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray38);
        java.lang.String str40 = type29.getClassName();
        int int42 = type29.getOpcode((int) (short) -1);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type46, type48 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("Z", type44, typeArray49);
        org.mockito.asm.Type[] typeArray51 = signature50.getArgumentTypes();
        java.lang.String str52 = signature50.getDescriptor();
        java.lang.String str53 = signature50.toString();
        java.lang.String str54 = signature50.getName();
        org.mockito.asm.Type type55 = signature50.getReturnType();
        org.mockito.asm.Type[] typeArray56 = signature50.getArgumentTypes();
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("LJ;", type29, typeArray56);
        org.mockito.asm.Type[] typeArray58 = signature57.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer7.begin_class((int) (short) 1, (int) (short) -1, "(JC)S", type19, typeArray58, "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/cglib/core/ClassEmitter;" + "'", str21, "Lorg/mockito/cglib/core/ClassEmitter;");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Z" + "'", str32, "Z");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "long" + "'", str34, "long");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(JC)C" + "'", str39, "(JC)C");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "char" + "'", str40, "char");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Z" + "'", str45, "Z");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "long" + "'", str47, "long");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(JC)Z" + "'", str52, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Z(JC)Z" + "'", str53, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Z" + "'", str54, "Z");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Z", type17, typeArray22);
        org.mockito.asm.Type type24 = signature23.getReturnType();
        org.mockito.asm.Type type25 = signature23.getReturnType();
        boolean boolean27 = signature23.equals((java.lang.Object) 104);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("Z", type31, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray38);
        int int40 = type29.getSort();
        int int41 = type29.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type45, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("Z", type43, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type29, typeArray48);
        org.mockito.asm.Type[] typeArray51 = signature50.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter52 = classEmitter10.begin_method((int) (short) 10, signature23, typeArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1058a811");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "long" + "'", str20, "long");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Z" + "'", str32, "Z");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "long" + "'", str34, "long");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(JC)C" + "'", str39, "(JC)C");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Z" + "'", str44, "Z");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "long" + "'", str46, "long");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray51);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("char", "Lg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.String str24 = signature22.getName();
        org.mockito.asm.Type[] typeArray25 = signature22.getArgumentTypes();
        org.mockito.asm.Type type26 = signature22.getReturnType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type29.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Z", type34, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type29, typeArray41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type45.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type52, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("Z", type50, typeArray55);
        org.mockito.asm.Type[] typeArray57 = signature56.getArgumentTypes();
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type45, typeArray57);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("S", type29, typeArray57);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray57);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("", type13, typeArray57);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter63 = classEmitter7.begin_method((int) (byte) -1, signature11, typeArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2bd815ee");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "void" + "'", str14, "void");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long" + "'", str19, "long");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Z" + "'", str35, "Z");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "long" + "'", str37, "long");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(JC)C" + "'", str42, "(JC)C");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Z" + "'", str51, "Z");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "long" + "'", str53, "long");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(JC)C" + "'", str58, "(JC)C");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(JC)Z" + "'", str61, "(JC)Z");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter2.visitField(112, "(JC)C", "org/mockito/cglib/core/ClassEmitter", "V", (java.lang.Object) classAdapter11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@122609bc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter1.visitMethod((int) (byte) 100, "short", "hi!", "longD", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6fbb630b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type19, typeArray31);
        org.mockito.asm.Type type34 = signature33.getReturnType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("Z", type41, typeArray46);
        org.mockito.asm.Type[] typeArray48 = signature47.getArgumentTypes();
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type36, typeArray48);
        int int52 = type36.getOpcode((int) (short) -1);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str54 = type53.getClassName();
        boolean boolean55 = type36.equals((java.lang.Object) type53);
        java.lang.String str56 = type53.toString();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str59 = type58.toString();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str61 = type60.getClassName();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("Z", type58, typeArray63);
        org.mockito.asm.Type type65 = signature64.getReturnType();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str71 = type70.toString();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str73 = type72.getClassName();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type72, type74 };
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("Z", type70, typeArray75);
        org.mockito.asm.Type[] typeArray77 = signature76.getArgumentTypes();
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray77);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray77);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray77);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray77);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter82 = classEmitter12.begin_method((int) 'a', signature33, typeArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@78fb83fe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "long" + "'", str27, "long");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(JC)C" + "'", str32, "(JC)C");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Z" + "'", str42, "Z");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "long" + "'", str44, "long");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(JC)C" + "'", str49, "(JC)C");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "void" + "'", str54, "void");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "V" + "'", str56, "V");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Z" + "'", str59, "Z");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "long" + "'", str61, "long");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Z" + "'", str71, "Z");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "long" + "'", str73, "long");
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(JC)L(JC)C;" + "'", str78, "(JC)L(JC)C;");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(JC)Z" + "'", str79, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(JC)Z" + "'", str80, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "(JC)V" + "'", str81, "(JC)V");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] { "mockito/cglib/core/ClassEmitter", "(JC)S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter3.visitMethod((int) (byte) 0, "void", "void", "(JC)Lorg/mockito/asm/Type;", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@420b48a2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type16, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray23);
        java.lang.String str25 = type14.getClassName();
        int int27 = type14.getOpcode((int) (short) -1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("Z", type29, typeArray34);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        java.lang.String str37 = signature35.getDescriptor();
        java.lang.String str38 = signature35.toString();
        java.lang.String str39 = signature35.getName();
        org.mockito.asm.Type type40 = signature35.getReturnType();
        org.mockito.asm.Type[] typeArray41 = signature35.getArgumentTypes();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("LJ;", type14, typeArray41);
        org.mockito.asm.Type type43 = signature42.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor44 = classEmitter2.visitField((int) '4', "char", "org/mockito/cglib/core/Signature", "", (java.lang.Object) signature42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long" + "'", str19, "long");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JC)C" + "'", str24, "(JC)C");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "char" + "'", str25, "char");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Z" + "'", str30, "Z");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "long" + "'", str32, "long");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(JC)Z" + "'", str37, "(JC)Z");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Z(JC)Z" + "'", str38, "Z(JC)Z");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Z" + "'", str39, "Z");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] { "(JC)LJ;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter2.visitMethod(108, "(JC)Z", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Z", type11, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type6, typeArray18);
        java.lang.String str21 = signature20.getName();
        org.mockito.asm.Type[] typeArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter3.begin_method((int) (byte) 100, signature20, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7a19559f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JC)C" + "'", str19, "(JC)C");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter13.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
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
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = fieldProviderTransformer0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@5c29a684");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer19 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer19);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo23 = fieldProviderTransformer22.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        fieldProviderTransformer22.setTarget(classVisitor25);
        org.mockito.cglib.core.ClassInfo classInfo27 = fieldProviderTransformer22.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor30 = fieldProviderTransformer5.visitField((int) '#', "(JC)L(JC)C;", "LLorg/mockito/cglib/core/ClassEmitter;;", "L(JC)C;", (java.lang.Object) classAdapter28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter3.getClassInfo();
        java.lang.String[] strArray27 = new java.lang.String[] { "void", "org.mockito.cglib.core.ClassEmitter", "double", "(JC)D", "C", "(JC)J" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(134, (int) '4', "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "Z(JC)Z", "double", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod(10, "org.mockito.cglib.core.ClassEmitter", "boolean", "J", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2e4918d8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer3.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer7.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        java.lang.String[] strArray24 = new java.lang.String[] { "booleanZ", "longD", "LJ;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visit(116, (int) (short) 0, "(JC)LJ;", "g.mockito.cglib.core.ClassEmitter", "org/mockito/cglib/core/ClassEmitter", strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "double", "double", "org.mockito.cglib.core.ClassEmitter", "(JC)V", "hi!", "short" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter1.visitMethod(0, "", "S", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@73625f43");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer10.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        boolean boolean13 = type3.equals((java.lang.Object) classEmitter8);
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("(JC)C", type2, typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S" + "'", str4, "S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "S" + "'", str5, "S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JC)S" + "'", str16, "(JC)S");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        fieldProviderTransformer3.setTarget(classVisitor6);
        java.lang.String[] strArray14 = new java.lang.String[] { "S", "short" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = fieldProviderTransformer3.visitMethod(112, "org.mockito.cglib.core.ClassEmitter", "char", "org/mockito/asm/Type", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@3f247804");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "D");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        fieldProviderTransformer11.setTarget(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer11.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        boolean boolean23 = signature2.equals((java.lang.Object) fieldProviderTransformer11);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("J", "Z(JC)Z");
        java.lang.String str31 = signature30.toString();
        java.lang.String str32 = signature30.getName();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor34 = fieldProviderTransformer11.visitField(112, "(JC)Lorg/mockito/asm/Type;", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", "Lmockito/cglib/core/ClassEmitter;", (java.lang.Object) signature30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JZ(JC)Z" + "'", str31, "JZ(JC)Z");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "J" + "'", str32, "J");
        org.junit.Assert.assertNotNull(type33);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.String[] strArray18 = new java.lang.String[] { "g/mockito/cglib/core/ClassEmitter", "LLorg/mockito/cglib/core/ClassEmitter;;", "C", "(JC)V", "(JC)L(JC)C;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = fieldProviderTransformer5.visitMethod((int) '#', "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "V", "booleanZ", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JC)Lorg/mockito/cglib/core/ClassEmitter;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray18);
    }
}

