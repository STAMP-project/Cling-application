import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(1, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1847530900" + "'", str9, "L1847530900");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1847530900" + "'", str10, "L1847530900");
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("(V)S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(V)S" + "'", str1, "(V)S");
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter0.visitField(100, "L;(Ljava/lang/L;LV;)L;", "java.lang", "<init>", (java.lang.Object) type8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        int int6 = type4.getOpcode((int) ' ');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("int", type4, typeArray9);
        org.mockito.asm.Type[] typeArray11 = signature10.getArgumentTypes();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type13);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("L$3B", type2, typeArray11);
        java.lang.String str17 = type2.toString();
        org.mockito.asm.Type[] typeArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LV;" + "'", str17, "LV;");
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("int", "(V)S", "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitInsn(8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
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
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type[] typeArray9 = signature7.getArgumentTypes();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter0.begin_method(155, signature7, typeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7b849e07");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.mockito.asm.Type type5 = signature4.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        boolean boolean9 = type6.equals((java.lang.Object) label7);
        int[] intArray11 = new int[] { (byte) 100 };
        org.mockito.asm.Label[] labelArray12 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label7, intArray11, labelArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
        org.junit.Assert.assertNotNull(labelArray12);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
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
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        java.lang.Object obj10 = label6.info;
        int[] intArray14 = new int[] { 3, 32, 8 };
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label6, intArray14, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[3, 32, 8]");
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter7.visitMethod((-1), "", "L$3B", "L1011045012", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6230840");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn(56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitSource("()B", "L1092810277");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs((int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1799275916");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        boolean boolean14 = type11.equals((java.lang.Object) label12);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLabel(label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        boolean boolean15 = type12.equals((java.lang.Object) label13);
        org.mockito.asm.Label[] labelArray16 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn(8, 112, label13, labelArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(labelArray16);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter0.visitMethod(153, "<init>()V", "java.lang", "(Ljava/lang/L;)V", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '<init>()V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMaxs(0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean12 = type9.equals((java.lang.Object) type11);
        org.mockito.asm.MethodVisitor methodVisitor15 = null;
        org.mockito.asm.MethodAdapter methodAdapter16 = new org.mockito.asm.MethodAdapter(methodVisitor15);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter17 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter16);
        boolean boolean18 = type9.equals((java.lang.Object) 8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter1.visitField((int) (byte) 100, "Void", "()L;", "()LShort;", (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LL;;" + "'", str10, "LL;;");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn((-1), "(L;)Z", "double", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(12, "L1799275916", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("double");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter3.visitParameterAnnotation((int) (byte) 1, "java.lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter7.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn(11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.Object obj4 = label3.info;
        java.lang.Object obj5 = label3.info;
        java.lang.String str6 = label3.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(155, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L578566208" + "'", str6, "L578566208");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
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
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L;(Ljava/lang/L;LV;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((int) '4', type22);
        int int25 = local24.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classAdapter15.visitField(126, "L1799275916", "(Ljava/lang/L;)V", "int", (java.lang.Object) int25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "V" + "'", str23, "V");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(56, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1715366976" + "'", str12, "L1715366976");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type type15 = signature14.getReturnType();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type15);
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        boolean boolean19 = type16.equals((java.lang.Object) label17);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("byte", "(V)S", "L;(Ljava/lang/L;LV;)L;", label10, label17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(12, "L179248870", "LL;;", "java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        boolean boolean18 = type15.equals((java.lang.Object) label16);
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.Object obj21 = label19.info;
        java.lang.Object obj22 = label19.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L<init>()V;", "D", "L179248870", label16, label19, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type17 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTypeInsn((int) (byte) 100, "byte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.Object obj6 = label4.info;
        java.lang.String str7 = label4.toString();
        java.lang.Object obj8 = label4.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber(157, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L825703326" + "'", str7, "L825703326");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitMaxs(104, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 154);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(L;)D", "[Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;)D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("(L;)I");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "byte", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.getTypes(classArray2);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.getTypes(classArray2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) classArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Short");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type S is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter9.visitAnnotation("java.lang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.String str6 = type3.getClassName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL;;" + "'", str2, "LL;;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "byte" + "'", str5, "byte");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "byte" + "'", str6, "byte");
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn((int) '4', 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.toString();
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("L;", type3, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L;" + "'", str4, "L;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L;" + "'", str5, "L;");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter7.visitParameterAnnotation(155, "double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str10 = type9.toString();
        java.lang.String str11 = type9.toString();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("V");
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("L;", type9, typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classAdapter1.visitField(32, "(L;D)Lt;", "<init>()V", "L205843408", (java.lang.Object) type9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L;" + "'", str10, "L;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L;" + "'", str11, "L;");
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter15.visitSource("short", "LL;;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type18 = classEmitter17.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMethodInsn((-1), "L1011045012", "short", "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter2.visitField((int) (byte) 1, "[Lorg/mockito/asm/Type;", "(Ljava/lang/L;)V", "double", (java.lang.Object) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(158);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMultiANewArrayInsn("I", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("short", type9, typeArray11);
        int int13 = type9.getSort();
        java.lang.String str14 = type9.toString();
        java.lang.String str15 = type9.toString();
        boolean boolean17 = type9.equals((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter0.visitField((int) (byte) 100, "byte", "byte", "L$3B", (java.lang.Object) type9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L;" + "'", str14, "L;");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L;" + "'", str15, "L;");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray15 = new java.lang.String[] { "byte", "(L;)D" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(124, 10, "<init>", "<init>", "int", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(1, "hi!", "void", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter3.visitField(11, "L<init>()V;", "int", "", (java.lang.Object) type13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(124, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitVarInsn(0, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        int[] intArray17 = new int[] { 8, 5, (short) 10, (byte) 100 };
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        java.lang.Object obj21 = label18.info;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.String str24 = label22.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        java.lang.Object obj27 = label25.info;
        java.lang.String str28 = label25.toString();
        java.lang.Object obj29 = label25.info;
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label18, label22, label25 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLookupSwitchInsn(label8, intArray17, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L205493496" + "'", str11, "L205493496");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[8, 5, 10, 100]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1057352004" + "'", str24, "L1057352004");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L405176456" + "'", str28, "L405176456");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = null;
        label9.info = obj10;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        java.lang.Object obj16 = label12.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("D", "L$3B", "()B", label9, label12, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn(9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitInsn(157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(14, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        boolean boolean16 = type13.equals((java.lang.Object) label14);
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.Object obj20 = label17.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L;(Ljava/lang/L;LV;)L;", "byte", "short", label14, label17, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 128");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn((int) ' ', "L<init>()V;", "Int", "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitVarInsn(5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn((int) (byte) 0, "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn((int) '#', "LV;", "Z", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(155);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor("L179248870");
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.String str8 = signature7.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = signature7.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter0.begin_method(0, signature4, typeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@39303786");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "()V" + "'", str8, "()V");
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(4, "L1011045012", (org.mockito.asm.MethodVisitor) methodAdapter3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIntInsn(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit(108, 7, "(V)S", "void", "org/mockito/cglib/core/Signature", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn(0, "()V", "java.lang", "Void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L88120343" + "'", str10, "L88120343");
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("void", "LV;", "D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = localVariablesSorter4.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(8, "byte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        int[] intArray15 = new int[] { 10, 56, '#' };
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.Object obj19 = label16.info;
        java.lang.Object obj20 = label16.info;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.Object obj23 = label21.info;
        java.lang.Object obj24 = label21.info;
        java.lang.Object obj25 = label21.info;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.Object obj28 = label26.info;
        java.lang.Object obj29 = label26.info;
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label16, label21, label26 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLookupSwitchInsn(label8, intArray15, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 56, 35]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(4, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isArray(type25);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        boolean boolean32 = type25.equals((java.lang.Object) strArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor33 = classEmitter1.visitMethod((int) (short) 1, "LV;", "short", "L1011045012", strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@10323ef5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "V" + "'", str26, "V");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "void" + "'", str29, "void");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.String str16 = type15.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter5.visitField(0, "(V)S", "D", "()V", (java.lang.Object) type15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "void" + "'", str16, "void");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit((int) (byte) 1, 100, "java.lang", "(L;)Z", "()B", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classAdapter1.visitMethod(9, "(L;)I", "Short", "<init>", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs(10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter5.visitMethod(96, "LV;", "<init>()V", "()LShort;", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4721ef70");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter2.visitField(104, "<init>()V", "()B", "L;(Ljava/lang/L;LV;)L;", (java.lang.Object) "byte");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(155, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L527231848" + "'", str9, "L527231848");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L527231848" + "'", str10, "L527231848");
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitFrame(5, 12, (java.lang.Object[]) typeArray10, 32, (java.lang.Object[]) typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visit(10, 52, "", "(L;)I", "double", strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = classEmitter5.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLdcInsn((java.lang.Object) "org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn((int) (byte) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn(124, "L;(Ljava/lang/L;LV;)L;", "", "L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classAdapter5.visitMethod(158, "short", "org/mockito/cglib/core/Signature", "Short", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@391c93ea");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = classEmitter7.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs(56, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        int int15 = type13.getOpcode((int) ' ');
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("int", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(10, (int) (short) 100, (java.lang.Object[]) typeArray10, 104, (java.lang.Object[]) typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter5.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(12, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
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
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("()B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("(Ljava/lang/L;)V", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
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
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIntInsn(0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter15.visitInnerClass("I", "()LShort;", "double", 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit((-1), 0, "I", "(L;D)Lt;", "(L;)I", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitVarInsn(6, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter7.visitParameterAnnotation(10, "<init>()V", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(3, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type21 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = methodAdapter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("(L;)I", type1, typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;)I' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "V" + "'", str2, "V");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@25a9fde3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) (byte) -1, "L1799275916");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTypeInsn(128, "<init>()V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter7.visitMethod(108, "LL;;", "L915517561", "double", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@55d1f63");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
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
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(153, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(0, (int) (short) 10, "Lorg/mockito/cglib/core/Signature;", "(L;)I", "V", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter3.visitParameterAnnotation(116, "(Ljava/lang/L;)V", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2Elang" + "'", str1, "java$2Elang");
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter5.visitParameterAnnotation(100, "java.lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        label9.info = type12;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.String str18 = label16.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("Short", "D", "short", label9, label16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1455574083" + "'", str11, "L1455574083");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "short" + "'", str13, "short");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L704256285" + "'", str18, "L704256285");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("L179248870", "<init>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visitInnerClass("LL;;", "()L;", "org/mockito/cglib/core/Signature", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn((int) (short) 1, "L1092810277", "[Lorg/mockito/asm/Type;", "L1799275916");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        java.lang.Object obj10 = label6.info;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        label11.info = type14;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label11, label18, "java$2Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L792326671" + "'", str13, "L792326671");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "short" + "'", str15, "short");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
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
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = methodAdapter7.visitAnnotation("byte", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter15.visit((int) 'a', (int) '4', "L1325724854", "<init>()V", "int", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitIntInsn(32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
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
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classEmitter7.visitMethod(128, "int", "L;", "Int", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5a6a2093");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L1092810277");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(153, "LL;;", "L1799275916", "()LShort;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("()B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3bcfb790");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.Object obj4 = label3.info;
        java.lang.String str5 = label3.toString();
        java.lang.Object obj6 = label3.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber((int) (short) -1, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L929948320" + "'", str5, "L929948320");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter6.visitParameterAnnotation((int) (short) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.String str14 = label11.toString();
        java.lang.Object obj15 = label11.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.String str19 = label16.toString();
        java.lang.Object obj20 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("I", "Void", "S", label11, label16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1218003345" + "'", str14, "L1218003345");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L115581706" + "'", str19, "L115581706");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.cglib.core.Signature signature8 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        java.lang.String str9 = signature8.getDescriptor();
        java.lang.String str10 = signature8.toString();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter20 = classEmitter2.begin_method(108, signature8, typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@58b76e5d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(signature8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "()V" + "'", str9, "()V");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<init>()V" + "'", str10, "<init>()V");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isPrimitive(type8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type8);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        int int15 = type13.getOpcode((int) ' ');
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("int", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame((int) (short) -1, (int) (byte) 0, (java.lang.Object[]) typeArray7, 56, (java.lang.Object[]) typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "int" + "'", str21, "int");
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        label9.info = type12;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.String str19 = label16.toString();
        java.lang.String str20 = label16.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("Void", "(L;)I", "(V)S", label9, label16, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 11");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1018413338" + "'", str11, "L1018413338");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "short" + "'", str13, "short");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L84141000" + "'", str19, "L84141000");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L84141000" + "'", str20, "L84141000");
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        int int10 = type8.getOpcode((int) ' ');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("int", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray15);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        java.lang.Class<?> wildcardClass22 = typeArray21.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        java.lang.Class<?> wildcardClass29 = signature27.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        java.lang.Class<?> wildcardClass36 = typeArray35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        java.lang.Class<?> wildcardClass46 = typeArray45.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        java.lang.String str48 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass46);
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        java.lang.String str51 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass46);
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass22, wildcardClass29, wildcardClass36, wildcardClass46 };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray57 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.getTypes(classArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("short", type56, typeArray58);
        int int60 = type56.getSort();
        java.lang.String str61 = type56.toString();
        java.lang.String str62 = type56.toString();
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type56);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type56);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(156, 32, (java.lang.Object[]) typeArray5, 96, (java.lang.Object[]) typeArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str23, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str30, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str31, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str37, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str38, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str39, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str41, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str47, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str48, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str49, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str51, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "L;" + "'", str61, "L;");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "L;" + "'", str62, "L;");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(typeArray64);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("()V");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "()V" + "'", str1, "()V");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        java.lang.Object obj15 = label12.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.String str19 = label16.toString();
        label16.info = ' ';
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.Object obj25 = label22.info;
        java.lang.Object obj26 = label22.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        java.lang.Object obj29 = label27.info;
        java.lang.Object obj30 = label27.info;
        java.lang.Object obj31 = label27.info;
        org.mockito.asm.Label[] labelArray32 = new org.mockito.asm.Label[] { label10, label12, label16, label22, label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn((int) (short) 100, 96, label9, labelArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L246519205" + "'", str14, "L246519205");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1495585589" + "'", str19, "L1495585589");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(labelArray32);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter2.visitMethod(11, "LL;;", "L1011045012", "L;", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@557b7d3e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = null;
        label0.info = obj1;
        java.lang.Object obj3 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(153);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIincInsn((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMultiANewArrayInsn("short", 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
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
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1092810277");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter0.visitField(124, "V", "L1011045012", "Short", (java.lang.Object) "double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter5.visitSource("<init>", "LV;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn((int) (byte) 1, "Int", "(V)S", "L1202418377");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
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
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getPackageName(type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray17);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        label20.info = type23;
        boolean boolean27 = signature18.equals((java.lang.Object) label20);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber((int) (byte) 10, label20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1413599213" + "'", str22, "L1413599213");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "short" + "'", str24, "short");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Object obj8 = label6.info;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(158, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotation("Short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        java.lang.Object[] objArray9 = null;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getPackageName(type13);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(0, (int) (short) 0, objArray9, (int) '4', (java.lang.Object[]) typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.String str8 = label5.toString();
        java.lang.Object obj9 = label5.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = null;
        label10.info = obj11;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        label13.info = type16;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        org.mockito.asm.Label[] labelArray23 = new org.mockito.asm.Label[] { label10, label13, label20 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTableSwitchInsn(0, (int) '4', label5, labelArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1434030433" + "'", str8, "L1434030433");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1965835387" + "'", str15, "L1965835387");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "short" + "'", str17, "short");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1056969735" + "'", str22, "L1056969735");
        org.junit.Assert.assertNotNull(labelArray23);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(104, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) ' ', 3, "<init>", "(Ljava/lang/L;)V", "L179248870", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("short", type12, typeArray14);
        int int16 = type12.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        int int23 = type21.getOpcode((int) ' ');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("int", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type30);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L$3B", type19, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.declare_field(4, "Z", type12, (java.lang.Object) "L$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.String str3 = label0.toString();
        label0.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            int int6 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1352359528" + "'", str3, "L1352359528");
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIntInsn(0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Ljava/lang/L;)V", "java$2Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Ljava/lang/L;)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber(35, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray8 = new java.lang.String[] { "D" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod((int) (short) -1, "hi!", "int", "LV;", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@20c9be43");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMethodInsn((int) (short) -1, "(Ljava/lang/L;)V", "S", "org.mockito.cglib.core.Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = null;
        label8.info = obj9;
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn(9, 9, label8, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("LL;;", 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(157, "<init>", "Lorg/mockito/cglib/core/Signature;", "LV;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        java.lang.Class<?> wildcardClass12 = signature10.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLdcInsn((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str13, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str14, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        boolean boolean15 = type12.equals((java.lang.Object) label13);
        java.lang.Object obj16 = label13.info;
        int[] intArray22 = new int[] { (short) 1, (byte) 10, 100, (byte) 0, (byte) 100 };
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.Object obj25 = label23.info;
        java.lang.String str26 = label23.toString();
        java.lang.Object obj27 = label23.info;
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.String str30 = label28.toString();
        java.lang.Object obj31 = label28.info;
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.Object obj33 = label32.info;
        java.lang.Object obj34 = label32.info;
        java.lang.String str35 = label32.toString();
        java.lang.String str36 = label32.toString();
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] { label23, label28, label32 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLookupSwitchInsn(label13, intArray22, labelArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 10, 100, 0, 100]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L359317218" + "'", str26, "L359317218");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1015257558" + "'", str30, "L1015257558");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1367825807" + "'", str35, "L1367825807");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1367825807" + "'", str36, "L1367825807");
        org.junit.Assert.assertNotNull(labelArray37);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("(L;D)Lt;", "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(35, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 130);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(116, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter15.visitAttribute(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        java.lang.Class<?> wildcardClass17 = signature15.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter7.visitField(100, "I", "L$3B", "(L;)Z", (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str18, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("[Lorg/mockito/asm/Type;", "Short", "Z", 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("S", 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn((int) '#', "L1011045012", "L$3B", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("short");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classAdapter9.visitField(0, "org.mockito.cglib.core.Signature", "Void", "Short", (java.lang.Object) "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("I", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter17.visitSource("(Ljava/lang/L;)V", "Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(32, (int) (byte) 100, "org.mockito.cglib.core.Signature", "()L;", "L1092810277", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray9);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLdcInsn((java.lang.Object) typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("()B");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        int int10 = type8.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter2.visitField(100, "double", "int", "java.lang", (java.lang.Object) type8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        java.lang.Object obj3 = label2.info;
        java.lang.String str4 = label2.toString();
        java.lang.Object obj5 = label2.info;
        int[] intArray6 = null;
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
        java.lang.Object obj17 = label13.info;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        java.lang.Object obj21 = label18.info;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.String str25 = label22.toString();
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] { label7, label10, label13, label18, label22 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label2, intArray6, labelArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L429720766" + "'", str4, "L429720766");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L123014839" + "'", str16, "L123014839");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1844062234" + "'", str25, "L1844062234");
        org.junit.Assert.assertNotNull(labelArray26);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        label7.info = ' ';
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getPackageName(type15);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray22);
        org.mockito.asm.Type type24 = signature23.getReturnType();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        java.lang.String str27 = label25.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        label25.info = type28;
        boolean boolean32 = signature23.equals((java.lang.Object) label25);
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        java.lang.Object obj34 = label33.info;
        java.lang.Object obj35 = label33.info;
        java.lang.Object obj36 = label33.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label25, label33, "(Ljava/lang/L;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1719158735" + "'", str10, "L1719158735");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNull(obj26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L789767711" + "'", str27, "L789767711");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "short" + "'", str29, "short");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitVarInsn(56, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("short");
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLdcInsn((java.lang.Object) type9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(4, "[Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter2.visitAnnotation("LV;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("()V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitFieldInsn(126, "", "(L;D)Lt;", "L179248870");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (byte) -1, type2);
        org.mockito.asm.Type type4 = local3.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type21 = classEmitter5.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitFieldInsn(10, "<init>()V", "(L;)I", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type0);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type V is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "V" + "'", str1, "V");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "void" + "'", str4, "void");
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter2.visitMethod(35, "L1799275916", "L179248870", "()LShort;", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1e6ca172");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
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
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("(L;)D", "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMethodInsn(11, "java$2Elang", "()B", "<init>()V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("org.mockito.cglib.core.Signature");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.mockito.cglib.core" + "'", str1, "org.mockito.cglib.core");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type18);
        org.mockito.asm.Type type20 = type18.getElementType();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(153, 154, "org.mockito.cglib.core", type10, typeArray26, "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(L;D)Lt;" + "'", str27, "(L;D)Lt;");
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter10.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("void");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn((int) (byte) 10, "L915517561", "", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter7.visitParameterAnnotation(11, "L1325724854", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isPrimitive(type13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) 154);
        int int20 = type17.getSize();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFrame(100, 4, (java.lang.Object[]) typeArray15, 4, (java.lang.Object[]) typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(L;)Z" + "'", str24, "(L;)Z");
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(128, "L<init>()V;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type7);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        java.lang.String str10 = type7.getDescriptor();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lint;" + "'", str10, "Lint;");
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitInsn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn((int) 'a', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = classEmitter7.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        int int11 = type9.getOpcode((int) ' ');
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("int", type9, typeArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter1.visitMethod((int) (byte) 0, "LL;;", "short", "D", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@74c11deb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = null;
        label10.info = obj11;
        java.lang.Object obj13 = label10.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = null;
        label14.info = obj15;
        java.lang.Object obj17 = label14.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("java.lang", "", "(L;)D", label10, label14, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(5, "", "short", "L205843408");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (byte) -1, 0, "(L;)Z", "Short", "L1092810277", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "V" + "'", str8, "V");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("double");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Double" + "'", str1, "Double");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = null;
        int[] intArray15 = new int[] { 5, 2, 154, (byte) 1, 0, 1 };
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.String str19 = label16.toString();
        java.lang.String str20 = label16.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = null;
        label22.info = obj23;
        java.lang.Object obj25 = label22.info;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.Object obj32 = label31.info;
        boolean boolean33 = type30.equals((java.lang.Object) label31);
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        java.lang.Object obj35 = null;
        label34.info = obj35;
        java.lang.Object obj37 = label34.info;
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        java.lang.Object obj39 = label38.info;
        org.mockito.asm.Label[] labelArray40 = new org.mockito.asm.Label[] { label16, label21, label22, label31, label34, label38 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label8, intArray15, labelArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[5, 2, 154, 1, 0, 1]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1087404762" + "'", str19, "L1087404762");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1087404762" + "'", str20, "L1087404762");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(labelArray40);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(100, type10);
        int int12 = local11.getIndex();
        org.mockito.asm.Type type13 = local11.getType();
        java.lang.String str14 = type13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classAdapter4.visitField((int) (short) 1, "L1202418377", "L;(Ljava/lang/L;LV;)L;", "", (java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "D" + "'", str14, "D");
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
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
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) -1, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("<init>()V", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIincInsn(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.String str12 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn(35, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1466790594" + "'", str12, "L1466790594");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTypeInsn((int) (byte) 10, "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
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
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = null;
        label0.info = obj1;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("()B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation((-1), "LL;;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter3.visitParameterAnnotation(32, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        java.lang.Object obj8 = label5.info;
        int[] intArray12 = new int[] { (-1), (byte) 0, (short) -1 };
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type16);
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        boolean boolean20 = type17.equals((java.lang.Object) label18);
        org.mockito.asm.Label[] labelArray21 = new org.mockito.asm.Label[] { label18 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray12, labelArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L795964056" + "'", str7, "L795964056");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 0, -1]");
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(labelArray21);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitFieldInsn(158, "L1325724854", "", "L179248870");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) '4', type9);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "V" + "'", str10, "V");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "void" + "'", str12, "void");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("L179248870");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter3.visitField(153, "org.mockito.cglib.core.Signature", "byte", "<init>", (java.lang.Object) "L179248870");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(14, "(L;D)Lt;", "L1325724854", "L179248870", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;D)Lt;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        int int9 = type7.getOpcode((int) ' ');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("int", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type16);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L$3B", type5, typeArray14);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("L;(Ljava/lang/L;LV;)L;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter0.begin_method(104, signature19, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3b677774");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$2Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang" + "'", str1, "Java$2Elang");
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str25 = signature24.getDescriptor();
        java.lang.String str26 = signature24.toString();
        java.lang.String str27 = signature24.toString();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type31);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type35);
        org.mockito.asm.Type type37 = type35.getElementType();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter45 = classEmitter1.begin_method(52, signature24, typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3eb436ea");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(L;D)Lt;" + "'", str44, "(L;D)Lt;");
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = methodAdapter6.visitParameterAnnotation(35, "Double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST(1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor20 = classEmitter17.visitAnnotation("D", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 1, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(124, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitFieldInsn(116, "D", "Int", "(L;)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(8, "(L;)D", "L;(Ljava/lang/L;LV;)L;", "Java$2Elang", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;)D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = null;
        label10.info = obj11;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLocalVariable("(V)S", "L1325724854", "S", label10, label13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitSource("L<init>()V;", "(V)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1943638160");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        boolean boolean15 = type12.equals((java.lang.Object) label13);
        java.lang.Object obj16 = label13.info;
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.Object obj20 = label18.info;
        java.lang.String str21 = label18.toString();
        label18.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTryCatchBlock(label13, label17, label18, "L1325724854");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L179777896" + "'", str21, "L179777896");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMethodInsn((int) (short) 0, "java$2Elang", "Double", "int");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("Int");
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field(156, "L179248870", type23, (java.lang.Object) "Int");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "V" + "'", str24, "V");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(type27);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("<init>()V");
        java.lang.String str2 = type1.getInternalName();
        java.lang.String str3 = type1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>()V" + "'", str2, "<init>()V");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L<init>()V;" + "'", str3, "L<init>()V;");
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        int int22 = type20.getOpcode((int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("int", type20, typeArray25);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("Int");
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.String str39 = signature38.getDescriptor();
        org.mockito.asm.Type[] typeArray40 = signature38.getArgumentTypes();
        org.mockito.asm.Type type41 = signature38.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(0, "(L;)I", type33, (java.lang.Object) signature38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Int" + "'", str35, "Int");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(signature38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "()V" + "'", str39, "()V");
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type41);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTypeInsn(153, "<init>(S)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMethodInsn((int) (short) 1, "[Lorg/mockito/asm/Type;", "org.mockito.cglib.core", "L$3B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("short", type10, typeArray12);
        int int14 = type10.getSort();
        java.lang.String str15 = type10.toString();
        int int17 = type10.getOpcode(8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter2.visitField((int) (short) -1, "Z", "Void", "L;", (java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L;" + "'", str15, "L;");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitInsn(155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitVarInsn(124, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        java.lang.Class<?> wildcardClass12 = typeArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.lang.String str15 = type14.getInternalName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter1.visitField(130, "L1943638160", "double", "LV;", (java.lang.Object) type14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str13, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str15, "[Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(100, type9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) local10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLdcInsn((java.lang.Object) classEmitter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("int");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL;;" + "'", str2, "LL;;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(154, "L1011045012", "I", "L179248870");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor23 = classAdapter17.visitAnnotation("(Ljava/lang/L;)V", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        boolean boolean18 = type15.equals((java.lang.Object) label16);
        java.lang.Object obj19 = label16.info;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.Object obj22 = label20.info;
        java.lang.Object obj23 = label20.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTryCatchBlock(label7, label16, label20, "L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1295902971" + "'", str10, "L1295902971");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTypeInsn((int) '#', "org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
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
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter9.visitAnnotation("D", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitOuterClass("(L;)D", "", "L1325724854");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L<init>()V;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitInsn(14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = classEmitter7.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(11, type1);
        java.lang.String str5 = type1.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "short" + "'", str2, "short");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "S" + "'", str5, "S");
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter7.visitParameterAnnotation(157, "LL;;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMethodInsn((int) 'a', "[Lorg/mockito/asm/Type;", "L1092810277", "L1092810277");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(35, "L205843408", "void", "L1092810277");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@409ff70a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (byte) -1, 130, "()LShort;", "", "L$3B", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("LL;;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LL$3B$3B" + "'", str1, "LL$3B$3B");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) classEmitter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str12 = type11.getDescriptor();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field(7, "java$2Elang", type11, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LL;;" + "'", str12, "LL;;");
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMaxs(100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
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
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter17.visitOuterClass("Lint;", "L1011045012", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter15.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn((int) (short) 1, "L<init>()V;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.String str14 = signature13.getDescriptor();
        org.mockito.asm.Type[] typeArray15 = signature13.getArgumentTypes();
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("short", type18, typeArray20);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("short", type24, typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray20);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray31);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        java.lang.Class<?> wildcardClass40 = typeArray39.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        java.lang.Class<?> wildcardClass46 = typeArray45.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass40, wildcardClass46 };
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray49);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitFrame((int) (byte) 10, 104, (java.lang.Object[]) typeArray15, 0, (java.lang.Object[]) typeArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "()V" + "'", str14, "()V");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[Lorg/mockito/asm/Type;" + "'", str47, "[Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn((int) (byte) -1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        boolean boolean15 = type12.equals((java.lang.Object) label13);
        java.lang.Object obj16 = label13.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(9, label13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMaxs(153, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMultiANewArrayInsn("(L;D)Lt;", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        java.lang.Object obj15 = label12.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.String str19 = label16.toString();
        java.lang.Object obj20 = label16.info;
        label12.info = obj20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("L<init>()V;", "<init>(S)V", "hi!", label12, label22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L322880325" + "'", str14, "L322880325");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L2136253188" + "'", str19, "L2136253188");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("byte");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        label7.info = type10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(6, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L849162461" + "'", str9, "L849162461");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "short" + "'", str11, "short");
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        java.lang.String str21 = type19.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.fromInternalName("Short");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(100, type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        boolean boolean30 = type19.equals((java.lang.Object) signature29);
        int int31 = type19.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("void");
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray35);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.begin_class((int) (byte) 0, 0, "LL;;", type19, typeArray35, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "int" + "'", str20, "int");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "I" + "'", str21, "I");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "double" + "'", str27, "double");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "short" + "'", str33, "short");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(V)S" + "'", str36, "(V)S");
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.Object obj15 = label13.info;
        java.lang.Object obj16 = label13.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("short(Ljava/lang/V;LV;)Lva/lang;", "org/mockito/cglib/core/Signature", "", label11, label13, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L668844992" + "'", str12, "L668844992");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("", "()V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1011045012");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1011045012" + "'", str1, "L1011045012");
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(0, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMaxs(156, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(0, "()B", "(L;)Z", "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(153, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitAnnotation("()LShort;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray16 = new java.lang.String[] { "(L;)Z", "LL$3B$3B", "LL;;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit((int) '#', 130, "java$2Elang", "LV;", "(L;D)Lt;", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(5, "Void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn(11, "()B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = classEmitter7.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("L;");
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter7.visit(100, (int) (short) 0, "double", "(L;)D", "Java$2Elang", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitInsn(11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getPackageName(type10);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray17);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        label20.info = type23;
        boolean boolean27 = signature18.equals((java.lang.Object) label20);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn((int) (short) 0, label20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L2124458328" + "'", str22, "L2124458328");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "short" + "'", str24, "short");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        int int9 = type6.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("LV;", type6, typeArray10);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(4, "short(Ljava/lang/V;LV;)Lva/lang;", type6, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "short" + "'", str7, "short");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs((int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = null;
        label8.info = obj9;
        int[] intArray11 = null;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.Object obj15 = label12.info;
        java.lang.Object obj16 = label12.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        java.lang.Object obj21 = label17.info;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.Object obj24 = label22.info;
        java.lang.Object obj25 = label22.info;
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] { label12, label17, label22 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label8, intArray11, labelArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1311663001" + "'", str20, "L1311663001");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(labelArray26);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("short", type12, typeArray14);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("short", type18, typeArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray20);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFrame(156, 156, (java.lang.Object[]) typeArray20, 0, (java.lang.Object[]) typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.Object obj14 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLineNumber(0, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(104, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.Object obj11 = label8.info;
        java.lang.Object obj12 = null;
        label8.info = obj12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        java.lang.String str17 = label14.toString();
        label14.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("L1325724854", "L115210646", "()V", label8, label14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1612714786" + "'", str17, "L1612714786");
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("L;");
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean14 = type11.equals((java.lang.Object) type13);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classAdapter5.visitField((int) '4', "L1910611786", "L1325724854", "(L;Lint;)V", (java.lang.Object) type11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LL;;" + "'", str12, "LL;;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L;" + "'", str15, "L;");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(128);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("short(Ljava/lang/V;LV;)Lva/lang;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMaxs(11, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.Object obj6 = label4.info;
        java.lang.String str7 = label4.toString();
        java.lang.Object obj8 = label4.info;
        java.lang.String str9 = label4.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        java.lang.Object obj14 = label10.info;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("int");
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type22);
        org.mockito.asm.Type type24 = type22.getElementType();
        label10.info = type24;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = null;
        label26.info = obj27;
        java.lang.Object obj29 = label26.info;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        org.mockito.asm.Type type35 = signature34.getReturnType();
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type35);
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.Object obj38 = label37.info;
        boolean boolean39 = type36.equals((java.lang.Object) label37);
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        java.lang.String str42 = label40.toString();
        java.lang.Object obj43 = label40.info;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        java.lang.Object obj45 = label44.info;
        java.lang.Object obj46 = label44.info;
        java.lang.String str47 = label44.toString();
        java.lang.Object obj48 = label44.info;
        label40.info = obj48;
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] { label10, label26, label30, label37, label40 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(155, 7, label4, labelArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L889921144" + "'", str7, "L889921144");
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L889921144" + "'", str9, "L889921144");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L570496865" + "'", str13, "L570496865");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(signature34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1474973477" + "'", str42, "L1474973477");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L998235797" + "'", str47, "L998235797");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(labelArray50);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        int int25 = type23.getOpcode((int) ' ');
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("int", type23, typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor31 = classAdapter15.visitMethod((int) '#', "java.lang", "L115210646", "L<init>()V;", strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@283534d1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        java.lang.String str8 = label5.toString();
        java.lang.String str9 = label5.toString();
        org.mockito.asm.Label[] labelArray10 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTableSwitchInsn(9, (int) (short) 0, label5, labelArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L467189567" + "'", str8, "L467189567");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L467189567" + "'", str9, "L467189567");
        org.junit.Assert.assertNotNull(labelArray10);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = type1.getSize();
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray5);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("LV;", type1, typeArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type S is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "short" + "'", str2, "short");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter5.visitField(108, "L680990058", "L1034763014", "Double", (java.lang.Object) classEmitter12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitSource("D", "int");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTypeInsn((int) (short) 100, "byte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L1325724854");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1325724854" + "'", str1, "L1325724854");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visit((int) ' ', 6, "L;", "org.mockito.cglib.core.Signature", "Lorg/mockito/cglib/core/Signature;", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn(116, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label label11 = null;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        java.lang.Object obj16 = label12.info;
        java.lang.String str17 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label11, label12, "L1910611786");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1629798430" + "'", str10, "L1629798430");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1243158471" + "'", str15, "L1243158471");
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1243158471" + "'", str17, "L1243158471");
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter15.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("Int", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn(124, "[Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("L915517561", "Short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter3.visitMethod(9, "", "Double", "Double", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4a8297dd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("D");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D" + "'", str2, "D");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("Int", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn(2, "org/mockito/cglib/core/Signature", "B", "<init>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(9, "(V)S", "B", "Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMaxs((-1), 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = null;
        label6.info = obj7;
        int[] intArray10 = new int[] { 12 };
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.String str14 = label11.toString();
        label11.info = ' ';
        java.lang.String str17 = label11.toString();
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] { label11 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label6, intArray10, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[12]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L61306464" + "'", str14, "L61306464");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L61306464" + "'", str17, "L61306464");
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitOuterClass("L<init>()V;", "L205843408", "java$2Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.Object obj12 = label9.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.Object obj15 = label13.info;
        java.lang.String str16 = label13.toString();
        java.lang.Object obj17 = label13.info;
        label9.info = obj17;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L914761541" + "'", str11, "L914761541");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L281001684" + "'", str16, "L281001684");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMaxs(157, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(1, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn(158, "LL;;", "Lorg/mockito/cglib/core/Signature;", "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "L1034763014", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.mockito.asm.Type[] typeArray0 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        boolean boolean7 = type4.equals((java.lang.Object) label5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type V is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        java.lang.String str15 = label12.toString();
        java.lang.String str16 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter5.visitLocalVariable("(Ljava/lang/L;)V", "L179248870", "()V", label9, label12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L324585765" + "'", str15, "L324585765");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L324585765" + "'", str16, "L324585765");
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIntInsn(153, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter4.visitParameterAnnotation((int) (short) 1, "L1910611786", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("", "(V)S", "IL1202418377");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(8, "(Ljava/lang/L;)V", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIntInsn(37, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        java.lang.String str11 = label8.toString();
        int[] intArray14 = new int[] { (short) 0, 126 };
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Object obj19 = label17.info;
        java.lang.String str20 = label17.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        java.lang.Object obj23 = label21.info;
        java.lang.Object obj24 = label21.info;
        org.mockito.asm.Label[] labelArray25 = new org.mockito.asm.Label[] { label15, label17, label21 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitLookupSwitchInsn(label8, intArray14, labelArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1873954458" + "'", str11, "L1873954458");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 126]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L731069297" + "'", str20, "L731069297");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(labelArray25);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("java.lang.L179248870", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        int int18 = type16.getOpcode((int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("int", type16, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray13);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(100, type27);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        java.lang.Class[] classArray34 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray35);
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] {};
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type27, typeArray36);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.INT_TYPE;
        int int46 = type44.getOpcode((int) ' ');
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("int", type44, typeArray49);
        org.mockito.asm.Type[] typeArray51 = signature50.getArgumentTypes();
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type53);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray57);
        java.lang.Class[] classArray59 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.getTypes(classArray59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray58, typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray51, typeArray60);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(124, 128, (java.lang.Object[]) typeArray36, 9, (java.lang.Object[]) typeArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(100, "()B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(9, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("org.mockito.cglib.core.Signature", "L130113989");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
