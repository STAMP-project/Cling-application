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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        java.lang.String str8 = label5.toString();
        java.lang.Object obj9 = label5.info;
        java.lang.Object obj10 = label5.info;
        label5.info = 128;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1819999213" + "'", str8, "L1819999213");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L793134035", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        int int8 = type5.getSize();
        int int9 = type5.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        int int19 = type15.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type12, type13, type15, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("boolean", type11, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type5, typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) signature24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "boolean" + "'", str7, "boolean");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        java.lang.String str7 = label4.toString();
        java.lang.Object obj8 = label4.info;
        java.lang.Object obj9 = label4.info;
        label4.info = 128;
        java.lang.Object obj12 = label4.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1609929773" + "'", str7, "L1609929773");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 128 + "'", obj12, 128);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter3.visitParameterAnnotation(8, "L1708628491", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitOuterClass("(DCF)Lhi!;", "(DDZZ)S", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        java.lang.String[] strArray19 = new java.lang.String[] { "org.mockito.asm.Type", "L1708628491", "L986491722" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classEmitter8.visitMethod(2, "Lorg.mockito.asm.ClassAdapter;", "float", "L1246856285", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@751bcd49");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(155, "L1708628491");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter10.visitSource("org/mockito/asm/Type", "org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        java.lang.Object obj13 = label8.info;
        label8.info = 128;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 108;
        java.lang.Object obj19 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("S", "Lorg/mockito/asm/ClassAdapter;", "", label8, label16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1360388056" + "'", str11, "L1360388056");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 108 + "'", obj19, 108);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 10.0f;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(6, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1594048033" + "'", str9, "L1594048033");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1594048033" + "'", str10, "L1594048033");
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        java.lang.String str8 = label5.toString();
        java.lang.String str9 = label5.toString();
        java.lang.String str10 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) ' ', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1047064417" + "'", str8, "L1047064417");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1047064417" + "'", str9, "L1047064417");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1047064417" + "'", str10, "L1047064417");
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "L103011084", "(DDZZ)Z", "(DIZZ)F" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (byte) 10, 130, "L793134035", "Lorg/mockito/asm/Type;", "(C)D", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber((int) (short) 1, label6);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (short) 0, 5);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(112, "L793134035");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) (short) 10, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(96, "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitOuterClass("L635492318", "org/mockito/asm/Type", "L186258654");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(153, 97, label7, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L628793509" + "'", str10, "L628793509");
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn((int) '4', "L635492318", "(DIZZ)I", "org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        int int26 = type25.getSize();
        int int27 = type25.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type23, type24, type25 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("F", type22, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("I", type17, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray28);
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        label32.info = 108;
        java.lang.Object obj35 = label32.info;
        java.lang.String str36 = label32.toString();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.declare_field((int) ' ', "org/mockito/asm/Type", type15, (java.lang.Object) str36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(DCF)V" + "'", str31, "(DCF)V");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 108 + "'", obj35, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L800840704" + "'", str36, "L800840704");
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        boolean boolean6 = signature2.equals((java.lang.Object) "");
        java.lang.String str7 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("F");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
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
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        label7.info = 128;
        java.lang.Object obj15 = label7.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = (-1);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1246856285", "C", "org/mockito/asm/Type", label7, label16, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 158");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1242934868" + "'", str10, "L1242934868");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 128 + "'", obj15, 128);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn((int) (byte) 1, "L186258654", "L103011084", "S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(0, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L2061364284", 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        java.lang.String[] strArray20 = new java.lang.String[] { "C", "Lorg/mockito/asm/Type;", "L186258654", "F", "(DDZZ)Lorg/mockito/asm/ClassAdapter;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit((int) (short) 0, 7, "(DIZZ)Z", "S", "hi!", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.mockito.asm.Type", "(DCF)Lhi!;", "(DIZZ)F", "L103011084", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(3, (-1), "L734413371", "L793134035", "L734413371", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("boolean", "org.mockito.asm.Type", "L2061364284");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int11 = type10.getSize();
        int int12 = type10.getSort();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type8, type9, type10 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("F", type7, typeArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str16 = type15.toString();
        java.lang.String str17 = type15.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        int int21 = type19.getOpcode(1);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        int int36 = type33.getSort();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type23, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("S", type19, typeArray37);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter41 = classEmitter0.begin_method(4, signature14, typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5386969a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "S" + "'", str16, "S");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "S" + "'", str17, "S");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean" + "'", str34, "boolean");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "boolean" + "'", str35, "boolean");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(DDZZ)S" + "'", str40, "(DDZZ)S");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) (short) 0, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "C", "L734413371" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(97, 5, "L2061364284", "L793134035", "L1246856285", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 108;
        java.lang.Object obj10 = label7.info;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 10.0f;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 10.0f;
        java.lang.String str17 = label14.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        label14.info = classEmitter23;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 10.0f;
        java.lang.String str34 = label31.toString();
        java.lang.Object obj35 = label31.info;
        org.mockito.asm.Label[] labelArray36 = new org.mockito.asm.Label[] { label11, label14, label31 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) (short) 10, (int) 'a', label7, labelArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 108 + "'", obj10, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L299241571" + "'", str17, "L299241571");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L153035108" + "'", str34, "L153035108");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0f + "'", obj35, 10.0f);
        org.junit.Assert.assertNotNull(labelArray36);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor16 = interceptFieldTransformer1.visitAnnotation("L734413371", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str29 = signature28.toString();
        java.lang.String str30 = signature28.getName();
        boolean boolean32 = signature28.equals((java.lang.Object) "");
        java.lang.String str33 = signature28.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor34 = interceptFieldTransformer1.visitField(0, "boolean", "boolean", "boolean", (java.lang.Object) str33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        int int24 = type21.getSize();
        int int25 = type21.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int28 = type27.getDimensions();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        java.lang.String str37 = type35.getClassName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(96, type35);
        int int39 = type35.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type27, type29, type32, type35, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("Z", type21, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("L635492318", type17, typeArray42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor46 = null;
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter(classVisitor46);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classAdapter47);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.declare_field(130, "(DCF)V", type17, (java.lang.Object) classAdapter47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean" + "'", str22, "boolean");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "I" + "'", str33, "I");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "boolean" + "'", str37, "boolean");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(155, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = interceptFieldTransformer1.visitAnnotation("(DCF)V", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        java.lang.String str8 = label5.toString();
        java.lang.String str9 = label5.toString();
        java.lang.String str10 = label5.toString();
        int[] intArray12 = new int[] { 124 };
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 10.0f;
        java.lang.String str16 = label13.toString();
        java.lang.String str17 = label13.toString();
        java.lang.String str18 = label13.toString();
        org.mockito.asm.Label[] labelArray19 = new org.mockito.asm.Label[] { label13 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray12, labelArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L333006157" + "'", str8, "L333006157");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L333006157" + "'", str9, "L333006157");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L333006157" + "'", str10, "L333006157");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[124]");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L682875353" + "'", str16, "L682875353");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L682875353" + "'", str17, "L682875353");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L682875353" + "'", str18, "L682875353");
        org.junit.Assert.assertNotNull(labelArray19);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(116, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "(DIZZ)Z", "F", "F", "(DCF)V", "L734413371", "L1373512854" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter2.visitMethod(0, "(C)D", "L1700422645", "L396320025", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(C)D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter3.visitParameterAnnotation((int) ' ', "", true);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(124, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("hi!", 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 10.0f;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        java.lang.Object obj11 = label6.info;
        int[] intArray13 = new int[] { 130 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 10.0f;
        java.lang.String str17 = label14.toString();
        java.lang.String str18 = label14.toString();
        org.mockito.asm.Label[] labelArray19 = new org.mockito.asm.Label[] { label14 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label6, intArray13, labelArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1151339245" + "'", str9, "L1151339245");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1151339245" + "'", str10, "L1151339245");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[130]");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L2044838511" + "'", str17, "L2044838511");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L2044838511" + "'", str18, "L2044838511");
        org.junit.Assert.assertNotNull(labelArray19);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter4.visitAnnotation("L396320025", true);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 108;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(4, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L2087983043" + "'", str9, "L2087983043");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2087983043" + "'", str10, "L2087983043");
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type10.getOpcode(1);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        int int27 = type24.getSort();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type17, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type14, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("S", type10, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray28);
        org.mockito.asm.Type[] typeArray34 = org.mockito.asm.Type.getArgumentTypes("(DDZZ)Z");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(96, (int) (short) -1, (java.lang.Object[]) typeArray28, (int) (byte) 1, (java.lang.Object[]) typeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "boolean" + "'", str26, "boolean");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(DDZZ)Z" + "'", str31, "(DDZZ)Z");
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn((int) (short) 100, "L793134035", "L1373512854", "L1122543531");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitOuterClass("float", "L1700422645", "L1700422645");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "L1373512854" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visit((int) ' ', 2, "hi!", "L1122543531", "boolean", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = null;
        int[] intArray11 = new int[] { 0, 157, 126, 96, 108 };
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 108;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 10.0f;
        java.lang.String str21 = label18.toString();
        java.lang.Object obj22 = label18.info;
        java.lang.Object obj23 = label18.info;
        label18.info = 128;
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] { label12, label13, label15, label18 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray11, labelArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 157, 126, 96, 108]");
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L119506482" + "'", str21, "L119506482");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0f + "'", obj23, 10.0f);
        org.junit.Assert.assertNotNull(labelArray26);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) classAdapter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(3, type8);
        label5.info = 3;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 10.0f;
        java.lang.String str16 = label13.toString();
        java.lang.Object obj17 = label13.info;
        java.lang.Object obj18 = label13.info;
        java.lang.String str19 = label13.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 10.0f;
        java.lang.String str23 = label20.toString();
        java.lang.String str24 = label20.toString();
        java.lang.String str25 = label20.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label13, label20, "L1539487718");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "S" + "'", str9, "S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "S" + "'", str10, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L2074363543" + "'", str16, "L2074363543");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L2074363543" + "'", str19, "L2074363543");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L954056518" + "'", str23, "L954056518");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L954056518" + "'", str24, "L954056518");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L954056518" + "'", str25, "L954056518");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 108;
        java.lang.Object obj3 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 108 + "'", obj3, 108);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber((int) (byte) 100, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L446144126" + "'", str10, "L446144126");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "L1246856285", "boolean(DIZZ)C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = interceptFieldTransformer1.visitMethod(154, "L1708628491", "(DCF)Lhi!;", "L1373512854", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@b9f3b10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        java.lang.String str29 = type27.getClassName();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(96, type27);
        java.lang.String str31 = type27.toString();
        int int32 = type27.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor33 = interceptFieldTransformer1.visitField(0, "I", "float", "", (java.lang.Object) int32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter6.visitSource("(DIZZ)I", "Lorg.mockito.asm.ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str16 = type15.toString();
        java.lang.String str17 = type15.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        int int21 = type19.getOpcode(1);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        int int36 = type33.getSort();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type26, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type23, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("S", type19, typeArray37);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray37);
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(154, type15);
        org.mockito.asm.ClassVisitor classVisitor42 = null;
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter(classVisitor42);
        java.lang.Class<?> wildcardClass44 = classAdapter43.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field(104, "boolean(DIZZ)C", type15, (java.lang.Object) wildcardClass44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "S" + "'", str16, "S");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "S" + "'", str17, "S");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean" + "'", str34, "boolean");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "boolean" + "'", str35, "boolean");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(DDZZ)S" + "'", str40, "(DDZZ)S");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str45, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(type46);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.String str11 = label7.toString();
        java.lang.Object obj12 = label7.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 108;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L986491722", "F", "S", label7, label13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1115242592" + "'", str10, "L1115242592");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1115242592" + "'", str11, "L1115242592");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getDescriptor();
        java.lang.String str8 = type5.toString();
        java.lang.String str9 = type5.getClassName();
        java.lang.String str10 = type5.getClassName();
        int int12 = type5.getOpcode((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Z" + "'", str8, "Z");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean" + "'", str10, "boolean");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitSource("C", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn(4, "", "Lorg.mockito.asm.ClassAdapter;", "(DIZZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((int) (byte) 1, "L986491722");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        org.mockito.asm.Label[] labelArray12 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(126, 5, label7, labelArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L913905188" + "'", str10, "L913905188");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertNotNull(labelArray12);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(DIZZ)C", "L2061364284");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DIZZ)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(112, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(116, "org/mockito/asm/Type", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        java.lang.String[] strArray19 = new java.lang.String[] { "Z", "org/mockito/cglib/core/Signature" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classEmitter11.visitMethod(0, "", "L1700422645", "L1708628491", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6e982dd2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(130, "L986491722", "L2061364284", "L396320025");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("L2061364284", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(100, "Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSort();
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type4, type5 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("F", type2, typeArray8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean12 = signature9.equals((java.lang.Object) "F");
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        boolean boolean24 = signature9.equals((java.lang.Object) classEmitter21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor27 = classEmitter21.visitAnnotation("(DDZZ)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter0.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        label7.info = 128;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 108;
        java.lang.Object obj18 = label15.info;
        java.lang.String str19 = label15.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 108;
        java.lang.Object obj23 = label20.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        label24.info = 10.0f;
        java.lang.String str27 = label24.toString();
        java.lang.Object obj28 = label24.info;
        java.lang.Object obj29 = label24.info;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        label30.info = (-1);
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        label33.info = 108;
        java.lang.String str36 = label33.toString();
        java.lang.String str37 = label33.toString();
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        label38.info = 108;
        java.lang.Object obj41 = label38.info;
        java.lang.String str42 = label38.toString();
        java.lang.String str43 = label38.toString();
        org.mockito.asm.Label[] labelArray44 = new org.mockito.asm.Label[] { label15, label20, label24, label30, label33, label38 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) (short) 10, (int) ' ', label7, labelArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L856994861" + "'", str10, "L856994861");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 108 + "'", obj18, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L76730383" + "'", str19, "L76730383");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 108 + "'", obj23, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L968658459" + "'", str27, "L968658459");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 10.0f + "'", obj28, 10.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0f + "'", obj29, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L258551021" + "'", str36, "L258551021");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L258551021" + "'", str37, "L258551021");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 108 + "'", obj41, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L432686321" + "'", str42, "L432686321");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L432686321" + "'", str43, "L432686321");
        org.junit.Assert.assertNotNull(labelArray44);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "F" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visit((int) (byte) 100, 130, "L793134035", "org/mockito/cglib/core/Signature", "boolean(DIZZ)C", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSort();
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type4, type5 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("F", type2, typeArray8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean12 = signature9.equals((java.lang.Object) "F");
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        boolean boolean24 = signature9.equals((java.lang.Object) classEmitter21);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter21.visitOuterClass("(DIZZ)C", "", "L1122543531");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 108;
        java.lang.String str3 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L48100349" + "'", str3, "L48100349");
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L635492318");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitSource("float", "L793134035");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(156, 124);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(1, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        java.lang.String[] strArray16 = new java.lang.String[] { "Lorg/mockito/asm/ClassAdapter;", "C", "L103011084", "F", "(DCF)Lhi!;", "float" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visit(8, 0, "(DIZZ)F", "org.mockito.asm.Type", "L734413371", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitOuterClass("org/mockito/cglib/core/Signature", "L1700422645", "L396320025");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitOuterClass("Lorg/mockito/asm/ClassAdapter;", "L1246856285", "L186258654");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("(DIZZ)C", 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(158, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 108;
        int[] intArray8 = new int[] {};
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 10.0f;
        java.lang.String str13 = label10.toString();
        java.lang.Object obj14 = label10.info;
        java.lang.Object obj15 = label10.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = (-1);
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        label19.info = 108;
        java.lang.Object obj22 = label19.info;
        org.mockito.asm.Label[] labelArray23 = new org.mockito.asm.Label[] { label9, label10, label16, label19 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray8, labelArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1511328204" + "'", str13, "L1511328204");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0f + "'", obj15, 10.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 108 + "'", obj22, 108);
        org.junit.Assert.assertNotNull(labelArray23);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(126, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(153, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        java.lang.String[] strArray23 = new java.lang.String[] { "L103011084", "L1373512854", "L2061364284", "F", "L793134035", "L1246856285" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter11.visitMethod(7, "(DCF)Lhi!;", "L1700422645", "I", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DCF)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        java.lang.String str15 = type11.toString();
        java.lang.String str16 = type11.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter4.visitField(3, "org/mockito/cglib/core/ClassEmitter", "L1539487718", "C", (java.lang.Object) type11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "boolean" + "'", str13, "boolean");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter10.visitSource("S", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(155, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(96, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter5.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter6.getClassInfo();
        java.lang.Class<?> wildcardClass11 = classEmitter6.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) str15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str12, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str14, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str15, "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitEnd();
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        label5.info = type8;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) '#', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 10.0f;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        int[] intArray17 = new int[] { (byte) 1, 'a', '#', 6, 8, 10 };
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 10.0f;
        java.lang.String str21 = label18.toString();
        java.lang.String str22 = label18.toString();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = type26.toString();
        java.lang.String str28 = type26.getDescriptor();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(3, type26);
        label23.info = 3;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 10.0f;
        java.lang.String str34 = label31.toString();
        java.lang.Object obj35 = label31.info;
        java.lang.Object obj36 = label31.info;
        label31.info = 128;
        java.lang.Object obj39 = label31.info;
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        label40.info = 10.0f;
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        java.lang.Object obj44 = label43.info;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str47 = type46.toString();
        java.lang.String str48 = type46.getDescriptor();
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(3, type46);
        label43.info = 3;
        org.mockito.asm.Label[] labelArray51 = new org.mockito.asm.Label[] { label18, label23, label31, label40, label43 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label6, intArray17, labelArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1312574156" + "'", str9, "L1312574156");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1312574156" + "'", str10, "L1312574156");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 97, 35, 6, 8, 10]");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1126734734" + "'", str21, "L1126734734");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1126734734" + "'", str22, "L1126734734");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "S" + "'", str27, "S");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "S" + "'", str28, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1488191984" + "'", str34, "L1488191984");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0f + "'", obj35, 10.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 10.0f + "'", obj36, 10.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 128 + "'", obj39, 128);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "S" + "'", str47, "S");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "S" + "'", str48, "S");
        org.junit.Assert.assertNotNull(labelArray51);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) ' ', 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("L1246856285", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) classAdapter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(0, "L1523158699");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classAdapter2.visitMethod(158, "Lorg/mockito/asm/ClassAdapter;", "(DIZZ)I", "L1246856285", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = null;
        int[] intArray12 = new int[] { 158, (byte) 100, 5, 96, 5 };
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 10.0f;
        java.lang.String str16 = label13.toString();
        java.lang.String str17 = label13.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 10.0f;
        java.lang.String str21 = label18.toString();
        java.lang.Object obj22 = label18.info;
        java.lang.Object obj23 = label18.info;
        label18.info = 128;
        java.lang.Object obj26 = label18.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        label27.info = (-1);
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label13, label18, label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label6, intArray12, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[158, 100, 5, 96, 5]");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1421881406" + "'", str16, "L1421881406");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1421881406" + "'", str17, "L1421881406");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1212402485" + "'", str21, "L1212402485");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0f + "'", obj23, 10.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 128 + "'", obj26, 128);
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter3.visitParameterAnnotation(5, "org/mockito/cglib/core/ClassEmitter", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = classEmitter8.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        int[] intArray13 = new int[] { 97, 153, (-1), 96, 156 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 108;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 10.0f;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 108;
        java.lang.String str23 = label20.toString();
        java.lang.String str24 = label20.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        label25.info = 10.0f;
        java.lang.String str28 = label25.toString();
        java.lang.Object obj29 = label25.info;
        java.lang.Object obj30 = label25.info;
        java.lang.String str31 = label25.toString();
        org.mockito.asm.Label[] labelArray32 = new org.mockito.asm.Label[] { label14, label17, label20, label25 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label6, intArray13, labelArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 153, -1, 96, 156]");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1522334745" + "'", str23, "L1522334745");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1522334745" + "'", str24, "L1522334745");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1994915117" + "'", str28, "L1994915117");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0f + "'", obj29, 10.0f);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 10.0f + "'", obj30, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1994915117" + "'", str31, "L1994915117");
        org.junit.Assert.assertNotNull(labelArray32);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        java.lang.String str8 = label5.toString();
        java.lang.String str9 = label5.toString();
        java.lang.Object obj10 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L705030027" + "'", str8, "L705030027");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L705030027" + "'", str9, "L705030027");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        label7.info = 128;
        java.lang.Object obj15 = label7.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 10.0f;
        java.lang.String str19 = label16.toString();
        java.lang.Object obj20 = label16.info;
        java.lang.Object obj21 = label16.info;
        java.lang.String str22 = label16.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L793134035", "Lorg/mockito/asm/ClassAdapter;", "org/mockito/asm/ClassAdapter", label7, label16, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 124");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L697627094" + "'", str10, "L697627094");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 128 + "'", obj15, 128);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L150171276" + "'", str19, "L150171276");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0f + "'", obj20, 10.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 10.0f + "'", obj21, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L150171276" + "'", str22, "L150171276");
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L1373512854", false);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(5, "", "Lorg.mockito.asm.ClassAdapter;", "(DIZZ)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        java.lang.String str9 = type7.getClassName();
        int int10 = type7.getSize();
        int int11 = type7.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(96, type17);
        int int21 = type17.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type14, type15, type17, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("boolean", type13, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type7, typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(9, "I", type5, (java.lang.Object) "Lorg.mockito.asm.ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "boolean" + "'", str8, "boolean");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertNotNull(typeArray24);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter5.visitAnnotation("org/mockito/cglib/core/ClassEmitter", false);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(3, 2);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((int) '4', "(DIZZ)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitOuterClass("Lorg/mockito/asm/ClassAdapter;", "L734413371", "org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(7, 153);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
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
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn((int) (short) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(97, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(155, "", "", "I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(112, 1);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn((int) (byte) -1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.String[] strArray32 = new java.lang.String[] { "org/mockito/cglib/core/Signature", "S", "org/mockito/asm/Type", "L1523158699", "(DDZZ)S" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.visit((int) (byte) 0, (int) (byte) -1, "L986491722", "L734413371", "boolean", strArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(96, type23);
        int int27 = type23.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type20, type21, type23, type28 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("boolean", type19, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type15, typeArray30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean35 = type33.equals((java.lang.Object) type34);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.declare_field(7, "boolean(DIZZ)C", type15, (java.lang.Object) type33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter10.visitInnerClass("float", "org/mockito/asm/Type", "Lorg/mockito/asm/ClassAdapter;", 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter5 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer6 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) classAdapter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        java.lang.String str8 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(156, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1377505018" + "'", str8, "L1377505018");
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1708628491");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        java.lang.String[] strArray17 = new java.lang.String[] { "short", "L734413371", "Z", "(DIZZ)Lorg/mockito/asm/ClassAdapter;", "F", "L396320025" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter5.visit((int) 'a', 108, "(DDZZ)Z", "L186258654", "org/mockito/asm/Type", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str7 = signature6.toString();
        java.lang.String str8 = signature6.getName();
        java.lang.String str9 = signature6.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) signature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        int int5 = type3.getOpcode(1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        int int20 = type17.getSort();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("S", type3, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "boolean" + "'", str8, "boolean");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(DDZZ)Z" + "'", str24, "(DDZZ)Z");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter6.visitOuterClass("Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", "F", "");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        java.lang.Object obj13 = label8.info;
        label8.info = 128;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 10.0f;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSort();
        label17.info = type20;
        boolean boolean24 = type16.equals((java.lang.Object) label17);
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        label25.info = 10.0f;
        java.lang.String str28 = label25.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter(classVisitor30);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classAdapter31);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter31);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor37 = null;
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter(classVisitor37);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classAdapter38);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        label25.info = classEmitter34;
        org.mockito.asm.Label label42 = new org.mockito.asm.Label();
        label42.info = (-1);
        org.mockito.asm.Label label45 = new org.mockito.asm.Label();
        java.lang.Object obj46 = label45.info;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str49 = type48.toString();
        java.lang.String str50 = type48.getDescriptor();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(3, type48);
        label45.info = 3;
        org.mockito.asm.Label label53 = new org.mockito.asm.Label();
        java.lang.Object obj54 = label53.info;
        org.mockito.asm.Label[] labelArray55 = new org.mockito.asm.Label[] { label17, label25, label42, label45, label53 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) (short) -1, (int) (byte) -1, label8, labelArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1982355588" + "'", str11, "L1982355588");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L311192622" + "'", str28, "L311192622");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "S" + "'", str49, "S");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "S" + "'", str50, "S");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(labelArray55);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((int) (short) 0, "L1122543531");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        java.lang.String str7 = label4.toString();
        java.lang.Object obj8 = label4.info;
        int[] intArray12 = new int[] { 116, 154, ' ' };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray12, labelArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L378214617" + "'", str7, "L378214617");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[116, 154, 32]");
        org.junit.Assert.assertNotNull(labelArray13);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn((java.lang.Object) "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitSource("org.mockito.asm.Type", "(DIZZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        int[] intArray10 = new int[] { (byte) -1, 96 };
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 10.0f;
        java.lang.String str14 = label11.toString();
        java.lang.Object obj15 = label11.info;
        java.lang.Object obj16 = label11.info;
        java.lang.String str17 = label11.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = (-1);
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 10.0f;
        java.lang.String str24 = label21.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor33 = null;
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter(classVisitor33);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classAdapter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        label21.info = classEmitter30;
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        label38.info = (-1);
        org.mockito.asm.Label[] labelArray41 = new org.mockito.asm.Label[] { label11, label18, label21, label38 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray10, labelArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 96]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L456798339" + "'", str14, "L456798339");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0f + "'", obj15, 10.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L456798339" + "'", str17, "L456798339");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1022650544" + "'", str24, "L1022650544");
        org.junit.Assert.assertNotNull(labelArray41);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        java.lang.String str8 = label5.toString();
        java.lang.Object obj9 = label5.info;
        java.lang.Object obj10 = label5.info;
        label5.info = 128;
        int[] intArray17 = new int[] { 112, (byte) 100, 7, '#' };
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 108;
        java.lang.Object obj21 = label18.info;
        java.lang.String str22 = label18.toString();
        java.lang.String str23 = label18.toString();
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        label24.info = 108;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        label27.info = 10.0f;
        java.lang.String str30 = label27.toString();
        java.lang.String str31 = label27.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        label32.info = 108;
        java.lang.Object obj35 = label32.info;
        java.lang.String str36 = label32.toString();
        java.lang.String str37 = label32.toString();
        org.mockito.asm.Label[] labelArray38 = new org.mockito.asm.Label[] { label18, label24, label27, label32 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray17, labelArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1913752509" + "'", str8, "L1913752509");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[112, 100, 7, 35]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 108 + "'", obj21, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L351159059" + "'", str22, "L351159059");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L351159059" + "'", str23, "L351159059");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1531388279" + "'", str30, "L1531388279");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1531388279" + "'", str31, "L1531388279");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 108 + "'", obj35, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1350369292" + "'", str36, "L1350369292");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1350369292" + "'", str37, "L1350369292");
        org.junit.Assert.assertNotNull(labelArray38);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("(DCF)Lhi!;", "L1523158699", "L1373512854", label10, label11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitAnnotation("org/mockito/asm/Type", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitAnnotation("(DDZZ)Lorg/mockito/asm/ClassAdapter;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitAttribute(attribute5);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classAdapter11.visitMethod(128, "L793134035", "float", "L1246856285", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@65641cfa");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("L1700422645", 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(7, "(DCF)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        java.lang.String str13 = type11.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        int int17 = type15.getOpcode(1);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        int int32 = type29.getSort();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type19, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("S", type15, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class((int) (short) 1, 158, "boolean(DIZZ)C", type10, typeArray33, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "S" + "'", str12, "S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "S" + "'", str13, "S");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "boolean" + "'", str30, "boolean");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(DDZZ)S" + "'", str36, "(DDZZ)S");
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/ClassAdapter;");
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int16 = type15.getDimensions();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        java.lang.String str24 = type22.getClassName();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(96, type22);
        int int26 = type22.getSort();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type19, type20, type22, type27 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("boolean", type18, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class(1, 0, "(DDZZ)S", type12, typeArray29, "L1523158699");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg.mockito.asm.ClassAdapter;" + "'", str13, "Lorg.mockito.asm.ClassAdapter;");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(DIZZ)Lorg/mockito/asm/ClassAdapter;" + "'", str31, "(DIZZ)Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter2.visitField(3, "(DCF)V", "", "L2075600599", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        java.lang.String str7 = label4.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        label4.info = classEmitter13;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 10.0f;
        java.lang.String str24 = label21.toString();
        java.lang.String str25 = label21.toString();
        java.lang.Object obj26 = label21.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        label27.info = 10.0f;
        java.lang.String str30 = label27.toString();
        java.lang.String str31 = label27.toString();
        java.lang.String str32 = label27.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label21, label27, "Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L441897190" + "'", str7, "L441897190");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1657457926" + "'", str24, "L1657457926");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1657457926" + "'", str25, "L1657457926");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0f + "'", obj26, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L767601883" + "'", str30, "L767601883");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L767601883" + "'", str31, "L767601883");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L767601883" + "'", str32, "L767601883");
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn((int) '4', "Lorg.mockito.asm.ClassAdapter;", "L1539487718", "L1782750153");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        int int22 = type19.getSize();
        int int23 = type19.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int26 = type25.getDimensions();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        int int28 = type27.getSize();
        int int29 = type27.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(96, type33);
        int int37 = type33.getSort();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type25, type27, type30, type33, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("Z", type19, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor42 = interceptFieldTransformer1.visitField(4, "(DIZZ)Z", "L151203943", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", (java.lang.Object) typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "I" + "'", str31, "I");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean" + "'", str34, "boolean");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "boolean" + "'", str35, "boolean");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSort();
        label5.info = type8;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber((int) '4', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 10.0f;
        int[] intArray11 = new int[] { 0, 153 };
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 10.0f;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 10.0f;
        java.lang.String str18 = label15.toString();
        java.lang.Object obj19 = label15.info;
        java.lang.Object obj20 = label15.info;
        label15.info = 128;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        label23.info = 108;
        java.lang.Object obj26 = label23.info;
        java.lang.String str27 = label23.toString();
        java.lang.String str28 = label23.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        label29.info = 108;
        java.lang.Object obj32 = label29.info;
        java.lang.String str33 = label29.toString();
        java.lang.String str34 = label29.toString();
        java.lang.Object obj35 = label29.info;
        org.mockito.asm.Label[] labelArray36 = new org.mockito.asm.Label[] { label12, label15, label23, label29 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label6, intArray11, labelArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 153]");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L293700833" + "'", str18, "L293700833");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0f + "'", obj20, 10.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 108 + "'", obj26, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L112031965" + "'", str27, "L112031965");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L112031965" + "'", str28, "L112031965");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 108 + "'", obj32, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1393988877" + "'", str33, "L1393988877");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1393988877" + "'", str34, "L1393988877");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 108 + "'", obj35, 108);
        org.junit.Assert.assertNotNull(labelArray36);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 10.0f;
        java.lang.String str9 = label6.toString();
        java.lang.Object obj10 = label6.info;
        java.lang.Object obj11 = label6.info;
        label6.info = 128;
        java.lang.Object obj14 = label6.info;
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 10.0f;
        java.lang.String str19 = label16.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label15, label16, "(DIZZ)Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1218424177" + "'", str9, "L1218424177");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 128 + "'", obj14, 128);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L494624857" + "'", str19, "L494624857");
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        java.lang.String[] strArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classAdapter10.visitMethod(0, "(DIZZ)C", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", "(DIZZ)C", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 108;
        java.lang.Object obj10 = label7.info;
        java.lang.String str11 = label7.toString();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str15 = signature14.toString();
        java.lang.String str16 = signature14.getName();
        boolean boolean18 = signature14.equals((java.lang.Object) "");
        java.lang.String str19 = signature14.toString();
        label7.info = str19;
        int[] intArray26 = new int[] { (short) 0, 108, (byte) -1, 7, (byte) 0 };
        org.mockito.asm.Label[] labelArray27 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label7, intArray26, labelArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 108 + "'", obj10, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L636822634" + "'", str11, "L636822634");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 108, -1, 7, 0]");
        org.junit.Assert.assertNotNull(labelArray27);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((-1), 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 10.0f;
        java.lang.String str16 = label13.toString();
        java.lang.String str17 = label13.toString();
        java.lang.String str18 = label13.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("", "L1246856285", "S", label9, label13, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 126");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1539561892" + "'", str12, "L1539561892");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1494339230" + "'", str16, "L1494339230");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1494339230" + "'", str17, "L1494339230");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1494339230" + "'", str18, "L1494339230");
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local((-1), type27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((-1), type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        java.lang.String str36 = type34.getClassName();
        int int37 = type34.getSort();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type27, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type24, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        org.mockito.asm.Type[] typeArray42 = org.mockito.asm.Type.getArgumentTypes("(DDZZ)Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter43 = classEmitter18.begin_method((int) (byte) 10, signature39, typeArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@33b7c4a1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "boolean" + "'", str33, "boolean");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "boolean" + "'", str35, "boolean");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter((int) 'a', "L1122543531", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(104, "S", "(DCF)V", "Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter6.visitParameterAnnotation(100, "L396320025", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 108;
        java.lang.String str10 = label7.toString();
        java.lang.String str11 = label7.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 108;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 108;
        java.lang.String str18 = label15.toString();
        java.lang.String str19 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label12, label15, "(DDZZ)Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L669042993" + "'", str10, "L669042993");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L669042993" + "'", str11, "L669042993");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L713487747" + "'", str18, "L713487747");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L713487747" + "'", str19, "L713487747");
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        int int13 = type12.getSize();
        int int14 = type12.getSort();
        label9.info = type12;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 10.0f;
        java.lang.String str19 = label16.toString();
        java.lang.String str20 = label16.toString();
        java.lang.Object obj21 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("(DCF)Lhi!;", "L1246856285", "Lorg/mockito/asm/Type;", label9, label16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L934247325" + "'", str19, "L934247325");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L934247325" + "'", str20, "L934247325");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 10.0f + "'", obj21, 10.0f);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 108;
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 10.0f;
        java.lang.String str17 = label14.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L1246856285", "org/mockito/cglib/core/ClassEmitter", "L793134035", label9, label14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L667033327" + "'", str12, "L667033327");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L667033327" + "'", str13, "L667033327");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L368820199" + "'", str17, "L368820199");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
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
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 108;
        java.lang.Object obj11 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn(6, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 108 + "'", obj11, 108);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitSource("org.mockito.asm.Type", "(DIZZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] { "L1373512854" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter3.visitMethod(2, "float", "L396320025", "short", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@678495f5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        java.lang.String str24 = type22.getClassName();
        int int25 = type22.getSort();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type10, typeArray26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        java.lang.String str33 = type31.getClassName();
        int int34 = type31.getSort();
        java.lang.String str35 = type31.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        int int39 = type37.getOpcode(1);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((-1), type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((-1), type47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        java.lang.String str53 = type51.getClassName();
        int int54 = type51.getSort();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type44, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type41, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("S", type37, typeArray55);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("I", type31, typeArray55);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(0, (int) (short) 10, (java.lang.Object[]) typeArray26, 126, (java.lang.Object[]) typeArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "boolean" + "'", str13, "boolean");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "boolean" + "'", str33, "boolean");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Z" + "'", str35, "Z");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "boolean" + "'", str42, "boolean");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "boolean" + "'", str50, "boolean");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "boolean" + "'", str52, "boolean");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "boolean" + "'", str53, "boolean");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(typeArray55);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("L1782750153", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str9 = type8.toString();
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(3, type8);
        label5.info = 3;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "S" + "'", str9, "S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "S" + "'", str10, "S");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        java.lang.Object obj13 = label8.info;
        label8.info = 128;
        java.lang.Object obj16 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn(1, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L391743675" + "'", str11, "L391743675");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 128 + "'", obj16, 128);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter5.visitAnnotation("L1700422645", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter2.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 108;
        java.lang.String str11 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(104, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1563841874" + "'", str11, "L1563841874");
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(126, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        java.lang.String[] strArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter13.visit(3, 0, "F", "L1246856285", "L186258654", strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        int int13 = type11.getOpcode(1);
        java.lang.Class<?> wildcardClass14 = type11.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        int int20 = type18.getOpcode(1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((-1), type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        java.lang.String str34 = type32.getClassName();
        int int35 = type32.getSort();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type25, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type22, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("S", type18, typeArray36);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class(156, (-1), "C", type16, typeArray36, "(C)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "boolean" + "'", str33, "boolean");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean" + "'", str34, "boolean");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn((int) (short) 1, "(C)D", "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter5.visitInnerClass("(DDZZ)Lorg/mockito/asm/ClassAdapter;", "(C)D", "org/mockito/asm/Type", 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("(DDZZ)Z", 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 108;
        java.lang.Object obj10 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber((int) '#', label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 108 + "'", obj10, 108);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitInnerClass("hi!", "I", "Lorg/mockito/cglib/core/Signature;", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitParameterAnnotation((int) (byte) 1, "L151203943", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(DIZZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("(DCF)Lhi!;", "L2075600599");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = interceptFieldTransformer1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 10.0f;
        java.lang.String str13 = label10.toString();
        java.lang.Object obj14 = label10.info;
        java.lang.Object obj15 = label10.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 108;
        java.lang.Object obj19 = label16.info;
        java.lang.String str20 = label16.toString();
        java.lang.String str21 = label16.toString();
        java.lang.Object obj22 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLocalVariable("L1373512854", "L1539487718", "Lorg/mockito/cglib/core/Signature;", label10, label16, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 124");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L859241665" + "'", str13, "L859241665");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0f + "'", obj15, 10.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 108 + "'", obj19, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1670426140" + "'", str20, "L1670426140");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1670426140" + "'", str21, "L1670426140");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 108 + "'", obj22, 108);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter5.visitOuterClass("short", "", "float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        java.lang.String str14 = type12.getClassName();
        int int15 = type12.getSort();
        java.lang.Class<?> wildcardClass16 = type12.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter6.visitField(0, "Lorg/mockito/asm/ClassAdapter;", "org.mockito.asm.Type", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", (java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "boolean" + "'", str13, "boolean");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "boolean" + "'", str14, "boolean");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str18, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSort();
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type4, type5 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("F", type2, typeArray8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean12 = signature9.equals((java.lang.Object) "F");
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        boolean boolean24 = signature9.equals((java.lang.Object) classEmitter21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor27 = classEmitter21.visitAnnotation("Lorg/mockito/asm/ClassAdapter;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        java.lang.Object obj14 = label9.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label7, label9, label15, "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1700083431" + "'", str12, "L1700083431");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1700083431" + "'", str13, "L1700083431");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("S", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type10 = null;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        java.lang.String str15 = type13.getClassName();
        int int16 = type13.getSize();
        int int17 = type13.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(96, type23);
        int int27 = type23.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type20, type21, type23, type28 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("boolean", type19, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type13, typeArray30);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray30);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.declare_field((-1), "hi!", type10, (java.lang.Object) str33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "boolean" + "'", str14, "boolean");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(DIZZ)Z" + "'", str33, "(DIZZ)Z");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = classEmitter14.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        java.lang.Object obj14 = label9.info;
        org.mockito.asm.Label label15 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("(DDZZ)Lorg/mockito/asm/ClassAdapter;", "Z", "(DIZZ)Z", label9, label15, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 130");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1161607020" + "'", str12, "L1161607020");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter4.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1523158699");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter7.visitParameterAnnotation(4, "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter10.visitMethod(6, "L1708628491", "L1523158699", "L2061364284", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5c8f8f32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod(124, "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", "", "", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6cc57a97");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(0, "L1122543531");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn(130);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(154, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        java.lang.String str4 = type2.getClassName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(96, type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(96, type11);
        int int15 = type11.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type8, type9, type11, type16 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type7, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        java.lang.String str23 = type2.toString();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "boolean" + "'", str3, "boolean");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "boolean" + "'", str4, "boolean");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "boolean" + "'", str13, "boolean");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(DIZZ)Z" + "'", str21, "(DIZZ)Z");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        boolean boolean11 = type0.equals((java.lang.Object) classEmitter1);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        int int33 = type30.getSort();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type20, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type18, typeArray34);
        java.lang.String str37 = signature36.toString();
        boolean boolean39 = signature36.equals((java.lang.Object) 1L);
        org.mockito.asm.Type type40 = signature36.getReturnType();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) (short) 100, type40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int45 = type44.getDimensions();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local((-1), type53);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((-1), type56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str61 = type60.getClassName();
        java.lang.String str62 = type60.getClassName();
        int int63 = type60.getSort();
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type53, type56, type58, type60 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type50, typeArray64);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type48, typeArray64);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("L1122543531", type44, typeArray64);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class(0, 155, "F", type40, typeArray64, "L1539487718");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(DDZZ)Lorg/mockito/asm/ClassAdapter;" + "'", str37, "(DDZZ)Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "boolean" + "'", str51, "boolean");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "boolean" + "'", str59, "boolean");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "boolean" + "'", str61, "boolean");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "boolean" + "'", str62, "boolean");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(typeArray64);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitOuterClass("L186258654", "(C)D", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = interceptFieldTransformer1.visitField((int) (byte) 100, "(DDZZ)Z", "L103011084", "L635492318", (java.lang.Object) type16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type16);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter10.visitInnerClass("", "(DDZZ)Lorg/mockito/asm/ClassAdapter;", "Lorg/mockito/asm/Type;", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation(158, "L635492318", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter4.visitParameterAnnotation(154, "L793134035", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(7, (int) (byte) 100, "", "(DIZZ)Z", "(DDZZ)S", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        int int20 = type17.getSort();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type10, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type7, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type5, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("(DCF)V", type1, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DCF)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "boolean" + "'", str8, "boolean");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 108;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn((int) (short) -1, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(116, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIincInsn(153, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("L986491722", "short", "", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "short", "org/mockito/cglib/core/Signature", "", "(DDZZ)Z", "Lorg/mockito/asm/ClassAdapter;", "L635492318" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter2.visitMethod(2, "L1782750153", "S", "L1539487718", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@46f6bdf9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "L1539487718", "I", "Lorg/mockito/asm/ClassAdapter;", "L793134035", "(DIZZ)I" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classAdapter1.visitMethod((int) (byte) 0, "F", "boolean(DIZZ)C", "(DDZZ)Lorg/mockito/asm/ClassAdapter;", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn((int) (short) -1, "(DIZZ)F", "(DIZZ)Z", "(DCF)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray13 = new java.lang.String[] { "org/mockito/asm/ClassAdapter", "Lorg/mockito/cglib/core/Signature;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter5.visitMethod(97, "boolean(DIZZ)C", "L151203943", "L1700422645", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'boolean(DIZZ)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn(8, "L1122543531");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str6 = type5.toString();
        java.lang.String str7 = type5.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSort();
        java.lang.String str13 = type9.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        int int17 = type15.getOpcode(1);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        int int32 = type29.getSort();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type19, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("S", type15, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("I", type9, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray33);
        int int39 = type5.getOpcode(154);
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        label40.info = 108;
        java.lang.Object obj43 = label40.info;
        java.lang.String str44 = label40.toString();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str48 = signature47.toString();
        java.lang.String str49 = signature47.getName();
        boolean boolean51 = signature47.equals((java.lang.Object) "");
        java.lang.String str52 = signature47.toString();
        label40.info = str52;
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.declare_field(128, "L151203943", type5, (java.lang.Object) str52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "S" + "'", str6, "S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "S" + "'", str7, "S");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean" + "'", str10, "boolean");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "boolean" + "'", str30, "boolean");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(DDZZ)S" + "'", str37, "(DDZZ)S");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 154 + "'", int39 == 154);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 108 + "'", obj43, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "L1948395265" + "'", str44, "L1948395265");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("org/mockito/asm/ClassAdapter", "(DDZZ)Z", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("I");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        java.lang.String str13 = type11.getClassName();
        int int14 = type11.getSort();
        java.lang.Class<?> wildcardClass15 = type11.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter5.visitField((int) (short) 100, "", "L1523158699", "L1246856285", (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "boolean" + "'", str13, "boolean");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs((int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = null;
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        int int11 = type10.getSize();
        int int12 = type10.getSort();
        label7.info = type10;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 10.0f;
        java.lang.String str17 = label14.toString();
        java.lang.Object obj18 = label14.info;
        java.lang.Object obj19 = label14.info;
        label14.info = 128;
        java.lang.Object obj22 = label14.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label7, label14, "(C)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1275932084" + "'", str17, "L1275932084");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 128 + "'", obj22, 128);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = (-1);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(104, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "I" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter5.visit(100, (-1), "L1523158699", "L1539487718", "short", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 108;
        java.lang.Object obj11 = label8.info;
        java.lang.String str12 = label8.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 108;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str20 = type19.toString();
        java.lang.String str21 = type19.getDescriptor();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(3, type19);
        label16.info = 3;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str28 = type27.toString();
        java.lang.String str29 = type27.getDescriptor();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(3, type27);
        label24.info = 3;
        org.mockito.asm.Label[] labelArray32 = new org.mockito.asm.Label[] { label13, label16, label24 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn((-1), (int) '#', label8, labelArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 108 + "'", obj11, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L587772760" + "'", str12, "L587772760");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "S" + "'", str20, "S");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "S" + "'", str21, "S");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "S" + "'", str28, "S");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "S" + "'", str29, "S");
        org.junit.Assert.assertNotNull(labelArray32);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = interceptFieldTransformer1.visitField(4, "L1122543531", "(DIZZ)I", "", obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn((int) 'a', "L151203943");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        java.lang.String[] strArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visit(130, 128, "L2061364284", "L1782750153", "L1539487718", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTypeInsn((int) (byte) 10, "(DDZZ)Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(96, "org/mockito/asm/ClassAdapter", "L793134035", "Lorg/mockito/cglib/core/Signature;");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 10.0f;
        java.lang.String str14 = label11.toString();
        java.lang.String str15 = label11.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] { label11, label16 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(1, 8, label8, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1281791553" + "'", str14, "L1281791553");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1281791553" + "'", str15, "L1281791553");
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 108;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classAdapter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter22.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor42 = interceptFieldTransformer1.visitField(6, "(DCF)V", "F", "(DDZZ)Z", (java.lang.Object) "org/mockito/asm/ClassAdapter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo33);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter5 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer6 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter9);
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) classEmitter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(7, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        java.lang.String[] strArray20 = new java.lang.String[] { "Lorg/mockito/cglib/core/Signature;", "org/mockito/cglib/core/ClassEmitter" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor21 = interceptFieldTransformer11.visitMethod(116, "L1708628491", "L1539487718", "(DDZZ)Z", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@4497dc8a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter5 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer6 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer6.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter14 = interceptFieldTransformer6.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        int int13 = type12.getSize();
        int int14 = type12.getSort();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type10, type11, type12 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("F", type9, typeArray15);
        java.lang.String str17 = signature16.getDescriptor();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter0.visitField((int) ' ', "L2061364284", "(DDZZ)S", "L271690198", (java.lang.Object) signature16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(DCF)Lhi!;" + "'", str17, "(DCF)Lhi!;");
        org.junit.Assert.assertNotNull(type18);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(0, "C", "(DCF)Lhi!;", "(C)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 10.0f;
        java.lang.String str8 = label5.toString();
        java.lang.Object obj9 = label5.info;
        java.lang.Object obj10 = label5.info;
        java.lang.String str11 = label5.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 108;
        java.lang.Object obj15 = label12.info;
        java.lang.String str16 = label12.toString();
        java.lang.String str17 = label12.toString();
        java.lang.Object obj18 = label12.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        label19.info = 108;
        java.lang.Object obj22 = label19.info;
        java.lang.String str23 = label19.toString();
        java.lang.String str24 = label19.toString();
        java.lang.Object obj25 = label19.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label5, label12, label19, "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1112253599" + "'", str8, "L1112253599");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1112253599" + "'", str11, "L1112253599");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 108 + "'", obj15, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L2074199100" + "'", str16, "L2074199100");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L2074199100" + "'", str17, "L2074199100");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 108 + "'", obj18, 108);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 108 + "'", obj22, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L744768759" + "'", str23, "L744768759");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L744768759" + "'", str24, "L744768759");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 108 + "'", obj25, 108);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor6);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter0.visitField(128, "Lorg/mockito/asm/Type;", "L1246856285", "org/mockito/asm/ClassAdapter", (java.lang.Object) classEmitter10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 108;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(155, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 108 + "'", obj9, 108);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 10.0f;
        java.lang.String str18 = label15.toString();
        java.lang.String str19 = label15.toString();
        java.lang.Object obj20 = label15.info;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 10.0f;
        java.lang.String str24 = label21.toString();
        java.lang.String str25 = label21.toString();
        java.lang.Object obj26 = label21.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        label27.info = 10.0f;
        java.lang.String str30 = label27.toString();
        java.lang.Object obj31 = label27.info;
        java.lang.Object obj32 = label27.info;
        label27.info = 128;
        java.lang.Object obj35 = label27.info;
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        label36.info = 108;
        java.lang.Object obj39 = label36.info;
        java.lang.String str40 = label36.toString();
        java.lang.String str41 = label36.toString();
        java.lang.Object obj42 = label36.info;
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        label43.info = 108;
        java.lang.String str46 = label43.toString();
        org.mockito.asm.Label[] labelArray47 = new org.mockito.asm.Label[] { label14, label15, label21, label27, label36, label43 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTableSwitchInsn(2, 156, label9, labelArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1349750821" + "'", str12, "L1349750821");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1156044252" + "'", str18, "L1156044252");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1156044252" + "'", str19, "L1156044252");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0f + "'", obj20, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1220171102" + "'", str24, "L1220171102");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1220171102" + "'", str25, "L1220171102");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0f + "'", obj26, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1237762552" + "'", str30, "L1237762552");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0f + "'", obj31, 10.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10.0f + "'", obj32, 10.0f);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 128 + "'", obj35, 128);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 108 + "'", obj39, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L100176477" + "'", str40, "L100176477");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L100176477" + "'", str41, "L100176477");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 108 + "'", obj42, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L2135682571" + "'", str46, "L2135682571");
        org.junit.Assert.assertNotNull(labelArray47);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer1.getClassInfo();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int15 = type13.getOpcode(1);
        java.lang.Class<?> wildcardClass16 = type13.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = interceptFieldTransformer1.visitField((int) '#', "Lorg/mockito/asm/ClassAdapter;", "(DDZZ)S", "L151203943", (java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str18, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLdcInsn(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 108;
        java.lang.Object obj12 = label9.info;
        java.lang.String str13 = label9.toString();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str17 = signature16.toString();
        java.lang.String str18 = signature16.getName();
        boolean boolean20 = signature16.equals((java.lang.Object) "");
        java.lang.String str21 = signature16.toString();
        label9.info = str21;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn(5, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 108 + "'", obj12, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1757134784" + "'", str13, "L1757134784");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs(156, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        int int19 = type15.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type12, type13, type15, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("boolean", type11, typeArray22);
        java.lang.String str24 = type11.toString();
        int int26 = type11.getOpcode(0);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSort();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type30, type31, type32 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("F", type29, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray35);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((-1), type46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((-1), type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        java.lang.String str55 = type53.getClassName();
        int int56 = type53.getSort();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type46, type49, type51, type53 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type43, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type41, typeArray57);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFrame(104, (int) 'a', (java.lang.Object[]) typeArray35, 130, (java.lang.Object[]) typeArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "C" + "'", str24, "C");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(DCF)C" + "'", str37, "(DCF)C");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "boolean" + "'", str44, "boolean");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "boolean" + "'", str52, "boolean");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "boolean" + "'", str54, "boolean");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "boolean" + "'", str55, "boolean");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(typeArray57);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) 'a', 0);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 108;
        java.lang.Object obj12 = label9.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 10.0f;
        java.lang.String str16 = label13.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        label13.info = classEmitter22;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L2075600599", "Z", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;", label9, label13, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 108 + "'", obj12, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1993401614" + "'", str16, "L1993401614");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter5 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer6 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer6.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor16 = interceptFieldTransformer3.visitAnnotation("(DIZZ)I", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        java.lang.String[] strArray19 = new java.lang.String[] { "org/mockito/asm/Type", "C", "short" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classAdapter10.visitMethod((int) '4', "(DDZZ)S", "L271690198", "", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DDZZ)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type12.getOpcode(1);
        java.lang.Class<?> wildcardClass15 = type12.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classAdapter6.visitField(1, "F", "L635492318(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z", "", (java.lang.Object) type17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L1700422645", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        int int22 = type21.getSize();
        int int23 = type21.getSort();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type20, type21 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("F", type18, typeArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str27 = type26.toString();
        java.lang.String str28 = type26.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        int int33 = type30.getSort();
        java.lang.String str34 = type30.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        int int38 = type36.getOpcode(1);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((-1), type43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((-1), type46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str49 = type48.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        java.lang.String str52 = type50.getClassName();
        int int53 = type50.getSort();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type43, type46, type48, type50 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type40, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("S", type36, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("I", type30, typeArray54);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray54);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class(3, 4, "L793134035", type18, typeArray54, "L1246856285");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "S" + "'", str27, "S");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "S" + "'", str28, "S");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Z" + "'", str34, "Z");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "boolean" + "'", str41, "boolean");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "boolean" + "'", str49, "boolean");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "boolean" + "'", str51, "boolean");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "boolean" + "'", str52, "boolean");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(DDZZ)S" + "'", str58, "(DDZZ)S");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = signature22.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(96, type30);
        int int34 = type30.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type27, type28, type30, type35 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("boolean", type26, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter39 = interceptFieldTransformer1.begin_method((int) (byte) 0, signature22, typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@1e4ff1a0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean(DIZZ)C" + "'", str24, "boolean(DIZZ)C");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        int int18 = type15.getSize();
        int int19 = type15.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        java.lang.String str27 = type25.getClassName();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(96, type25);
        int int29 = type25.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type22, type23, type25, type30 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("boolean", type21, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type15, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean37 = type15.equals((java.lang.Object) "S");
        int int38 = type15.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor39 = classEmitter0.visitField((-1), "L986491722", "", "", (java.lang.Object) int38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "boolean" + "'", str26, "boolean");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "boolean" + "'", str27, "boolean");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        java.lang.String str24 = type22.getClassName();
        int int25 = type22.getSort();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type12, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type10, typeArray26);
        java.lang.String str29 = signature28.toString();
        boolean boolean31 = signature28.equals((java.lang.Object) 1L);
        org.mockito.asm.Type type32 = signature28.getReturnType();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 100, type32);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "boolean" + "'", str13, "boolean");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(DDZZ)Lorg/mockito/asm/ClassAdapter;" + "'", str29, "(DDZZ)Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer11.visitInnerClass("L635492318", "Lorg/mockito/asm/ClassAdapter;", "org/mockito/cglib/core/ClassEmitter", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 108;
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 10.0f;
        java.lang.String str17 = label14.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter(classVisitor26);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        label14.info = classEmitter23;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 108;
        java.lang.String str34 = label31.toString();
        java.lang.String str35 = label31.toString();
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.Object obj37 = label36.info;
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        label38.info = 108;
        java.lang.Object obj41 = label38.info;
        java.lang.String str42 = label38.toString();
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        java.lang.Object obj44 = label43.info;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str47 = type46.toString();
        java.lang.String str48 = type46.getDescriptor();
        org.mockito.cglib.core.Local local49 = new org.mockito.cglib.core.Local(3, type46);
        label43.info = 3;
        org.mockito.asm.Label label51 = new org.mockito.asm.Label();
        label51.info = 10.0f;
        java.lang.String str54 = label51.toString();
        java.lang.Object obj55 = label51.info;
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] { label14, label31, label36, label38, label43, label51 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTableSwitchInsn((int) (short) 1, 158, label9, labelArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L980562929" + "'", str12, "L980562929");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L980562929" + "'", str13, "L980562929");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1090693258" + "'", str17, "L1090693258");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L627392137" + "'", str34, "L627392137");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L627392137" + "'", str35, "L627392137");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 108 + "'", obj41, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L595463605" + "'", str42, "L595463605");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "S" + "'", str47, "S");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "S" + "'", str48, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L137912208" + "'", str54, "L137912208");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 10.0f + "'", obj55, 10.0f);
        org.junit.Assert.assertNotNull(labelArray56);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        int int11 = type9.getOpcode(1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        int int26 = type23.getSort();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type16, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type13, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("S", type9, typeArray27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        java.lang.String str37 = type35.getClassName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(96, type35);
        int int39 = type35.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type32, type33, type35, type40 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("boolean", type31, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray42);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray42);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) typeArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "boolean" + "'", str7, "boolean");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "boolean" + "'", str14, "boolean");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean" + "'", str22, "boolean");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "boolean" + "'", str37, "boolean");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "boolean" + "'", str41, "boolean");
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(DIZZ)F" + "'", str44, "(DIZZ)F");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(DIZZ)Z" + "'", str45, "(DIZZ)Z");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("(DDZZ)S");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) type19);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.declare_field(4, "L946233021", type17, (java.lang.Object) type19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 108;
        java.lang.Object obj9 = label6.info;
        java.lang.String str10 = label6.toString();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str14 = signature13.toString();
        java.lang.String str15 = signature13.getName();
        boolean boolean17 = signature13.equals((java.lang.Object) "");
        java.lang.String str18 = signature13.toString();
        label6.info = str18;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 108 + "'", obj9, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1204349023" + "'", str10, "L1204349023");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str8 = signature7.toString();
        java.lang.String str9 = signature7.getName();
        java.lang.String str10 = signature7.getName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type12.getOpcode(1);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        java.lang.String str28 = type26.getClassName();
        int int29 = type26.getSort();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type16, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("S", type12, typeArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter33 = interceptFieldTransformer1.begin_method((int) (byte) 100, signature7, typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@6833194f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "boolean" + "'", str27, "boolean");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter2.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        java.lang.Object obj14 = label9.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 108;
        java.lang.Object obj18 = label15.info;
        java.lang.String str19 = label15.toString();
        java.lang.String str20 = label15.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 10.0f;
        java.lang.String str24 = label21.toString();
        java.lang.Object obj25 = label21.info;
        java.lang.Object obj26 = label21.info;
        java.lang.String str27 = label21.toString();
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        label28.info = 108;
        java.lang.Object obj31 = label28.info;
        java.lang.String str32 = label28.toString();
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str36 = signature35.toString();
        java.lang.String str37 = signature35.getName();
        boolean boolean39 = signature35.equals((java.lang.Object) "");
        java.lang.String str40 = signature35.toString();
        label28.info = str40;
        org.mockito.asm.Label[] labelArray42 = new org.mockito.asm.Label[] { label15, label21, label28 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(2, 128, label9, labelArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1915107784" + "'", str12, "L1915107784");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 108 + "'", obj18, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L366798743" + "'", str19, "L366798743");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L366798743" + "'", str20, "L366798743");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1712201945" + "'", str24, "L1712201945");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0f + "'", obj25, 10.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0f + "'", obj26, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1712201945" + "'", str27, "L1712201945");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 108 + "'", obj31, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L214915157" + "'", str32, "L214915157");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(labelArray42);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(157, "L986491722", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMultiANewArrayInsn("", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter10.visitInnerClass("L1708628491", "L1700422645", "org/mockito/cglib/core/Signature", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 108;
        java.lang.Object obj11 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn((int) (byte) 10, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 108 + "'", obj11, 108);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str16 = signature15.toString();
        java.lang.String str17 = signature15.getName();
        java.lang.String str18 = signature15.getName();
        java.lang.String str19 = signature15.getName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        java.lang.String str28 = type26.getClassName();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(96, type26);
        int int30 = type26.getSort();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type23, type24, type26, type31 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("boolean", type22, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter36 = interceptFieldTransformer1.begin_method(4, signature15, typeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@1d9a6585");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "boolean" + "'", str27, "boolean");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(DIZZ)C" + "'", str35, "(DIZZ)C");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type7);
        int int9 = local8.getIndex();
        int int10 = local8.getIndex();
        int int11 = local8.getIndex();
        int int12 = local8.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter8.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 108;
        java.lang.Object obj8 = label5.info;
        java.lang.String str9 = label5.toString();
        java.lang.String str10 = label5.toString();
        java.lang.Object obj11 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 108 + "'", obj8, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L387286925" + "'", str9, "L387286925");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L387286925" + "'", str10, "L387286925");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 108 + "'", obj11, 108);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 108;
        org.mockito.asm.Label[] labelArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(9, (int) (byte) -1, label8, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitInnerClass("L2061364284", "short", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSort();
        label8.info = type11;
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn(4, 3, label8, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.getClassName();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(96, type24);
        int int28 = type24.getSort();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type21, type22, type24, type29 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("boolean", type20, typeArray31);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray33);
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 100, type15);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        int int39 = type37.getOpcode(1);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((-1), type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((-1), type47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        java.lang.String str53 = type51.getClassName();
        int int54 = type51.getSort();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type44, type47, type49, type51 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type41, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("S", type37, typeArray55);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class(116, 3, "Lorg.mockito.asm.ClassAdapter;", type15, typeArray55, "(DIZZ)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "boolean" + "'", str26, "boolean");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "boolean" + "'", str30, "boolean");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(DIZZ)Z" + "'", str34, "(DIZZ)Z");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "boolean" + "'", str42, "boolean");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "boolean" + "'", str50, "boolean");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "boolean" + "'", str52, "boolean");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "boolean" + "'", str53, "boolean");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(typeArray55);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = (-1);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        java.lang.String str20 = type18.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        java.lang.String str24 = type22.getClassName();
        int int25 = type22.getSize();
        int int26 = type22.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int29 = type28.getDimensions();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        int int31 = type30.getSize();
        int int32 = type30.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        java.lang.String str38 = type36.getClassName();
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(96, type36);
        int int40 = type36.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type28, type30, type33, type36, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Z", type22, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L635492318", type18, typeArray43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int48 = type47.getDimensions();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str55 = type54.getClassName();
        java.lang.String str56 = type54.getClassName();
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(96, type54);
        int int58 = type54.getSort();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type51, type52, type54, type59 };
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("boolean", type50, typeArray61);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray61);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer11.begin_class(124, 4, "L1782750153", type18, typeArray61, "(DCF)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "I" + "'", str34, "I");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "boolean" + "'", str37, "boolean");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "boolean" + "'", str38, "boolean");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "boolean" + "'", str55, "boolean");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "boolean" + "'", str56, "boolean");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "boolean" + "'", str60, "boolean");
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(DIZZ)Lorg/mockito/asm/ClassAdapter;" + "'", str63, "(DIZZ)Lorg/mockito/asm/ClassAdapter;");
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = interceptFieldTransformer1.visitField(112, "L635492318(Lorg/mockito/asm/ClassAdapter;FIZLorg/mockito/asm/ClassAdapter;)Z", "short", "L734413371", (java.lang.Object) classAdapter13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
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
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter8.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(116, "(C)D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        java.lang.String str7 = label4.toString();
        java.lang.Object obj8 = label4.info;
        java.lang.Object obj9 = label4.info;
        java.lang.String str10 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1334265235" + "'", str7, "L1334265235");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1334265235" + "'", str10, "L1334265235");
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        java.lang.String[] strArray22 = new java.lang.String[] { "L1246856285", "S", "L151203943", "(DIZZ)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor23 = interceptFieldTransformer1.visitMethod(156, "(DCF)Lhi!;", "L396320025", "L151203943", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DCF)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(130, 10);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitOuterClass("Lorg/mockito/asm/ClassAdapter;", "L1523158699", "L635492318");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(96, type17);
        int int21 = type17.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type14, type15, type17, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("boolean", type13, typeArray24);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type13 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        int int33 = type30.getSize();
        int int34 = type30.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        java.lang.String str42 = type40.getClassName();
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(96, type40);
        int int44 = type40.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type37, type38, type40, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("boolean", type36, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type30, typeArray47);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(0, 7, (java.lang.Object[]) typeArray26, 3, (java.lang.Object[]) typeArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(C)D" + "'", str27, "(C)D");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "boolean" + "'", str41, "boolean");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "boolean" + "'", str42, "boolean");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "boolean" + "'", str46, "boolean");
        org.junit.Assert.assertNotNull(typeArray47);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        java.lang.String str27 = type25.getClassName();
        int int28 = type25.getSort();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type15, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type13, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.declare_field((int) (byte) -1, "(DIZZ)C", type10, (java.lang.Object) type13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "boolean" + "'", str26, "boolean");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "boolean" + "'", str27, "boolean");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn(2, "(DCF)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSort();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(153, type22);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        java.lang.String str29 = type27.getClassName();
        int int30 = type27.getSort();
        java.lang.String str31 = type27.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        int int35 = type33.getOpcode(1);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((-1), type40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((-1), type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        java.lang.String str49 = type47.getClassName();
        int int50 = type47.getSort();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type40, type43, type45, type47 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type37, typeArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("S", type33, typeArray51);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("I", type27, typeArray51);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer11.begin_class(154, 1, "hi!", type22, typeArray51, "(DCF)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Z" + "'", str31, "Z");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "boolean" + "'", str38, "boolean");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "boolean" + "'", str46, "boolean");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "boolean" + "'", str48, "boolean");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "boolean" + "'", str49, "boolean");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(typeArray51);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(96, type30);
        int int34 = type30.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type27, type28, type30, type35 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("boolean", type26, typeArray37);
        java.lang.String str39 = type26.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter(classVisitor44);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classAdapter45);
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter45);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classAdapter49);
        boolean boolean51 = type40.equals((java.lang.Object) classEmitter41);
        boolean boolean52 = type26.equals((java.lang.Object) type40);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local((-1), type60);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local64 = new org.mockito.cglib.core.Local((-1), type63);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str66 = type65.getClassName();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.getClassName();
        java.lang.String str69 = type67.getClassName();
        int int70 = type67.getSort();
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type60, type63, type65, type67 };
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("", type57, typeArray71);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("", type55, typeArray71);
        java.lang.String str74 = signature73.toString();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.LONG_TYPE;
        boolean boolean76 = signature73.equals((java.lang.Object) type75);
        org.mockito.asm.Type[] typeArray77 = signature73.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.begin_class((int) (byte) 1, 154, "L2061364284", type26, typeArray77, "L1523158699");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "C" + "'", str39, "C");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "boolean" + "'", str58, "boolean");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "boolean" + "'", str66, "boolean");
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "boolean" + "'", str68, "boolean");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "boolean" + "'", str69, "boolean");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(DDZZ)Lorg/mockito/asm/ClassAdapter;" + "'", str74, "(DDZZ)Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(typeArray77);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        java.lang.Object obj13 = label8.info;
        label8.info = 128;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber((int) (short) 100, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L2018428644" + "'", str11, "L2018428644");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        java.lang.String str21 = type19.getClassName();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(96, type19);
        int int23 = type19.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type16, type17, type19, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("boolean", type15, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type11, typeArray26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        int int33 = type31.getOpcode(1);
        java.lang.Class<?> wildcardClass34 = type31.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type37 = type36.getElementType();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        java.lang.String str45 = type43.getClassName();
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(96, type43);
        int int47 = type43.getSort();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str49 = type48.getClassName();
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type40, type41, type43, type48 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("boolean", type39, typeArray50);
        org.mockito.asm.Type[] typeArray52 = signature51.getArgumentTypes();
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("C", type36, typeArray52);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFrame((int) (short) 100, 157, (java.lang.Object[]) typeArray26, 0, (java.lang.Object[]) typeArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/asm/Type" + "'", str35, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "boolean" + "'", str44, "boolean");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "boolean" + "'", str45, "boolean");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "boolean" + "'", str49, "boolean");
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray8 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(153, 8, label7, labelArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray8);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        java.lang.String str7 = type5.getClassName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(96, type5);
        int int9 = type5.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type2, type3, type5, type10 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray12);
        java.lang.String str14 = type1.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classAdapter24);
        boolean boolean26 = type15.equals((java.lang.Object) classEmitter16);
        boolean boolean27 = type1.equals((java.lang.Object) type15);
        java.lang.String str28 = type15.getDescriptor();
        int int29 = type15.getSort();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = type15.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "boolean" + "'", str7, "boolean");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "C" + "'", str14, "C");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "S" + "'", str28, "S");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        java.lang.Object obj13 = label9.info;
        java.lang.Object obj14 = label9.info;
        label9.info = 128;
        java.lang.Object obj17 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber((int) (byte) 100, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1550304787" + "'", str12, "L1550304787");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 128 + "'", obj17, 128);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMultiANewArrayInsn("(DIZZ)Lorg/mockito/asm/ClassAdapter;", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor10);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter9.getClassInfo();
        java.lang.Class<?> wildcardClass14 = classEmitter9.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type17 = type16.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = interceptFieldTransformer1.visitField(0, "L635492318", "L1782750153", "L1700422645", (java.lang.Object) type16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str15, "org/mockito/cglib/core/ClassEmitter");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1122543531");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter7.visitParameterAnnotation(104, "L103011084", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        java.lang.String str11 = label8.toString();
        java.lang.Object obj12 = label8.info;
        java.lang.Object obj13 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn((int) (short) 10, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L444053612" + "'", str11, "L444053612");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMethodInsn((int) (byte) 10, "Lorg/mockito/asm/Type;", "(C)D", "(DCF)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = (-1);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 108;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 108;
        java.lang.Object obj19 = label16.info;
        java.lang.String str20 = label16.toString();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str24 = signature23.toString();
        java.lang.String str25 = signature23.getName();
        boolean boolean27 = signature23.equals((java.lang.Object) "");
        java.lang.String str28 = signature23.toString();
        label16.info = str28;
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label13, label16 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTableSwitchInsn(96, 100, label10, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 108 + "'", obj19, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L118941170" + "'", str20, "L118941170");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("LL734413371;", "short", "(DIZZ)Lorg/mockito/asm/ClassAdapter;");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1122543531", "org/mockito/cglib/core/Signature");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter3.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter23 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer24 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        interceptFieldTransformer24.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer24);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        boolean boolean32 = signature2.equals((java.lang.Object) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("L635492318", "(DDZZ)S", "L793134035", 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        label0.info = classEmitter9;
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter(classVisitor22);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classAdapter23);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter21.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter9.visitField(126, "boolean", "", "", (java.lang.Object) classEmitter21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L341519231" + "'", str3, "L341519231");
        org.junit.Assert.assertNull(classInfo25);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "(DIZZ)Lorg/mockito/asm/ClassAdapter;", "L635492318", "(DDZZ)Lorg/mockito/asm/ClassAdapter;", "L1700422645" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classAdapter1.visitMethod(154, "(DCF)C", "L1700422645", "", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter6.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1aaf4083");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        java.lang.String str10 = type8.getClassName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(96, type8);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        java.lang.String str19 = type17.getClassName();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(96, type17);
        int int21 = type17.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type14, type15, type17, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("boolean", type13, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor28 = classEmitter2.visitField((int) (short) 100, "hi!", "(DIZZ)I", "L2075600599", (java.lang.Object) type8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean" + "'", str10, "boolean");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(DIZZ)Z" + "'", str27, "(DIZZ)Z");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSort();
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type3, type4, type5 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("F", type2, typeArray8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean12 = signature9.equals((java.lang.Object) "F");
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter(classVisitor14);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        boolean boolean24 = signature9.equals((java.lang.Object) classEmitter21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = classEmitter21.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 108;
        java.lang.Object obj3 = label0.info;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 108 + "'", obj3, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1578264228" + "'", str4, "L1578264228");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1578264228" + "'", str5, "L1578264228");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 108 + "'", obj6, 108);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("S");
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer11.declare_field((int) (short) 1, "(DCF)V", type17, (java.lang.Object) "org/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 10.0f;
        java.lang.String str9 = label6.toString();
        java.lang.Object obj10 = label6.info;
        java.lang.Object obj11 = label6.info;
        label6.info = 128;
        int[] intArray18 = new int[] { 124, 'a', (short) 1, 104 };
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        label19.info = 108;
        java.lang.Object obj22 = label19.info;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        label23.info = 10.0f;
        java.lang.String str26 = label23.toString();
        java.lang.Object obj27 = label23.info;
        java.lang.Object obj28 = label23.info;
        label23.info = 128;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 108;
        java.lang.String str34 = label31.toString();
        java.lang.String str35 = label31.toString();
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        label36.info = 10.0f;
        java.lang.String str39 = label36.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor41 = null;
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter(classVisitor41);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classAdapter42);
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter42);
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor48 = null;
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter(classVisitor48);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classAdapter49);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        label36.info = classEmitter45;
        org.mockito.asm.Label label53 = new org.mockito.asm.Label();
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        label54.info = 10.0f;
        java.lang.String str57 = label54.toString();
        java.lang.String str58 = label54.toString();
        java.lang.String str59 = label54.toString();
        org.mockito.asm.Label[] labelArray60 = new org.mockito.asm.Label[] { label19, label23, label31, label36, label53, label54 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label6, intArray18, labelArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L178695257" + "'", str9, "L178695257");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0f + "'", obj10, 10.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[124, 97, 1, 104]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 108 + "'", obj22, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L2092531065" + "'", str26, "L2092531065");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0f + "'", obj27, 10.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 10.0f + "'", obj28, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L356625091" + "'", str34, "L356625091");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L356625091" + "'", str35, "L356625091");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L2002544935" + "'", str39, "L2002544935");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "L1210570737" + "'", str57, "L1210570737");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "L1210570737" + "'", str58, "L1210570737");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "L1210570737" + "'", str59, "L1210570737");
        org.junit.Assert.assertNotNull(labelArray60);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn(8, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/ClassAdapter;");
        java.lang.String str18 = type17.getClassName();
        int int19 = type17.getSort();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 10.0f;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        int int24 = type23.getSize();
        int int25 = type23.getSort();
        label20.info = type23;
        boolean boolean27 = type17.equals((java.lang.Object) type23);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str29 = type28.toString();
        java.lang.String str30 = type28.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer11.declare_field((int) (byte) 0, "C", type23, (java.lang.Object) str30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg.mockito.asm.ClassAdapter;" + "'", str18, "Lorg.mockito.asm.ClassAdapter;");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "S" + "'", str29, "S");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "S" + "'", str30, "S");
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs((-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(3, "L2075600599", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(130, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn(6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter5 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer6 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer6.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer6);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        java.lang.String str23 = type21.getClassName();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(96, type21);
        int int25 = type21.getSort();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type18, type19, type21, type26 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("boolean", type17, typeArray28);
        org.mockito.asm.MethodVisitor methodVisitor32 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter33 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor32);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter34 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter33);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter35 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter34);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter36 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter35);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer6.declare_field((int) (short) 10, "float", type17, (java.lang.Object) localVariablesSorter35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean" + "'", str22, "boolean");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "boolean" + "'", str23, "boolean");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "boolean" + "'", str27, "boolean");
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 108;
        java.lang.Object obj9 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 108 + "'", obj9, 108);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("(DIZZ)Lorg/mockito/asm/ClassAdapter;", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1373512854");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("C");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type12.getOpcode(1);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        java.lang.String str28 = type26.getClassName();
        int int29 = type26.getSort();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type19, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type16, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("S", type12, typeArray30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.getClassName();
        java.lang.String str40 = type38.getClassName();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(96, type38);
        int int42 = type38.getSort();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type35, type36, type38, type43 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("boolean", type34, typeArray45);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray45);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray45);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class(4, 10, "(DCF)C", type8, typeArray45, "L986491722");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean" + "'", str10, "boolean");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "boolean" + "'", str27, "boolean");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "boolean" + "'", str39, "boolean");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "boolean" + "'", str40, "boolean");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "boolean" + "'", str44, "boolean");
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(DIZZ)F" + "'", str47, "(DIZZ)F");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(DIZZ)Z" + "'", str48, "(DIZZ)Z");
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.toString();
        java.lang.String str13 = type11.getDescriptor();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(3, type11);
        label8.info = 3;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(0, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "S" + "'", str12, "S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "S" + "'", str13, "S");
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSort();
        label8.info = type11;
        boolean boolean15 = type7.equals((java.lang.Object) label8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 108;
        java.lang.Object obj8 = label5.info;
        java.lang.String str9 = label5.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 108;
        java.lang.Object obj13 = label10.info;
        java.lang.String str14 = label10.toString();
        java.lang.String str15 = label10.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 10.0f;
        java.lang.String str19 = label16.toString();
        java.lang.String str20 = label16.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label10, label16, "L986491722");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 108 + "'", obj8, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L201472090" + "'", str9, "L201472090");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 108 + "'", obj13, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1576105648" + "'", str14, "L1576105648");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1576105648" + "'", str15, "L1576105648");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L876292223" + "'", str19, "L876292223");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L876292223" + "'", str20, "L876292223");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        label0.info = classEmitter9;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter25);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        java.lang.String[] strArray42 = new java.lang.String[] { "(DIZZ)C", "Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor43 = classEmitter9.visitMethod(157, "(DCF)C", "L2061364284", "L2075600599", strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DCF)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L92208981" + "'", str3, "L92208981");
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(96, type23);
        int int27 = type23.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type20, type21, type23, type28 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("boolean", type19, typeArray30);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        java.lang.String str33 = signature31.toString();
        org.mockito.asm.Type type34 = signature31.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor35 = interceptFieldTransformer1.visitField(0, "L396320025", "org/mockito/cglib/core/ClassEmitter", "L1700422645", (java.lang.Object) signature31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "boolean(DIZZ)C" + "'", str33, "boolean(DIZZ)C");
        org.junit.Assert.assertNotNull(type34);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(158, "C", "L396320025", "L1373512854");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 108;
        java.lang.Object obj13 = label10.info;
        java.lang.String str14 = label10.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 10.0f;
        java.lang.String str18 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L1246856285", "float", "(C)D", label10, label15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 108 + "'", obj13, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L784966824" + "'", str14, "L784966824");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1225194568" + "'", str18, "L1225194568");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/asm/ClassAdapter");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(6, (int) (byte) 10);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 1, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 10.0f;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSort();
        label8.info = type11;
        boolean boolean15 = type7.equals((java.lang.Object) label8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(0, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter20 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer21 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer21);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        int int36 = type35.getSize();
        int int37 = type35.getSort();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type33, type34, type35 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("F", type32, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean42 = signature39.equals((java.lang.Object) "F");
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter(classVisitor44);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classAdapter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter43.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor48 = null;
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter(classVisitor48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        boolean boolean54 = signature39.equals((java.lang.Object) classEmitter51);
        java.lang.String str55 = signature39.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str62 = type61.getClassName();
        java.lang.String str63 = type61.getClassName();
        org.mockito.cglib.core.Local local64 = new org.mockito.cglib.core.Local(96, type61);
        int int65 = type61.getSort();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str67 = type66.getClassName();
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type58, type59, type61, type66 };
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("boolean", type57, typeArray68);
        org.mockito.asm.Type[] typeArray70 = signature69.getArgumentTypes();
        java.lang.String str71 = signature69.toString();
        org.mockito.asm.Type type72 = signature69.getReturnType();
        org.mockito.asm.Type[] typeArray73 = signature69.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter74 = classEmitter10.begin_method(158, signature39, typeArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@13da6e56");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(DCF)Lhi!;" + "'", str55, "(DCF)Lhi!;");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "boolean" + "'", str62, "boolean");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "boolean" + "'", str63, "boolean");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "boolean" + "'", str67, "boolean");
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "boolean(DIZZ)C" + "'", str71, "boolean(DIZZ)C");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray73);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        label7.info = 128;
        int[] intArray18 = new int[] { (short) 10, (byte) 0, 104 };
        org.mockito.asm.Label[] labelArray19 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label7, intArray18, labelArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L198983453" + "'", str10, "L198983453");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 0, 104]");
        org.junit.Assert.assertNotNull(labelArray19);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = interceptFieldTransformer11.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = interceptFieldTransformer1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(2, "L986491722", "S", "L217349127");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter1.visitAnnotation("(DDZZ)Lorg/mockito/asm/ClassAdapter;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        java.lang.String str9 = type7.getClassName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) 'a', type7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        java.lang.String str27 = type25.getClassName();
        int int28 = type25.getSort();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type18, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type15, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type13, typeArray29);
        java.lang.String str32 = signature31.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        java.lang.String str36 = type34.getClassName();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) 'a', type34);
        boolean boolean38 = signature31.equals((java.lang.Object) 'a');
        org.mockito.asm.Type[] typeArray39 = signature31.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) str40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "boolean" + "'", str8, "boolean");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "boolean" + "'", str26, "boolean");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "boolean" + "'", str27, "boolean");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(DDZZ)Lorg/mockito/asm/ClassAdapter;" + "'", str32, "(DDZZ)Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "boolean" + "'", str35, "boolean");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(DDZZ)Z" + "'", str40, "(DDZZ)Z");
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 10.0f;
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        label7.info = 128;
        java.lang.Object obj15 = label7.info;
        java.lang.Object obj16 = label7.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 108;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 10.0f;
        java.lang.String str23 = label20.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter(classVisitor25);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor32 = null;
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter(classVisitor32);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classAdapter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        label20.info = classEmitter29;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label7, label17, label20, "L1373512854");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1908082730" + "'", str10, "L1908082730");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 128 + "'", obj15, 128);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 128 + "'", obj16, 128);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L884998436" + "'", str23, "L884998436");
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        int int13 = type10.getSize();
        int int14 = type10.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(96, type20);
        int int24 = type20.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type17, type18, type20, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("boolean", type16, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("Lorg.mockito.asm.ClassAdapter;", type10, typeArray27);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str32 = type31.toString();
        java.lang.String str33 = type31.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        int int37 = type35.getOpcode(1);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((-1), type42);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((-1), type45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str50 = type49.getClassName();
        java.lang.String str51 = type49.getClassName();
        int int52 = type49.getSort();
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type42, type45, type47, type49 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type39, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("S", type35, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray53);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(6, (int) 'a', "L396320025", type8, typeArray53, "org/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean" + "'", str22, "boolean");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "boolean" + "'", str26, "boolean");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(DIZZ)Z" + "'", str30, "(DIZZ)Z");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "S" + "'", str32, "S");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "S" + "'", str33, "S");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "boolean" + "'", str40, "boolean");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "boolean" + "'", str48, "boolean");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "boolean" + "'", str50, "boolean");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "boolean" + "'", str51, "boolean");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(DDZZ)S" + "'", str56, "(DDZZ)S");
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 10.0f;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        java.lang.Object obj11 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L394911751" + "'", str9, "L394911751");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L394911751" + "'", str10, "L394911751");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter17);
        interceptFieldTransformer14.setTarget((org.mockito.asm.ClassVisitor) classAdapter19);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str27 = signature26.toString();
        java.lang.Class<?> wildcardClass28 = signature26.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        int int32 = type31.getSize();
        int int33 = type31.getSort();
        java.lang.String str34 = type31.toString();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.declare_field((int) (byte) 0, "L1501923494", type30, (java.lang.Object) type31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "F" + "'", str34, "F");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] { "L151203943" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter3.visitMethod(0, "L271690198", "I", "L151203943", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@473118b0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(97, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        label0.info = classEmitter9;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter25);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitSource("(C)D", "(DDZZ)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L2090304630" + "'", str3, "L2090304630");
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo32);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter20 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer21 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer21);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter(classVisitor23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter24);
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor29 = null;
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter(classVisitor29);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter30);
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor35 = classEmitter5.visitField(108, "L2061364284", "org/mockito/asm/Type", "(DDZZ)Lorg/mockito/asm/ClassAdapter;", (java.lang.Object) classEmitter34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        int[] intArray8 = new int[] { 14, 6 };
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 108;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] { label9 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray8, labelArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[14, 6]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L139503462" + "'", str12, "L139503462");
        org.junit.Assert.assertNotNull(labelArray13);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer11.visitSource("Lorg/mockito/asm/Type;", "org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn(156);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
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
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str4 = type3.toString();
        java.lang.String str5 = type3.getDescriptor();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(3, type3);
        label0.info = 3;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S" + "'", str4, "S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "S" + "'", str5, "S");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L651773408" + "'", str3, "L651773408");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
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
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = (-1);
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(116, 1, label7, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1952025893" + "'", str10, "L1952025893");
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 10.0f;
        java.lang.String str7 = label4.toString();
        java.lang.Object obj8 = label4.info;
        java.lang.Object obj9 = label4.info;
        label4.info = 128;
        java.lang.Object obj12 = label4.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        int int18 = type16.getOpcode(1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        int int33 = type30.getSort();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type23, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type20, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type16, typeArray34);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        java.lang.String str44 = type42.getClassName();
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(96, type42);
        int int46 = type42.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type39, type40, type42, type47 };
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("boolean", type38, typeArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray49);
        label4.info = typeArray49;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L334978019" + "'", str7, "L334978019");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 128 + "'", obj12, 128);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "boolean" + "'", str14, "boolean");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "boolean" + "'", str43, "boolean");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "boolean" + "'", str44, "boolean");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "boolean" + "'", str48, "boolean");
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(DIZZ)F" + "'", str51, "(DIZZ)F");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(DIZZ)Z" + "'", str52, "(DIZZ)Z");
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn((int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs(157, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/asm/ClassAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = (-1);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str16 = type15.toString();
        java.lang.String str17 = type15.getDescriptor();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(3, type15);
        label12.info = 3;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label6, label9, label12, "L217349127");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "S" + "'", str16, "S");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "S" + "'", str17, "S");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter(classVisitor15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) classAdapter18);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) classAdapter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo13);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        label0.info = classEmitter9;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter(classVisitor20);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter25);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Attribute attribute36 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter17.visitAttribute(attribute36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1694202389" + "'", str3, "L1694202389");
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo32);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(104, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(155, "L1754199210", "(DIZZ)Z", "L1373512854");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 108;
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1217859170" + "'", str3, "L1217859170");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1217859170" + "'", str4, "L1217859170");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L1501923494", (int) '4');
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIincInsn((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "L1700422645", "L1122543531", "C", "(DIZZ)Z" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(3, 7, "L396320025", "L1754199210", "L1269572140", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int16 = type15.getDimensions();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type15);
        java.lang.String str18 = type15.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        int int22 = type20.getOpcode(1);
        java.lang.Class<?> wildcardClass23 = type20.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type26 = type25.getElementType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        java.lang.String str34 = type32.getClassName();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(96, type32);
        int int36 = type32.getSort();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type29, type30, type32, type37 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("boolean", type28, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("C", type25, typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.declare_field(9, "org/mockito/cglib/core/ClassEmitter", type15, (java.lang.Object) typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/ClassAdapter;" + "'", str18, "Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/asm/Type" + "'", str24, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "boolean" + "'", str33, "boolean");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean" + "'", str34, "boolean");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "boolean" + "'", str38, "boolean");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = interceptFieldTransformer1.visitAnnotation("L1782750153", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = (-1);
        java.lang.String str12 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(8, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L434440123" + "'", str12, "L434440123");
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
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
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = (-1);
        java.lang.String str8 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1700165951" + "'", str8, "L1700165951");
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSize();
        int int13 = type9.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int16 = type15.getDimensions();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        int int18 = type17.getSize();
        int int19 = type17.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(96, type23);
        int int27 = type23.getSort();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type15, type17, type20, type23, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type9, typeArray30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((-1), type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        java.lang.String str42 = type40.getClassName();
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local(96, type40);
        int int44 = type40.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type37, type38, type40, type45 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("boolean", type36, typeArray47);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type36 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray49);
        int int51 = type33.getSort();
        int int52 = type33.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((-1), type54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str62 = type61.getClassName();
        java.lang.String str63 = type61.getClassName();
        org.mockito.cglib.core.Local local64 = new org.mockito.cglib.core.Local(96, type61);
        int int65 = type61.getSort();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str67 = type66.getClassName();
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type58, type59, type61, type66 };
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("boolean", type57, typeArray68);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type57 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray70);
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray70);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter73 = interceptFieldTransformer1.begin_method(7, signature31, typeArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@31dae4bd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean" + "'", str10, "boolean");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "I" + "'", str21, "I");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "boolean" + "'", str24, "boolean");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "boolean" + "'", str25, "boolean");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "boolean" + "'", str41, "boolean");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "boolean" + "'", str42, "boolean");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "boolean" + "'", str46, "boolean");
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(C)D" + "'", str50, "(C)D");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "boolean" + "'", str62, "boolean");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "boolean" + "'", str63, "boolean");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "boolean" + "'", str67, "boolean");
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(C)D" + "'", str71, "(C)D");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(C)D" + "'", str72, "(C)D");
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter18);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        int int31 = type29.getOpcode(1);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((-1), type39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        java.lang.String str45 = type43.getClassName();
        int int46 = type43.getSort();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type36, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type33, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("S", type29, typeArray47);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer15.begin_class((int) (short) 1, 154, "hi!", type27, typeArray47, "L1122543531");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean" + "'", str34, "boolean");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "boolean" + "'", str42, "boolean");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "boolean" + "'", str44, "boolean");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "boolean" + "'", str45, "boolean");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(typeArray47);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter4.visitAnnotation("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        java.lang.Object obj14 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn((int) (byte) 0, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L2116845138" + "'", str12, "L2116845138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L2116845138" + "'", str13, "L2116845138");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.getClassName();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(96, type9);
        int int13 = type9.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type6, type7, type9, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("boolean", type5, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type1, typeArray16);
        int int20 = type1.getOpcode(108);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean" + "'", str10, "boolean");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 108 + "'", int20 == 108);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 108;
        java.lang.Object obj12 = label9.info;
        java.lang.String str13 = label9.toString();
        org.mockito.asm.Label[] labelArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTableSwitchInsn((int) 'a', (int) (short) 10, label9, labelArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 108 + "'", obj12, 108);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1335831709" + "'", str13, "L1335831709");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(104, "L986491722", "(DDZZ)S", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 10.0f;
        java.lang.String str3 = label0.toString();
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        label0.info = 128;
        java.lang.Object obj8 = label0.info;
        java.lang.Object obj9 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1048375183" + "'", str3, "L1048375183");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 128 + "'", obj8, 128);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 128 + "'", obj9, 128);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 108;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        java.lang.String str11 = label6.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 10.0f;
        java.lang.String str15 = label12.toString();
        java.lang.Object obj16 = label12.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 10.0f;
        java.lang.String str20 = label17.toString();
        java.lang.Object obj21 = label17.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label6, label12, label17, "L635492318");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1419554450" + "'", str9, "L1419554450");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1419554450" + "'", str10, "L1419554450");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1419554450" + "'", str11, "L1419554450");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1648377221" + "'", str15, "L1648377221");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1031551572" + "'", str20, "L1031551572");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 10.0f + "'", obj21, 10.0f);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 108;
        java.lang.String str16 = label13.toString();
        java.lang.String str17 = label13.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 108;
        java.lang.String str21 = label18.toString();
        java.lang.String str22 = label18.toString();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        label23.info = 10.0f;
        java.lang.String str26 = label23.toString();
        java.lang.Object obj27 = label23.info;
        java.lang.Object obj28 = label23.info;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        label29.info = 10.0f;
        java.lang.String str32 = label29.toString();
        java.lang.Object obj33 = label29.info;
        java.lang.Object obj34 = label29.info;
        label29.info = 128;
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        label37.info = 10.0f;
        java.lang.String str40 = label37.toString();
        java.lang.Object obj41 = label37.info;
        java.lang.Object obj42 = label37.info;
        java.lang.String str43 = label37.toString();
        org.mockito.asm.Label[] labelArray44 = new org.mockito.asm.Label[] { label13, label18, label23, label29, label37 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(8, 128, label9, labelArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L997188128" + "'", str12, "L997188128");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1418430292" + "'", str16, "L1418430292");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1418430292" + "'", str17, "L1418430292");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L931833029" + "'", str21, "L931833029");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L931833029" + "'", str22, "L931833029");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1236088769" + "'", str26, "L1236088769");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0f + "'", obj27, 10.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 10.0f + "'", obj28, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L219652662" + "'", str32, "L219652662");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10.0f + "'", obj33, 10.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0f + "'", obj34, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L95299047" + "'", str40, "L95299047");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10.0f + "'", obj41, 10.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 10.0f + "'", obj42, 10.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L95299047" + "'", str43, "L95299047");
        org.junit.Assert.assertNotNull(labelArray44);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitSource("L734413371", "L1708628491");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.String str17 = type15.getClassName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(96, type15);
        int int19 = type15.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type12, type13, type15, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("boolean", type11, typeArray22);
        int int24 = type11.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((-1), type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((-1), type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getClassName();
        java.lang.String str41 = type39.getClassName();
        int int42 = type39.getSort();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type32, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type27, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.declare_field(10, "L1851620781", type11, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean" + "'", str17, "boolean");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "boolean" + "'", str30, "boolean");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "boolean" + "'", str38, "boolean");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "boolean" + "'", str40, "boolean");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "boolean" + "'", str41, "boolean");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(typeArray43);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn((int) '4', "L1700475493", "C", "L217349127");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        org.mockito.asm.Type type18 = local17.getType();
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(96, type29);
        int int33 = type29.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type26, type27, type29, type34 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("boolean", type25, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("Z", type21, typeArray36);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class(0, 108, "L1269572140", type18, typeArray36, "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "boolean" + "'", str30, "boolean");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "boolean" + "'", str35, "boolean");
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = interceptFieldTransformer3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@67735348");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(0, "L217349127");
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/ClassAdapter;");
        int int8 = type7.getDimensions();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        java.lang.String str16 = type14.getClassName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(96, type14);
        int int18 = type14.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type11, type12, type14, type19 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("boolean", type10, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        java.lang.String str32 = type30.getClassName();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(96, type30);
        int int34 = type30.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type27, type28, type30, type35 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("boolean", type26, typeArray37);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        java.lang.String str40 = signature38.toString();
        org.mockito.asm.Type type41 = signature38.getReturnType();
        org.mockito.asm.Type[] typeArray42 = signature38.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(0, (int) (byte) 100, (java.lang.Object[]) typeArray21, (int) (byte) 1, (java.lang.Object[]) typeArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(DIZZ)Lorg/mockito/asm/ClassAdapter;" + "'", str23, "(DIZZ)Lorg/mockito/asm/ClassAdapter;");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "boolean" + "'", str32, "boolean");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "boolean(DIZZ)C" + "'", str40, "boolean(DIZZ)C");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter17 = classEmitter16.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter(classVisitor21);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter22);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer29);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor37 = classEmitter0.visitField(10, "(C)D", "L271690198", "boolean", (java.lang.Object) classEmitter8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo33);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 10.0f;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        int int13 = type12.getSize();
        int int14 = type12.getSort();
        label9.info = type12;
        boolean boolean16 = type8.equals((java.lang.Object) label9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn(158, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitOuterClass("(DDZZ)Z", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        java.lang.String[] strArray15 = new java.lang.String[] { "C(DIZZ)Lorg/mockito/asm/Type;", "I", "F", "L986491722", "(DCF)V", "L1700475493" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = interceptFieldTransformer1.visitMethod(153, "", "L758134381", "L734413371", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@487ae948");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitInnerClass("L1373512854", "L1269572140", "org/mockito/asm/Type", 0);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter(classVisitor7);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter8);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter6.visitAnnotation("L734413371", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.String[] strArray18 = new java.lang.String[] { "L1373512854", "", "L2075600599" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visit(153, 0, "(DCF)V", "org/mockito/asm/Type", "", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn(2, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor1);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classAdapter10.visitField((int) (short) 1, "L1708628491", "L2061364284", "L1269572140", obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(DCF)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((int) 'a', type10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        int int17 = type15.getOpcode(1);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.getClassName();
        java.lang.String str31 = type29.getClassName();
        int int32 = type29.getSort();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type22, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type19, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("S", type15, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray33);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        int int42 = type40.getOpcode(1);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((-1), type47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((-1), type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str55 = type54.getClassName();
        java.lang.String str56 = type54.getClassName();
        int int57 = type54.getSort();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type47, type50, type52, type54 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type44, typeArray58);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("S", type40, typeArray58);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray58);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFrame((int) ' ', 100, (java.lang.Object[]) typeArray33, (-1), (java.lang.Object[]) typeArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "boolean" + "'", str20, "boolean");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "boolean" + "'", str28, "boolean");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "boolean" + "'", str30, "boolean");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "boolean" + "'", str31, "boolean");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(DDZZ)Z" + "'", str36, "(DDZZ)Z");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "boolean" + "'", str45, "boolean");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "boolean" + "'", str53, "boolean");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "boolean" + "'", str55, "boolean");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "boolean" + "'", str56, "boolean");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(DDZZ)Z" + "'", str61, "(DDZZ)Z");
    }
}
