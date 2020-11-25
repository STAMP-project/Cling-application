import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.mockito.asm.ClassWriter.COMPUTE_MAXS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.mockito.asm.ClassWriter.COMPUTE_FRAMES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.Class<?> wildcardClass2 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        java.lang.Class<?> wildcardClass8 = fieldVisitor7.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        java.lang.Class<?> wildcardClass10 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        java.lang.Class<?> wildcardClass12 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.Attribute attribute28 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter((int) '4');
        int int12 = classWriter9.newNameType("", "hi!");
        classWriter9.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter9.visitAnnotation("", true);
        classWriter9.visitOuterClass("hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int24 = classWriter1.newConst((java.lang.Object) classWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@452e86ad");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter13.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = classWriter1.newConst((java.lang.Object) annotationVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.AnnotationWriter@5f94142c");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor23);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        org.mockito.asm.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = classWriter1.newConst(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        java.lang.Class<?> wildcardClass13 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        java.lang.Class<?> wildcardClass21 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        java.lang.Class<?> wildcardClass8 = annotationVisitor7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        int int13 = classWriter10.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor25 = classWriter19.visitMethod(0, "hi!", "", "hi!", strArray24);
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter10.visitMethod((int) 'a', "hi!", "", "hi!", strArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = classWriter1.newConst((java.lang.Object) methodVisitor26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.MethodWriter@4ade0426");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodVisitor25);
        org.junit.Assert.assertNotNull(methodVisitor26);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) -1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int34 = classWriter1.newMethod("hi!", "", "hi!", true);
        java.lang.Class<?> wildcardClass35 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) '4');
        int int32 = classWriter29.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter29.visitMethod((int) 'a', "hi!", "", "hi!", strArray43);
        classWriter1.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray43);
        org.mockito.asm.Attribute attribute47 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertNotNull(methodVisitor45);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        org.mockito.asm.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int32 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.Attribute attribute33 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        java.lang.Class<?> wildcardClass9 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int24 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter(0);
        int int32 = classWriter30.newClass("");
        classWriter30.visitSource("hi!", "");
        byte[] byteArray36 = classWriter30.toByteArray();
        int int40 = classWriter30.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        int int50 = classWriter47.newNameType("", "hi!");
        classWriter47.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter((int) '4');
        int int64 = classWriter61.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter70 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray75 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter70.visitMethod(0, "hi!", "", "hi!", strArray75);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter61.visitMethod((int) 'a', "hi!", "", "hi!", strArray75);
        classWriter47.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray75);
        classWriter30.visit((-1), (int) (byte) 1, "hi!", "", "", strArray75);
        java.lang.Class<?> wildcardClass80 = classWriter30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor81 = classWriter1.visitField(100, "hi!", "hi!", "hi!", (java.lang.Object) classWriter30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@17aac4f5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 7 + "'", int40 == 7);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int10 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass27 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter13.visitMethod(0, "hi!", "", "hi!", strArray18);
        int int21 = classWriter13.newConst((java.lang.Object) 10.0d);
        int int23 = classWriter13.newClass("hi!");
        classWriter13.visitOuterClass("hi!", "", "hi!");
        int int29 = classWriter13.newClass("hi!");
        org.mockito.asm.FieldVisitor fieldVisitor30 = classWriter7.visitField((int) (byte) 0, "", "", "", (java.lang.Object) int29);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = classWriter1.newConst((java.lang.Object) classWriter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@61514212");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor30);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newClass("");
        classWriter18.visitSource("hi!", "");
        byte[] byteArray24 = classWriter18.toByteArray();
        int int28 = classWriter18.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int38 = classWriter35.newNameType("", "hi!");
        classWriter35.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter35.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray63);
        classWriter18.visit((-1), (int) (byte) 1, "hi!", "", "", strArray63);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor68 = classWriter1.visitMethod(100, "", "", "hi!", strArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        int int70 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        java.lang.Class<?> wildcardClass74 = annotationVisitor73.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classWriter1.visitAnnotation("hi!", false);
        java.lang.Class<?> wildcardClass9 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "", 4);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter16.visitEnd();
        int int19 = classWriter16.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter16.visitAnnotation("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classWriter1.visitField(1, "hi!", "", "", (java.lang.Object) classWriter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@1090743a");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor22);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter5.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((-1));
        classWriter8.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter8.visit(9, (int) '#', "", "", "", strArray18);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newConst((java.lang.Object) 1);
        int int32 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter8.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int34 = classWriter5.newConst((java.lang.Object) 100);
        int int35 = classWriter1.newConst((java.lang.Object) int34);
        org.mockito.asm.Attribute attribute36 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        int int20 = classWriter12.newConst((java.lang.Object) 10.0d);
        int int22 = classWriter12.newClass("hi!");
        classWriter12.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray37 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor38 = classWriter32.visitMethod(0, "hi!", "", "hi!", strArray37);
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter(0);
        int int42 = classWriter40.newConst((java.lang.Object) 1);
        int int47 = classWriter40.newMethod("", "", "", true);
        int int52 = classWriter40.newMethod("hi!", "hi!", "hi!", false);
        int int53 = classWriter32.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        int int63 = classWriter60.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter60.visitMethod((int) 'a', "hi!", "", "hi!", strArray74);
        classWriter32.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter12.visitMethod(4, "hi!", "", "", strArray74);
        classWriter1.visit((int) (short) 10, 3, "hi!", "", "", strArray74);
        java.lang.Class<?> wildcardClass80 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = classWriter1.newConst(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.Attribute attribute37 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor36);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        org.mockito.asm.Attribute attribute46 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitOuterClass("", "hi!", "");
        java.lang.Class<?> wildcardClass50 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        org.mockito.asm.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.Attribute attribute46 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter5.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((-1));
        classWriter8.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter8.visit(9, (int) '#', "", "", "", strArray18);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newConst((java.lang.Object) 1);
        int int32 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter8.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int34 = classWriter5.newConst((java.lang.Object) 100);
        int int35 = classWriter1.newConst((java.lang.Object) int34);
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter41.visitSource("", "");
        classWriter41.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor46 = classWriter1.visitField((int) 'a', "", "hi!", "hi!", (java.lang.Object) classWriter41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@6883af20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitOuterClass("", "", "");
        org.mockito.asm.Attribute attribute50 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor35 = classWriter1.visitField((-1), "", "", "hi!", (java.lang.Object) classWriter34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@1299c117");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        int int14 = classWriter11.newNameType("", "hi!");
        classWriter11.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter11.visitAnnotation("", true);
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter11.visitField(9, "", "", "", (java.lang.Object) 6);
        java.lang.Class<?> wildcardClass32 = fieldVisitor31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = classWriter1.newConst((java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value class org.mockito.asm.FieldWriter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(0);
        int int35 = classWriter33.newClass("");
        int int37 = classWriter33.newConst((java.lang.Object) 10L);
        int int41 = classWriter33.newField("hi!", "hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter1.visitField((int) ' ', "", "", "hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor42);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) '4');
        int int10 = classWriter7.newNameType("", "hi!");
        int int12 = classWriter7.newClass("");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int21 = classWriter19.newClass("");
        classWriter19.visitSource("hi!", "");
        byte[] byteArray25 = classWriter19.toByteArray();
        int int29 = classWriter19.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter36.newNameType("", "hi!");
        classWriter36.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        int int53 = classWriter50.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray64 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter59.visitMethod(0, "hi!", "", "hi!", strArray64);
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter50.visitMethod((int) 'a', "hi!", "", "hi!", strArray64);
        classWriter36.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray64);
        classWriter19.visit((-1), (int) (byte) 1, "hi!", "", "", strArray64);
        classWriter7.visit((int) (short) 10, (int) (short) 0, "hi!", "hi!", "", strArray64);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor70 = classWriter1.visitMethod(6, "", "", "", strArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor66);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitInnerClass("", "", "", (-1));
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter11.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter11.visitOuterClass("", "hi!", "hi!");
        int int24 = classWriter11.newNameType("", "hi!");
        byte[] byteArray25 = classWriter11.toByteArray();
        byte[] byteArray26 = classWriter11.toByteArray();
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(0);
        int int35 = classWriter33.newUTF8("hi!");
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter33.visitMethod(2, "hi!", "hi!", "hi!", strArray43);
        classWriter11.visit(0, 4, "hi!", "", "hi!", strArray43);
        java.lang.Class<?> wildcardClass46 = classWriter11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = classWriter1.newConst((java.lang.Object) classWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@566f23d7");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter(0);
        int int56 = classWriter54.newConst((java.lang.Object) 1);
        int int61 = classWriter54.newMethod("hi!", "hi!", "", true);
        classWriter54.visitSource("", "");
        byte[] byteArray65 = classWriter54.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor66 = classWriter1.visitField((int) (short) 10, "hi!", "hi!", "hi!", (java.lang.Object) byteArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@654840c3");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 2, 0, 4, 0, 8, 0, 0, 0, 0]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        classWriter1.visitEnd();
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newClass("");
        int int13 = classWriter9.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor25 = classWriter19.visitMethod(0, "hi!", "", "hi!", strArray24);
        int int27 = classWriter19.newConst((java.lang.Object) 10.0d);
        int int29 = classWriter19.newClass("hi!");
        classWriter19.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter39.visitMethod(0, "hi!", "", "hi!", strArray44);
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter(0);
        int int49 = classWriter47.newConst((java.lang.Object) 1);
        int int54 = classWriter47.newMethod("", "", "", true);
        int int59 = classWriter47.newMethod("hi!", "hi!", "hi!", false);
        int int60 = classWriter39.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        int int70 = classWriter67.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter76.visitMethod(0, "hi!", "", "hi!", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter67.visitMethod((int) 'a', "hi!", "", "hi!", strArray81);
        classWriter39.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter19.visitMethod(4, "hi!", "", "", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter9.visitMethod((int) 'a', "", "", "hi!", strArray81);
        org.mockito.asm.FieldVisitor fieldVisitor87 = classWriter1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodVisitor25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(fieldVisitor87);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter(0);
        int int16 = classWriter11.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter22.visitMethod(0, "hi!", "", "hi!", strArray27);
        org.mockito.asm.MethodVisitor methodVisitor29 = classWriter11.visitMethod(4, "", "hi!", "hi!", strArray27);
        byte[] byteArray30 = classWriter11.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = classWriter1.newConst((java.lang.Object) byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@3cae8678");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 6, 0, 0, 0, 2, 0, 5, 0, 0]");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter5.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((-1));
        classWriter8.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter8.visit(9, (int) '#', "", "", "", strArray18);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newConst((java.lang.Object) 1);
        int int32 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter8.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int34 = classWriter5.newConst((java.lang.Object) 100);
        int int35 = classWriter1.newConst((java.lang.Object) int34);
        int int39 = classWriter1.newField("hi!", "hi!", "hi!");
        org.mockito.asm.Attribute attribute40 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter34.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter34.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter1.visitField((int) ' ', "", "hi!", "", (java.lang.Object) "hi!");
        org.mockito.asm.Attribute attribute64 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        int int33 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newConst((java.lang.Object) 1);
        int int42 = classWriter35.newMethod("hi!", "hi!", "", true);
        classWriter35.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) '4');
        int int55 = classWriter52.newNameType("", "hi!");
        classWriter52.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) '4');
        int int69 = classWriter66.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray80 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter75.visitMethod(0, "hi!", "", "hi!", strArray80);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter66.visitMethod((int) 'a', "hi!", "", "hi!", strArray80);
        classWriter52.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray80);
        classWriter35.visit((int) (byte) -1, (int) (byte) 0, "", "", "", strArray80);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = classWriter1.newConst((java.lang.Object) strArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@5852eb8e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        int int22 = classWriter19.newNameType("", "hi!");
        classWriter19.visitOuterClass("hi!", "hi!", "hi!");
        classWriter19.visitEnd();
        classWriter19.visitSource("hi!", "");
        int int33 = classWriter19.newNameType("hi!", "hi!");
        classWriter19.visitSource("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int37 = classWriter1.newConst((java.lang.Object) classWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@1bbcc7ae");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        java.lang.Class<?> wildcardClass7 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newClass("");
        classWriter23.visitSource("hi!", "");
        int int33 = classWriter23.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter23.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        classWriter23.visit((int) (byte) 100, 0, "", "", "hi!", strArray51);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        classWriter23.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter1.visitMethod(10, "", "", "hi!", strArray65);
        org.mockito.asm.Attribute attribute69 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor68);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        int int16 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "", 4);
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter9.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter9.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter9.visitInnerClass("", "hi!", "hi!", 1);
        int int30 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj35 = null;
        org.mockito.asm.FieldVisitor fieldVisitor36 = classWriter9.visitField(10, "", "", "", obj35);
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter9.visitAnnotation("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor40 = classWriter1.visitField((int) (short) 100, "", "", "", (java.lang.Object) classWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@475dee43");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(annotationVisitor39);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        classWriter1.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray43);
        int int48 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter5.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((-1));
        classWriter8.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter8.visit(9, (int) '#', "", "", "", strArray18);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newConst((java.lang.Object) 1);
        int int32 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter8.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int34 = classWriter5.newConst((java.lang.Object) 100);
        int int35 = classWriter1.newConst((java.lang.Object) int34);
        int int38 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.Attribute attribute39 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter9.newNameType("hi!", "hi!");
        int int15 = classWriter9.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter22.visitMethod(0, "hi!", "", "hi!", strArray27);
        classWriter9.visit((int) ' ', 2, "", "hi!", "hi!", strArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor30 = classWriter1.visitMethod((int) (byte) -1, "", "", "hi!", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(methodVisitor28);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        int int15 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitSource("", "");
        java.lang.Class<?> wildcardClass19 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        classWriter1.visitOuterClass("", "", "");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor47 = classWriter41.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter41.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = classWriter41.visitAnnotation("hi!", false);
        int int57 = classWriter41.newNameType("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            int int58 = classWriter1.newConst((java.lang.Object) classWriter41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@16055c3c");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter1.visitField(8, "hi!", "", "", (java.lang.Object) "");
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter(0);
        int int19 = classWriter17.newClass("");
        classWriter17.visitSource("hi!", "");
        byte[] byteArray23 = classWriter17.toByteArray();
        int int27 = classWriter17.newField("", "hi!", "hi!");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter17.visitMethod(9, "", "hi!", "hi!", strArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor38 = classWriter1.visitMethod(8, "hi!", "", "hi!", strArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter33.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter33.visitMethod(4, "hi!", "hi!", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor63 = classWriter1.visitMethod((int) (byte) 0, "hi!", "", "", strArray59);
        java.lang.Class<?> wildcardClass64 = strArray59.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        int int17 = classWriter12.newClass("");
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter(0);
        int int26 = classWriter24.newClass("");
        classWriter24.visitSource("hi!", "");
        byte[] byteArray30 = classWriter24.toByteArray();
        int int34 = classWriter24.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        int int44 = classWriter41.newNameType("", "hi!");
        classWriter41.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        int int58 = classWriter55.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter64.visitMethod(0, "hi!", "", "hi!", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter55.visitMethod((int) 'a', "hi!", "", "hi!", strArray69);
        classWriter41.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray69);
        classWriter24.visit((-1), (int) (byte) 1, "hi!", "", "", strArray69);
        classWriter12.visit((int) (short) 10, (int) (short) 0, "hi!", "hi!", "", strArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor75 = classWriter1.visitField(0, "hi!", "hi!", "", (java.lang.Object) strArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@21222e61");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor71);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) -1);
        classWriter1.visitEnd();
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        org.mockito.asm.Attribute attribute49 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        classWriter1.visitOuterClass("hi!", "", "");
        java.lang.Class<?> wildcardClass22 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitInnerClass("", "hi!", "", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter1.visitField(8, "hi!", "", "", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        java.lang.Class<?> wildcardClass15 = annotationVisitor14.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor11);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        int int5 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass10 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newConst((java.lang.Object) (short) 1);
        byte[] byteArray4 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int5 = classWriter1.newClass("hi!");
        java.lang.Class<?> wildcardClass6 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int30 = classWriter1.newField("hi!", "hi!", "hi!");
        int int33 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter35.visitEnd();
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((-1));
        classWriter38.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray48 = null;
        classWriter38.visit(9, (int) '#', "", "", "", strArray48);
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter(0);
        int int57 = classWriter55.newConst((java.lang.Object) 1);
        int int62 = classWriter55.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter38.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int64 = classWriter35.newConst((java.lang.Object) 100);
        int int65 = classWriter1.newConst((java.lang.Object) int64);
        java.lang.Class<?> wildcardClass66 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 5 + "'", int62 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        int int20 = classWriter12.newConst((java.lang.Object) 10.0d);
        int int22 = classWriter12.newClass("hi!");
        classWriter12.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray37 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor38 = classWriter32.visitMethod(0, "hi!", "", "hi!", strArray37);
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter(0);
        int int42 = classWriter40.newConst((java.lang.Object) 1);
        int int47 = classWriter40.newMethod("", "", "", true);
        int int52 = classWriter40.newMethod("hi!", "hi!", "hi!", false);
        int int53 = classWriter32.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        int int63 = classWriter60.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter60.visitMethod((int) 'a', "hi!", "", "hi!", strArray74);
        classWriter32.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter12.visitMethod(4, "hi!", "", "", strArray74);
        classWriter1.visit((int) (short) 10, 3, "hi!", "", "", strArray74);
        org.mockito.asm.Attribute attribute80 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor78);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int10 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int28 = classWriter23.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter23.visitMethod(4, "", "hi!", "hi!", strArray39);
        classWriter16.visit(10, 6, "", "hi!", "", strArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor43 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(methodVisitor41);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(4);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int7 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        int int19 = classWriter1.newNameType("", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newClass("");
        classWriter44.visitSource("hi!", "");
        int int54 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter44.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 100, 0, "", "", "hi!", strArray72);
        classWriter1.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray72);
        int int77 = classWriter1.newClass("");
        byte[] byteArray78 = classWriter1.toByteArray();
        int int83 = classWriter1.newMethod("", "", "hi!", true);
        byte[] byteArray84 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-54, -2, -70, -66, 0, 0, 0, 1, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 10, 0, 6, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 3, 0, 10, 0, 0, 0, 2, 0, 5, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 13 + "'", int83 == 13);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[-54, -2, -70, -66, 0, 0, 0, 1, 0, 14, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 10, 0, 6, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 11, 0, 2, 0, 7, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 3, 0, 10, 0, 0, 0, 2, 0, 5, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int18 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int22 = classWriter20.newConst((java.lang.Object) 1);
        int int27 = classWriter20.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter20.visitAnnotation("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = classWriter1.newConst((java.lang.Object) classWriter20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@597baadd");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int16 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("hi!", "", "hi!", 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", true);
        int int9 = classWriter1.newClass("hi!");
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        java.lang.Class<?> wildcardClass8 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter(0);
        int int15 = classWriter13.newClass("");
        classWriter13.visitSource("hi!", "");
        byte[] byteArray19 = classWriter13.toByteArray();
        int int23 = classWriter13.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) '4');
        int int33 = classWriter30.newNameType("", "hi!");
        classWriter30.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        int int47 = classWriter44.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter53.visitMethod(0, "hi!", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter44.visitMethod((int) 'a', "hi!", "", "hi!", strArray58);
        classWriter30.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray58);
        classWriter13.visit((-1), (int) (byte) 1, "hi!", "", "", strArray58);
        classWriter1.visit((int) (short) 10, (int) (short) 0, "hi!", "hi!", "", strArray58);
        org.mockito.asm.Attribute attribute64 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor60);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        classWriter1.visitSource("", "");
        classWriter1.visitInnerClass("hi!", "", "hi!", 11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter10.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter10.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter10.visitInnerClass("", "hi!", "hi!", 1);
        int int31 = classWriter10.newMethod("hi!", "hi!", "hi!", false);
        int int36 = classWriter10.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter1.visitField(9, "", "hi!", "", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass38 = fieldVisitor37.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classWriter1.visitAnnotation("hi!", false);
        int int11 = classWriter1.newNameType("", "");
        classWriter1.visitSource("", "hi!");
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        int int90 = classWriter1.newUTF8("");
        int int92 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 2 + "'", int92 == 2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        int int15 = classWriter1.newNameType("", "");
        int int19 = classWriter1.newField("", "", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        java.lang.Class<?> wildcardClass82 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.Class<?> wildcardClass26 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        byte[] byteArray13 = classWriter1.toByteArray();
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 100);
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = classWriter48.visitAnnotation("", false);
        classWriter48.visitEnd();
        classWriter48.visitInnerClass("", "", "hi!", 1);
        int int66 = classWriter48.newNameType("hi!", "");
        classWriter48.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor68 = classWriter1.visitField(3, "hi!", "hi!", "", (java.lang.Object) classWriter48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@4362527e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 100);
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) '4');
        int int10 = classWriter7.newNameType("", "hi!");
        int int12 = classWriter7.newClass("");
        int int14 = classWriter7.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter7.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter1.visitField(3, "hi!", "hi!", "", (java.lang.Object) annotationVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.AnnotationWriter@1e0eb796");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor17);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitEnd();
        int int18 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((-1));
        classWriter20.visitOuterClass("", "", "hi!");
        int int28 = classWriter20.newField("", "", "");
        classWriter20.visitSource("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int32 = classWriter1.newConst((java.lang.Object) classWriter20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@37b554d");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        int int17 = classWriter14.newNameType("", "hi!");
        classWriter14.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter14.visitAnnotation("", true);
        classWriter14.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int40 = classWriter35.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        org.mockito.asm.MethodVisitor methodVisitor53 = classWriter35.visitMethod(4, "", "hi!", "hi!", strArray51);
        classWriter14.visit(10, (int) (byte) 100, "", "", "", strArray51);
        classWriter1.visit((int) '4', (int) '#', "", "", "", strArray51);
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 10);
        java.lang.String[] strArray65 = null;
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray65);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(methodVisitor66);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitSource("", "");
        java.lang.Class<?> wildcardClass19 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int31 = classWriter1.newMethod("", "", "", false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(3);
        int int6 = classWriter1.newMethod("", "", "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", 10);
        classWriter1.visitEnd();
        int int17 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Class<?> wildcardClass18 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        int int22 = classWriter1.newMethod("", "", "", false);
        java.lang.Class<?> wildcardClass23 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        org.mockito.asm.Attribute attribute36 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int14 = classWriter1.newNameType("hi!", "hi!");
        int int19 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        int int6 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int57 = classWriter54.newNameType("", "hi!");
        classWriter54.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = classWriter54.visitAnnotation("", true);
        classWriter54.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter(0);
        int int80 = classWriter75.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter86 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray91 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter86.visitMethod(0, "hi!", "", "hi!", strArray91);
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter75.visitMethod(4, "", "hi!", "hi!", strArray91);
        classWriter54.visit(10, (int) (byte) 100, "", "", "", strArray91);
        classWriter54.visitOuterClass("", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor99 = classWriter1.visitField(12, "", "", "hi!", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 4 + "'", int80 == 4);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(fieldVisitor99);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter((int) '4');
        int int21 = classWriter18.newNameType("", "hi!");
        classWriter18.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter32.visitMethod((int) 'a', "hi!", "", "hi!", strArray46);
        classWriter18.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray46);
        classWriter1.visit((int) (byte) -1, (int) (byte) 0, "", "", "", strArray46);
        int int52 = classWriter1.newClass("hi!");
        java.lang.Class<?> wildcardClass53 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        int int8 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newConst((java.lang.Object) 1);
        int int17 = classWriter10.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor29 = classWriter23.visitMethod(0, "hi!", "", "hi!", strArray28);
        int int31 = classWriter23.newConst((java.lang.Object) 10.0d);
        int int33 = classWriter23.newClass("hi!");
        classWriter23.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor49 = classWriter43.visitMethod(0, "hi!", "", "hi!", strArray48);
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter(0);
        int int53 = classWriter51.newConst((java.lang.Object) 1);
        int int58 = classWriter51.newMethod("", "", "", true);
        int int63 = classWriter51.newMethod("hi!", "hi!", "hi!", false);
        int int64 = classWriter43.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        int int74 = classWriter71.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter80 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray85 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter80.visitMethod(0, "hi!", "", "hi!", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter71.visitMethod((int) 'a', "hi!", "", "hi!", strArray85);
        classWriter43.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter23.visitMethod(4, "hi!", "", "", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter10.visitMethod(7, "hi!", "hi!", "hi!", strArray85);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = classWriter1.newConst((java.lang.Object) strArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@85c01b");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(methodVisitor90);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("hi!", "", "", (-1));
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int24 = classWriter19.newMethod("", "", "", true);
        classWriter19.visitEnd();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        classWriter32.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = classWriter32.visitAnnotation("", true);
        classWriter32.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter53.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter64.visitMethod(0, "hi!", "", "hi!", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter53.visitMethod(4, "", "hi!", "hi!", strArray69);
        classWriter32.visit(10, (int) (byte) 100, "", "", "", strArray69);
        classWriter19.visit((int) '4', (int) '#', "", "", "", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter1.visitMethod((int) (byte) 0, "", "", "hi!", strArray69);
        byte[] byteArray75 = classWriter1.toByteArray();
        int int77 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 4, 0, 4, 0, 1, 0, 8, 0, 0, 0, 2, 0, 2, 0, 1, 0, 9, 0, 0, 0, 10, 0, 1, 0, 3, 0, 7, 0, 4, -1, -1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 4 + "'", int77 == 4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter(0);
        int int21 = classWriter16.newMethod("", "", "", true);
        int int26 = classWriter16.newMethod("hi!", "hi!", "hi!", false);
        int int30 = classWriter16.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter(0);
        int int39 = classWriter37.newConst((java.lang.Object) 1);
        int int44 = classWriter37.newMethod("", "", "", true);
        int int49 = classWriter37.newMethod("hi!", "hi!", "hi!", false);
        int int54 = classWriter37.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter37.visitMethod(7, "", "hi!", "hi!", strArray65);
        classWriter16.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray65);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = classWriter1.newConst((java.lang.Object) strArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@22da6625");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 11 + "'", int54 == 11);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor67);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        byte[] byteArray20 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(0);
        int int28 = classWriter26.newConst((java.lang.Object) 1);
        int int33 = classWriter26.newMethod("", "", "", true);
        int int38 = classWriter26.newMethod("hi!", "hi!", "hi!", false);
        int int43 = classWriter26.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor55 = classWriter49.visitMethod(0, "hi!", "", "hi!", strArray54);
        org.mockito.asm.MethodVisitor methodVisitor56 = classWriter26.visitMethod(7, "", "hi!", "hi!", strArray54);
        byte[] byteArray57 = classWriter26.toByteArray();
        int int59 = classWriter26.newClass("");
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter1.visitField(15, "hi!", "", "", (java.lang.Object) "");
        int int63 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 6, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11 + "'", int43 == 11);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        int int45 = classWriter1.newField("", "", "");
        classWriter1.visitSource("hi!", "");
        int int50 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        int int53 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        int int23 = classWriter1.newNameType("", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(5);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", (int) '#');
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter(0);
        int int17 = classWriter15.newConst((java.lang.Object) 1);
        int int22 = classWriter15.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter28.visitMethod(0, "hi!", "", "hi!", strArray33);
        int int36 = classWriter28.newConst((java.lang.Object) 10.0d);
        int int38 = classWriter28.newClass("hi!");
        classWriter28.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        org.mockito.asm.ClassWriter classWriter56 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter56.newConst((java.lang.Object) 1);
        int int63 = classWriter56.newMethod("", "", "", true);
        int int68 = classWriter56.newMethod("hi!", "hi!", "hi!", false);
        int int69 = classWriter48.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        int int79 = classWriter76.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter85 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter85.visitMethod(0, "hi!", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter76.visitMethod((int) 'a', "hi!", "", "hi!", strArray90);
        classWriter48.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter28.visitMethod(4, "hi!", "", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor95 = classWriter15.visitMethod(7, "hi!", "hi!", "hi!", strArray90);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor96 = classWriter1.visitMethod(4, "", "", "hi!", strArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 9 + "'", int68 == 9);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor95);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        int int19 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor16 = classWriter10.visitMethod(0, "hi!", "", "hi!", strArray15);
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter1.visitMethod((int) 'a', "hi!", "", "hi!", strArray15);
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodVisitor16);
        org.junit.Assert.assertNotNull(methodVisitor17);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        int int17 = classWriter14.newNameType("", "hi!");
        classWriter14.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter14.visitAnnotation("", true);
        classWriter14.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int40 = classWriter35.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        org.mockito.asm.MethodVisitor methodVisitor53 = classWriter35.visitMethod(4, "", "hi!", "hi!", strArray51);
        classWriter14.visit(10, (int) (byte) 100, "", "", "", strArray51);
        classWriter1.visit((int) '4', (int) '#', "", "", "", strArray51);
        org.mockito.asm.Attribute attribute56 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(methodVisitor53);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int10 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) '4');
        int int19 = classWriter16.newNameType("", "hi!");
        int int21 = classWriter16.newClass("");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        int int31 = classWriter28.newNameType("", "hi!");
        classWriter28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter28.visitAnnotation("", true);
        classWriter28.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter(0);
        int int54 = classWriter49.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter49.visitMethod(4, "", "hi!", "hi!", strArray65);
        classWriter28.visit(10, (int) (byte) 100, "", "", "", strArray65);
        classWriter16.visit((int) ' ', 9, "", "hi!", "hi!", strArray65);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor70 = classWriter1.visitMethod((int) (byte) 100, "hi!", "hi!", "", strArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor67);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter(3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classWriter1.visitField((int) (short) 100, "hi!", "hi!", "hi!", (java.lang.Object) classWriter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@3096de3");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int33 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newConst((java.lang.Object) 1);
        int int42 = classWriter35.newMethod("", "", "", true);
        int int47 = classWriter35.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter35.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter35.visitMethod(7, "", "hi!", "hi!", strArray63);
        int int66 = classWriter1.newConst((java.lang.Object) 7);
        org.mockito.asm.Attribute attribute67 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 11 + "'", int52 == 11);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((-1));
        classWriter17.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter28.visitMethod(0, "hi!", "", "hi!", strArray33);
        int int36 = classWriter28.newConst((java.lang.Object) 10.0d);
        int int38 = classWriter28.newClass("hi!");
        classWriter28.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        org.mockito.asm.ClassWriter classWriter56 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter56.newConst((java.lang.Object) 1);
        int int63 = classWriter56.newMethod("", "", "", true);
        int int68 = classWriter56.newMethod("hi!", "hi!", "hi!", false);
        int int69 = classWriter48.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        int int79 = classWriter76.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter85 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter85.visitMethod(0, "hi!", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter76.visitMethod((int) 'a', "hi!", "", "hi!", strArray90);
        classWriter48.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter28.visitMethod(4, "hi!", "", "", strArray90);
        classWriter17.visit((int) (short) 10, 3, "hi!", "", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter1.visitMethod(4, "", "hi!", "", strArray90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 9 + "'", int68 == 9);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor96);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter20.newMethod("", "", "", true);
        classWriter20.visitEnd();
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        int int36 = classWriter33.newNameType("", "hi!");
        classWriter33.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter33.visitAnnotation("", true);
        classWriter33.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter(0);
        int int59 = classWriter54.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray70 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter65.visitMethod(0, "hi!", "", "hi!", strArray70);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter54.visitMethod(4, "", "hi!", "hi!", strArray70);
        classWriter33.visit(10, (int) (byte) 100, "", "", "", strArray70);
        classWriter20.visit((int) '4', (int) '#', "", "", "", strArray70);
        classWriter1.visit((int) (short) 10, 3, "", "", "", strArray70);
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor78);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 100);
        int int40 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        int int19 = classWriter1.newField("", "", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(4);
        byte[] byteArray2 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((int) '4');
        int int11 = classWriter8.newNameType("", "hi!");
        byte[] byteArray12 = classWriter8.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classWriter8.visitAnnotation("hi!", false);
        int int19 = classWriter8.newField("hi!", "hi!", "hi!");
        classWriter8.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) classWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@473e0265");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int30 = classWriter1.newField("hi!", "hi!", "hi!");
        int int33 = classWriter1.newNameType("", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray8 = classWriter7.toByteArray();
        byte[] byteArray9 = classWriter7.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@1f2a32fa");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter13.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor24 = classWriter13.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter13.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int34 = classWriter13.newMethod("", "hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = classWriter1.newConst((java.lang.Object) classWriter13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@423d08b6");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter50.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter50.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter50.visitInnerClass("", "hi!", "hi!", 1);
        int int71 = classWriter50.newMethod("hi!", "hi!", "hi!", false);
        int int72 = classWriter1.newConst((java.lang.Object) "hi!");
        int int75 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter81 = new org.mockito.asm.ClassWriter((int) '4');
        int int84 = classWriter81.newNameType("", "hi!");
        byte[] byteArray85 = classWriter81.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor88 = classWriter81.visitAnnotation("hi!", false);
        int int91 = classWriter81.newNameType("", "");
        org.mockito.asm.FieldVisitor fieldVisitor92 = classWriter1.visitField(7, "hi!", "hi!", "", (java.lang.Object) "");
        int int97 = classWriter1.newMethod("", "hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 6 + "'", int72 == 6);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 7 + "'", int75 == 7);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor88);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 4 + "'", int91 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor92);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 10 + "'", int97 == 10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.Object obj13 = null;
        org.mockito.asm.FieldVisitor fieldVisitor14 = classWriter1.visitField(100, "", "", "hi!", obj13);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter(0);
        int int19 = classWriter16.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter25.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor36 = classWriter25.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter25.visitInnerClass("", "hi!", "hi!", 1);
        int int46 = classWriter25.newMethod("hi!", "hi!", "hi!", false);
        int int51 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter16.visitField(9, "", "hi!", "", (java.lang.Object) "");
        int int54 = classWriter16.newUTF8("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int55 = classWriter1.newConst((java.lang.Object) classWriter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@515cea30");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        int int17 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter12.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter12.visitOuterClass("", "hi!", "hi!");
        int int25 = classWriter12.newNameType("", "hi!");
        byte[] byteArray26 = classWriter12.toByteArray();
        byte[] byteArray27 = classWriter12.toByteArray();
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newUTF8("hi!");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter34.visitMethod(2, "hi!", "hi!", "hi!", strArray44);
        classWriter12.visit(0, 4, "hi!", "", "hi!", strArray44);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter12.visitAnnotation("", false);
        int int50 = classWriter1.newConst((java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray53 = classWriter52.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int54 = classWriter1.newConst((java.lang.Object) classWriter52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@434bcaf8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int8 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        classWriter10.visitSource("hi!", "");
        byte[] byteArray16 = classWriter10.toByteArray();
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter22.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int37 = classWriter34.newNameType("", "hi!");
        classWriter34.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        int int51 = classWriter48.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor63 = classWriter57.visitMethod(0, "hi!", "", "hi!", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter48.visitMethod((int) 'a', "hi!", "", "hi!", strArray62);
        classWriter34.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter22.visitMethod(7, "", "", "", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter10.visitMethod(9, "hi!", "hi!", "hi!", strArray62);
        classWriter10.visitOuterClass("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter(0);
        int int76 = classWriter73.newNameType("hi!", "hi!");
        int int78 = classWriter73.newUTF8("hi!");
        int int79 = classWriter10.newConst((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int80 = classWriter1.newConst((java.lang.Object) classWriter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@2f6cf548");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodVisitor63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 7 + "'", int79 == 7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classWriter83.visitAnnotation("hi!", true);
        int int87 = classWriter1.newConst((java.lang.Object) true);
        int int91 = classWriter1.newField("", "", "");
        classWriter1.visitInnerClass("", "", "", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 7 + "'", int87 == 7);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 9 + "'", int91 == 9);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newClass("");
        classWriter18.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor24 = classWriter1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int28 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int19 = classWriter17.newConst((java.lang.Object) (short) 1);
        int int22 = classWriter17.newNameType("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = classWriter1.newConst((java.lang.Object) classWriter17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@71da72bd");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("", "hi!");
        org.mockito.asm.Attribute attribute56 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        int int16 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        java.lang.String[] strArray16 = null;
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter1.visitMethod((int) (short) 100, "hi!", "", "", strArray16);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int20 = classWriter1.newConst((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass21 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int27 = classWriter1.newMethod("", "", "", true);
        int int29 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int54 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute55 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        int int7 = classWriter1.newField("hi!", "hi!", "");
        int int10 = classWriter1.newNameType("", "");
        int int12 = classWriter1.newConst((java.lang.Object) 100L);
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor16 = classWriter10.visitMethod(0, "hi!", "", "hi!", strArray15);
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter1.visitMethod((int) 'a', "hi!", "", "hi!", strArray15);
        java.lang.Class<?> wildcardClass18 = methodVisitor17.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodVisitor16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int21 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray2 = classWriter1.toByteArray();
        byte[] byteArray3 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("hi!", "hi!", "", 9);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newClass("");
        classWriter44.visitSource("hi!", "");
        int int54 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter44.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 100, 0, "", "", "hi!", strArray72);
        classWriter1.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray72);
        int int77 = classWriter1.newClass("");
        java.lang.Class<?> wildcardClass78 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int16 = classWriter1.newField("hi!", "hi!", "hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        classWriter1.visitInnerClass("", "", "", (int) (short) -1);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newMethod("", "hi!", "hi!", false);
        int int28 = classWriter1.newMethod("", "", "hi!", true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        byte[] byteArray17 = classWriter1.toByteArray();
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 5, 0, 5, 12, 0, 5, 0, 1, 11, 0, 2, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 9, 0, 0, 0, 4, 0, 2, 0, 6]");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter(0);
        int int24 = classWriter21.newNameType("hi!", "hi!");
        int int27 = classWriter21.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        classWriter21.visit((int) ' ', 2, "", "hi!", "hi!", strArray39);
        classWriter21.visitOuterClass("hi!", "hi!", "hi!");
        int int50 = classWriter21.newMethod("hi!", "", "", false);
        classWriter21.visitSource("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = classWriter1.newConst((java.lang.Object) classWriter21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@2f42b1dd");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 7 + "'", int50 == 7);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        int int12 = classWriter1.newClass("");
        byte[] byteArray13 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass14 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 4, 0, 0, 0, 2, 0, 1, 0, 1, 0, 5, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        java.lang.Class<?> wildcardClass29 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter1.visitAnnotation("", true);
        int int40 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter1.visitAnnotation("hi!", false);
        int int45 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter(0);
        int int52 = classWriter47.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter47.visitMethod(4, "", "hi!", "hi!", strArray63);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = classWriter1.newConst((java.lang.Object) strArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@3c86ffa");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 13 + "'", int40 == 13);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 6 + "'", int45 == 6);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int21 = classWriter19.newConst((java.lang.Object) 1);
        int int26 = classWriter19.newMethod("hi!", "hi!", "", true);
        classWriter19.visitInnerClass("", "hi!", "hi!", (-1));
        int int35 = classWriter19.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter(0);
        int int43 = classWriter41.newClass("");
        classWriter41.visitSource("hi!", "");
        int int51 = classWriter41.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor57 = classWriter41.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter64.visitMethod(0, "hi!", "", "hi!", strArray69);
        classWriter41.visit((int) (byte) 100, 0, "", "", "hi!", strArray69);
        org.mockito.asm.ClassWriter classWriter78 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter78.visitMethod(0, "hi!", "", "hi!", strArray83);
        classWriter41.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray83);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter19.visitMethod(10, "", "", "hi!", strArray83);
        int int88 = classWriter19.newClass("hi!");
        org.mockito.asm.FieldVisitor fieldVisitor89 = classWriter1.visitField((int) (short) 100, "", "", "hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 6 + "'", int51 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 3 + "'", int88 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor89);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(8);
        org.mockito.asm.ClassWriter classWriter3 = new org.mockito.asm.ClassWriter(0);
        int int5 = classWriter3.newClass("");
        int int7 = classWriter3.newConst((java.lang.Object) 10L);
        classWriter3.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = classWriter1.newConst((java.lang.Object) classWriter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@4c22d0a6");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int14 = classWriter1.newNameType("hi!", "");
        int int16 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor21 = classWriter15.visitMethod(0, "hi!", "", "hi!", strArray20);
        int int23 = classWriter15.newConst((java.lang.Object) 10.0d);
        int int25 = classWriter15.newClass("hi!");
        classWriter15.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter35.visitMethod(0, "hi!", "", "hi!", strArray40);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(0);
        int int45 = classWriter43.newConst((java.lang.Object) 1);
        int int50 = classWriter43.newMethod("", "", "", true);
        int int55 = classWriter43.newMethod("hi!", "hi!", "hi!", false);
        int int56 = classWriter35.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        int int66 = classWriter63.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter72 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray77 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter72.visitMethod(0, "hi!", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter63.visitMethod((int) 'a', "hi!", "", "hi!", strArray77);
        classWriter35.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter15.visitMethod(4, "hi!", "", "", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter1.visitMethod(12, "", "hi!", "hi!", strArray77);
        byte[] byteArray83 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodVisitor21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 12, 0, 2, 0, 2, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 12, 0, 1, 0, 2, 0, 1, 0, 5, 0, 0, 0, 2, 0, 2, 0, 1, 0, 6, 0, 0, 0, 4, 0, 3, 0, 4]");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        int int16 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newClass("");
        int int31 = classWriter27.newConst((java.lang.Object) 10L);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) int31);
        org.mockito.asm.Attribute attribute33 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor32);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        org.mockito.asm.Attribute attribute68 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        int int39 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter(0);
        int int47 = classWriter45.newUTF8("hi!");
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor56 = classWriter45.visitMethod(2, "hi!", "hi!", "hi!", strArray55);
        java.lang.Class<?> wildcardClass57 = classWriter45.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor58 = classWriter1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) classWriter45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@294de7ca");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        int int42 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.Attribute attribute43 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newMethod("", "hi!", "hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        org.mockito.asm.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter(0);
        int int13 = classWriter11.newConst((java.lang.Object) 1);
        classWriter11.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter11.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter26.visitMethod(0, "hi!", "", "hi!", strArray31);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newConst((java.lang.Object) 1);
        int int41 = classWriter34.newMethod("", "", "", true);
        int int46 = classWriter34.newMethod("hi!", "hi!", "hi!", false);
        int int47 = classWriter26.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int57 = classWriter54.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter54.visitMethod((int) 'a', "hi!", "", "hi!", strArray68);
        classWriter26.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter11.visitMethod(6, "hi!", "hi!", "", strArray68);
        classWriter1.visit((int) (byte) -1, 100, "hi!", "hi!", "", strArray68);
        int int75 = classWriter1.newClass("hi!");
        int int78 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.Attribute attribute79 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        java.lang.String[] strArray16 = null;
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter1.visitMethod((int) (byte) -1, "", "hi!", "", strArray16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertNotNull(methodVisitor17);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitEnd();
        java.lang.Class<?> wildcardClass17 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        int int33 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int40 = classWriter35.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        org.mockito.asm.MethodVisitor methodVisitor53 = classWriter35.visitMethod(4, "", "hi!", "hi!", strArray51);
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        int int62 = classWriter35.newConst((java.lang.Object) "hi!");
        byte[] byteArray63 = classWriter35.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int64 = classWriter1.newConst((java.lang.Object) byteArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@7e731390");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 6 + "'", int62 == 6);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 8, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 7, 0, 0, 0, 2, 0, 5, 0, 0]");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        int int10 = classWriter1.newMethod("", "hi!", "", false);
        java.lang.Class<?> wildcardClass11 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) '4');
        int int32 = classWriter29.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter29.visitMethod((int) 'a', "hi!", "", "hi!", strArray43);
        classWriter1.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray43);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor57 = classWriter1.visitField(2, "", "hi!", "", (java.lang.Object) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor57);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter34.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter34.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter1.visitField((int) ' ', "", "hi!", "", (java.lang.Object) "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int40 = classWriter35.newMethod("", "", "", true);
        classWriter35.visitEnd();
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        int int51 = classWriter48.newNameType("", "hi!");
        classWriter48.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = classWriter48.visitAnnotation("", true);
        classWriter48.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter(0);
        int int74 = classWriter69.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter80 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray85 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter80.visitMethod(0, "hi!", "", "hi!", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter69.visitMethod(4, "", "hi!", "hi!", strArray85);
        classWriter48.visit(10, (int) (byte) 100, "", "", "", strArray85);
        classWriter35.visit((int) '4', (int) '#', "", "", "", strArray85);
        java.lang.Class<?> wildcardClass90 = strArray85.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int91 = classWriter1.newConst((java.lang.Object) strArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@29e39e7e");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.Class<?> wildcardClass39 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int54 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter(0);
        int int76 = classWriter71.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter82 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray87 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor88 = classWriter82.visitMethod(0, "hi!", "", "hi!", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter71.visitMethod(4, "", "hi!", "hi!", strArray87);
        classWriter64.visit(10, 6, "", "hi!", "", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter1.visitMethod((int) (byte) 1, "", "", "", strArray87);
        int int96 = classWriter1.newMethod("hi!", "", "", true);
        int int99 = classWriter1.newNameType("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 9 + "'", int96 == 9);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 8 + "'", int99 == 8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int24 = classWriter19.newMethod("", "", "", true);
        int int29 = classWriter19.newMethod("hi!", "hi!", "hi!", false);
        int int33 = classWriter19.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter(0);
        int int42 = classWriter40.newConst((java.lang.Object) 1);
        int int47 = classWriter40.newMethod("", "", "", true);
        int int52 = classWriter40.newMethod("hi!", "hi!", "hi!", false);
        int int57 = classWriter40.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter40.visitMethod(7, "", "hi!", "hi!", strArray68);
        classWriter19.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray68);
        classWriter1.visit((int) '#', 15, "hi!", "hi!", "", strArray68);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 11 + "'", int57 == 11);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        byte[] byteArray19 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass20 = byteArray19.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) '4');
        int int20 = classWriter17.newNameType("", "hi!");
        classWriter17.visitOuterClass("hi!", "hi!", "hi!");
        classWriter17.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = classWriter1.newConst((java.lang.Object) classWriter17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@772bc179");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        java.lang.String[] strArray20 = null;
        classWriter1.visit(0, 7, "hi!", "hi!", "", strArray20);
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int20 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        classWriter27.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter27.visitAnnotation("", true);
        classWriter27.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int53 = classWriter48.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray64 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter59.visitMethod(0, "hi!", "", "hi!", strArray64);
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter48.visitMethod(4, "", "hi!", "hi!", strArray64);
        classWriter27.visit(10, (int) (byte) 100, "", "", "", strArray64);
        classWriter1.visit((int) (short) 100, 1, "", "hi!", "hi!", strArray64);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor66);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter4 = new org.mockito.asm.ClassWriter((-1));
        classWriter4.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray14 = null;
        classWriter4.visit(9, (int) '#', "", "", "", strArray14);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter(0);
        int int23 = classWriter21.newConst((java.lang.Object) 1);
        int int28 = classWriter21.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter4.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int30 = classWriter1.newConst((java.lang.Object) 100);
        int int34 = classWriter1.newField("", "", "");
        org.mockito.asm.Attribute attribute35 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        byte[] byteArray32 = classWriter1.toByteArray();
        int int34 = classWriter1.newClass("");
        int int37 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(annotationVisitor40);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        int int28 = classWriter25.newNameType("", "hi!");
        classWriter25.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) '4');
        int int42 = classWriter39.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor55 = classWriter39.visitMethod((int) 'a', "hi!", "", "hi!", strArray53);
        classWriter25.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor57 = classWriter13.visitMethod(7, "", "", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor58 = classWriter1.visitMethod(9, "hi!", "hi!", "hi!", strArray53);
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter(0);
        int int67 = classWriter64.newNameType("hi!", "hi!");
        int int69 = classWriter64.newUTF8("hi!");
        int int70 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(methodVisitor57);
        org.junit.Assert.assertNotNull(methodVisitor58);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter20.newMethod("", "", "", true);
        classWriter20.visitEnd();
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        int int36 = classWriter33.newNameType("", "hi!");
        classWriter33.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter33.visitAnnotation("", true);
        classWriter33.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter(0);
        int int59 = classWriter54.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray70 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter65.visitMethod(0, "hi!", "", "hi!", strArray70);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter54.visitMethod(4, "", "hi!", "hi!", strArray70);
        classWriter33.visit(10, (int) (byte) 100, "", "", "", strArray70);
        classWriter20.visit((int) '4', (int) '#', "", "", "", strArray70);
        classWriter1.visit((int) (short) 10, 3, "", "", "", strArray70);
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter77.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor88 = classWriter77.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int91 = classWriter77.newNameType("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int92 = classWriter1.newConst((java.lang.Object) classWriter77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@53069516");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(fieldVisitor88);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 6 + "'", int91 == 6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int12 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        int int22 = classWriter14.newConst((java.lang.Object) 10.0d);
        int int24 = classWriter14.newClass("hi!");
        classWriter14.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int44 = classWriter42.newConst((java.lang.Object) 1);
        int int49 = classWriter42.newMethod("", "", "", true);
        int int54 = classWriter42.newMethod("hi!", "hi!", "hi!", false);
        int int55 = classWriter34.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        int int65 = classWriter62.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter62.visitMethod((int) 'a', "hi!", "", "hi!", strArray76);
        classWriter34.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter14.visitMethod(4, "hi!", "", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter1.visitMethod(7, "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor89 = classWriter83.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter83.visitOuterClass("", "hi!", "hi!");
        int int96 = classWriter83.newNameType("", "hi!");
        int int97 = classWriter1.newConst((java.lang.Object) int96);
        int int99 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor89);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 6 + "'", int96 == 6);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 7 + "'", int97 == 7);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 8 + "'", int99 == 8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int6 = classWriter1.newMethod("hi!", "hi!", "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor49 = classWriter43.visitMethod(0, "hi!", "", "hi!", strArray48);
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter(0);
        int int53 = classWriter51.newConst((java.lang.Object) 1);
        int int58 = classWriter51.newMethod("", "", "", true);
        int int63 = classWriter51.newMethod("hi!", "hi!", "hi!", false);
        int int64 = classWriter43.newConst((java.lang.Object) "hi!");
        int int69 = classWriter43.newMethod("", "hi!", "", true);
        classWriter43.visitSource("", "");
        int int73 = classWriter1.newConst((java.lang.Object) "");
        classWriter1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 6 + "'", int69 == 6);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 7 + "'", int73 == 7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        int int70 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter1.visitMethod((int) (short) -1, "", "hi!", "hi!", strArray84);
        int int89 = classWriter1.newField("hi!", "", "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 10 + "'", int89 == 10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor15 = classWriter9.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        int int24 = classWriter21.newNameType("", "hi!");
        classWriter21.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int38 = classWriter35.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter44.visitMethod(0, "hi!", "", "hi!", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter35.visitMethod((int) 'a', "hi!", "", "hi!", strArray49);
        classWriter21.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor53 = classWriter9.visitMethod(7, "", "", "", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter1.visitMethod((int) (short) 10, "hi!", "", "", strArray49);
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(methodVisitor54);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter5.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((-1));
        classWriter8.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter8.visit(9, (int) '#', "", "", "", strArray18);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newConst((java.lang.Object) 1);
        int int32 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter8.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int34 = classWriter5.newConst((java.lang.Object) 100);
        int int35 = classWriter1.newConst((java.lang.Object) int34);
        int int38 = classWriter1.newNameType("hi!", "hi!");
        int int40 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        int int34 = classWriter1.newMethod("", "hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        int int18 = classWriter15.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter15.visitMethod((int) 'a', "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray29);
        int int37 = classWriter1.newMethod("", "hi!", "", false);
        int int39 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        int int16 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass21 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int20 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter25.visitMethod(0, "hi!", "", "hi!", strArray30);
        int int33 = classWriter25.newConst((java.lang.Object) 10.0d);
        int int35 = classWriter25.newClass("hi!");
        classWriter25.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter45.visitMethod(0, "hi!", "", "hi!", strArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter(0);
        int int55 = classWriter53.newConst((java.lang.Object) 1);
        int int60 = classWriter53.newMethod("", "", "", true);
        int int65 = classWriter53.newMethod("hi!", "hi!", "hi!", false);
        int int66 = classWriter45.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter((int) '4');
        int int76 = classWriter73.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter82 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray87 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor88 = classWriter82.visitMethod(0, "hi!", "", "hi!", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter73.visitMethod((int) 'a', "hi!", "", "hi!", strArray87);
        classWriter45.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter25.visitMethod(4, "hi!", "", "", strArray87);
        int int94 = classWriter25.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor97 = classWriter25.visitAnnotation("", false);
        int int98 = classWriter1.newConst((java.lang.Object) false);
        byte[] byteArray99 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 7 + "'", int94 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 8 + "'", int98 == 8);
        org.junit.Assert.assertNotNull(byteArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray99), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 1, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 1, 0, 1, 0, 2, 0, 9, 0, 0, 0, 2, 0, 4, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 11, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 6, 0, 6, 0, 1, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        int int3 = classWriter1.newUTF8("");
        int int6 = classWriter1.newNameType("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter34.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter34.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter1.visitField((int) ' ', "", "hi!", "", (java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) '4');
        int int68 = classWriter65.newNameType("", "hi!");
        classWriter65.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classWriter65.visitAnnotation("", true);
        classWriter65.visitOuterClass("hi!", "", "hi!");
        int int80 = classWriter1.newConst((java.lang.Object) "hi!");
        byte[] byteArray81 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass82 = byteArray81.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 6, 0, 7, 8, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 0, 1, 0, 1, 0, 2, 0, 10, 0, 0, 0, 2, 0, 4, 0, 11, 0, 0, 0, 2, 0, 1, 0, 10, 0, 1, 0, 1, 0, 1, 0, 11, 0, 0, 0, 2, 0, 1, 0, 32, 0, 1, 0, 3, 0, 2, 0, 10, 0, 0, 0, 2, 0, 9, 0, 11, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 12, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 2, 0, 6, 0, 3, 0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int33 = classWriter1.newField("hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter1.visitField(8, "hi!", "", "", (java.lang.Object) "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor11);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int21 = classWriter19.newConst((java.lang.Object) 1);
        int int26 = classWriter19.newMethod("", "", "", true);
        int int31 = classWriter19.newMethod("hi!", "hi!", "hi!", false);
        int int32 = classWriter11.newConst((java.lang.Object) "hi!");
        int int37 = classWriter11.newMethod("", "hi!", "", true);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter11.visitMethod(0, "", "hi!", "", strArray45);
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter1.visitMethod((int) (short) 1, "hi!", "", "", strArray45);
        java.lang.Class<?> wildcardClass48 = strArray45.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        int int37 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        classWriter1.visitEnd();
        byte[] byteArray19 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 1, 0, 1, 0, 2, 0, 7, 0, 0, 0, 2, 0, 4, 0, 8, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 9, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 2, 0, 6, 0, 3, 0, 1]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("hi!", "", "", (-1));
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newClass("");
        classWriter44.visitSource("hi!", "");
        int int54 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter44.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 100, 0, "", "", "hi!", strArray72);
        classWriter1.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray72);
        org.mockito.asm.Attribute attribute76 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int22 = classWriter20.newClass("");
        int int24 = classWriter20.newConst((java.lang.Object) 10L);
        int int26 = classWriter20.newUTF8("hi!");
        classWriter20.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter1.visitField(4, "", "hi!", "", (java.lang.Object) "");
        classWriter1.visitOuterClass("", "", "hi!");
        int int39 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter34.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter34.visitAnnotation("hi!", true);
        int int42 = classWriter34.newClass("hi!");
        int int43 = classWriter1.newConst((java.lang.Object) "hi!");
        byte[] byteArray44 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        java.lang.Class<?> wildcardClass46 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 8, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 2, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter1.visitField(9, "", "", "", (java.lang.Object) 6);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter31.visitEnd();
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((-1));
        classWriter34.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray44 = null;
        classWriter34.visit(9, (int) '#', "", "", "", strArray44);
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter(0);
        int int53 = classWriter51.newConst((java.lang.Object) 1);
        int int58 = classWriter51.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor59 = classWriter34.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int60 = classWriter31.newConst((java.lang.Object) 100);
        int int61 = classWriter27.newConst((java.lang.Object) int60);
        org.mockito.asm.FieldVisitor fieldVisitor67 = classWriter27.visitField((-1), "", "hi!", "", (java.lang.Object) 1L);
        int int70 = classWriter27.newNameType("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor71 = classWriter1.visitField((-1), "", "", "", (java.lang.Object) classWriter27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@304a6537");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 6 + "'", int70 == 6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod(6, "hi!", "hi!", "", strArray19);
        int int23 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitOuterClass("", "", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (short) 0);
        int int41 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        int int7 = classWriter1.newField("hi!", "hi!", "");
        int int11 = classWriter1.newField("hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        classWriter1.visitOuterClass("", "", "");
        byte[] byteArray46 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 10, 0, 11, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 7, 0, 1, 12, 0, 1, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 100, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 3, 0, 8, 0, 0, 0, 2, 0, 1, 0, 9, 0, 0, 0, 4, 0, 6, 0, 7, 0, 10, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        int int28 = classWriter1.newConst((java.lang.Object) "hi!");
        byte[] byteArray29 = classWriter1.toByteArray();
        int int31 = classWriter1.newClass("");
        java.lang.Class<?> wildcardClass32 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 8, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 7, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        byte[] byteArray32 = classWriter1.toByteArray();
        int int34 = classWriter1.newClass("");
        int int37 = classWriter1.newNameType("hi!", "");
        classWriter1.visitSource("", "");
        int int45 = classWriter1.newMethod("hi!", "", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int37 = classWriter1.newField("", "", "");
        java.lang.Class<?> wildcardClass38 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "hi!", 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        int int28 = classWriter25.newNameType("", "hi!");
        byte[] byteArray29 = classWriter25.toByteArray();
        int int31 = classWriter25.newClass("hi!");
        java.lang.String[] strArray37 = null;
        classWriter25.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray37);
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter25.visitAnnotation("hi!", false);
        byte[] byteArray42 = classWriter25.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter1.visitField(0, "", "", "", (java.lang.Object) byteArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@24fabcc6");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 8, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 10, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute47 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        int int45 = classWriter1.newField("", "", "");
        classWriter1.visitSource("hi!", "");
        int int50 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = classWriter1.visitAnnotation("hi!", true);
        int int56 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        int int23 = classWriter1.newNameType("", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int3 = classWriter1.newUTF8("hi!");
        int int5 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        int int5 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        byte[] byteArray10 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "", "", 2);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        int int44 = classWriter22.newField("hi!", "", "hi!");
        classWriter22.visitOuterClass("hi!", "", "");
        int int50 = classWriter22.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = classWriter22.visitAnnotation("hi!", false);
        int int58 = classWriter22.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter(0);
        int int67 = classWriter65.newClass("");
        classWriter65.visitSource("hi!", "");
        int int75 = classWriter65.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor81 = classWriter65.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter88 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray93 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter88.visitMethod(0, "hi!", "", "hi!", strArray93);
        classWriter65.visit((int) (byte) 100, 0, "", "", "hi!", strArray93);
        classWriter22.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray93);
        classWriter1.visit((int) (short) 10, 7, "hi!", "hi!", "", strArray93);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 12, 0, 3, 0, 1, 9, 0, 2, 0, 4, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 6 + "'", int75 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(methodVisitor94);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(annotationVisitor34);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        java.lang.String[] strArray13 = null;
        classWriter1.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray13);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter(0);
        int int30 = classWriter28.newConst((java.lang.Object) 1);
        int int35 = classWriter28.newMethod("", "", "", true);
        int int40 = classWriter28.newMethod("hi!", "hi!", "hi!", false);
        int int41 = classWriter20.newConst((java.lang.Object) "hi!");
        int int46 = classWriter20.newMethod("", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor58 = classWriter52.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        int int67 = classWriter64.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray78 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter73.visitMethod(0, "hi!", "", "hi!", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter64.visitMethod((int) 'a', "hi!", "", "hi!", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter52.visitMethod(4, "hi!", "hi!", "hi!", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter20.visitMethod((int) (byte) 0, "hi!", "", "", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter1.visitMethod((int) '4', "hi!", "", "", strArray78);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(methodVisitor83);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter(0);
        int int15 = classWriter13.newClass("");
        classWriter13.visitSource("hi!", "");
        byte[] byteArray19 = classWriter13.toByteArray();
        int int23 = classWriter13.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) '4');
        int int33 = classWriter30.newNameType("", "hi!");
        classWriter30.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        int int47 = classWriter44.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter53.visitMethod(0, "hi!", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter44.visitMethod((int) 'a', "hi!", "", "hi!", strArray58);
        classWriter30.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray58);
        classWriter13.visit((-1), (int) (byte) 1, "hi!", "", "", strArray58);
        classWriter1.visit((int) (short) 10, (int) (short) 0, "hi!", "hi!", "", strArray58);
        int int65 = classWriter1.newClass("");
        int int70 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.Attribute attribute71 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        byte[] byteArray17 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass18 = byteArray17.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 5, 0, 5, 12, 0, 5, 0, 1, 11, 0, 2, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 9, 0, 0, 0, 4, 0, 2, 0, 6]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int54 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        byte[] byteArray32 = classWriter1.toByteArray();
        int int34 = classWriter1.newClass("");
        int int36 = classWriter1.newClass("hi!");
        org.mockito.asm.Attribute attribute37 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        int int8 = classWriter1.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter(0);
        int int13 = classWriter11.newConst((java.lang.Object) 1);
        classWriter11.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter11.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter26.visitMethod(0, "hi!", "", "hi!", strArray31);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newConst((java.lang.Object) 1);
        int int41 = classWriter34.newMethod("", "", "", true);
        int int46 = classWriter34.newMethod("hi!", "hi!", "hi!", false);
        int int47 = classWriter26.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int57 = classWriter54.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter54.visitMethod((int) 'a', "hi!", "", "hi!", strArray68);
        classWriter26.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter11.visitMethod(6, "hi!", "hi!", "", strArray68);
        classWriter1.visit((int) (byte) -1, 100, "hi!", "hi!", "", strArray68);
        int int78 = classWriter1.newMethod("hi!", "", "", true);
        int int81 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 6 + "'", int78 == 6);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 7 + "'", int81 == 7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int20 = classWriter1.newUTF8("hi!");
        java.lang.Class<?> wildcardClass21 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter33.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter33.visitMethod(4, "hi!", "hi!", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor63 = classWriter1.visitMethod((int) (byte) 0, "hi!", "", "", strArray59);
        org.mockito.asm.Attribute attribute64 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor63);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        classWriter12.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter12.visitAnnotation("", true);
        classWriter12.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(0);
        int int38 = classWriter33.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter44.visitMethod(0, "hi!", "", "hi!", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter33.visitMethod(4, "", "hi!", "hi!", strArray49);
        classWriter12.visit(10, (int) (byte) 100, "", "", "", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor53 = classWriter1.visitMethod(8, "", "", "", strArray49);
        org.mockito.asm.Attribute attribute54 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(methodVisitor53);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int15 = classWriter1.newNameType("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor16 = classWriter10.visitMethod(0, "hi!", "", "hi!", strArray15);
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter1.visitMethod((int) 'a', "hi!", "", "hi!", strArray15);
        int int22 = classWriter1.newMethod("", "", "", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodVisitor16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        int int39 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute43 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 13 + "'", int39 == 13);
        org.junit.Assert.assertNotNull(annotationVisitor42);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (byte) -1);
        int int32 = classWriter1.newNameType("", "");
        int int36 = classWriter1.newField("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) '4');
        int int32 = classWriter29.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter29.visitMethod((int) 'a', "hi!", "", "hi!", strArray43);
        classWriter1.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray43);
        int int48 = classWriter1.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor51);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        classWriter1.visitInnerClass("", "", "hi!", 6);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter22.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int37 = classWriter34.newNameType("", "hi!");
        classWriter34.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        int int51 = classWriter48.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor63 = classWriter57.visitMethod(0, "hi!", "", "hi!", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter48.visitMethod((int) 'a', "hi!", "", "hi!", strArray62);
        classWriter34.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter22.visitMethod(7, "", "", "", strArray62);
        classWriter22.visitOuterClass("", "", "");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter(0);
        int int79 = classWriter76.newNameType("hi!", "hi!");
        int int81 = classWriter76.newConst((java.lang.Object) 1.0d);
        int int86 = classWriter76.newMethod("hi!", "hi!", "", false);
        org.mockito.asm.FieldVisitor fieldVisitor87 = classWriter22.visitField((int) 'a', "hi!", "", "", (java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor88 = classWriter1.visitField(7, "", "", "", (java.lang.Object) 'a');
        org.mockito.asm.Attribute attribute89 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodVisitor63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 8 + "'", int86 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor87);
        org.junit.Assert.assertNotNull(fieldVisitor88);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int15 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", 10);
        classWriter1.visitEnd();
        int int17 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter50.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter50.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter50.visitInnerClass("", "hi!", "hi!", 1);
        int int71 = classWriter50.newMethod("hi!", "hi!", "hi!", false);
        int int72 = classWriter1.newConst((java.lang.Object) "hi!");
        int int75 = classWriter1.newNameType("", "");
        int int78 = classWriter1.newNameType("", "hi!");
        java.lang.String[] strArray83 = null;
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray83);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 6 + "'", int72 == 6);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 7 + "'", int75 == 7);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertNotNull(methodVisitor84);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod((int) (short) -1, "hi!", "", "", strArray19);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        int int29 = classWriter26.newNameType("", "hi!");
        classWriter26.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter26.visitAnnotation("", true);
        int int39 = classWriter26.newNameType("hi!", "");
        int int41 = classWriter26.newClass("hi!");
        classWriter26.visitOuterClass("hi!", "", "hi!");
        int int50 = classWriter26.newMethod("", "", "hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor51 = classWriter1.visitField((int) '4', "hi!", "", "", (java.lang.Object) true);
        byte[] byteArray52 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass53 = byteArray52.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 52, 0, 1, 0, 2, 0, 2, 0, 7, 0, 0, 0, 2, 0, 6, 0, 10, 0, 0, 0, 2, 0, 2, 0, 1, -1, -1, 0, 1, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 2, 0, 2, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(3);
        classWriter1.visitInnerClass("", "hi!", "", (int) ' ');
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        byte[] byteArray12 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("hi!", "", "", 8);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newClass("");
        int int27 = classWriter23.newConst((java.lang.Object) 10L);
        int int29 = classWriter23.newUTF8("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor30 = classWriter1.visitField(14, "hi!", "", "", (java.lang.Object) classWriter23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@815978d");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, 10, 0, 1, 0, 2, 0, 4, 0, 3, 0, 0, 0, 6, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitEnd();
        java.lang.Class<?> wildcardClass5 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        int int6 = classWriter1.newUTF8("");
        classWriter1.visitSource("", "");
        int int12 = classWriter1.newNameType("", "");
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int9 = classWriter1.newField("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classWriter1.visitAnnotation("hi!", false);
        java.lang.Class<?> wildcardClass13 = annotationVisitor12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        int int17 = classWriter1.newClass("");
        int int19 = classWriter1.newClass("hi!");
        int int22 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        java.lang.Class<?> wildcardClass20 = strArray17.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitInnerClass("hi!", "", "", 4);
        int int25 = classWriter1.newUTF8("hi!");
        int int29 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        int int19 = classWriter1.newNameType("", "");
        int int22 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        int int33 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classWriter1.visitAnnotation("", false);
        java.lang.Class<?> wildcardClass46 = annotationVisitor45.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(8);
        java.lang.Class<?> wildcardClass2 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray2 = classWriter1.toByteArray();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.FieldVisitor fieldVisitor9 = classWriter1.visitField(10, "", "", "", (java.lang.Object) 10);
        java.lang.Class<?> wildcardClass10 = fieldVisitor9.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int21 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        byte[] byteArray4 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        int int36 = classWriter33.newNameType("", "hi!");
        classWriter33.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter33.visitAnnotation("", true);
        int int46 = classWriter33.newNameType("hi!", "");
        int int47 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("", "", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        classWriter1.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray43);
        int int49 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        int int16 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        byte[] byteArray21 = classWriter1.toByteArray();
        classWriter1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 2, 0, 1, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 4, 0, 4, 0, 3, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter34.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter34.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter1.visitField((int) ' ', "", "hi!", "", (java.lang.Object) "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newClass("");
        classWriter44.visitSource("hi!", "");
        int int54 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter44.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 100, 0, "", "", "hi!", strArray72);
        classWriter1.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray72);
        int int77 = classWriter1.newClass("");
        byte[] byteArray78 = classWriter1.toByteArray();
        int int83 = classWriter1.newMethod("", "", "hi!", true);
        int int86 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-54, -2, -70, -66, 0, 0, 0, 1, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 10, 0, 6, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 3, 0, 10, 0, 0, 0, 2, 0, 5, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 13 + "'", int83 == 13);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 7 + "'", int86 == 7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        int int45 = classWriter1.newField("hi!", "hi!", "");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        int int50 = classWriter47.newNameType("", "hi!");
        classWriter47.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = classWriter47.visitAnnotation("", true);
        int int60 = classWriter47.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = classWriter47.visitAnnotation("", true);
        classWriter47.visitSource("", "");
        byte[] byteArray67 = classWriter47.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int68 = classWriter1.newConst((java.lang.Object) byteArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@1aa7e3d1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 6 + "'", int60 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 2, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 4, 0, 5, 0, 10, 0, 0, 0, 10, 0, 2, 0, 1, 0, 0, 0, 1, 0, 0]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        int int36 = classWriter33.newNameType("", "hi!");
        classWriter33.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter33.visitAnnotation("", true);
        int int46 = classWriter33.newNameType("hi!", "");
        int int47 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter34.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter34.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter1.visitField((int) ' ', "", "hi!", "", (java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) '4');
        int int68 = classWriter65.newNameType("", "hi!");
        classWriter65.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classWriter65.visitAnnotation("", true);
        classWriter65.visitOuterClass("hi!", "", "hi!");
        int int80 = classWriter1.newConst((java.lang.Object) "hi!");
        int int85 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitEnd();
        byte[] byteArray87 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 8 + "'", int85 == 8);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 6, 0, 7, 8, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 0, 1, 0, 1, 0, 2, 0, 10, 0, 0, 0, 2, 0, 4, 0, 11, 0, 0, 0, 2, 0, 1, 0, 10, 0, 1, 0, 1, 0, 1, 0, 11, 0, 0, 0, 2, 0, 1, 0, 32, 0, 1, 0, 3, 0, 2, 0, 10, 0, 0, 0, 2, 0, 9, 0, 11, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 12, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 2, 0, 6, 0, 3, 0, 1]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newConst((java.lang.Object) 1);
        int int34 = classWriter27.newMethod("", "", "", true);
        int int39 = classWriter27.newMethod("hi!", "hi!", "hi!", false);
        int int44 = classWriter27.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor56 = classWriter50.visitMethod(0, "hi!", "", "hi!", strArray55);
        org.mockito.asm.MethodVisitor methodVisitor57 = classWriter27.visitMethod(7, "", "hi!", "hi!", strArray55);
        byte[] byteArray58 = classWriter27.toByteArray();
        int int60 = classWriter27.newClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter1.visitField(8, "", "hi!", "hi!", (java.lang.Object) classWriter27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@51c897b3");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 11 + "'", int44 == 11);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(methodVisitor57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(1);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int11 = classWriter9.newUTF8("");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        int int30 = classWriter18.newMethod("hi!", "hi!", "hi!", false);
        int int35 = classWriter18.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter18.visitMethod(7, "", "hi!", "hi!", strArray46);
        classWriter9.visit(2, 7, "hi!", "", "", strArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor50 = classWriter1.visitMethod(11, "", "hi!", "hi!", strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int15 = classWriter1.newField("", "hi!", "");
        int int17 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classWriter23.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(0);
        int int35 = classWriter33.newConst((java.lang.Object) 1);
        classWriter33.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter33.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        org.mockito.asm.ClassWriter classWriter56 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter56.newConst((java.lang.Object) 1);
        int int63 = classWriter56.newMethod("", "", "", true);
        int int68 = classWriter56.newMethod("hi!", "hi!", "hi!", false);
        int int69 = classWriter48.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        int int79 = classWriter76.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter85 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter85.visitMethod(0, "hi!", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter76.visitMethod((int) 'a', "hi!", "", "hi!", strArray90);
        classWriter48.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter33.visitMethod(6, "hi!", "hi!", "", strArray90);
        classWriter23.visit((int) (byte) -1, 100, "hi!", "hi!", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter1.visitMethod((int) (byte) 10, "", "", "hi!", strArray90);
        byte[] byteArray97 = classWriter1.toByteArray();
        int int99 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 9 + "'", int68 == 9);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(byteArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray97), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 7, 0, 1, 12, 0, 2, 0, 1, 9, 0, 6, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 1, 0, 1, 0, 1, 0, 9, 0, 0, 0, 2, 0, 2, 0, 2, 0, 10, 0, 0, 0, 4, 0, 4, 0, 5, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 2 + "'", int99 == 2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classWriter83.visitAnnotation("hi!", true);
        int int87 = classWriter1.newConst((java.lang.Object) true);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        byte[] byteArray92 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 7 + "'", int87 == 7);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray92), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 5, 3, 0, 0, 0, 1, 7, 0, 5, 12, 0, 5, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 97, 0, 1, 0, 1, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 1, 0, 11, 0, 0, 0, 4, 0, 8, 0, 9]");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        java.lang.Class<?> wildcardClass36 = strArray33.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newMethod("", "hi!", "hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        int int30 = classWriter1.newClass("");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int46 = classWriter1.newMethod("hi!", "hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        java.lang.Class<?> wildcardClass19 = annotationVisitor18.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(annotationVisitor9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter((int) '4');
        int int21 = classWriter18.newNameType("", "hi!");
        classWriter18.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter32.visitMethod((int) 'a', "hi!", "", "hi!", strArray46);
        classWriter18.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray46);
        classWriter1.visit((-1), (int) (byte) 1, "hi!", "", "", strArray46);
        int int54 = classWriter1.newField("", "", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter(0);
        int int76 = classWriter71.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter82 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray87 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor88 = classWriter82.visitMethod(0, "hi!", "", "hi!", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter71.visitMethod(4, "", "hi!", "hi!", strArray87);
        classWriter64.visit(10, 6, "", "hi!", "", strArray87);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor91 = classWriter1.visitField((int) ' ', "hi!", "", "", (java.lang.Object) strArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@74e68b21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(methodVisitor89);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classWriter83.visitAnnotation("hi!", true);
        int int87 = classWriter1.newConst((java.lang.Object) true);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int96 = classWriter1.newMethod("hi!", "", "", false);
        int int98 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 7 + "'", int87 == 7);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 11 + "'", int96 == 11);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2 + "'", int98 == 2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int13 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor25 = classWriter19.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter19.visitOuterClass("", "hi!", "hi!");
        int int34 = classWriter19.newMethod("hi!", "hi!", "", true);
        classWriter19.visitOuterClass("", "", "hi!");
        classWriter19.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter1.visitField(0, "", "hi!", "", (java.lang.Object) "");
        classWriter1.visitOuterClass("", "hi!", "");
        int int49 = classWriter1.newNameType("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter24.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter35.visitMethod(0, "hi!", "", "hi!", strArray40);
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter24.visitMethod(4, "", "hi!", "hi!", strArray40);
        int int46 = classWriter24.newField("hi!", "", "hi!");
        classWriter24.visitOuterClass("hi!", "", "");
        int int52 = classWriter24.newUTF8("");
        // The following exception was thrown during execution in test generation
        try {
            int int53 = classWriter1.newConst((java.lang.Object) classWriter24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@2b7f97a");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter(0);
        int int17 = classWriter15.newClass("");
        classWriter15.visitSource("hi!", "");
        byte[] byteArray21 = classWriter15.toByteArray();
        int int25 = classWriter15.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        classWriter32.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter46.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter46.visitMethod((int) 'a', "hi!", "", "hi!", strArray60);
        classWriter32.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray60);
        classWriter15.visit((-1), (int) (byte) 1, "hi!", "", "", strArray60);
        classWriter1.visit((int) 'a', 9, "hi!", "hi!", "hi!", strArray60);
        int int67 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        classWriter1.visitInnerClass("hi!", "", "", 4);
        classWriter1.visitInnerClass("", "", "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter(0);
        int int15 = classWriter13.newConst((java.lang.Object) 1);
        int int20 = classWriter13.newMethod("hi!", "hi!", "", true);
        classWriter13.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = classWriter1.newConst((java.lang.Object) classWriter13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@621181e7");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor24);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newConst((java.lang.Object) (short) 1);
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        int int12 = classWriter1.newClass("");
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor29 = classWriter23.visitMethod(0, "hi!", "", "hi!", strArray28);
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(0);
        int int33 = classWriter31.newConst((java.lang.Object) 1);
        int int38 = classWriter31.newMethod("", "", "", true);
        int int43 = classWriter31.newMethod("hi!", "hi!", "hi!", false);
        int int44 = classWriter23.newConst((java.lang.Object) "hi!");
        int int49 = classWriter23.newMethod("", "hi!", "", true);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor58 = classWriter23.visitMethod(0, "", "hi!", "", strArray57);
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter1.visitMethod(6, "", "hi!", "hi!", strArray57);
        java.lang.Class<?> wildcardClass60 = methodVisitor59.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 6 + "'", int49 == 6);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", (-1));
        int int28 = classWriter1.newNameType("hi!", "");
        int int31 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass18 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        byte[] byteArray16 = classWriter12.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter12.visitAnnotation("hi!", false);
        int int23 = classWriter12.newField("hi!", "hi!", "hi!");
        classWriter12.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = classWriter1.newConst((java.lang.Object) classWriter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@6e9ef778");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        int int17 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter1.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass21 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "hi!", 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter(0);
        int int23 = classWriter21.newConst((java.lang.Object) 1);
        int int28 = classWriter21.newMethod("hi!", "hi!", "", true);
        byte[] byteArray29 = classWriter21.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = classWriter1.newConst((java.lang.Object) byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@6ac15ce2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        int int22 = classWriter1.newMethod("", "", "", false);
        int int27 = classWriter1.newMethod("", "", "", false);
        int int31 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        int int16 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter26.visitMethod(0, "hi!", "", "hi!", strArray31);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newConst((java.lang.Object) 1);
        int int41 = classWriter34.newMethod("", "", "", true);
        int int46 = classWriter34.newMethod("hi!", "hi!", "hi!", false);
        int int47 = classWriter26.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int57 = classWriter54.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter54.visitMethod((int) 'a', "hi!", "", "hi!", strArray68);
        classWriter26.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray68);
        classWriter1.visit((int) (short) 100, 11, "", "hi!", "", strArray68);
        java.lang.Class<?> wildcardClass73 = strArray68.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        java.lang.String[] strArray13 = null;
        classWriter1.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray13);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter(0);
        int int21 = classWriter16.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor33 = classWriter27.visitMethod(0, "hi!", "", "hi!", strArray32);
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter16.visitMethod(4, "", "hi!", "hi!", strArray32);
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        int int43 = classWriter16.newConst((java.lang.Object) "hi!");
        byte[] byteArray44 = classWriter16.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = classWriter16.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = classWriter1.newConst((java.lang.Object) annotationVisitor47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.AnnotationWriter@227df226");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(methodVisitor33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 8, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 7, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor47);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        int int33 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classWriter1.visitAnnotation("", false);
        byte[] byteArray46 = classWriter1.toByteArray();
        int int48 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 15, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 12, 0, 3, 0, 3, 11, 0, 2, 0, 4, 8, 0, 1, 4, -65, -128, 0, 0, 7, 0, 3, 12, 0, 1, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 100, 0, 1, 0, 1, 0, 2, 0, 10, 0, 0, 0, 2, 0, 6, 0, 11, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 12, 0, 0, 0, 4, 0, 8, 0, 9, 0, 13, 0, 0, 0, 10, 0, 1, 0, 8, 0, 8, 0, 1, 0, 32, 0, 14, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        java.lang.Object obj31 = null;
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField(100, "", "hi!", "hi!", obj31);
        org.mockito.asm.Attribute attribute33 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = classWriter1.visitAnnotation("", true);
        byte[] byteArray35 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 1, 0, 13, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor23);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        classWriter1.visitEnd();
        int int23 = classWriter1.newMethod("", "", "hi!", false);
        org.mockito.asm.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int3 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter(0);
        int int13 = classWriter8.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor25 = classWriter19.visitMethod(0, "hi!", "", "hi!", strArray24);
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter8.visitMethod(4, "", "hi!", "hi!", strArray24);
        classWriter1.visit(10, 6, "", "hi!", "", strArray24);
        java.lang.Class<?> wildcardClass28 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodVisitor25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", 10);
        int int15 = classWriter1.newField("", "hi!", "");
        int int17 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("hi!", "", "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        java.lang.Class<?> wildcardClass2 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        int int8 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int17 = classWriter10.newMethod("hi!", "", "", false);
        classWriter10.visitEnd();
        classWriter10.visitInnerClass("", "", "", 10);
        classWriter10.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = classWriter1.newConst((java.lang.Object) classWriter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@4d8faa17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        int int15 = classWriter1.newUTF8("");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(1, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int20 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter13.visitInnerClass("", "", "hi!", 2);
        int int22 = classWriter13.newField("hi!", "", "");
        int int24 = classWriter13.newUTF8("");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter31.newMethod("", "", "", true);
        int int41 = classWriter31.newMethod("hi!", "hi!", "hi!", false);
        int int45 = classWriter31.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter(0);
        int int54 = classWriter52.newConst((java.lang.Object) 1);
        int int59 = classWriter52.newMethod("", "", "", true);
        int int64 = classWriter52.newMethod("hi!", "hi!", "hi!", false);
        int int69 = classWriter52.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray80 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter75.visitMethod(0, "hi!", "", "hi!", strArray80);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter52.visitMethod(7, "", "hi!", "hi!", strArray80);
        classWriter31.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray80);
        classWriter13.visit((int) '#', 15, "hi!", "hi!", "", strArray80);
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter1.visitMethod(6, "", "hi!", "hi!", strArray80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 9 + "'", int64 == 9);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 11 + "'", int69 == 11);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(methodVisitor85);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "", "", false);
        classWriter1.visitInnerClass("", "hi!", "", 9);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int24 = classWriter19.newMethod("", "", "", true);
        int int29 = classWriter19.newMethod("hi!", "hi!", "hi!", false);
        int int33 = classWriter19.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter(0);
        int int42 = classWriter40.newConst((java.lang.Object) 1);
        int int47 = classWriter40.newMethod("", "", "", true);
        int int52 = classWriter40.newMethod("hi!", "hi!", "hi!", false);
        int int57 = classWriter40.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter40.visitMethod(7, "", "hi!", "hi!", strArray68);
        classWriter19.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter1.visitMethod((int) '4', "hi!", "", "", strArray68);
        java.lang.Class<?> wildcardClass73 = methodVisitor72.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 11 + "'", int57 == 11);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        int int6 = classWriter1.newMethod("hi!", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter(0);
        int int10 = classWriter8.newConst((java.lang.Object) 1);
        int int15 = classWriter8.newMethod("hi!", "hi!", "", true);
        classWriter8.visitInnerClass("hi!", "", "", (-1));
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter26.newMethod("", "", "", true);
        classWriter26.visitEnd();
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) '4');
        int int42 = classWriter39.newNameType("", "hi!");
        classWriter39.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter39.visitAnnotation("", true);
        classWriter39.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter(0);
        int int65 = classWriter60.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter60.visitMethod(4, "", "hi!", "hi!", strArray76);
        classWriter39.visit(10, (int) (byte) 100, "", "", "", strArray76);
        classWriter26.visit((int) '4', (int) '#', "", "", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter8.visitMethod((int) (byte) 0, "", "", "hi!", strArray76);
        byte[] byteArray82 = classWriter8.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int83 = classWriter1.newConst((java.lang.Object) byteArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@525936ec");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 4, 0, 4, 0, 1, 0, 8, 0, 0, 0, 2, 0, 2, 0, 1, 0, 9, 0, 0, 0, 10, 0, 1, 0, 3, 0, 7, 0, 4, -1, -1]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter52.visitInnerClass("", "", "hi!", 2);
        int int61 = classWriter52.newField("hi!", "", "");
        int int63 = classWriter52.newUTF8("");
        int int66 = classWriter52.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = classWriter52.visitAnnotation("hi!", true);
        int int74 = classWriter52.newMethod("", "hi!", "hi!", false);
        classWriter52.visitInnerClass("hi!", "", "", (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor82 = classWriter52.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor83 = classWriter1.visitField(4, "hi!", "hi!", "", (java.lang.Object) "hi!");
        int int87 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 8 + "'", int74 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor82);
        org.junit.Assert.assertNotNull(fieldVisitor83);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 7 + "'", int87 == 7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        int int45 = classWriter1.newField("", "", "");
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter(0);
        int int56 = classWriter54.newClass("");
        classWriter54.visitSource("hi!", "");
        int int64 = classWriter54.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor70 = classWriter54.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        classWriter54.visit((int) (byte) 100, 0, "", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter1.visitMethod((int) (byte) -1, "hi!", "", "", strArray82);
        org.mockito.asm.AnnotationVisitor annotationVisitor88 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.Attribute attribute89 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 6 + "'", int64 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(annotationVisitor88);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        int int12 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", (-1));
        org.mockito.asm.Attribute attribute26 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int16 = classWriter1.newField("hi!", "hi!", "hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        classWriter1.visitInnerClass("", "", "", (int) (short) -1);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        int int31 = classWriter28.newNameType("", "hi!");
        classWriter28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter28.visitAnnotation("", true);
        classWriter28.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter(0);
        int int54 = classWriter49.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter49.visitMethod(4, "", "hi!", "hi!", strArray65);
        classWriter28.visit(10, (int) (byte) 100, "", "", "", strArray65);
        int int72 = classWriter28.newField("", "", "");
        int int73 = classWriter1.newConst((java.lang.Object) "");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute75 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 8 + "'", int72 == 8);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 11 + "'", int73 == 11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int22 = classWriter20.newClass("");
        int int24 = classWriter20.newConst((java.lang.Object) 10L);
        int int26 = classWriter20.newUTF8("hi!");
        classWriter20.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter1.visitField(4, "", "hi!", "", (java.lang.Object) "");
        int int33 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        byte[] byteArray11 = classWriter1.toByteArray();
        int int13 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("", "", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        int int6 = classWriter1.newUTF8("");
        classWriter1.visitSource("", "");
        int int12 = classWriter1.newNameType("", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int20 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        int int28 = classWriter1.newField("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int5 = classWriter1.newClass("hi!");
        int int7 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int54 = classWriter1.newUTF8("");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "", "", false);
        classWriter1.visitInnerClass("", "hi!", "", 9);
        int int15 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int24 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        int int28 = classWriter1.newNameType("hi!", "");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(0);
        int int35 = classWriter33.newConst((java.lang.Object) 1);
        int int40 = classWriter33.newMethod("", "", "", true);
        int int45 = classWriter33.newMethod("hi!", "hi!", "hi!", false);
        int int46 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor54);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("hi!", "");
        int int12 = classWriter1.newNameType("", "");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int11 = classWriter1.newField("hi!", "", "");
        int int13 = classWriter1.newUTF8("");
        classWriter1.visitEnd();
        int int17 = classWriter1.newNameType("", "");
        int int20 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", true);
        int int19 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        int int29 = classWriter21.newConst((java.lang.Object) 10.0d);
        int int31 = classWriter21.newClass("hi!");
        classWriter21.visitOuterClass("hi!", "", "hi!");
        classWriter21.visitInnerClass("", "", "hi!", 3);
        int int43 = classWriter21.newNameType("", "hi!");
        classWriter21.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = classWriter21.visitAnnotation("", true);
        int int48 = classWriter1.newConst((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 7 + "'", int48 == 7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter22.visitEnd();
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((-1));
        classWriter25.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray35 = null;
        classWriter25.visit(9, (int) '#', "", "", "", strArray35);
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int44 = classWriter42.newConst((java.lang.Object) 1);
        int int49 = classWriter42.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor50 = classWriter25.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int51 = classWriter22.newConst((java.lang.Object) 100);
        int int52 = classWriter18.newConst((java.lang.Object) int51);
        int int55 = classWriter18.newNameType("hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor56 = classWriter1.visitField(8, "", "hi!", "", (java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor68 = classWriter62.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter62.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classWriter62.visitAnnotation("hi!", false);
        int int78 = classWriter62.newNameType("hi!", "");
        int int83 = classWriter62.newMethod("", "", "", false);
        int int88 = classWriter62.newMethod("", "", "", false);
        java.lang.Class<?> wildcardClass89 = classWriter62.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor90 = classWriter1.visitField(100, "", "", "", (java.lang.Object) classWriter62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@6f236bc4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 6 + "'", int78 == 6);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 8 + "'", int83 == 8);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 8 + "'", int88 == 8);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '#');
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        int int17 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((-1));
        classWriter23.visitOuterClass("", "", "hi!");
        int int31 = classWriter23.newField("", "", "");
        classWriter23.visitSource("", "");
        classWriter23.visitEnd();
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int47 = classWriter42.newMethod("", "", "", true);
        classWriter42.visitEnd();
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        int int58 = classWriter55.newNameType("", "hi!");
        classWriter55.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = classWriter55.visitAnnotation("", true);
        classWriter55.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter(0);
        int int81 = classWriter76.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter87 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray92 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter87.visitMethod(0, "hi!", "", "hi!", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter76.visitMethod(4, "", "hi!", "hi!", strArray92);
        classWriter55.visit(10, (int) (byte) 100, "", "", "", strArray92);
        classWriter42.visit((int) '4', (int) '#', "", "", "", strArray92);
        classWriter23.visit((int) (short) 10, 3, "", "", "", strArray92);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor98 = classWriter1.visitMethod(0, "", "", "hi!", strArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 4 + "'", int81 == 4);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor94);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        byte[] byteArray89 = classWriter1.toByteArray();
        int int91 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[-54, -2, -70, -66, -1, -1, -1, -1, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 3, 0, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 2, 0, 1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int11 = classWriter1.newField("hi!", "", "");
        int int13 = classWriter1.newUTF8("");
        classWriter1.visitEnd();
        int int17 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        java.lang.String[] strArray20 = null;
        classWriter1.visit(0, 7, "hi!", "hi!", "", strArray20);
        byte[] byteArray22 = classWriter1.toByteArray();
        int int25 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 1, 0, 1, 9, 0, 4, 0, 5, 12, 0, 3, 0, 1, 9, 0, 4, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 7, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 2]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        int int19 = classWriter1.newField("", "", "hi!");
        int int24 = classWriter1.newMethod("", "hi!", "", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter25.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter25.visitOuterClass("", "hi!", "hi!");
        int int40 = classWriter25.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter25.visitAnnotation("", false);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = classWriter1.newConst((java.lang.Object) classWriter25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@724264f2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor43);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int22 = classWriter1.newMethod("", "hi!", "", true);
        org.mockito.asm.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int21 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter23.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter23.visitOuterClass("", "hi!", "hi!");
        int int36 = classWriter23.newNameType("", "hi!");
        byte[] byteArray37 = classWriter23.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = classWriter1.newConst((java.lang.Object) byteArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [B@7e043bd0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((-1));
        classWriter15.visitOuterClass("", "", "hi!");
        int int23 = classWriter15.newField("", "", "");
        classWriter15.visitSource("", "");
        classWriter15.visitEnd();
        int int29 = classWriter15.newUTF8("");
        byte[] byteArray30 = classWriter15.toByteArray();
        org.mockito.asm.FieldVisitor fieldVisitor36 = classWriter15.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) 0L);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter1.visitField(11, "hi!", "hi!", "", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor37);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "", "", (int) (byte) 100);
        classWriter1.visitSource("hi!", "hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        int int28 = classWriter1.newConst((java.lang.Object) "hi!");
        byte[] byteArray29 = classWriter1.toByteArray();
        int int32 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter37.visitMethod(0, "hi!", "", "hi!", strArray42);
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classWriter37.visitAnnotation("", false);
        int int48 = classWriter37.newClass("");
        classWriter37.visitInnerClass("hi!", "", "", 8);
        int int55 = classWriter37.newConst((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = classWriter1.newConst((java.lang.Object) classWriter37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@1a4b4652");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 8, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 7, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        int int39 = classWriter1.newField("", "hi!", "hi!");
        int int43 = classWriter1.newField("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 13 + "'", int39 == 13);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        byte[] byteArray13 = classWriter1.toByteArray();
        int int18 = classWriter1.newMethod("", "", "hi!", false);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        int int31 = classWriter26.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) '4');
        int int40 = classWriter37.newNameType("", "hi!");
        classWriter37.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = classWriter37.visitAnnotation("", true);
        classWriter37.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter(0);
        int int63 = classWriter58.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter58.visitMethod(4, "", "hi!", "hi!", strArray74);
        classWriter37.visit(10, (int) (byte) 100, "", "", "", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter26.visitMethod(8, "", "", "", strArray74);
        classWriter1.visit(3, (-1), "", "hi!", "hi!", strArray74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 12, 0, 2, 0, 1, 10, 0, 3, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor78);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        int int16 = classWriter1.newUTF8("hi!");
        int int18 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitInnerClass("", "", "hi!", (int) (short) -1);
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        int int18 = classWriter15.newNameType("", "hi!");
        classWriter15.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classWriter15.visitAnnotation("", true);
        int int28 = classWriter15.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = classWriter15.visitAnnotation("", true);
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor44 = classWriter38.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        int int53 = classWriter50.newNameType("", "hi!");
        classWriter50.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        int int67 = classWriter64.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray78 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter73.visitMethod(0, "hi!", "", "hi!", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter64.visitMethod((int) 'a', "hi!", "", "hi!", strArray78);
        classWriter50.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter38.visitMethod(7, "", "", "", strArray78);
        classWriter15.visit(0, 7, "hi!", "", "", strArray78);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor84 = classWriter1.visitMethod((int) (short) 0, "", "hi!", "hi!", strArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor82);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newClass("");
        int int31 = classWriter27.newConst((java.lang.Object) 10L);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) int31);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        byte[] byteArray37 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 16, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 7, 0, 1, 12, 0, 2, 0, 2, 10, 0, 4, 0, 7, 3, 0, 0, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, 0, 1, 0, 2, 0, 4, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 13, 0, 0, 0, 2, 0, 1, 0, 100, 0, 2, 0, 2, 0, 2, 0, 10, 0, 0, 0, 2, 0, 9, 0, 13, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 14, 0, 0, 0, 4, 0, 6, 0, 5, 0, 15, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitSource("", "hi!");
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int8 = classWriter1.newNameType("hi!", "");
        byte[] byteArray9 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter(0);
        int int13 = classWriter11.newConst((java.lang.Object) 1);
        int int18 = classWriter11.newMethod("", "", "", true);
        int int23 = classWriter11.newMethod("hi!", "hi!", "hi!", false);
        int int28 = classWriter11.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter11.visitMethod(7, "", "hi!", "hi!", strArray39);
        int int43 = classWriter11.newClass("hi!");
        int int46 = classWriter11.newNameType("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int47 = classWriter1.newConst((java.lang.Object) classWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@5b9b6595");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 1, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 7 + "'", int43 == 7);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) '4');
        int int32 = classWriter29.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter29.visitMethod((int) 'a', "hi!", "", "hi!", strArray43);
        classWriter1.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray43);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) wildcardClass52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value class java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter(0);
        int int63 = classWriter58.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter58.visitMethod(4, "", "hi!", "hi!", strArray74);
        int int80 = classWriter58.newField("hi!", "", "hi!");
        classWriter58.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classWriter58.visitAnnotation("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor87 = classWriter1.visitField(13, "", "hi!", "", (java.lang.Object) annotationVisitor86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.AnnotationWriter@b74b1a5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 8 + "'", int80 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor86);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter14.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter14.visitAnnotation("hi!", true);
        int int24 = classWriter14.newField("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        int int57 = classWriter31.newMethod("", "hi!", "", true);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter31.visitMethod(0, "", "hi!", "", strArray65);
        classWriter14.visit(9, (int) 'a', "hi!", "hi!", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter1.visitMethod((int) (byte) -1, "hi!", "", "", strArray65);
        int int73 = classWriter1.newMethod("hi!", "hi!", "", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor8);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 7 + "'", int73 == 7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitSource("", "");
        int int26 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.Attribute attribute27 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter12.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter12.visitOuterClass("", "hi!", "hi!");
        int int25 = classWriter12.newNameType("", "hi!");
        byte[] byteArray26 = classWriter12.toByteArray();
        byte[] byteArray27 = classWriter12.toByteArray();
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newUTF8("hi!");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter34.visitMethod(2, "hi!", "hi!", "hi!", strArray44);
        classWriter12.visit(0, 4, "hi!", "", "hi!", strArray44);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter12.visitAnnotation("", false);
        int int50 = classWriter1.newConst((java.lang.Object) false);
        int int53 = classWriter1.newNameType("", "hi!");
        int int56 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute60 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 7 + "'", int53 == 7);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor59);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        classWriter1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        int int6 = classWriter1.newMethod("hi!", "hi!", "", false);
        java.lang.Object obj11 = null;
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField(11, "", "", "hi!", obj11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter5.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((-1));
        classWriter8.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter8.visit(9, (int) '#', "", "", "", strArray18);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newConst((java.lang.Object) 1);
        int int32 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter8.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int34 = classWriter5.newConst((java.lang.Object) 100);
        int int35 = classWriter1.newConst((java.lang.Object) int34);
        int int39 = classWriter1.newField("hi!", "", "");
        int int44 = classWriter1.newMethod("hi!", "hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod((int) (short) -1, "hi!", "", "", strArray19);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(methodVisitor20);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter50.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter50.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter50.visitInnerClass("", "hi!", "hi!", 1);
        int int71 = classWriter50.newMethod("hi!", "hi!", "hi!", false);
        int int72 = classWriter1.newConst((java.lang.Object) "hi!");
        int int74 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 6 + "'", int72 == 6);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5 + "'", int74 == 5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray2 = classWriter1.toByteArray();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", true);
        int int11 = classWriter1.newField("", "hi!", "");
        int int15 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 100);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classWriter83.visitAnnotation("hi!", true);
        int int87 = classWriter1.newConst((java.lang.Object) true);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 7 + "'", int87 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor91);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor16 = classWriter10.visitMethod(0, "hi!", "", "hi!", strArray15);
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter1.visitMethod((int) 'a', "hi!", "", "hi!", strArray15);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int28 = classWriter23.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter23.visitMethod(4, "", "hi!", "hi!", strArray39);
        int int45 = classWriter23.newField("hi!", "", "hi!");
        classWriter23.visitOuterClass("hi!", "", "");
        int int51 = classWriter23.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = classWriter23.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter56 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter56.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter56.visitAnnotation("hi!", true);
        int int64 = classWriter56.newClass("hi!");
        int int65 = classWriter23.newConst((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor66 = classWriter1.visitField((int) (byte) 0, "", "hi!", "", (java.lang.Object) classWriter23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@7a381c02");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodVisitor16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = classWriter69.visitAnnotation("", false);
        classWriter69.visitOuterClass("hi!", "hi!", "hi!");
        int int81 = classWriter69.newMethod("hi!", "hi!", "", true);
        int int82 = classWriter1.newConst((java.lang.Object) true);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter92 = new org.mockito.asm.ClassWriter(0);
        int int94 = classWriter92.newClass("");
        int int96 = classWriter92.newConst((java.lang.Object) 10L);
        int int98 = classWriter92.newUTF8("hi!");
        org.mockito.asm.FieldVisitor fieldVisitor99 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 7 + "'", int82 == 7);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 2 + "'", int94 == 2);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 3 + "'", int96 == 3);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 5 + "'", int98 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor99);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        int int5 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        byte[] byteArray10 = classWriter1.toByteArray();
        classWriter1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 12, 0, 3, 0, 1, 9, 0, 2, 0, 4, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 2, 0, 4]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("hi!");
        java.lang.Object obj11 = null;
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField(0, "", "", "", obj11);
        int int14 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter20.visitInnerClass("", "", "hi!", 2);
        int int29 = classWriter20.newField("hi!", "", "");
        int int33 = classWriter20.newField("hi!", "hi!", "");
        java.lang.String[] strArray39 = null;
        classWriter20.visit(0, 7, "hi!", "hi!", "", strArray39);
        byte[] byteArray41 = classWriter20.toByteArray();
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("hi!", "hi!", "", true);
        classWriter48.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) '4');
        int int68 = classWriter65.newNameType("", "hi!");
        classWriter65.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter79 = new org.mockito.asm.ClassWriter((int) '4');
        int int82 = classWriter79.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter88 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray93 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter88.visitMethod(0, "hi!", "", "hi!", strArray93);
        org.mockito.asm.MethodVisitor methodVisitor95 = classWriter79.visitMethod((int) 'a', "hi!", "", "hi!", strArray93);
        classWriter65.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray93);
        classWriter48.visit((int) (byte) -1, (int) (byte) 0, "", "", "", strArray93);
        classWriter20.visit((int) '4', (int) '4', "hi!", "hi!", "", strArray93);
        org.mockito.asm.FieldVisitor fieldVisitor99 = classWriter1.visitField(14, "", "hi!", "hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 1, 0, 1, 9, 0, 4, 0, 5, 12, 0, 3, 0, 1, 9, 0, 4, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 7, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 2]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor95);
        org.junit.Assert.assertNotNull(fieldVisitor99);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int21 = classWriter19.newConst((java.lang.Object) 1);
        int int26 = classWriter19.newMethod("", "", "", true);
        int int31 = classWriter19.newMethod("hi!", "hi!", "hi!", false);
        int int32 = classWriter11.newConst((java.lang.Object) "hi!");
        int int37 = classWriter11.newMethod("", "hi!", "", true);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter11.visitMethod(0, "", "hi!", "", strArray45);
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter1.visitMethod((int) (short) 1, "hi!", "", "", strArray45);
        org.mockito.asm.Attribute attribute48 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(methodVisitor47);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        classWriter1.visitSource("", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        int int13 = classWriter1.newUTF8("");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(100);
        java.lang.String[] strArray7 = null;
        classWriter1.visit((int) (short) 10, 0, "", "", "", strArray7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newClass("");
        classWriter9.visitSource("hi!", "");
        byte[] byteArray15 = classWriter9.toByteArray();
        int int19 = classWriter9.newField("", "hi!", "hi!");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor29 = classWriter9.visitMethod(9, "", "hi!", "hi!", strArray28);
        org.mockito.asm.FieldVisitor fieldVisitor30 = classWriter1.visitField(0, "", "hi!", "hi!", (java.lang.Object) 9);
        classWriter1.visitSource("", "hi!");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor30);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newClass("");
        int int31 = classWriter27.newConst((java.lang.Object) 10L);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) int31);
        int int34 = classWriter1.newUTF8("hi!");
        int int36 = classWriter1.newClass("hi!");
        int int38 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int30 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 10);
        classWriter1.visitOuterClass("", "", "hi!");
        byte[] byteArray40 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 3, 104, 105, 33, 1, 0, 0, 8, 0, 1, 7, 0, 2, 12, 0, 2, 0, 2, 9, 0, 4, 0, 5, 7, 0, 1, 12, 0, 1, 0, 1, 9, 0, 7, 0, 8, 12, 0, 2, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 11, 0, 0, 0, 2, 0, 1, 0, 2, 0, 12, 0, 0, 0, 4, 0, 4, 0, 10, 0, 13, 0, 0, 0, 10, 0, 1, 0, 4, 0, 4, 0, 1, 0, 10]");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        classWriter1.visitEnd();
        int int9 = classWriter1.newNameType("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int17 = classWriter1.newField("hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int20 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter(0);
        int int32 = classWriter30.newClass("");
        classWriter30.visitSource("hi!", "");
        int int40 = classWriter30.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor46 = classWriter30.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter53.visitMethod(0, "hi!", "", "hi!", strArray58);
        classWriter30.visit((int) (byte) 100, 0, "", "", "hi!", strArray58);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        classWriter30.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray72);
        int int78 = classWriter30.newField("", "", "");
        int int80 = classWriter30.newClass("");
        int int82 = classWriter30.newClass("hi!");
        classWriter30.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor84 = classWriter1.visitField(13, "", "hi!", "hi!", (java.lang.Object) classWriter30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@55f41d38");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 9 + "'", int78 == 9);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter(0);
        int int13 = classWriter11.newConst((java.lang.Object) 1);
        classWriter11.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter11.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter26.visitMethod(0, "hi!", "", "hi!", strArray31);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newConst((java.lang.Object) 1);
        int int41 = classWriter34.newMethod("", "", "", true);
        int int46 = classWriter34.newMethod("hi!", "hi!", "hi!", false);
        int int47 = classWriter26.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int57 = classWriter54.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter54.visitMethod((int) 'a', "hi!", "", "hi!", strArray68);
        classWriter26.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter11.visitMethod(6, "hi!", "hi!", "", strArray68);
        classWriter1.visit((int) (byte) -1, 100, "hi!", "hi!", "", strArray68);
        int int75 = classWriter1.newClass("hi!");
        int int78 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) -1);
        int int88 = classWriter1.newField("", "hi!", "");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 7 + "'", int88 == 7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newClass("");
        classWriter23.visitSource("hi!", "");
        int int33 = classWriter23.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter23.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        classWriter23.visit((int) (byte) 100, 0, "", "", "hi!", strArray51);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        classWriter23.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter1.visitMethod(10, "", "", "hi!", strArray65);
        int int70 = classWriter1.newClass("hi!");
        classWriter1.visitSource("", "");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        int int20 = classWriter12.newConst((java.lang.Object) 10.0d);
        int int22 = classWriter12.newClass("hi!");
        classWriter12.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray37 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor38 = classWriter32.visitMethod(0, "hi!", "", "hi!", strArray37);
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter(0);
        int int42 = classWriter40.newConst((java.lang.Object) 1);
        int int47 = classWriter40.newMethod("", "", "", true);
        int int52 = classWriter40.newMethod("hi!", "hi!", "hi!", false);
        int int53 = classWriter32.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        int int63 = classWriter60.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter60.visitMethod((int) 'a', "hi!", "", "hi!", strArray74);
        classWriter32.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter12.visitMethod(4, "hi!", "", "", strArray74);
        classWriter1.visit((int) (short) 10, 3, "hi!", "", "", strArray74);
        classWriter1.visitSource("", "");
        int int84 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        int int39 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor42);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int35 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        int int44 = classWriter41.newNameType("", "hi!");
        int int46 = classWriter41.newClass("");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor59 = classWriter53.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter53.visitOuterClass("", "hi!", "hi!");
        int int66 = classWriter53.newNameType("", "hi!");
        byte[] byteArray67 = classWriter53.toByteArray();
        byte[] byteArray68 = classWriter53.toByteArray();
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter(0);
        int int77 = classWriter75.newUTF8("hi!");
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter75.visitMethod(2, "hi!", "hi!", "hi!", strArray85);
        classWriter53.visit(0, 4, "hi!", "", "hi!", strArray85);
        classWriter41.visit((int) ' ', 4, "", "", "hi!", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter1.visitMethod((int) 'a', "hi!", "", "hi!", strArray85);
        int int92 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 6 + "'", int66 == 6);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        int int28 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        int int16 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int33 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newConst((java.lang.Object) 1);
        int int42 = classWriter35.newMethod("", "", "", true);
        int int47 = classWriter35.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter35.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter35.visitMethod(7, "", "hi!", "hi!", strArray63);
        int int66 = classWriter1.newConst((java.lang.Object) 7);
        int int71 = classWriter1.newMethod("hi!", "hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 11 + "'", int52 == 11);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        classWriter1.visitEnd();
        int int9 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitInnerClass("", "hi!", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter22.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int37 = classWriter34.newNameType("", "hi!");
        classWriter34.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        int int51 = classWriter48.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor63 = classWriter57.visitMethod(0, "hi!", "", "hi!", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter48.visitMethod((int) 'a', "hi!", "", "hi!", strArray62);
        classWriter34.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter22.visitMethod(7, "", "", "", strArray62);
        int int67 = classWriter1.newConst((java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodVisitor63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) '4');
        int int20 = classWriter17.newNameType("", "hi!");
        byte[] byteArray21 = classWriter17.toByteArray();
        int int23 = classWriter17.newClass("hi!");
        int int27 = classWriter17.newField("hi!", "", "hi!");
        int int30 = classWriter17.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter37.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        classWriter49.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        int int66 = classWriter63.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter72 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray77 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter72.visitMethod(0, "hi!", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter63.visitMethod((int) 'a', "hi!", "", "hi!", strArray77);
        classWriter49.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter37.visitMethod(7, "", "", "", strArray77);
        byte[] byteArray82 = classWriter37.toByteArray();
        org.mockito.asm.ClassWriter classWriter88 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray93 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter88.visitMethod(0, "hi!", "", "hi!", strArray93);
        org.mockito.asm.MethodVisitor methodVisitor95 = classWriter37.visitMethod((int) (byte) 100, "hi!", "", "", strArray93);
        classWriter17.visit((int) (short) 1, (int) (short) 100, "hi!", "hi!", "", strArray93);
        classWriter1.visit(6, (int) '#', "hi!", "hi!", "hi!", strArray93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 2, 0, 1, 0, 1, 0, 7, 0, 2, 0, 2, 0, 1, 0, 7, 0, 0, 0, 2, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor95);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 100);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "hi!", 7);
        int int48 = classWriter1.newField("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 13 + "'", int48 == 13);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        int int22 = classWriter1.newMethod("", "", "", false);
        int int27 = classWriter1.newMethod("", "", "", false);
        int int30 = classWriter1.newNameType("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(8);
        int int5 = classWriter1.newField("", "hi!", "");
        int int7 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int32 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int10 = classWriter1.newMethod("hi!", "", "hi!", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        classWriter1.visitSource("", "");
        int int34 = classWriter1.newMethod("", "hi!", "", true);
        int int37 = classWriter1.newNameType("hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitEnd();
        int int21 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newMethod("", "hi!", "hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        int int30 = classWriter1.newClass("");
        org.mockito.asm.Attribute attribute31 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        int int16 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newClass("");
        classWriter23.visitSource("hi!", "");
        int int33 = classWriter23.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter23.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        classWriter23.visit((int) (byte) 100, 0, "", "", "hi!", strArray51);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        classWriter23.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter1.visitMethod(10, "", "", "hi!", strArray65);
        int int70 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor14 = classWriter8.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter8.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter8.visitAnnotation("hi!", false);
        int int23 = classWriter8.newClass("hi!");
        java.lang.Class<?> wildcardClass24 = classWriter8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = classWriter1.newConst((java.lang.Object) classWriter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@60a90267");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(fieldVisitor14);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        java.lang.Object obj31 = null;
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField(100, "", "hi!", "hi!", obj31);
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) (short) 10);
        int int40 = classWriter38.newUTF8("");
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter1.visitField(1, "hi!", "", "", (java.lang.Object) "");
        org.mockito.asm.Attribute attribute42 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor41);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int54 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((-1));
        classWriter60.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray70 = null;
        classWriter60.visit(9, (int) '#', "", "", "", strArray70);
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter(0);
        int int79 = classWriter77.newConst((java.lang.Object) 1);
        int int84 = classWriter77.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor85 = classWriter60.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int87 = classWriter60.newUTF8("");
        int int88 = classWriter1.newConst((java.lang.Object) "");
        java.lang.Class<?> wildcardClass89 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 7 + "'", int88 == 7);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.mockito.asm.ClassReader classReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter2 = new org.mockito.asm.ClassWriter(classReader0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter(0);
        int int9 = classWriter7.newClass("");
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter(0);
        int int18 = classWriter16.newClass("");
        int int20 = classWriter16.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter26.visitMethod(0, "hi!", "", "hi!", strArray31);
        int int34 = classWriter26.newConst((java.lang.Object) 10.0d);
        int int36 = classWriter26.newClass("hi!");
        classWriter26.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter(0);
        int int56 = classWriter54.newConst((java.lang.Object) 1);
        int int61 = classWriter54.newMethod("", "", "", true);
        int int66 = classWriter54.newMethod("hi!", "hi!", "hi!", false);
        int int67 = classWriter46.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter74 = new org.mockito.asm.ClassWriter((int) '4');
        int int77 = classWriter74.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray88 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter83.visitMethod(0, "hi!", "", "hi!", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter74.visitMethod((int) 'a', "hi!", "", "hi!", strArray88);
        classWriter46.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter26.visitMethod(4, "hi!", "", "", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter16.visitMethod((int) 'a', "", "", "hi!", strArray88);
        classWriter7.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray88);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor95 = classWriter1.visitMethod(10, "hi!", "hi!", "", strArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(methodVisitor90);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor93);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        classWriter1.visitSource("", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        java.lang.String[] strArray17 = null;
        classWriter1.visit(13, 3, "hi!", "hi!", "", strArray17);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter(0);
        int int26 = classWriter24.newConst((java.lang.Object) 1);
        int int31 = classWriter24.newMethod("", "", "", true);
        int int36 = classWriter24.newMethod("hi!", "hi!", "hi!", false);
        int int41 = classWriter24.newMethod("hi!", "hi!", "hi!", false);
        byte[] byteArray42 = classWriter24.toByteArray();
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newConst((java.lang.Object) 1);
        int int51 = classWriter44.newMethod("", "", "", true);
        int int56 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter44.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter44.visitMethod(7, "", "hi!", "hi!", strArray72);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = classWriter44.visitAnnotation("", true);
        int int79 = classWriter44.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor82 = classWriter44.visitAnnotation("", true);
        int int83 = classWriter24.newConst((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor84 = classWriter1.visitField((int) ' ', "hi!", "", "", (java.lang.Object) classWriter24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@7b020d58");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 11 + "'", int61 == 11);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 7 + "'", int79 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        int int8 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter(0);
        int int16 = classWriter14.newClass("");
        classWriter14.visitSource("hi!", "");
        int int24 = classWriter14.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor30 = classWriter14.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter37.visitMethod(0, "hi!", "", "hi!", strArray42);
        classWriter14.visit((int) (byte) 100, 0, "", "", "hi!", strArray42);
        classWriter14.visitEnd();
        byte[] byteArray46 = classWriter14.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter14.visitAnnotation("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor50 = classWriter1.visitField((-1), "", "hi!", "", (java.lang.Object) classWriter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@c5fb11b");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor49);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        int int18 = classWriter1.newClass("");
        int int22 = classWriter1.newField("", "hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        classWriter1.visitInnerClass("", "", "hi!", 6);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        classWriter1.visitOuterClass("", "", "");
        int int49 = classWriter1.newField("", "", "");
        int int53 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor56);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter31.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        int int46 = classWriter43.newNameType("", "hi!");
        classWriter43.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter((int) '4');
        int int60 = classWriter57.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter66.visitMethod(0, "hi!", "", "hi!", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter57.visitMethod((int) 'a', "hi!", "", "hi!", strArray71);
        classWriter43.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter31.visitMethod(7, "", "", "", strArray71);
        org.mockito.asm.FieldVisitor fieldVisitor76 = classWriter1.visitField(4, "", "hi!", "hi!", (java.lang.Object) "");
        classWriter1.visitInnerClass("", "hi!", "hi!", 9);
        int int85 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 7 + "'", int85 == 7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor16 = classWriter10.visitMethod(0, "hi!", "", "hi!", strArray15);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        int int30 = classWriter18.newMethod("hi!", "hi!", "hi!", false);
        int int31 = classWriter10.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        int int41 = classWriter38.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor53 = classWriter47.visitMethod(0, "hi!", "", "hi!", strArray52);
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter38.visitMethod((int) 'a', "hi!", "", "hi!", strArray52);
        classWriter10.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray52);
        org.mockito.asm.MethodVisitor methodVisitor56 = classWriter1.visitMethod(0, "", "", "hi!", strArray52);
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter62.visitMethod(0, "hi!", "", "hi!", strArray67);
        int int70 = classWriter62.newConst((java.lang.Object) 10.0d);
        int int72 = classWriter62.newClass("hi!");
        classWriter62.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor77 = classWriter1.visitField((-1), "", "", "", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodVisitor16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor77);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.Object obj30 = null;
        org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter1.visitField(0, "hi!", "", "", obj30);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor31);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter3 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter3.newNameType("", "hi!");
        byte[] byteArray7 = classWriter3.toByteArray();
        int int9 = classWriter3.newClass("hi!");
        java.lang.String[] strArray15 = null;
        classWriter3.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray15);
        int int17 = classWriter1.newConst((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        byte[] byteArray32 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0]");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        int int16 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int25 = classWriter1.newMethod("", "", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor28);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int3 = classWriter1.newClass("hi!");
        int int8 = classWriter1.newMethod("hi!", "", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int7 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        byte[] byteArray32 = classWriter1.toByteArray();
        int int34 = classWriter1.newClass("");
        byte[] byteArray35 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass36 = byteArray35.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitInnerClass("", "", "", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int35 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.Attribute attribute36 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int22 = classWriter20.newClass("");
        classWriter20.visitSource("hi!", "");
        byte[] byteArray26 = classWriter20.toByteArray();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter32.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        int int47 = classWriter44.newNameType("", "hi!");
        classWriter44.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        int int61 = classWriter58.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter58.visitMethod((int) 'a', "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter32.visitMethod(7, "", "", "", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter20.visitMethod(9, "hi!", "hi!", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod(4, "hi!", "hi!", "hi!", strArray72);
        classWriter1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        int int23 = classWriter1.newClass("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        int int17 = classWriter1.newNameType("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int27 = classWriter1.newMethod("", "", "", true);
        int int29 = classWriter1.newClass("hi!");
        int int31 = classWriter1.newUTF8("hi!");
        int int33 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int34 = classWriter1.newNameType("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int14 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        int int16 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("hi!", true);
        int int21 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter31.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        int int46 = classWriter43.newNameType("", "hi!");
        classWriter43.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter((int) '4');
        int int60 = classWriter57.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter66.visitMethod(0, "hi!", "", "hi!", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter57.visitMethod((int) 'a', "hi!", "", "hi!", strArray71);
        classWriter43.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter31.visitMethod(7, "", "", "", strArray71);
        org.mockito.asm.FieldVisitor fieldVisitor76 = classWriter1.visitField(4, "", "hi!", "hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass77 = fieldVisitor76.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classWriter83.visitAnnotation("hi!", true);
        int int87 = classWriter1.newConst((java.lang.Object) true);
        int int91 = classWriter1.newField("", "", "");
        int int93 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 7 + "'", int87 == 7);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 9 + "'", int91 == 9);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2 + "'", int93 == 2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int36 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitEnd();
        int int39 = classWriter1.newUTF8("");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        int int15 = classWriter1.newNameType("hi!", "hi!");
        int int18 = classWriter1.newNameType("", "");
        java.lang.Class<?> wildcardClass19 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        java.lang.Class<?> wildcardClass9 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor13 = classWriter7.visitMethod(0, "hi!", "", "hi!", strArray12);
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter(0);
        int int17 = classWriter15.newConst((java.lang.Object) 1);
        int int22 = classWriter15.newMethod("", "", "", true);
        int int27 = classWriter15.newMethod("hi!", "hi!", "hi!", false);
        int int28 = classWriter7.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int38 = classWriter35.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter44.visitMethod(0, "hi!", "", "hi!", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter35.visitMethod((int) 'a', "hi!", "", "hi!", strArray49);
        classWriter7.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray49);
        int int54 = classWriter7.newUTF8("hi!");
        int int55 = classWriter1.newConst((java.lang.Object) int54);
        java.lang.Class<?> wildcardClass56 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodVisitor13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        byte[] byteArray89 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass90 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[-54, -2, -70, -66, -1, -1, -1, -1, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 3, 0, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 2, 0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass90);
    }
}

