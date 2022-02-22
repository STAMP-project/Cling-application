import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn(108, "L1617403293", "short", "L919849236");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray15 = new java.lang.String[] { "org/mockito/asm/MethodAdapter", "L1035675070", "L323416934", "org/mockito/asm/MethodAdapter", "L92807203" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classAdapter5.visitMethod((int) (short) 10, "(ZZZZ)Lorg/mockito/asm/Type;", "L1687456611", "L1411121776", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        boolean boolean10 = type8.equals((java.lang.Object) label9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        int int13 = type11.getOpcode(5);
        label9.info = 5;
        java.lang.Object obj15 = label9.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label9, label16, label18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 5 + "'", obj15, 5);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1988676149" + "'", str20, "L1988676149");
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        label8.info = 130;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        label8.info = wildcardClass14;
        java.lang.Object obj18 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1268770390" + "'", str10, "L1268770390");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class org.mockito.asm.Type");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class org.mockito.asm.Type");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class org.mockito.asm.Type");
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(10, "L822822720", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter7.visitMethod(153, "org/mockito/asm/MethodAdapter", "S", "boolean", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1fe608fe");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
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
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(126, "L407651636", "L1035675070", "()Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
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
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn(3, 96, label7, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1980557728" + "'", str9, "L1980557728");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1980557728" + "'", str10, "L1980557728");
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) (short) 0, "L822822720");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(156, "char", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn(2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter5.visitParameterAnnotation((int) (byte) 0, "(ZZZZ)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(126, "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "hi!(VZZVZZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("L323416934", "L1687456611", "(VZZVZZ)Lorg/mockito/asm/Type;", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = classEmitter4.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMultiANewArrayInsn("J", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
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
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.Object obj4 = label3.info;
        java.lang.Object obj5 = label3.info;
        boolean boolean6 = type0.equals(obj5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = type0.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "J" + "'", str1, "J");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J" + "'", str2, "J");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@54727571");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        java.lang.String str13 = label10.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.String str16 = label14.toString();
        java.lang.Object obj17 = label14.info;
        java.lang.Object obj18 = label14.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        label19.info = 130;
        label19.info = "L822822720";
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.String str27 = label26.toString();
        java.lang.String str28 = label26.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.Object obj30 = label29.info;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.Object obj32 = label31.info;
        java.lang.String str33 = label31.toString();
        label31.info = 130;
        java.lang.String str36 = label31.toString();
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.Object obj38 = label37.info;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSize();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type41, type43, type45, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray49);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(108, type40);
        java.lang.Class<?> wildcardClass52 = type40.getClass();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        label37.info = type53;
        java.lang.Object obj55 = label37.info;
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] { label14, label19, label26, label29, label31, label37 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn((int) '4', 4, label10, labelArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1958846207" + "'", str12, "L1958846207");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1958846207" + "'", str13, "L1958846207");
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1920848725" + "'", str16, "L1920848725");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1428609431" + "'", str21, "L1428609431");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1810742096" + "'", str27, "L1810742096");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1810742096" + "'", str28, "L1810742096");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L321119924" + "'", str33, "L321119924");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L321119924" + "'", str36, "L321119924");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(ZZZZ)Z" + "'", str50, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(labelArray56);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray13);
        org.mockito.asm.Type[] typeArray17 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("boolean", type11, typeArray17);
        java.lang.String str19 = type11.toString();
        int int20 = type11.getSize();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "()Z" + "'", str14, "()Z");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str15, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMultiANewArrayInsn("short", 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
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
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "L2068771860", (org.mockito.asm.MethodVisitor) methodAdapter8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        boolean boolean14 = type12.equals((java.lang.Object) label13);
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.String str17 = label15.toString();
        label15.info = 130;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        label15.info = wildcardClass21;
        java.lang.Object obj25 = label15.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTryCatchBlock(label10, label13, label15, "()V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L312278222" + "'", str17, "L312278222");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class org.mockito.asm.Type");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class org.mockito.asm.Type");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class org.mockito.asm.Type");
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L407651636", "Lorg/mockito/cglib/core/ClassEmitter;", "L1283204962", "(VZZVZZ)Lorg/mockito/asm/Type;", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter1.visitMethod(128, "Lorg/mockito/asm/Type;(VZZVZZ)V", "", "(ZDZ)C", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Lorg/mockito/asm/Type;(VZZVZZ)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("org/mockito/asm/MethodAdapter");
        java.lang.String str10 = type9.toString();
        int int12 = type9.getOpcode((int) (short) 10);
        int int14 = type9.getOpcode(0);
        org.mockito.asm.Type[] typeArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.begin_class(6, (int) (short) 0, "(ZZZZ)Z", type9, typeArray15, "L1411121776");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lorg/mockito/asm/MethodAdapter;" + "'", str10, "Lorg/mockito/asm/MethodAdapter;");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
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
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L2032297897" + "'", str2, "L2032297897");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMaxs(5, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMultiANewArrayInsn("C", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        java.lang.String str11 = signature8.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type15, type26, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter32 = classEmitter2.begin_method(1, signature8, typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2ee2a2e0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(ZDZ)Z" + "'", str11, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(ZZZZ)Z" + "'", str25, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(ZDZ)Z" + "'", str30, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZDZ)Z" + "'", str31, "(ZDZ)Z");
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = classEmitter2.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitFieldInsn((int) '#', "L1974286099", "L92807203", "()V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str10 = signature9.getDescriptor();
        java.lang.String str11 = signature9.getName();
        org.mockito.asm.Type type12 = signature9.getReturnType();
        int int14 = type12.getOpcode(156);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean18 = type16.equals((java.lang.Object) '#');
        java.lang.String str19 = type16.getDescriptor();
        int int20 = type16.getSort();
        int int22 = type16.getOpcode((int) (short) -1);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type29, type31 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray33);
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local(108, type24);
        int int36 = local35.getIndex();
        int int37 = local35.getIndex();
        int int38 = local35.getIndex();
        org.mockito.asm.Type type39 = local35.getType();
        java.lang.Object[] objArray41 = new java.lang.Object[] { int14, int22, local35, 0.0f };
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type47 = signature46.getReturnType();
        org.mockito.asm.Type[] typeArray49 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray49);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitFrame((int) ' ', 155, objArray41, 0, (java.lang.Object[]) typeArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(ZDZ)Z" + "'", str10, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 156 + "'", int14 == 156);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lhi!;" + "'", str19, "Lhi!;");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(ZZZZ)Z" + "'", str34, "(ZZZZ)Z");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 108 + "'", int36 == 108);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 108 + "'", int37 == 108);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 108 + "'", int38 == 108);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "()V" + "'", str50, "()V");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "()C" + "'", str51, "()C");
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitInnerClass("L838408294", "V", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        boolean boolean10 = type8.equals((java.lang.Object) label9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        int int13 = type11.getOpcode(5);
        label9.info = 5;
        java.lang.String str15 = label9.toString();
        int[] intArray19 = new int[] { 155, 158, 5 };
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        java.lang.Object obj23 = label20.info;
        java.lang.Object obj24 = label20.info;
        java.lang.String str25 = label20.toString();
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.Object obj28 = label26.info;
        label26.info = "C";
        org.mockito.asm.Label[] labelArray31 = new org.mockito.asm.Label[] { label20, label26 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label9, intArray19, labelArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L542100381" + "'", str15, "L542100381");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[155, 158, 5]");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L2045767216" + "'", str22, "L2045767216");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L2045767216" + "'", str25, "L2045767216");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(labelArray31);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(158, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        boolean boolean10 = signature8.equals((java.lang.Object) "org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type[] typeArray11 = signature8.getArgumentTypes();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        java.lang.String str23 = type12.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type30, type32, type34 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type27, type38, type39 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter45 = classEmitter2.begin_method(8, signature8, typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@36150356");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(ZZZZ)Z" + "'", str22, "(ZZZZ)Z");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(ZZZZ)Z" + "'", str37, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(ZDZ)Z" + "'", str42, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(ZDZ)Z" + "'", str43, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(ZDZ)Z" + "'", str44, "(ZDZ)Z");
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("L92807203", "short", "L1405890076");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("org.mockito.asm.Type", "(VZZVZZ)V", "org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        label0.info = 130;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        label0.info = wildcardClass6;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L865288350" + "'", str2, "L865288350");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
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
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(157, "()V", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMethodInsn(2, "", "hi!(VZZVZZ)V", "L407651636");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "short", "Lorg/mockito/asm/Type;(VZZVZZ)V" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter1.visitMethod((int) (short) -1, "()Lorg/mockito/asm/Type;", "C", "L1365617678", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = methodAdapter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(5, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIincInsn(116, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitJumpInsn(4, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L867049093" + "'", str14, "L867049093");
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.String str14 = label9.toString();
        java.lang.String str15 = label9.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.String str18 = label16.toString();
        label16.info = 130;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.String str22 = label21.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTryCatchBlock(label9, label16, label21, "L1220550033");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1803844882" + "'", str11, "L1803844882");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1803844882" + "'", str14, "L1803844882");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1803844882" + "'", str15, "L1803844882");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L858667625" + "'", str18, "L858667625");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1929706768" + "'", str22, "L1929706768");
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter11.visitOuterClass("L814527759", "L()Z;", "()Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        boolean boolean14 = type12.equals((java.lang.Object) label13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        int int17 = type15.getOpcode(5);
        label13.info = 5;
        java.lang.String str19 = label13.toString();
        java.lang.Object obj20 = label13.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitJumpInsn(154, label13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1380665784" + "'", str19, "L1380665784");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 5 + "'", obj20, 5);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = methodAdapter6.visitParameterAnnotation(2, "L1405890076", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitVarInsn(2, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)Z");
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        org.mockito.asm.Type[] typeArray12 = signature11.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(96, (int) (byte) 1, (java.lang.Object[]) typeArray7, (int) (short) -1, (java.lang.Object[]) typeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        int int16 = type14.getOpcode((int) (short) 10);
        org.mockito.asm.Type[] typeArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("L919849236", type14, typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(ZZZZ)Z" + "'", str12, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter5.visitParameterAnnotation((int) (byte) 0, "Lorg/mockito/asm/Type;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        label8.info = "C";
        java.lang.String str13 = label8.toString();
        java.lang.String str14 = label8.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.String str17 = label15.toString();
        java.lang.Object obj18 = label15.info;
        java.lang.Object obj19 = label15.info;
        java.lang.String str20 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitTryCatchBlock(label6, label8, label15, "L(ZDZ)Z;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1291336925" + "'", str7, "L1291336925");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1349967585" + "'", str13, "L1349967585");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1349967585" + "'", str14, "L1349967585");
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1640648547" + "'", str17, "L1640648547");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1640648547" + "'", str20, "L1640648547");
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(0, "Lorg/mockito/asm/Type;(VZZVZZ)V", "org/mockito/asm/MethodAdapter", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitInsn(130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter5.visitField((int) 'a', "L()Z;", "org/mockito/cglib/core/ClassEmitter", "Lorg/mockito/asm/Type;(VZZVZZ)V", obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        boolean boolean13 = signature11.equals((java.lang.Object) "org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type[] typeArray14 = signature11.getArgumentTypes();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "(VZZVZZ)V");
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame((-1), 128, (java.lang.Object[]) typeArray14, 104, (java.lang.Object[]) typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray19);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(108, "()Z", "void", "L323416934");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(124, type14);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type type17 = local15.getType();
        int int18 = local15.getIndex();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(ZZZZ)Z" + "'", str12, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 124 + "'", int18 == 124);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("char", "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;");
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        java.lang.String[] strArray10 = new java.lang.String[] { "Lorg/mockito/cglib/core/ClassEmitter;", "L407651636", "hi!(VZZVZZ)V" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classAdapter2.visitMethod(5, "L1365617678", "org/mockito/asm/MethodAdapter", "Lorg/mockito/asm/Type;", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Type type22 = signature20.getReturnType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter34 = classEmitter5.begin_method((int) '4', signature20, typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6d5c049e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(ZZZZ)Z" + "'", str33, "(ZZZZ)Z");
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
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
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(108, type15);
        java.lang.Class<?> wildcardClass27 = type15.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        label12.info = type28;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.String str32 = label30.toString();
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        boolean boolean36 = type34.equals((java.lang.Object) label35);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitTryCatchBlock(label12, label30, label35, "()C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(ZZZZ)Z" + "'", str25, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1045482020" + "'", str32, "L1045482020");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("()Z", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("boolean()Lorg/mockito/asm/Type;", 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        boolean boolean9 = type7.equals((java.lang.Object) label8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        int int12 = type10.getOpcode(5);
        label8.info = 5;
        java.lang.Object obj14 = label8.info;
        java.lang.String str15 = label8.toString();
        int[] intArray22 = new int[] { ' ', '#', (byte) 1, 155, (byte) -1, '4' };
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.String str25 = label23.toString();
        java.lang.Object obj26 = label23.info;
        java.lang.Object obj27 = label23.info;
        java.lang.Object obj28 = label23.info;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        boolean boolean31 = type29.equals((java.lang.Object) label30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        int int34 = type32.getOpcode(5);
        label30.info = 5;
        java.lang.Object obj36 = label30.info;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        boolean boolean39 = type37.equals((java.lang.Object) label38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        int int42 = type40.getOpcode(5);
        label38.info = 5;
        java.lang.String str44 = label38.toString();
        java.lang.Object obj45 = label38.info;
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        java.lang.Object obj47 = label46.info;
        java.lang.String str48 = label46.toString();
        label46.info = 130;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        label46.info = wildcardClass52;
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] { label23, label30, label38, label46 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label8, intArray22, labelArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 5 + "'", obj14, 5);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1434579513" + "'", str15, "L1434579513");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32, 35, 1, 155, -1, 52]");
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1581197158" + "'", str25, "L1581197158");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 5 + "'", obj36, 5);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "L529506669" + "'", str44, "L529506669");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 5 + "'", obj45, 5);
        org.junit.Assert.assertNull(obj47);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L640716054" + "'", str48, "L640716054");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(labelArray56);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
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
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(157, "Lorg/mockito/asm/Type;", "Lhi!;", "()Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(104, "L407651636", "L1035675070", "L1411121776");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (byte) -1, 157, "", "L92807203", "L1404759413", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = classEmitter9.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str3 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "void" + "'", str3, "void");
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMaxs(3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Label label11 = null;
        int[] intArray18 = new int[] { '4', 112, 1, (short) 100, (short) 1, 3 };
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        label19.info = 130;
        label19.info = "L822822720";
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] { label19 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLookupSwitchInsn(label11, intArray18, labelArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[52, 112, 1, 100, 1, 3]");
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L431306949" + "'", str21, "L431306949");
        org.junit.Assert.assertNotNull(labelArray26);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        java.lang.String str7 = type5.getDescriptor();
        int int8 = type5.getSort();
        java.lang.String str9 = type5.getDescriptor();
        int int10 = type5.getSize();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str14 = signature13.getName();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        java.lang.String str16 = signature13.toString();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(100, "Lorg/mockito/cglib/core/ClassEmitter;", type5, (java.lang.Object) type17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "J" + "'", str6, "J");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "J" + "'", str7, "J");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "J" + "'", str9, "J");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ZDZ)Z" + "'", str16, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "L1405890076", "L711231962", "()V", "L1035675070", "boolean()Lorg/mockito/asm/Type;", "boolean()Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter2.visitMethod(124, "L14978671", "L919849236", "org/mockito/cglib/core/ClassEmitter", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@24899083");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitVarInsn(154, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("()Lorg/mockito/asm/Type;", "hi!", "S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) ' ', type9);
        int int11 = type9.getSort();
        java.lang.String str12 = type9.getClassName();
        java.lang.String str13 = type9.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type15, type26, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor32 = classAdapter3.visitField(1, "short", "L92807203", "Lorg/mockito/asm/Type;", (java.lang.Object) type9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "char" + "'", str12, "char");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "C" + "'", str13, "C");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(ZZZZ)Z" + "'", str25, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(ZDZ)Z" + "'", str30, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZDZ)C" + "'", str31, "(ZDZ)C");
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.String str14 = label9.toString();
        java.lang.String str15 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn(100, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L674236853" + "'", str11, "L674236853");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L674236853" + "'", str14, "L674236853");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L674236853" + "'", str15, "L674236853");
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        label7.info = 130;
        java.lang.String str12 = label7.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        java.lang.Object obj16 = label13.info;
        java.lang.Object obj17 = label13.info;
        java.lang.Object obj18 = label13.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        label19.info = 130;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        label19.info = wildcardClass25;
        java.lang.String str29 = label19.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTryCatchBlock(label7, label13, label19, "L()Z;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L599520354" + "'", str9, "L599520354");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L599520354" + "'", str12, "L599520354");
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L8135581" + "'", str15, "L8135581");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1391436139" + "'", str21, "L1391436139");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1391436139" + "'", str29, "L1391436139");
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter2.setTarget(classVisitor5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("()V", "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1956367500" + "'", str2, "L1956367500");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1956367500" + "'", str3, "L1956367500");
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(157, "()V", methodVisitor2);
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
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn(104, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter2.getClassInfo();
        java.lang.String[] strArray22 = new java.lang.String[] { "L2068771860", "L838408294", "S", "boolean()Lorg/mockito/asm/Type;", "char", "L1411121776" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(116, 13, "L1035675070", "", "org/mockito/asm/Type", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.String str14 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(1, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1281049900" + "'", str11, "L1281049900");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1281049900" + "'", str14, "L1281049900");
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type16, type18 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type26 = signature25.getReturnType();
        org.mockito.asm.Type[] typeArray28 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(96, "Lorg/mockito/asm/MethodAdapter;", type11, (java.lang.Object) type22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(ZZZZ)Z" + "'", str21, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "()V" + "'", str29, "()V");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "()C" + "'", str30, "()C");
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter4.visitParameterAnnotation((int) ' ', "L1617403293", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) ' ', type16);
        int int18 = type16.getSort();
        boolean boolean19 = type12.equals((java.lang.Object) int18);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitLdcInsn((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "()Z" + "'", str14, "()Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("Lorg/mockito/cglib/core/ClassEmitter;", "L2068771860", "L1687456611", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitMultiANewArrayInsn("", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIincInsn((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("Lorg/mockito/cglib/core/ClassEmitter;", 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) "S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        java.lang.String str13 = label11.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label11, label14, "L1411121776");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L422892544" + "'", str9, "L422892544");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L422892544" + "'", str10, "L422892544");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1542989117" + "'", str12, "L1542989117");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1542989117" + "'", str13, "L1542989117");
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.String str14 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn((-1), label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1717515166" + "'", str11, "L1717515166");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1717515166" + "'", str14, "L1717515166");
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitInsn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
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
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        boolean boolean14 = type12.equals((java.lang.Object) label13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        boolean boolean17 = type15.equals((java.lang.Object) label16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        int int20 = type18.getOpcode(5);
        label16.info = 5;
        java.lang.String str22 = label16.toString();
        java.lang.Object obj23 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("L(ZDZ)Z;", "L711231962", "C", label13, label16, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 104");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L2041324934" + "'", str22, "L2041324934");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 5 + "'", obj23, 5);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIntInsn(14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        label12.info = "C";
        java.lang.String str17 = label12.toString();
        java.lang.String str18 = label12.toString();
        java.lang.Object obj19 = label12.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLabel(label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L482962666" + "'", str17, "L482962666");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L482962666" + "'", str18, "L482962666");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "C" + "'", obj19, "C");
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        java.lang.String str18 = type16.getDescriptor();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(153, type16);
        java.lang.String str20 = type16.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type24, type26, type28 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("L1687456611", type16, typeArray30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type38 = signature37.getReturnType();
        org.mockito.asm.Type[] typeArray40 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitFrame(124, 9, (java.lang.Object[]) typeArray30, 128, (java.lang.Object[]) typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "J" + "'", str17, "J");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "J" + "'", str18, "J");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "J" + "'", str20, "J");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZZZZ)Z" + "'", str31, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "()V" + "'", str41, "()V");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "()C" + "'", str42, "()C");
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type16, type18 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(108, type11);
        java.lang.Class<?> wildcardClass23 = type11.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        int int25 = type24.getSize();
        java.lang.String str26 = type24.getClassName();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str30 = signature29.getDescriptor();
        org.mockito.asm.Type[] typeArray31 = signature29.getArgumentTypes();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type24, typeArray31);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) type24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(ZZZZ)Z" + "'", str21, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.mockito.asm.Type" + "'", str26, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(ZDZ)Z" + "'", str30, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(typeArray31);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitVarInsn(13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Type[] typeArray23 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor25 = classEmitter6.visitField((int) (byte) 10, "V", "L1220550033", "short", (java.lang.Object) typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "()V" + "'", str24, "()V");
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(157, "()V", methodVisitor2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        boolean boolean6 = type4.equals((java.lang.Object) label5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.Object obj10 = label7.info;
        java.lang.Object obj11 = label7.info;
        java.lang.String str12 = label7.toString();
        java.lang.String str13 = label7.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        boolean boolean16 = type14.equals((java.lang.Object) label15);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label5, label7, label15, "char");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1072282749" + "'", str9, "L1072282749");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1072282749" + "'", str12, "L1072282749");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1072282749" + "'", str13, "L1072282749");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitInnerClass("J", "short", "()Z", 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs((int) 'a', 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        label11.info = 130;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        label11.info = wildcardClass17;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        boolean boolean23 = type21.equals((java.lang.Object) label22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        int int26 = type24.getOpcode(5);
        label22.info = 5;
        java.lang.Object obj28 = label22.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("Lorg/mockito/asm/MethodAdapter;", "short", "L()Z;", label11, label22, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 96");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L952435640" + "'", str13, "L952435640");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 5 + "'", obj28, 5);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = classAdapter8.visitField((int) (short) 0, "L711231962", "L1035675070", "boolean", (java.lang.Object) "(VZZVZZ)Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.String str8 = label6.toString();
        label6.info = 130;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber(153, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1440323249" + "'", str8, "L1440323249");
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn((int) '4', "L1404759413");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(157, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray8);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("boolean", type6, typeArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter0.begin_method(0, signature13, typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@f98467e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "()Z" + "'", str9, "()Z");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str10, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray20 = new java.lang.String[] { "C", "org/mockito/asm/MethodAdapter", "org.mockito.asm.Type", "J", "L1411121776" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(1, 127, "L(ZDZ)Z;", "L2068771860", "L1035675070", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotation("char", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        java.lang.String str9 = type7.getDescriptor();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(153, type7);
        org.mockito.asm.Type type11 = local10.getType();
        org.mockito.asm.Type type12 = local10.getType();
        org.mockito.asm.Type type13 = local10.getType();
        int int15 = type13.getOpcode(126);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("L1411121776");
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(96, "org.mockito.asm.Type", type13, (java.lang.Object) "L1411121776");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "J" + "'", str8, "J");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "J" + "'", str9, "J");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 127 + "'", int15 == 127);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter2.setTarget(classVisitor5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMaxs(126, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
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
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("L1411121776", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.Object obj10 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(2, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1671431196" + "'", str9, "L1671431196");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(157, "()V", methodVisitor2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type27, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        java.lang.String str33 = type22.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type38.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type42.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSize();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type42, type44 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int50 = type49.getSize();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type37, type48, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray51);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray51);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(3, (int) (byte) 0, (java.lang.Object[]) typeArray18, 10, (java.lang.Object[]) typeArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ZZZZ)Z" + "'", str19, "(ZZZZ)Z");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(ZZZZ)Lorg/mockito/asm/Type;" + "'", str20, "(ZZZZ)Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(ZZZZ)Z" + "'", str32, "(ZZZZ)Z");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(ZZZZ)Z" + "'", str47, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(ZDZ)Z" + "'", str52, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(ZDZ)Z" + "'", str53, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(ZDZ)Z" + "'", str54, "(ZDZ)Z");
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
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
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("Lhi!;", "org/mockito/asm/Type");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type19, type21, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type16, type27, type28 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type35, type37, type39, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray43);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(108, type34);
        org.mockito.asm.Type type46 = local45.getType();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSize();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type56.getSize();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type50, type52, type54, type56 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray58);
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(108, type49);
        org.mockito.asm.Type type61 = local60.getType();
        int int62 = type61.getSize();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int64 = type63.getSize();
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type12, type14, type46, type47, type61, type63 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray65);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter67 = classEmitter5.begin_method(5, signature10, typeArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4919231f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(ZZZZ)Z" + "'", str26, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZDZ)Z" + "'", str31, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(ZDZ)Z" + "'", str32, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(ZZZZ)Z" + "'", str44, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(ZZZZ)Z" + "'", str59, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(VZZVZZ)V" + "'", str66, "(VZZVZZ)V");
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter4.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn(157, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        java.lang.String[] strArray20 = new java.lang.String[] { "L1471807529" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor21 = classEmitter5.visitMethod(9, "()Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "L303557794", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = (-1L);
        java.lang.Object obj12 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter4.visitField(154, "L1365617678", "L303557794", "L680829613", (java.lang.Object) label9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber(14, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L2147097180" + "'", str5, "L2147097180");
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter2.visitParameterAnnotation(153, "short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray20 = new java.lang.String[] { "()C", "L1404759413" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor21 = classEmitter2.visitMethod(116, "Z", "org.mockito.asm.Type", "L303557794", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@50ebe31b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitInnerClass("L1035675070org.mockito.asm.Type", "Lhi!;", "L92807203", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = classEmitter5.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Object obj7 = label5.info;
        label5.info = "C";
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber((int) (short) 100, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "L1404759413", "(ZZZZ)Z", "org/mockito/asm/Type" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (short) 0, 1, "L1617403293", "V", "org/mockito/cglib/core/ClassEmitter", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        label7.info = 130;
        java.lang.String str12 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitJumpInsn(8, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L276566492" + "'", str9, "L276566492");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L276566492" + "'", str12, "L276566492");
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) classAdapter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMethodInsn(100, "L323416934", "boolean", "()C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn(100, "(ZDZ)C", "L303557794", "L442156004");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        label9.info = 130;
        java.lang.String str14 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(124, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1718573793" + "'", str11, "L1718573793");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1718573793" + "'", str14, "L1718573793");
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter5.visitParameterAnnotation(126, "Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
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
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor16 = classEmitter5.visitAnnotation("L323416934", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] {};
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray13);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(108, type18);
        int int30 = local29.getIndex();
        org.mockito.asm.Type type31 = local29.getType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("(ZDZ)Z");
        int int35 = type34.getDimensions();
        java.lang.String str36 = type34.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type38.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type42.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSize();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type42, type44 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("L1617403293", type34, typeArray46);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray46);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame((int) (short) 1, 157, (java.lang.Object[]) typeArray13, (int) (byte) 0, (java.lang.Object[]) typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "()Z" + "'", str14, "()Z");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str15, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(ZZZZ)Z" + "'", str28, "(ZZZZ)Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L(ZDZ)Z;" + "'", str36, "L(ZDZ)Z;");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(ZZZZ)Z" + "'", str47, "(ZZZZ)Z");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(ZZZZ)Z" + "'", str49, "(ZZZZ)Z");
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(155, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs(104, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn((int) (byte) 10, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray10);
        java.lang.String str12 = type8.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("boolean", type16, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type8, typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "()V" + "'", str11, "()V");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "V" + "'", str12, "V");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "()Z" + "'", str19, "()Z");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str20, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray8 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "S" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter1.visitMethod(112, "L1687456611", "L1283204962", "(ZDZ)C", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@13c44887");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitMethodInsn(108, "L1365617678", "char", "()Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        label7.info = "C";
        java.lang.String str12 = label7.toString();
        java.lang.String str13 = label7.toString();
        java.lang.Object obj14 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1377521324" + "'", str12, "L1377521324");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1377521324" + "'", str13, "L1377521324");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "C" + "'", obj14, "C");
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = (-1L);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        java.lang.Object obj16 = label13.info;
        java.lang.Object obj17 = label13.info;
        java.lang.Object obj18 = label13.info;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        boolean boolean21 = type19.equals((java.lang.Object) label20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        int int24 = type22.getOpcode(5);
        label20.info = 5;
        java.lang.Object obj26 = label20.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitTryCatchBlock(label10, label13, label20, "Lorg/mockito/asm/Type;(VZZVZZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L616986996" + "'", str15, "L616986996");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 5 + "'", obj26, 5);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitSource("void", "L()Z;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter6.visitAnnotation("L814527759", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classAdapter9.visitAnnotation("Lorg/mockito/asm/MethodAdapter;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMultiANewArrayInsn("", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn((int) (short) 10, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = methodAdapter6.visitParameterAnnotation(96, "(ZDZ)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMethodInsn(158, "()Lorg/mockito/asm/Type;", "L1405890076", "L1617403293");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitOuterClass("void", "L919849236", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(1, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean3 = type1.equals((java.lang.Object) '#');
        java.lang.String str4 = type1.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        boolean boolean14 = type1.equals((java.lang.Object) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lhi!;" + "'", str4, "Lhi!;");
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        org.mockito.asm.Type[] typeArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("L919849236", type1, typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J" + "'", str2, "J");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L235367498" + "'", str9, "L235367498");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "L14978671", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn(4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        java.lang.String str10 = label8.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        label11.info = 130;
        label11.info = "L822822720";
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        java.lang.Object obj21 = label18.info;
        java.lang.Object obj22 = label18.info;
        java.lang.Object obj23 = label18.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.String str26 = label24.toString();
        label18.info = str26;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label8, label11, label18, "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L931375674" + "'", str9, "L931375674");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L931375674" + "'", str10, "L931375674");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L846305901" + "'", str13, "L846305901");
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1499518926" + "'", str20, "L1499518926");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1835923679" + "'", str26, "L1835923679");
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        label9.info = "C";
        java.lang.String str14 = label9.toString();
        java.lang.Object obj15 = null;
        label9.info = obj15;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn((int) (short) 10, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1173442007" + "'", str14, "L1173442007");
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(7, "L1617403293", "L(ZDZ)Z;", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(116, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(97, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitInsn(154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7381d787");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn(130, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter12.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter5.visitAnnotation("L1035675070", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn(108, "L1404759413", "org/mockito/cglib/core/ClassEmitter", "(ZZZZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitIntInsn(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        label9.info = "C";
        java.lang.String str14 = label9.toString();
        java.lang.String str15 = label9.toString();
        java.lang.Object obj16 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn(154, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L820845725" + "'", str14, "L820845725");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L820845725" + "'", str15, "L820845725");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "C" + "'", obj16, "C");
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L407651636");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs((int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        boolean boolean2 = type0.equals((java.lang.Object) label1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type3.getOpcode(5);
        label1.info = 5;
        java.lang.Object obj7 = label1.info;
        java.lang.String str8 = label1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = label1.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 5 + "'", obj7, 5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L68543042" + "'", str8, "L68543042");
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = classEmitter7.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("(ZDZ)Z");
        int int12 = type11.getDimensions();
        java.lang.String str13 = type11.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type17, type19, type21 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("L1617403293", type11, typeArray23);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) ' ', type28);
        int int30 = type28.getSort();
        java.lang.String str31 = type28.getClassName();
        java.lang.String str32 = type28.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type35, type37, type39, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSize();
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type34, type45, type46 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray48);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame((int) (byte) 0, (int) (short) 1, (java.lang.Object[]) typeArray23, 104, (java.lang.Object[]) typeArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L(ZDZ)Z;" + "'", str13, "L(ZDZ)Z;");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(ZZZZ)Z" + "'", str24, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "char" + "'", str31, "char");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "C" + "'", str32, "C");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(ZZZZ)Z" + "'", str44, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(ZDZ)Z" + "'", str49, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(ZDZ)C" + "'", str50, "(ZDZ)C");
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int5 = type4.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        boolean boolean13 = type4.equals((java.lang.Object) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray26 = new java.lang.String[] { "org/mockito/asm/Type", "L667761749", "()V", "V", "L932695130", "L2068771860" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visit((int) (short) 100, 130, "(VZZVZZ)V", "", "g.mockito.asm.Type", strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        label11.info = "C";
        java.lang.String str16 = label11.toString();
        java.lang.String str17 = label11.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.String str19 = label18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        boolean boolean22 = type20.equals((java.lang.Object) label21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        int int25 = type23.getOpcode(5);
        label21.info = 5;
        java.lang.Object obj27 = label21.info;
        java.lang.String str28 = label21.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTryCatchBlock(label11, label18, label21, "L1220550033");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L861755287" + "'", str16, "L861755287");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L861755287" + "'", str17, "L861755287");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L2035382678" + "'", str19, "L2035382678");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 5 + "'", obj27, 5);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L126871107" + "'", str28, "L126871107");
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitMultiANewArrayInsn("L814527759", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1035675070", "org.mockito.asm.Type");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        boolean boolean5 = type3.equals((java.lang.Object) label4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        int int8 = type6.getOpcode(5);
        label4.info = 5;
        java.lang.Object obj10 = label4.info;
        boolean boolean11 = signature2.equals(obj10);
        java.lang.String str12 = signature2.toString();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str16 = signature15.getName();
        java.lang.String str17 = signature15.getName();
        boolean boolean19 = signature15.equals((java.lang.Object) "L919849236");
        java.lang.String str20 = signature15.toString();
        boolean boolean21 = signature2.equals((java.lang.Object) signature15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray22 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 5 + "'", obj10, 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1035675070org.mockito.asm.Type" + "'", str12, "L1035675070org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "void" + "'", str16, "void");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "void" + "'", str17, "void");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "void" + "'", str20, "void");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type15, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(108, type10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor22 = classEmitter4.visitField((-1), "", "", "boolean()Lorg/mockito/asm/Type;", (java.lang.Object) type10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(ZZZZ)Z" + "'", str20, "(ZZZZ)Z");
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(154, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int5 = type4.getSize();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        boolean boolean13 = type4.equals((java.lang.Object) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitOuterClass("L919849236", "L1739346356", "(VZZVZZ)Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMultiANewArrayInsn("L1687456611", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] {};
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("boolean", type21, typeArray27);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str32 = signature31.getName();
        boolean boolean33 = signature28.equals((java.lang.Object) signature31);
        java.lang.String str34 = signature28.toString();
        org.mockito.asm.Type[] typeArray35 = signature28.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitFrame(6, 157, (java.lang.Object[]) typeArray14, (int) (short) 100, (java.lang.Object[]) typeArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "()Z" + "'", str15, "()Z");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str16, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "()Z" + "'", str24, "()Z");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str25, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "void" + "'", str32, "void");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "boolean()Lorg/mockito/asm/Type;" + "'", str34, "boolean()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        boolean boolean13 = type11.equals((java.lang.Object) label12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        int int16 = type14.getOpcode(5);
        label12.info = 5;
        java.lang.Object obj18 = label12.info;
        java.lang.String str19 = label12.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        java.lang.Object obj23 = label20.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("L1365617678", "short", "V", label12, label20, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 104");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 5 + "'", obj18, 5);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1479188015" + "'", str19, "L1479188015");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L924159127" + "'", str22, "L924159127");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("()V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitAnnotation("org.mockito.asm.Type", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.String str16 = label14.toString();
        java.lang.Object obj17 = label14.info;
        java.lang.Object obj18 = label14.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        java.lang.Object obj22 = label19.info;
        java.lang.Object obj23 = label19.info;
        java.lang.Object obj24 = label19.info;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        boolean boolean27 = type25.equals((java.lang.Object) label26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        int int30 = type28.getOpcode(5);
        label26.info = 5;
        java.lang.String str32 = label26.toString();
        java.lang.String str33 = label26.toString();
        org.mockito.asm.Label[] labelArray34 = new org.mockito.asm.Label[] { label14, label19, label26 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitTableSwitchInsn(3, (int) (byte) 10, label11, labelArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1773720950" + "'", str16, "L1773720950");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L100620233" + "'", str21, "L100620233");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L678034641" + "'", str32, "L678034641");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L678034641" + "'", str33, "L678034641");
        org.junit.Assert.assertNotNull(labelArray34);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = localVariablesSorter8.visitParameterAnnotation(156, "L1405890076", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = methodAdapter8.visitAnnotation("L1974286099", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L838408294");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitVarInsn(156, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter5.visitParameterAnnotation((int) (short) 0, "L1405890076", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
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
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter2.visitField(6, "void", "long", "S", (java.lang.Object) "S");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = (-1L);
        int[] intArray19 = new int[] { (byte) -1, 124, (short) -1, 8 };
        org.mockito.asm.Label[] labelArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLookupSwitchInsn(label12, intArray19, labelArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 124, -1, 8]");
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter9.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label11 = null;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        boolean boolean14 = type12.equals((java.lang.Object) label13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        int int17 = type15.getOpcode(5);
        label13.info = 5;
        java.lang.String str19 = label13.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("L1687456611", "L442156004", "void", label11, label13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L112991866" + "'", str19, "L112991866");
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter6.visitParameterAnnotation(108, "Z", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        boolean boolean12 = type10.equals((java.lang.Object) label11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        int int15 = type13.getOpcode(5);
        label11.info = 5;
        java.lang.Object obj17 = label11.info;
        java.lang.String str18 = label11.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        boolean boolean21 = type19.equals((java.lang.Object) label20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        int int24 = type22.getOpcode(5);
        label20.info = 5;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.String str28 = label26.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.String str30 = label29.toString();
        java.lang.String str31 = label29.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.Object obj33 = label32.info;
        java.lang.Object obj34 = label32.info;
        label32.info = "C";
        java.lang.String str37 = label32.toString();
        java.lang.String str38 = label32.toString();
        org.mockito.asm.Label[] labelArray39 = new org.mockito.asm.Label[] { label20, label26, label29, label32 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTableSwitchInsn((int) (byte) -1, (int) 'a', label11, labelArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 5 + "'", obj17, 5);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1565218141" + "'", str18, "L1565218141");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L49034822" + "'", str28, "L49034822");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L176429099" + "'", str30, "L176429099");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L176429099" + "'", str31, "L176429099");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L621689969" + "'", str37, "L621689969");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L621689969" + "'", str38, "L621689969");
        org.junit.Assert.assertNotNull(labelArray39);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitVarInsn(8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitVarInsn(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        java.lang.Object[] objArray9 = null;
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame((int) '#', 124, objArray9, 108, (java.lang.Object[]) typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "()V" + "'", str17, "()V");
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTypeInsn(130, "L442156004");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitFieldInsn(2, "S", "org/mockito/asm/Type", "S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = localVariablesSorter9.visitAnnotation("(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.Object obj14 = label12.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitJumpInsn(0, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMultiANewArrayInsn("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLineNumber((int) (short) 1, label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(104, "L1687456611");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn(124, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter8.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitFieldInsn((int) (short) -1, "S", "L932695130", "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1687456611");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "L1220550033", "L711231962", "Z", "L(ZDZ)Z;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter2.visitMethod(10, "Lorg/mockito/cglib/core/ClassEmitter;", "L92807203", "L1035675070org.mockito.asm.Type", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@69d7f9e6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit((int) 'a', 116, "L1974286099", "C", "L14978671", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("(ZZZZ)Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitIntInsn((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray13 = new java.lang.String[] { "Lorg/mockito/asm/MethodAdapter;", "L1365617678", "", "L14978671" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter4.visitMethod((int) (short) 10, "L14978671", "L1617403293", "(ZDZ)C", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@698749ef");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        label13.info = 130;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        label13.info = wildcardClass19;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitJumpInsn(154, label13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L941547059" + "'", str15, "L941547059");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitIincInsn((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(8, "Lorg/mockito/asm/MethodAdapter;", "L667761749", "long");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitVarInsn(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(156, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = null;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        java.lang.Object obj14 = label11.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitTryCatchBlock(label10, label11, label15, "()C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1887036518" + "'", str16, "L1887036518");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(2, "L1405890076", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        label10.info = "C";
        java.lang.String str15 = label10.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLocalVariable("Z", "L14978671", "L1687456611", label7, label10, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1911005973" + "'", str9, "L1911005973");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L580416371" + "'", str15, "L580416371");
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label12 = null;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        java.lang.Object obj16 = label13.info;
        java.lang.Object obj17 = label13.info;
        java.lang.String str18 = label13.toString();
        java.lang.String str19 = label13.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitLocalVariable("L932695130", "()Z", "L303557794", label12, label13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L374537140" + "'", str15, "L374537140");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L374537140" + "'", str18, "L374537140");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L374537140" + "'", str19, "L374537140");
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitInnerClass("", "L1411121776", "org/mockito/cglib/core/ClassEmitter", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitSource("(ZZZZ)Z", "L838408294");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter2.visitField((int) (short) -1, "org.mockito.asm.MethodAdapter", "char", "boolean()Lorg/mockito/asm/Type;", (java.lang.Object) "Lorg/mockito/cglib/core/ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (short) 100, 154, "Z", "char", "", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str8 = signature7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter20 = classEmitter2.begin_method(116, signature7, typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6b179ef4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(ZDZ)Z" + "'", str8, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ZZZZ)Z" + "'", str19, "(ZZZZ)Z");
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7f539f3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classAdapter21);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("L14978671", "L1739346356");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo18);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        java.lang.Object obj8 = label5.info;
        java.lang.Object obj9 = label5.info;
        java.lang.String str10 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L856815141" + "'", str7, "L856815141");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L856815141" + "'", str10, "L856815141");
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMethodInsn(116, "L1405890076", "L303557794", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(157, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotation("()Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = (-1L);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitJumpInsn((int) (short) 0, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/asm/MethodAdapter;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visit(10, 112, "L442156004", "boolean()Lorg/mockito/asm/Type;", "Lorg/mockito/asm/MethodAdapter;", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "()Z" + "'", str4, "()Z");
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = methodAdapter6.visitAnnotation("hi!(VZZVZZ)V", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        boolean boolean11 = type9.equals((java.lang.Object) label10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        int int14 = type12.getOpcode(5);
        label10.info = 5;
        java.lang.String str16 = label10.toString();
        java.lang.Object obj17 = label10.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber(3, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L290317255" + "'", str16, "L290317255");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 5 + "'", obj17, 5);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        java.lang.String str15 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLineNumber(116, label12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L414897023" + "'", str14, "L414897023");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L414897023" + "'", str15, "L414897023");
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        label14.info = "C";
        java.lang.String str19 = label14.toString();
        java.lang.String str20 = label14.toString();
        java.lang.Object obj21 = label14.info;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.String str23 = label22.toString();
        java.lang.String str24 = label22.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        java.lang.String str27 = label25.toString();
        label25.info = 130;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass31 = type30.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        label25.info = wildcardClass31;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        boolean boolean37 = type35.equals((java.lang.Object) label36);
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        java.lang.String str39 = label38.toString();
        org.mockito.asm.Label[] labelArray40 = new org.mockito.asm.Label[] { label22, label25, label36, label38 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter11.visitTableSwitchInsn(100, (int) '4', label14, labelArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1206693059" + "'", str19, "L1206693059");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1206693059" + "'", str20, "L1206693059");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "C" + "'", obj21, "C");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L587394668" + "'", str23, "L587394668");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L587394668" + "'", str24, "L587394668");
        org.junit.Assert.assertNull(obj26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L845555950" + "'", str27, "L845555950");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L2073164866" + "'", str39, "L2073164866");
        org.junit.Assert.assertNotNull(labelArray40);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("void", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        label7.info = "C";
        java.lang.String str12 = label7.toString();
        java.lang.String str13 = label7.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.String str16 = label14.toString();
        java.lang.Object obj17 = label14.info;
        java.lang.Object obj18 = label14.info;
        java.lang.Object obj19 = label14.info;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.String str21 = label20.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label14, label20, "(ZDZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1319169868" + "'", str12, "L1319169868");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1319169868" + "'", str13, "L1319169868");
        org.junit.Assert.assertNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L479386250" + "'", str16, "L479386250");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1985982698" + "'", str21, "L1985982698");
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(104, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitMaxs(153, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray14 = new java.lang.String[] { "char" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classAdapter8.visitMethod((int) (short) 0, "()V", "S", "L14978671", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn((int) '4', "int", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(96, "Lhi!;", (org.mockito.asm.MethodVisitor) localVariablesSorter10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        boolean boolean5 = type3.equals((java.lang.Object) label4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        int int8 = type6.getOpcode(5);
        label4.info = 5;
        java.lang.String str10 = label4.toString();
        java.lang.Object obj11 = label4.info;
        int[] intArray14 = new int[] { 154, (short) 10 };
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.String str17 = label15.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        java.lang.Object obj21 = label18.info;
        java.lang.Object obj22 = label18.info;
        java.lang.Object obj23 = label18.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.String str26 = label24.toString();
        java.lang.Object obj27 = label24.info;
        java.lang.Object obj28 = label24.info;
        java.lang.Object obj29 = label24.info;
        java.lang.String str30 = label24.toString();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        java.lang.Object obj32 = label31.info;
        java.lang.Object obj33 = label31.info;
        java.lang.Object obj34 = label31.info;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.Object obj38 = label37.info;
        java.lang.String str39 = label37.toString();
        java.lang.Object obj40 = label37.info;
        java.lang.Object obj41 = label37.info;
        java.lang.String str42 = label37.toString();
        org.mockito.asm.Label[] labelArray43 = new org.mockito.asm.Label[] { label15, label18, label24, label31, label35, label37 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLookupSwitchInsn(label4, intArray14, labelArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L970965840" + "'", str10, "L970965840");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 5 + "'", obj11, 5);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[154, 10]");
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1937667892" + "'", str17, "L1937667892");
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1635196924" + "'", str20, "L1635196924");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1275264085" + "'", str26, "L1275264085");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1275264085" + "'", str30, "L1275264085");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L184574918" + "'", str39, "L184574918");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L184574918" + "'", str42, "L184574918");
        org.junit.Assert.assertNotNull(labelArray43);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitSource("(VZZVZZ)V", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        label11.info = "C";
        java.lang.String str16 = label11.toString();
        java.lang.String str17 = label11.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        label18.info = 130;
        label18.info = "L822822720";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLocalVariable("L1471807529", "L838408294", "L92807203", label11, label18, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L365842250" + "'", str16, "L365842250");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L365842250" + "'", str17, "L365842250");
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L771781362" + "'", str20, "L771781362");
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        boolean boolean9 = signature7.equals((java.lang.Object) "org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type[] typeArray10 = signature7.getArgumentTypes();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        java.lang.String str20 = type16.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("boolean", type24, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type16, typeArray30);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame(112, 96, (java.lang.Object[]) typeArray10, 108, (java.lang.Object[]) typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "()V" + "'", str19, "()V");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V" + "'", str20, "V");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "()Z" + "'", str27, "()Z");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str28, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(128, "", (org.mockito.asm.MethodVisitor) localVariablesSorter11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor13 = localVariablesSorter8.visitParameterAnnotation((int) '4', "()C", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        label8.info = 130;
        java.lang.String str13 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2101339879" + "'", str10, "L2101339879");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L2101339879" + "'", str13, "L2101339879");
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        label0.info = "C";
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        label0.info = "L680829613";
        // The following exception was thrown during execution in test generation
        try {
            int int9 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L709082144" + "'", str5, "L709082144");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L709082144" + "'", str6, "L709082144");
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter5.visitField(112, "hi!(VZZVZZ)V", "L1220550033", "L(ZDZ)Z;", (java.lang.Object) "L303557794");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.String str9 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(7, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1777887197" + "'", str9, "L1777887197");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("g.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter10.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (byte) 100, 100, "boolean", "L407651636", "L1411121776", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitAnnotation("L(ZDZ)Z;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type7, type9 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(108, type2);
        org.mockito.asm.Type type14 = local13.getType();
        org.mockito.asm.Type type15 = local13.getType();
        org.mockito.asm.Type type16 = local13.getType();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        boolean boolean21 = signature19.equals((java.lang.Object) "org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("(VZZVZZ)Lorg/mockito/asm/Type;", type16, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(VZZVZZ)Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(ZZZZ)Z" + "'", str12, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] {};
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        org.mockito.asm.Type type23 = type18.getElementType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type32.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSize();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type34, type36 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type29, type40, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type48.getSize();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSize();
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type48, type50, type52, type54 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray56);
        org.mockito.cglib.core.Local local58 = new org.mockito.cglib.core.Local(108, type47);
        org.mockito.asm.Type type59 = local58.getType();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int64 = type63.getSize();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int66 = type65.getSize();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int68 = type67.getSize();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int70 = type69.getSize();
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type63, type65, type67, type69 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray71);
        org.mockito.cglib.core.Local local73 = new org.mockito.cglib.core.Local(108, type62);
        org.mockito.asm.Type type74 = local73.getType();
        int int75 = type74.getSize();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int77 = type76.getSize();
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type25, type27, type59, type60, type74, type76 };
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray78);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray78);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter81 = classEmitter5.begin_method((int) (byte) -1, signature13, typeArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1a83b148");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "()Z" + "'", str21, "()Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str22, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(ZZZZ)Z" + "'", str39, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(ZDZ)Z" + "'", str44, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(ZDZ)Z" + "'", str45, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(ZZZZ)Z" + "'", str57, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(ZZZZ)Z" + "'", str72, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(VZZVZZ)V" + "'", str79, "(VZZVZZ)V");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(VZZVZZ)Lorg/mockito/asm/Type;" + "'", str80, "(VZZVZZ)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1365617678", "L1974286099");
        boolean boolean4 = signature2.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitMultiANewArrayInsn("L814527759", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Object obj13 = label11.info;
        label11.info = "C";
        java.lang.String str16 = label11.toString();
        java.lang.String str17 = label11.toString();
        java.lang.Object obj18 = label11.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitJumpInsn(5, label11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1758948591" + "'", str16, "L1758948591");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1758948591" + "'", str17, "L1758948591");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "C" + "'", obj18, "C");
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit((int) (byte) -1, 153, "short", "", "L680829613", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitMaxs(100, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray9);
        org.mockito.asm.Type type12 = type7.getElementType();
        java.lang.Object[] objArray13 = new java.lang.Object[] { type7 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.Type[] typeArray20 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(127, 157, objArray13, (int) (short) 0, (java.lang.Object[]) typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "()Z" + "'", str10, "()Z");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str11, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[Lorg/mockito/asm/Type;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[Lorg/mockito/asm/Type;]");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "()V" + "'", str21, "()V");
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.String str15 = label14.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.String str18 = label16.toString();
        java.lang.Object obj19 = label16.info;
        java.lang.Object obj20 = label16.info;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        boolean boolean23 = type21.equals((java.lang.Object) label22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        int int26 = type24.getOpcode(5);
        label22.info = 5;
        java.lang.String str28 = label22.toString();
        java.lang.String str29 = label22.toString();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.String str32 = label30.toString();
        label30.info = 130;
        label30.info = "L822822720";
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] { label16, label22, label30 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitTableSwitchInsn((int) 'a', 130, label14, labelArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1237534347" + "'", str15, "L1237534347");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1689814737" + "'", str18, "L1689814737");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L936620750" + "'", str28, "L936620750");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L936620750" + "'", str29, "L936620750");
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L312672957" + "'", str32, "L312672957");
        org.junit.Assert.assertNotNull(labelArray37);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn(155, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitOuterClass("L1411121776", "", "L92807203");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type18, type20 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type13, type24, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray27);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(10, type12);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitLdcInsn((java.lang.Object) local29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(ZZZZ)Z" + "'", str23, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(ZDZ)Z" + "'", str28, "(ZDZ)Z");
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        java.lang.Object obj13 = label10.info;
        java.lang.Object obj14 = label10.info;
        java.lang.String str15 = label10.toString();
        java.lang.String str16 = label10.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn(100, label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1457986756" + "'", str12, "L1457986756");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1457986756" + "'", str15, "L1457986756");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1457986756" + "'", str16, "L1457986756");
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitIincInsn(156, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(108, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        java.lang.Object obj11 = label8.info;
        java.lang.Object obj12 = label8.info;
        java.lang.String str13 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(104, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1479072879" + "'", str10, "L1479072879");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1479072879" + "'", str13, "L1479072879");
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.asm.MethodAdapter methodAdapter13 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter14 = new org.mockito.cglib.core.LocalVariablesSorter(97, "L1411121776", (org.mockito.asm.MethodVisitor) methodAdapter13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = (-1L);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        java.lang.String str14 = label12.toString();
        label12.info = 130;
        java.lang.String str17 = label12.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label9, label12, "J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L389620449" + "'", str11, "L389620449");
        org.junit.Assert.assertNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1566322007" + "'", str14, "L1566322007");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1566322007" + "'", str17, "L1566322007");
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "L919849236" };
        // The following exception was thrown during execution in test generation
        try {
            classAdapter5.visit(127, 124, "L1283204962", "L1405890076", "L838408294", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type12, type23, type24 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type37.getSize();
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type35, type37 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray39);
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(108, type30);
        org.mockito.asm.Type type42 = local41.getType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSize();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type48.getSize();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type52.getSize();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type46, type48, type50, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray54);
        org.mockito.cglib.core.Local local56 = new org.mockito.cglib.core.Local(108, type45);
        org.mockito.asm.Type type57 = local56.getType();
        int int58 = type57.getSize();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type59.getSize();
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type8, type10, type42, type43, type57, type59 };
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray61);
        java.lang.String str63 = type7.getClassName();
        int int64 = type7.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor65 = classEmitter2.visitField(112, "(VZZVZZ)Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "g.mockito.asm.Type", (java.lang.Object) int64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(ZZZZ)Z" + "'", str22, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(ZDZ)Z" + "'", str27, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(ZDZ)Z" + "'", str28, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(ZZZZ)Z" + "'", str40, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(ZZZZ)Z" + "'", str55, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(VZZVZZ)V" + "'", str62, "(VZZVZZ)V");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "void" + "'", str63, "void");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter4.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn(154, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray23 = new java.lang.String[] { "L303557794", "org.mockito.asm.MethodAdapter", "org.mockito.asm.MethodAdapter", "int" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor24 = classEmitter14.visitMethod(112, "(ZDZ)C", "(ZZZZ)Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;(VZZVZZ)V", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(ZDZ)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIntInsn((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        java.lang.String str13 = label10.toString();
        int[] intArray17 = new int[] { 8, 1, (byte) 1 };
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label10, intArray17, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1883653714" + "'", str12, "L1883653714");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1883653714" + "'", str13, "L1883653714");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[8, 1, 1]");
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitInsn(108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn((int) (byte) 0, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn((-1), "char", "", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter2.visitField(126, "()C", "org/mockito/cglib/core/ClassEmitter", "C", (java.lang.Object) classEmitter12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTypeInsn(155, "L1283204962");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = classEmitter11.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        boolean boolean12 = signature10.equals((java.lang.Object) "org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type[] typeArray13 = signature10.getArgumentTypes();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str18 = signature17.getName();
        java.lang.String str19 = signature17.getName();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(0, 156, (java.lang.Object[]) typeArray13, 155, (java.lang.Object[]) typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
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
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        boolean boolean12 = type10.equals((java.lang.Object) label11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        int int15 = type13.getOpcode(5);
        label11.info = 5;
        java.lang.Object obj17 = null;
        label11.info = obj17;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        java.lang.Object obj22 = label19.info;
        java.lang.Object obj23 = label19.info;
        java.lang.Object obj24 = label19.info;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        java.lang.String str27 = label25.toString();
        label19.info = str27;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("Z", "org/mockito/asm/Type", "()C", label11, label19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1614092921" + "'", str21, "L1614092921");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L575762455" + "'", str27, "L575762455");
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitInnerClass("L814527759", "g.mockito.asm.Type", "g.mockito.asm.Type", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type11.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type15, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type10, type21, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray24);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(10, type9);
        org.mockito.asm.Type type27 = local26.getType();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) type27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(ZZZZ)Z" + "'", str20, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(ZDZ)Z" + "'", str25, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type27);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitMultiANewArrayInsn("L1471807529", 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitOuterClass("boolean()Lorg/mockito/asm/Type;", "C", "hi!(VZZVZZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Object obj11 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitJumpInsn((int) '#', label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter7.visitAnnotation("org/mockito/asm/MethodAdapter", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter3.visitInnerClass("org/mockito/asm/MethodAdapter", "boolean", "L1220550033", 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        java.lang.String str15 = signature12.getDescriptor();
        java.lang.String str16 = signature12.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("boolean", type20, typeArray26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str31 = signature30.getName();
        boolean boolean32 = signature27.equals((java.lang.Object) signature30);
        java.lang.String str33 = signature27.toString();
        org.mockito.asm.Type[] typeArray34 = signature27.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter35 = classEmitter5.begin_method((int) (short) 1, signature12, typeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@243045bb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(ZDZ)Z" + "'", str15, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ZDZ)Z" + "'", str16, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()Z" + "'", str23, "()Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str24, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "void" + "'", str31, "void");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "boolean()Lorg/mockito/asm/Type;" + "'", str33, "boolean()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitOuterClass("Lhi!;", "V", "L838408294");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter5.visitParameterAnnotation(126, "org/mockito/asm/MethodAdapter", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn((int) (short) 1, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str13 = signature12.getName();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        java.lang.String str15 = signature12.toString();
        org.mockito.asm.Type type16 = signature12.getReturnType();
        org.mockito.asm.Type[] typeArray17 = signature12.getArgumentTypes();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type29, type31 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSize();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type24, type35, type36 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSize();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int50 = type49.getSize();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type43, type45, type47, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray51);
        org.mockito.cglib.core.Local local53 = new org.mockito.cglib.core.Local(108, type42);
        org.mockito.asm.Type type54 = local53.getType();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int59 = type58.getSize();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int61 = type60.getSize();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int63 = type62.getSize();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int65 = type64.getSize();
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type58, type60, type62, type64 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray66);
        org.mockito.cglib.core.Local local68 = new org.mockito.cglib.core.Local(108, type57);
        org.mockito.asm.Type type69 = local68.getType();
        int int70 = type69.getSize();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int72 = type71.getSize();
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type20, type22, type54, type55, type69, type71 };
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray73);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(1, (int) 'a', (java.lang.Object[]) typeArray17, 5, (java.lang.Object[]) typeArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(ZDZ)Z" + "'", str15, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(ZZZZ)Z" + "'", str34, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(ZDZ)Z" + "'", str39, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(ZDZ)Z" + "'", str40, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(ZZZZ)Z" + "'", str52, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(ZZZZ)Z" + "'", str67, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(VZZVZZ)V" + "'", str74, "(VZZVZZ)V");
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Object obj10 = label8.info;
        label8.info = "C";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        java.lang.Object obj11 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1046224284" + "'", str10, "L1046224284");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(157, "()V", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(14, "void");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label8 = null;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.Object obj12 = label9.info;
        java.lang.Object obj13 = label9.info;
        java.lang.Object obj14 = label9.info;
        java.lang.String str15 = label9.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.Object obj18 = label16.info;
        java.lang.Object obj19 = label16.info;
        java.lang.Object obj20 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter7.visitTryCatchBlock(label8, label9, label16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L187409171" + "'", str11, "L187409171");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L187409171" + "'", str15, "L187409171");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter(classVisitor9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter12);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter12.visitInnerClass("L2068771860", "L1644355547", "(ZZZZ)Z", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn((int) 'a', "L1644355547", "", "L1471807529");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter12.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn(14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIincInsn((int) (short) 100, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("Lhi!;", "(ZZZZ)Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIntInsn((int) (byte) -1, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(0, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitTypeInsn(153, "L1405890076");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(104, "L1617403293", "org/mockito/asm/Type", "(ZDZ)J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSize();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type10, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        java.lang.String str20 = type9.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classAdapter3.visitField(154, "(VZZVZZ)Lorg/mockito/asm/MethodAdapter;", "", "Lhi!;", (java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ZZZZ)Z" + "'", str19, "(ZZZZ)Z");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIntInsn(9, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitMaxs(14, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitInsn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter5.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@67e302ec");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.Object obj4 = label3.info;
        java.lang.String str5 = label3.toString();
        label3.info = 130;
        java.lang.Object obj8 = label3.info;
        int[] intArray15 = new int[] { 4, (short) 1, 1, 127, 156, (byte) 10 };
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.String str18 = label16.toString();
        java.lang.Object obj19 = label16.info;
        java.lang.Object obj20 = label16.info;
        java.lang.String str21 = label16.toString();
        java.lang.String str22 = label16.toString();
        org.mockito.asm.Label[] labelArray23 = new org.mockito.asm.Label[] { label16 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray15, labelArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L266774666" + "'", str5, "L266774666");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 130 + "'", obj8, 130);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[4, 1, 1, 127, 156, 10]");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1537637468" + "'", str18, "L1537637468");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1537637468" + "'", str21, "L1537637468");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1537637468" + "'", str22, "L1537637468");
        org.junit.Assert.assertNotNull(labelArray23);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = classEmitter5.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = signature11.getReturnType();
        java.lang.String str14 = signature11.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        java.lang.String str19 = type17.getDescriptor();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(153, type17);
        java.lang.String str21 = type17.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type23, type25, type27, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("L1687456611", type17, typeArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter34 = classEmitter7.begin_method(1, signature11, typeArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@36900f08");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(ZDZ)Z" + "'", str14, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "J" + "'", str18, "J");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "J" + "'", str19, "J");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "J" + "'", str21, "J");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(ZZZZ)Z" + "'", str32, "(ZZZZ)Z");
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(130, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        boolean boolean13 = type11.equals((java.lang.Object) label12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        int int16 = type14.getOpcode(5);
        label12.info = 5;
        java.lang.Object obj18 = null;
        label12.info = obj18;
        int[] intArray26 = new int[] { (short) 100, 96, 156, 96, 'a', 158 };
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.Object obj30 = label29.info;
        java.lang.String str31 = label29.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.Object obj33 = label32.info;
        java.lang.Object obj34 = label32.info;
        label32.info = "C";
        java.lang.String str37 = label32.toString();
        java.lang.Object obj38 = null;
        label32.info = obj38;
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        java.lang.String str42 = label40.toString();
        java.lang.Object obj43 = label40.info;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        java.lang.Object obj45 = label44.info;
        java.lang.Object obj46 = label44.info;
        label44.info = "C";
        java.lang.String str49 = label44.toString();
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] { label27, label29, label32, label40, label44 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label12, intArray26, labelArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 96, 156, 96, 97, 158]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L63873746" + "'", str31, "L63873746");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L238456346" + "'", str37, "L238456346");
        org.junit.Assert.assertNull(obj41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1657424138" + "'", str42, "L1657424138");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L1093690141" + "'", str49, "L1093690141");
        org.junit.Assert.assertNotNull(labelArray50);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = (-1L);
        java.lang.Object obj9 = label6.info;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("hi!(VZZVZZ)V", "L919849236", "L1411121776", label6, label10, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        java.lang.String str9 = label7.toString();
        int[] intArray16 = new int[] { (byte) 1, 124, 96, 14, 3, 155 };
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = (-1L);
        java.lang.Object obj20 = label17.info;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        boolean boolean23 = type21.equals((java.lang.Object) label22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        int int26 = type24.getOpcode(5);
        label22.info = 5;
        java.lang.String str28 = label22.toString();
        java.lang.Object obj29 = label22.info;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        boolean boolean32 = type30.equals((java.lang.Object) label31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        int int35 = type33.getOpcode(5);
        label31.info = 5;
        java.lang.Object obj37 = label31.info;
        org.mockito.asm.Label[] labelArray38 = new org.mockito.asm.Label[] { label17, label22, label31 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitLookupSwitchInsn(label7, intArray16, labelArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L339344465" + "'", str8, "L339344465");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L339344465" + "'", str9, "L339344465");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 124, 96, 14, 3, 155]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L365278374" + "'", str28, "L365278374");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 5 + "'", obj29, 5);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 5 + "'", obj37, 5);
        org.junit.Assert.assertNotNull(labelArray38);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("L1094307244", "L711231962", "L407651636");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitIincInsn((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 0, "Lhi!;", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        java.lang.Object obj14 = label11.info;
        java.lang.Object obj15 = label11.info;
        java.lang.Object obj16 = label11.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.String str23 = label22.toString();
        java.lang.String str24 = label22.toString();
        org.mockito.asm.Label[] labelArray25 = new org.mockito.asm.Label[] { label17, label19, label22 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTableSwitchInsn(0, (int) (short) 1, label11, labelArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L494303510" + "'", str13, "L494303510");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L692085220" + "'", str21, "L692085220");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1362633690" + "'", str23, "L1362633690");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1362633690" + "'", str24, "L1362633690");
        org.junit.Assert.assertNotNull(labelArray25);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] {};
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("boolean", type9, typeArray15);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str20 = signature19.getName();
        boolean boolean21 = signature16.equals((java.lang.Object) signature19);
        java.lang.String str22 = signature16.toString();
        org.mockito.asm.Type type23 = signature16.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("boolean", type27, typeArray33);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str38 = signature37.getName();
        boolean boolean39 = signature34.equals((java.lang.Object) signature37);
        java.lang.String str40 = signature34.toString();
        org.mockito.asm.Type type41 = signature34.getReturnType();
        org.mockito.asm.Type[] typeArray42 = signature34.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter43 = classEmitter3.begin_method((int) (short) 0, signature16, typeArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@79a4a616");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "()Z" + "'", str12, "()Z");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str13, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "void" + "'", str20, "void");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean()Lorg/mockito/asm/Type;" + "'", str22, "boolean()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "()Z" + "'", str30, "()Z");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str31, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "void" + "'", str38, "void");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "boolean()Lorg/mockito/asm/Type;" + "'", str40, "boolean()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter(methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(8, "L407651636", (org.mockito.asm.MethodVisitor) localVariablesSorter11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = localVariablesSorter10.visitParameterAnnotation((int) '4', "int", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        label9.info = 130;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        label9.info = wildcardClass15;
        java.lang.Object obj19 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L447219085" + "'", str11, "L447219085");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class org.mockito.asm.Type");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class org.mockito.asm.Type");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class org.mockito.asm.Type");
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        label10.info = 130;
        label10.info = "L822822720";
        int[] intArray23 = new int[] { 15, 127, 124, 'a', 15, (byte) -1 };
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.String str26 = label24.toString();
        label24.info = 130;
        java.lang.String str29 = label24.toString();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.String str32 = label30.toString();
        java.lang.Object obj33 = label30.info;
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        java.lang.Object obj35 = label34.info;
        java.lang.String str36 = label34.toString();
        java.lang.Object obj37 = label34.info;
        java.lang.Object obj38 = label34.info;
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        java.lang.Object obj40 = label39.info;
        java.lang.Object obj41 = label39.info;
        java.lang.Object obj42 = label39.info;
        java.lang.Object obj43 = label39.info;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        java.lang.Object obj45 = label44.info;
        java.lang.Object obj46 = label44.info;
        label44.info = "C";
        java.lang.String str49 = label44.toString();
        java.lang.String str50 = label44.toString();
        org.mockito.asm.Label label51 = new org.mockito.asm.Label();
        java.lang.Object obj52 = label51.info;
        java.lang.String str53 = label51.toString();
        java.lang.Object obj54 = label51.info;
        java.lang.Object obj55 = label51.info;
        java.lang.String str56 = label51.toString();
        java.lang.String str57 = label51.toString();
        org.mockito.asm.Label[] labelArray58 = new org.mockito.asm.Label[] { label24, label30, label34, label39, label44, label51 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label10, intArray23, labelArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1319249480" + "'", str12, "L1319249480");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[15, 127, 124, 97, 15, -1]");
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L754319527" + "'", str26, "L754319527");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L754319527" + "'", str29, "L754319527");
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L448468764" + "'", str32, "L448468764");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L2034439373" + "'", str36, "L2034439373");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L638385611" + "'", str49, "L638385611");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L638385611" + "'", str50, "L638385611");
        org.junit.Assert.assertNull(obj52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L979579541" + "'", str53, "L979579541");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L979579541" + "'", str56, "L979579541");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "L979579541" + "'", str57, "L979579541");
        org.junit.Assert.assertNotNull(labelArray58);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitFieldInsn(124, "L1035675070", "L14978671", "(ZDZ)J");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.String str11 = label10.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLabel(label10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1089174171" + "'", str11, "L1089174171");
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("void", "");
        java.lang.String str13 = signature12.getName();
        java.lang.String str14 = signature12.toString();
        java.lang.String str15 = signature12.getName();
        java.lang.String str16 = signature12.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type22, type24, type26 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(108, type19);
        java.lang.Class<?> wildcardClass31 = type19.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        int int33 = type32.getSize();
        java.lang.String str34 = type32.getClassName();
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str38 = signature37.getDescriptor();
        org.mockito.asm.Type[] typeArray39 = signature37.getArgumentTypes();
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Z", type32, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter41 = classEmitter8.begin_method(97, signature12, typeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@8fdd48a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "void" + "'", str13, "void");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "void" + "'", str14, "void");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "void" + "'", str15, "void");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "void" + "'", str16, "void");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(ZZZZ)Z" + "'", str29, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.mockito.asm.Type" + "'", str34, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(ZDZ)Z" + "'", str38, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitMultiANewArrayInsn("L14978671", 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("boolean", 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter4.visitTypeInsn((int) ' ', "L814527759");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter10.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type3);
        java.lang.Class<?> wildcardClass15 = type3.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        label0.info = type16;
        java.lang.Object obj18 = label0.info;
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter(classVisitor19);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        label0.info = classEmitter21;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = classEmitter21.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(ZZZZ)Z" + "'", str13, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo25);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        java.lang.String str13 = label10.toString();
        int[] intArray19 = new int[] { 10, 157, 'a', (short) -1, 126 };
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSize();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local(108, type23);
        java.lang.Class<?> wildcardClass35 = type23.getClass();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        label20.info = type36;
        java.lang.Object obj38 = label20.info;
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        java.lang.Object obj40 = label39.info;
        java.lang.String str41 = label39.toString();
        java.lang.Object obj42 = label39.info;
        java.lang.Object obj43 = label39.info;
        java.lang.Object obj44 = label39.info;
        java.lang.String str45 = label39.toString();
        org.mockito.asm.Label[] labelArray46 = new org.mockito.asm.Label[] { label20, label39 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitLookupSwitchInsn(label10, intArray19, labelArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1755351278" + "'", str12, "L1755351278");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1755351278" + "'", str13, "L1755351278");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 157, 97, -1, 126]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(ZZZZ)Z" + "'", str33, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(obj40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L1539441410" + "'", str41, "L1539441410");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L1539441410" + "'", str45, "L1539441410");
        org.junit.Assert.assertNotNull(labelArray46);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type2, type4, type6, type8 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray10);
        java.lang.String str12 = type1.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getReturnType("(ZZZZ)Z");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type19, type21, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type28.getSize();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type16, type27, type28 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray30);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type38.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type42.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type44.getSize();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type42, type44 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray46);
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local(108, type37);
        org.mockito.asm.Type type49 = local48.getType();
        boolean boolean50 = type35.equals((java.lang.Object) local48);
        java.lang.String str51 = type35.getClassName();
        boolean boolean52 = type1.equals((java.lang.Object) type35);
        java.lang.String str53 = type35.getClassName();
        org.mockito.asm.Type[] typeArray54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type35, typeArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(ZZZZ)Z" + "'", str11, "(ZZZZ)Z");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(ZZZZ)Z" + "'", str26, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZDZ)Z" + "'", str31, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(ZDZ)Z" + "'", str32, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(ZDZ)Z" + "'", str33, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(ZZZZ)Z" + "'", str47, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(9, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitInsn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(127, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFieldInsn((int) (short) 0, "()Lorg/mockito/asm/Type;", "(ZZZZ)Z", "(VZZVZZ)Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        boolean boolean16 = type14.equals((java.lang.Object) label15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        int int19 = type17.getOpcode(5);
        label15.info = 5;
        java.lang.String str21 = label15.toString();
        java.lang.String str22 = label15.toString();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.Object obj25 = label23.info;
        label23.info = "C";
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.String str30 = label28.toString();
        label28.info = 130;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        label28.info = wildcardClass34;
        java.lang.String str38 = label28.toString();
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        java.lang.Object obj40 = label39.info;
        java.lang.String str41 = label39.toString();
        label39.info = 130;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        java.lang.Object obj45 = label44.info;
        java.lang.String str46 = label44.toString();
        java.lang.Object obj47 = label44.info;
        java.lang.Object obj48 = label44.info;
        java.lang.Object obj49 = label44.info;
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] { label23, label28, label39, label44 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter11.visitTableSwitchInsn(127, 0, label15, labelArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1353718351" + "'", str21, "L1353718351");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1353718351" + "'", str22, "L1353718351");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L2037146560" + "'", str30, "L2037146560");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L2037146560" + "'", str38, "L2037146560");
        org.junit.Assert.assertNull(obj40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L368923260" + "'", str41, "L368923260");
        org.junit.Assert.assertNull(obj45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L1036256226" + "'", str46, "L1036256226");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(labelArray50);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        java.lang.String str12 = signature11.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitLdcInsn((java.lang.Object) str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/asm/Type;(VZZVZZ)V" + "'", str12, "Lorg/mockito/asm/Type;(VZZVZZ)V");
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(108, type12);
        java.lang.Class<?> wildcardClass24 = type12.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        label9.info = type25;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        java.lang.String str29 = label27.toString();
        java.lang.Object obj30 = label27.info;
        java.lang.Object obj31 = label27.info;
        java.lang.String str32 = label27.toString();
        java.lang.String str33 = label27.toString();
        org.mockito.asm.Label label34 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter8.visitTryCatchBlock(label9, label27, label34, "L442156004");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(ZZZZ)Z" + "'", str22, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L3340204" + "'", str29, "L3340204");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L3340204" + "'", str32, "L3340204");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L3340204" + "'", str33, "L3340204");
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "L1974286099", "org/mockito/asm/Type", "S", "org/mockito/asm/MethodAdapter", "(ZZZZ)Z" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter4.visitMethod(0, "L838408294", "Lorg/mockito/cglib/core/ClassEmitter;", "V", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4e6e8510");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitVarInsn(0, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter5.visitOuterClass("Lorg/mockito/asm/Type;(VZZVZZ)V", "L667761749", "()Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter9.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(158, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter8 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter9.visitInsn(108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type4.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type6.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type8, type10 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(108, type3);
        java.lang.Class<?> wildcardClass15 = type3.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        label0.info = type16;
        java.lang.Object obj18 = label0.info;
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter(classVisitor19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter(classVisitor19);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        label0.info = classEmitter21;
        java.lang.String[] strArray38 = new java.lang.String[] { "L1220550033", "char", "long", "hi!", "(ZZZZ)Lorg/mockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor39 = classEmitter21.visitMethod(96, "g.mockito.asm.Type", "(ZDZ)Z", "(VZZVZZ)Lorg/mockito/asm/Type;", strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6611b80e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(ZZZZ)Z" + "'", str13, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type8.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type14.getSize();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type12, type14 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(108, type7);
        java.lang.Class<?> wildcardClass19 = type7.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classAdapter1.visitField(15, "L1644355547", "void", "L1035675070", (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(ZZZZ)Z" + "'", str17, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str20, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = methodAdapter7.visitAnnotation("(ZDZ)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) "L680829613");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classAdapter8.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Object obj12 = label10.info;
        java.lang.Object obj13 = label10.info;
        java.lang.Object obj14 = label10.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSize();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(108, type18);
        java.lang.Class<?> wildcardClass30 = type18.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        label15.info = type31;
        java.lang.Object obj33 = label15.info;
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter(classVisitor34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter(classVisitor34);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        label15.info = classEmitter36;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        label44.info = (-1L);
        java.lang.Object obj47 = label44.info;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label49 = new org.mockito.asm.Label();
        boolean boolean50 = type48.equals((java.lang.Object) label49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        int int53 = type51.getOpcode(5);
        label49.info = 5;
        java.lang.Object obj55 = label49.info;
        java.lang.String str56 = label49.toString();
        org.mockito.asm.Label label57 = new org.mockito.asm.Label();
        java.lang.Object obj58 = label57.info;
        java.lang.String str59 = label57.toString();
        java.lang.Object obj60 = label57.info;
        java.lang.Object obj61 = label57.info;
        java.lang.String str62 = label57.toString();
        java.lang.String str63 = label57.toString();
        org.mockito.asm.Label label64 = new org.mockito.asm.Label();
        java.lang.Object obj65 = label64.info;
        java.lang.String str66 = label64.toString();
        java.lang.Object obj67 = label64.info;
        java.lang.Object obj68 = label64.info;
        java.lang.Object obj69 = label64.info;
        org.mockito.asm.Label label70 = new org.mockito.asm.Label();
        java.lang.Object obj71 = label70.info;
        java.lang.String str72 = label70.toString();
        label64.info = str72;
        org.mockito.asm.Label[] labelArray74 = new org.mockito.asm.Label[] { label15, label44, label49, label57, label64 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitTableSwitchInsn(127, 0, label10, labelArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(ZZZZ)Z" + "'", str28, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 5 + "'", obj55, 5);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L1591273413" + "'", str56, "L1591273413");
        org.junit.Assert.assertNull(obj58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "L1059173457" + "'", str59, "L1059173457");
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "L1059173457" + "'", str62, "L1059173457");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "L1059173457" + "'", str63, "L1059173457");
        org.junit.Assert.assertNull(obj65);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L457122284" + "'", str66, "L457122284");
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "L1847889183" + "'", str72, "L1847889183");
        org.junit.Assert.assertNotNull(labelArray74);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.asm.MethodAdapter methodAdapter11 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter8);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(VZZVZZ)V");
        org.mockito.asm.Type type16 = signature15.getReturnType();
        org.mockito.asm.Type[] typeArray18 = org.mockito.asm.Type.getArgumentTypes("()Z");
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        java.lang.String str20 = type16.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] {};
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.asm.Type.getArgumentTypes("()Z");
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("boolean", type24, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type16, typeArray30);
        java.lang.String str33 = signature32.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter8.visitLdcInsn((java.lang.Object) str33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "()V" + "'", str19, "()V");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "V" + "'", str20, "V");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "()Z" + "'", str27, "()Z");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str28, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "()V" + "'", str33, "()V");
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray1 = new org.mockito.asm.Type[] {};
        java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) ' ', type4);
        int int6 = type4.getSort();
        boolean boolean7 = type0.equals((java.lang.Object) int6);
        int int8 = type0.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "()Z" + "'", str2, "()Z");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray24 = new java.lang.String[] { "L2068771860", "(ZDZ)Z", "L1283204962", "L1617403293", "(ZZZZ)Z" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(15, 9, "()C", "org.mockito.asm.MethodAdapter", "long", strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(108, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.asm.MethodAdapter methodAdapter7 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn((int) (byte) 0, "()V", "L442156004", "L303557794");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        int[] intArray13 = new int[] { 5, 10, 127, 1, (short) 1 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Object obj16 = label14.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        java.lang.Object obj19 = label18.info;
        java.lang.String str20 = label18.toString();
        label18.info = 130;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        label18.info = wildcardClass24;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        boolean boolean30 = type28.equals((java.lang.Object) label29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        int int33 = type31.getOpcode(5);
        label29.info = 5;
        java.lang.Object obj35 = label29.info;
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.Object obj37 = label36.info;
        java.lang.String str38 = label36.toString();
        java.lang.Object obj39 = label36.info;
        org.mockito.asm.Label[] labelArray40 = new org.mockito.asm.Label[] { label14, label17, label18, label29, label36 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label7, intArray13, labelArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[5, 10, 127, 1, 1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L343989369" + "'", str20, "L343989369");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 5 + "'", obj35, 5);
        org.junit.Assert.assertNull(obj37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L837285482" + "'", str38, "L837285482");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(labelArray40);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter(classVisitor5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter(classVisitor5);
        classEmitter2.setTarget(classVisitor5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("L407651636", "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitIincInsn(14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitMethodInsn(104, "L442156004", "L838408294", "org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter5.visitField(0, "", "(ZZZZ)Z", "", (java.lang.Object) classEmitter15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "L1035675070org.mockito.asm.Type", "L1404759413", "L1035675070org.mockito.asm.Type" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter4.visitMethod(126, "org.mockito.asm.MethodAdapter", "(VZZVZZ)I", "()Z", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7146a026");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter12.visitIntInsn(8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.asm.MethodAdapter methodAdapter13 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitLdcInsn((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter4.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMultiANewArrayInsn("org/mockito/cglib/core/ClassEmitter", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs((int) (short) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitTypeInsn((int) (short) 0, "L711231962");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(108, type12);
        java.lang.Class<?> wildcardClass24 = type12.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        int int26 = type25.getSize();
        java.lang.String str27 = type25.getClassName();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", "(ZDZ)Z");
        java.lang.String str31 = signature30.getDescriptor();
        org.mockito.asm.Type[] typeArray32 = signature30.getArgumentTypes();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type25, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((int) ' ', type36);
        int int38 = type36.getSort();
        java.lang.String str39 = type36.getClassName();
        java.lang.String str40 = type36.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type43.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type45.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSize();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int50 = type49.getSize();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type43, type45, type47, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSize();
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type42, type53, type54 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray56);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray56);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(154, 2, (java.lang.Object[]) typeArray32, (int) (byte) 1, (java.lang.Object[]) typeArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(ZZZZ)Z" + "'", str22, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.mockito.asm.Type" + "'", str27, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ZDZ)Z" + "'", str31, "(ZDZ)Z");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "char" + "'", str39, "char");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "C" + "'", str40, "C");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(ZZZZ)Z" + "'", str52, "(ZZZZ)Z");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(ZDZ)Z" + "'", str57, "(ZDZ)Z");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(ZDZ)C" + "'", str58, "(ZDZ)C");
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn((int) ' ', 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "()Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter10.visitIntInsn(96, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter2);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        boolean boolean16 = type14.equals((java.lang.Object) label15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        int int19 = type17.getOpcode(5);
        label15.info = 5;
        java.lang.String str21 = label15.toString();
        java.lang.Object obj22 = label15.info;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter9.visitField(6, "boolean()Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "L1739346356", (java.lang.Object) label15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L639870680" + "'", str21, "L639870680");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 5 + "'", obj22, 5);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((-1), "(ZZZZ)Z", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        org.mockito.asm.MethodAdapter methodAdapter10 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = localVariablesSorter7.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray19 = new java.lang.String[] { "short", "L822822720", "org/mockito/asm/MethodAdapter", "L1471807529" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (byte) -1, 4, "L1094307244", "L2089788194", "L1411121776", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(2, "(ZZZZ)Z", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter6.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(156, "(ZDZ)Z", (org.mockito.asm.MethodVisitor) methodAdapter4);
        org.mockito.asm.MethodAdapter methodAdapter6 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter7);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter11 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter10);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter12 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter11);
        org.mockito.asm.MethodAdapter methodAdapter13 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) localVariablesSorter11);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter11.visitIntInsn(153, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
