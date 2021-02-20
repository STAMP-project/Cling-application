import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter17 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter17);
        aSMifierClassVisitor18.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor1.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list26 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list20 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor27.visitAnnotation("", true);
        java.util.List list43 = aSMifierClassVisitor27.getText();
        aSMifierClassVisitor27.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor27.visitInnerClass("hi!", "", "", (int) (short) 10);
        aSMifierClassVisitor27.visitInnerClass("", "", "hi!", (int) (byte) 100);
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor64.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor64.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor64.visitSource("hi!", "");
        java.util.List list80 = aSMifierClassVisitor64.text;
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor64.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray86);
        org.mockito.asm.MethodVisitor methodVisitor88 = aSMifierClassVisitor27.visitMethod((-1), "hi!", "", "hi!", strArray86);
        aSMifierClassVisitor1.visit(0, (int) (short) 100, "hi!", "hi!", "hi!", strArray86);
        java.util.List list90 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 100);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(list90);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        java.io.PrintWriter printWriter32 = null;
        aSMifierClassVisitor31.print(printWriter32);
        java.io.PrintWriter printWriter38 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor39 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter38);
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor39.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor39.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor39.visitSource("hi!", "");
        aSMifierClassVisitor39.visitSource("", "hi!");
        aSMifierClassVisitor39.visitOuterClass("", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor31.visitField((int) (byte) 10, "", "", "", (java.lang.Object) "");
        java.util.List list63 = aSMifierClassVisitor31.getText();
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor1.visitField(0, "hi!", "", "hi!", (java.lang.Object) aSMifierClassVisitor31);
        java.util.List list65 = aSMifierClassVisitor31.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        java.util.List list23 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list24 = aSMifierClassVisitor1.getText();
        java.util.List list25 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray44 = null;
        aSMifierClassVisitor32.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray44);
        java.lang.String[] strArray50 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor51 = aSMifierClassVisitor32.visitMethod(100, "", "hi!", "", strArray50);
        aSMifierClassVisitor1.visit((int) (byte) 100, 0, "hi!", "hi!", "", strArray50);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 10);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.util.List list47 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(annotationVisitor61);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (short) -1);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor23.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor23.visitSource("hi!", "");
        java.util.List list39 = aSMifierClassVisitor23.getText();
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor46.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor46.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray61);
        aSMifierClassVisitor23.visit((int) (short) 10, 1, "", "", "hi!", strArray61);
        org.mockito.asm.MethodVisitor methodVisitor64 = aSMifierClassVisitor1.visitMethod((int) (short) 0, "hi!", "hi!", "", strArray61);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list72 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(list72);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray34 = null;
        aSMifierClassVisitor22.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray34);
        aSMifierClassVisitor22.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor22.visitAnnotation("hi!", true);
        java.util.List list43 = aSMifierClassVisitor22.text;
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor1.visitField(10, "hi!", "hi!", "", (java.lang.Object) list43);
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list48 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list43 = aSMifierClassVisitor30.text;
        aSMifierClassVisitor30.visitSource("", "");
        java.util.List list47 = aSMifierClassVisitor30.getText();
        java.util.List list48 = aSMifierClassVisitor30.getText();
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor1.visitField((int) 'a', "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor30);
        aSMifierClassVisitor30.visitInnerClass("hi!", "", "", (int) (byte) 1);
        java.lang.Object obj59 = null;
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor30.visitField(100, "hi!", "", "hi!", obj59);
        aSMifierClassVisitor30.visitSource("", "");
        java.lang.Class<?> wildcardClass64 = aSMifierClassVisitor30.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor34.visitSource("hi!", "");
        java.util.List list50 = aSMifierClassVisitor34.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor34.visitAnnotation("hi!", false);
        java.util.List list54 = aSMifierClassVisitor34.text;
        java.util.List list55 = aSMifierClassVisitor34.getText();
        aSMifierClassVisitor34.visitSource("hi!", "");
        aSMifierClassVisitor34.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor34.visitAnnotation("", false);
        java.lang.Class<?> wildcardClass65 = aSMifierClassVisitor34.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor1.visitField((-1), "", "", "hi!", (java.lang.Object) aSMifierClassVisitor34);
        java.io.PrintWriter printWriter67 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(fieldVisitor66);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor31.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor31.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor31.visitAnnotation("", true);
        java.util.List list47 = aSMifierClassVisitor31.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor31.visitAnnotation("", true);
        java.lang.String[] strArray55 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor56 = aSMifierClassVisitor31.visitMethod((int) ' ', "", "hi!", "", strArray55);
        aSMifierClassVisitor1.visit((int) (short) 100, (int) (byte) 100, "", "hi!", "hi!", strArray55);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertNotNull(annotationVisitor75);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray46 = null;
        aSMifierClassVisitor34.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray46);
        java.lang.String[] strArray52 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor53 = aSMifierClassVisitor34.visitMethod(100, "", "hi!", "", strArray52);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor34.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter62 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor63 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter62);
        aSMifierClassVisitor63.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        aSMifierClassVisitor63.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray75);
        aSMifierClassVisitor34.visit((int) '4', (int) '#', "", "", "", strArray75);
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "", "hi!", "hi!", strArray75);
        java.util.List list79 = aSMifierClassVisitor1.getText();
        java.lang.String[] strArray84 = null;
        org.mockito.asm.MethodVisitor methodVisitor85 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "", "", "hi!", strArray84);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(methodVisitor85);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray40 = null;
        aSMifierClassVisitor28.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray40);
        aSMifierClassVisitor28.visitSource("hi!", "hi!");
        aSMifierClassVisitor28.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor28.visitMethod((int) (byte) 100, "hi!", "", "", strArray53);
        aSMifierClassVisitor1.visit(0, (int) '#', "hi!", "hi!", "hi!", strArray53);
        java.util.List list56 = aSMifierClassVisitor1.getText();
        java.util.List list57 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter62 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor63 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter62);
        java.io.PrintWriter printWriter64 = null;
        aSMifierClassVisitor63.print(printWriter64);
        java.util.List list66 = aSMifierClassVisitor63.getText();
        java.util.List list67 = aSMifierClassVisitor63.text;
        java.util.List list68 = aSMifierClassVisitor63.getText();
        aSMifierClassVisitor63.visitOuterClass("", "", "hi!");
        java.io.PrintWriter printWriter77 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor78 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter77);
        java.io.PrintWriter printWriter79 = null;
        aSMifierClassVisitor78.print(printWriter79);
        aSMifierClassVisitor78.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray91 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor78.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray91);
        org.mockito.asm.MethodVisitor methodVisitor93 = aSMifierClassVisitor63.visitMethod((-1), "", "hi!", "", strArray91);
        org.mockito.asm.FieldVisitor fieldVisitor94 = aSMifierClassVisitor1.visitField((int) (short) 1, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor63);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor63.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(fieldVisitor94);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.util.List list29 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        java.util.List list38 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (byte) 100);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", 0);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.util.List list47 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "", "", 100);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (byte) 0);
        java.util.List list13 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter18 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor19 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter18);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor19.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray31 = null;
        aSMifierClassVisitor19.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray31);
        java.lang.String[] strArray37 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor38 = aSMifierClassVisitor19.visitMethod(100, "", "hi!", "", strArray37);
        org.mockito.asm.MethodVisitor methodVisitor39 = aSMifierClassVisitor1.visitMethod((int) (short) 1, "hi!", "hi!", "hi!", strArray37);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list43 = aSMifierClassVisitor1.getText();
        java.util.List list44 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list8 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        java.io.PrintWriter printWriter27 = null;
        aSMifierClassVisitor26.print(printWriter27);
        java.util.List list29 = aSMifierClassVisitor26.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor26.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor26.visitAnnotation("", true);
        java.util.List list36 = aSMifierClassVisitor26.getText();
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor26);
        java.io.PrintWriter printWriter42 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor43.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor43.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor43.visitAnnotation("hi!", true);
        java.lang.String[] strArray64 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor43.visit(1, 100, "hi!", "", "hi!", strArray64);
        org.mockito.asm.MethodVisitor methodVisitor66 = aSMifierClassVisitor1.visitMethod((-1), "hi!", "hi!", "hi!", strArray64);
        java.util.List list67 = aSMifierClassVisitor1.text;
        java.util.List list68 = aSMifierClassVisitor1.text;
        java.util.List list69 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute70 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list14 = aSMifierClassVisitor1.getText();
        java.util.List list15 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list19 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        java.util.List list23 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.lang.Class<?> wildcardClass27 = annotationVisitor26.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list30 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) '#');
        java.io.PrintWriter printWriter39 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor33);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 10);
        java.util.List list28 = aSMifierClassVisitor1.text;
        java.util.List list29 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor27.visitSource("hi!", "");
        java.util.List list43 = aSMifierClassVisitor27.getText();
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor50.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor66 = aSMifierClassVisitor50.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray65);
        aSMifierClassVisitor27.visit((int) (short) 10, 1, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit((int) (short) 1, (int) (short) 1, "hi!", "hi!", "hi!", strArray65);
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) '#');
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(annotationVisitor71);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.util.List list20 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor45 = aSMifierClassVisitor29.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray44);
        aSMifierClassVisitor29.visitInnerClass("", "hi!", "", (int) ' ');
        java.io.PrintWriter printWriter55 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor56 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor56.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor56.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.FieldVisitor fieldVisitor69 = aSMifierClassVisitor29.visitField(100, "", "", "", (java.lang.Object) "");
        aSMifierClassVisitor29.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField(0, "hi!", "", "hi!", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor69);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter17 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter17);
        aSMifierClassVisitor18.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor1.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "", "", 1);
        java.lang.Class<?> wildcardClass42 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 0);
        aSMifierClassVisitor1.visitSource("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.lang.Object obj33 = null;
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor1.visitField((int) (byte) 0, "", "hi!", "", obj33);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.lang.String[] strArray43 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor1.visit(10, (int) (byte) 100, "hi!", "hi!", "hi!", strArray43);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (byte) 10);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 100);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter31 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor15.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray27 = null;
        aSMifierClassVisitor15.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray27);
        aSMifierClassVisitor15.visitSource("hi!", "hi!");
        aSMifierClassVisitor15.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor15.visitAnnotation("", true);
        aSMifierClassVisitor15.visitSource("", "hi!");
        aSMifierClassVisitor15.visitInnerClass("", "", "hi!", (int) '4');
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor15.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.Attribute attribute51 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 10);
        java.lang.Class<?> wildcardClass25 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter32 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter32);
        aSMifierClassVisitor33.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        aSMifierClassVisitor33.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray45);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField(100, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor33);
        aSMifierClassVisitor33.visitSource("hi!", "");
        java.util.List list54 = aSMifierClassVisitor33.text;
        aSMifierClassVisitor33.visitInnerClass("hi!", "", "hi!", (int) '4');
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = aSMifierClassVisitor33.visitAnnotation("", false);
        java.io.PrintWriter printWriter67 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor68 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter67);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor68.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor80 = aSMifierClassVisitor68.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = aSMifierClassVisitor68.visitAnnotation("", true);
        java.util.List list84 = aSMifierClassVisitor68.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor87 = aSMifierClassVisitor68.visitAnnotation("", true);
        aSMifierClassVisitor68.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor94 = aSMifierClassVisitor68.visitAnnotation("", false);
        java.util.List list95 = aSMifierClassVisitor68.getText();
        org.mockito.asm.FieldVisitor fieldVisitor96 = aSMifierClassVisitor33.visitField((int) (short) 0, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor68);
        java.lang.Class<?> wildcardClass97 = fieldVisitor96.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(fieldVisitor80);
        org.junit.Assert.assertNotNull(annotationVisitor83);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(annotationVisitor87);
        org.junit.Assert.assertNotNull(annotationVisitor94);
        org.junit.Assert.assertNotNull(list95);
        org.junit.Assert.assertNotNull(fieldVisitor96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitSource("", "hi!");
        java.util.List list32 = aSMifierClassVisitor28.getText();
        aSMifierClassVisitor28.visitSource("hi!", "hi!");
        aSMifierClassVisitor28.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        aSMifierClassVisitor45.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor28.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) "hi!");
        java.util.List list51 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        java.util.List list22 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter53 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 1);
        java.io.PrintWriter printWriter15 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor16 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor16.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray28 = null;
        aSMifierClassVisitor16.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray28);
        aSMifierClassVisitor16.visitSource("hi!", "hi!");
        aSMifierClassVisitor16.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierClassVisitor16.visitAnnotation("", true);
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor46.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor46.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor46.visitAnnotation("", true);
        java.util.List list62 = aSMifierClassVisitor46.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierClassVisitor46.visitAnnotation("", true);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor71 = aSMifierClassVisitor46.visitMethod((int) ' ', "", "hi!", "", strArray70);
        aSMifierClassVisitor16.visit((int) (short) 100, (int) (byte) 100, "", "hi!", "hi!", strArray70);
        aSMifierClassVisitor16.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = aSMifierClassVisitor16.visitAnnotation("hi!", true);
        java.util.List list80 = aSMifierClassVisitor16.text;
        aSMifierClassVisitor16.visitInnerClass("", "", "hi!", 100);
        org.mockito.asm.FieldVisitor fieldVisitor86 = aSMifierClassVisitor1.visitField((int) (byte) 1, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor16);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(annotationVisitor79);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(fieldVisitor86);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        java.util.List list14 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray32 = null;
        aSMifierClassVisitor20.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray32);
        aSMifierClassVisitor20.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor20.visitAnnotation("hi!", true);
        aSMifierClassVisitor20.visitSource("", "");
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor49.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor49.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor49.visitAnnotation("hi!", true);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor49.visit(1, 100, "hi!", "", "hi!", strArray70);
        org.mockito.asm.AnnotationVisitor annotationVisitor74 = aSMifierClassVisitor49.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierClassVisitor49.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor78 = aSMifierClassVisitor20.visitField(0, "", "", "", (java.lang.Object) annotationVisitor77);
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor1.visitField((int) '4', "hi!", "", "", (java.lang.Object) aSMifierClassVisitor20);
        java.io.PrintWriter printWriter80 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor20.print(printWriter80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(annotationVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(fieldVisitor78);
        org.junit.Assert.assertNotNull(fieldVisitor79);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list27 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list34 = aSMifierClassVisitor1.text;
        java.util.List list35 = aSMifierClassVisitor1.text;
        java.util.List list36 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor42.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor42.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor42.visitAnnotation("hi!", true);
        java.util.List list58 = aSMifierClassVisitor42.text;
        java.util.List list59 = aSMifierClassVisitor42.getText();
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor1.visitField((int) 'a', "hi!", "", "", (java.lang.Object) aSMifierClassVisitor42);
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(fieldVisitor60);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 100);
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        aSMifierClassVisitor32.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list38 = aSMifierClassVisitor32.getText();
        java.util.List list39 = aSMifierClassVisitor32.getText();
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor45.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor45.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor60 = aSMifierClassVisitor45.visitAnnotation("hi!", true);
        java.util.List list61 = aSMifierClassVisitor45.text;
        java.io.PrintWriter printWriter67 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor68 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter67);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor68.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor80 = aSMifierClassVisitor68.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor68.visitSource("hi!", "");
        java.util.List list84 = aSMifierClassVisitor68.text;
        java.lang.String[] strArray90 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor68.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray90);
        aSMifierClassVisitor45.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor93 = aSMifierClassVisitor32.visitMethod((int) (short) 100, "", "", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor94 = aSMifierClassVisitor1.visitMethod((int) (short) 0, "hi!", "", "hi!", strArray90);
        java.lang.Class<?> wildcardClass95 = methodVisitor94.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(annotationVisitor60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(fieldVisitor80);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", 1);
        java.util.List list25 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor34.visitSource("hi!", "");
        java.util.List list50 = aSMifierClassVisitor34.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor34.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor34.visitAnnotation("", true);
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor62.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor62.visitSource("hi!", "");
        java.util.List list78 = aSMifierClassVisitor62.text;
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor34.visitField((int) (short) 0, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor62);
        org.mockito.asm.AnnotationVisitor annotationVisitor82 = aSMifierClassVisitor62.visitAnnotation("", true);
        org.mockito.asm.FieldVisitor fieldVisitor83 = aSMifierClassVisitor1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(fieldVisitor79);
        org.junit.Assert.assertNotNull(annotationVisitor82);
        org.junit.Assert.assertNotNull(fieldVisitor83);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list33 = aSMifierClassVisitor1.getText();
        java.util.List list34 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor26.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor26.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = aSMifierClassVisitor26.visitAnnotation("", true);
        java.util.List list42 = aSMifierClassVisitor26.getText();
        aSMifierClassVisitor26.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray52 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor26.visit(1, (int) (short) 0, "hi!", "", "", strArray52);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray52);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(annotationVisitor64);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list43 = aSMifierClassVisitor30.text;
        aSMifierClassVisitor30.visitSource("", "");
        java.util.List list47 = aSMifierClassVisitor30.getText();
        java.util.List list48 = aSMifierClassVisitor30.getText();
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor1.visitField((int) 'a', "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor30);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter23 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor24 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter23);
        org.mockito.asm.FieldVisitor fieldVisitor30 = aSMifierClassVisitor24.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor40 = aSMifierClassVisitor24.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray39);
        aSMifierClassVisitor1.visit((int) (short) 10, 1, "", "", "hi!", strArray39);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter50 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor51 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter50);
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor51.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor51.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = aSMifierClassVisitor51.visitAnnotation("hi!", true);
        java.lang.Class<?> wildcardClass67 = aSMifierClassVisitor51.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor1.visitField(0, "", "", "hi!", (java.lang.Object) aSMifierClassVisitor51);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 0);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(annotationVisitor66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(fieldVisitor68);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list27 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) 'a');
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (-1));
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list24 = aSMifierClassVisitor1.getText();
        java.util.List list25 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray44 = null;
        aSMifierClassVisitor32.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray44);
        java.lang.String[] strArray50 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor51 = aSMifierClassVisitor32.visitMethod(100, "", "hi!", "", strArray50);
        aSMifierClassVisitor1.visit((int) (byte) 100, 0, "hi!", "hi!", "", strArray50);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list56 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.lang.String[] strArray23 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor24 = aSMifierClassVisitor1.visitMethod((int) '4', "hi!", "hi!", "hi!", strArray23);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.lang.Class<?> wildcardClass28 = annotationVisitor27.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(methodVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor35.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor35.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor35.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor60.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor60.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor60.visitAnnotation("", true);
        java.util.List list76 = aSMifierClassVisitor60.getText();
        aSMifierClassVisitor60.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor60.visit(1, (int) (short) 0, "hi!", "", "", strArray86);
        aSMifierClassVisitor35.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray86);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) (short) 0, "hi!", "hi!", "hi!", strArray86);
        java.util.List list90 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.util.List list95 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(list90);
        org.junit.Assert.assertNotNull(list95);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list31 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list39 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute40 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        java.util.List list23 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list27 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.lang.String[] strArray38 = null;
        org.mockito.asm.MethodVisitor methodVisitor39 = aSMifierClassVisitor1.visitMethod((int) (short) 0, "", "hi!", "hi!", strArray38);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(methodVisitor39);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray35 = null;
        aSMifierClassVisitor23.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray35);
        aSMifierClassVisitor23.visitSource("hi!", "hi!");
        aSMifierClassVisitor23.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor23.visitAnnotation("", true);
        aSMifierClassVisitor23.visitSource("", "hi!");
        java.io.PrintWriter printWriter54 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter54);
        java.io.PrintWriter printWriter56 = null;
        aSMifierClassVisitor55.print(printWriter56);
        org.mockito.asm.AnnotationVisitor annotationVisitor60 = aSMifierClassVisitor55.visitAnnotation("", false);
        java.util.List list61 = aSMifierClassVisitor55.getText();
        java.io.PrintWriter printWriter66 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor67 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter66);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor67.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor67.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor67.visitSource("hi!", "");
        java.util.List list83 = aSMifierClassVisitor67.text;
        java.lang.String[] strArray89 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor67.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray89);
        org.mockito.asm.MethodVisitor methodVisitor91 = aSMifierClassVisitor55.visitMethod((int) (byte) 10, "", "", "", strArray89);
        org.mockito.asm.MethodVisitor methodVisitor92 = aSMifierClassVisitor23.visitMethod((int) (byte) 100, "", "hi!", "", strArray89);
        aSMifierClassVisitor1.visit((int) ' ', (int) '#', "hi!", "hi!", "", strArray89);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(fieldVisitor79);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.lang.Object obj33 = null;
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor1.visitField((int) (byte) 0, "", "hi!", "", obj33);
        java.io.PrintWriter printWriter39 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor40 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter39);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor40.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor40.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierClassVisitor40.visitAnnotation("hi!", true);
        java.lang.String[] strArray61 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor40.visit(1, 100, "hi!", "", "hi!", strArray61);
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierClassVisitor40.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierClassVisitor40.visitAnnotation("hi!", true);
        java.lang.String[] strArray73 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor74 = aSMifierClassVisitor40.visitMethod((int) '4', "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "", "", "", strArray73);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(annotationVisitor85);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor15.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray27 = null;
        aSMifierClassVisitor15.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray27);
        aSMifierClassVisitor15.visitSource("hi!", "hi!");
        aSMifierClassVisitor15.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor15.visitAnnotation("", true);
        aSMifierClassVisitor15.visitSource("", "hi!");
        aSMifierClassVisitor15.visitInnerClass("", "", "hi!", (int) '4');
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor15.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "", "hi!", (java.lang.Object) "hi!");
        java.util.List list51 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor13.visitSource("hi!", "");
        java.util.List list29 = aSMifierClassVisitor13.text;
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor13.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray35);
        aSMifierClassVisitor1.visit(0, (int) '4', "hi!", "hi!", "", strArray35);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        aSMifierClassVisitor46.visitSource("", "hi!");
        java.util.List list50 = aSMifierClassVisitor46.getText();
        aSMifierClassVisitor46.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor46.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor62.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor79 = aSMifierClassVisitor46.visitMethod((int) (short) 100, "hi!", "", "", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor80 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "hi!", "", "", strArray77);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) '4');
        java.util.List list86 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(list86);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor14.visitSource("", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = null;
        aSMifierClassVisitor35.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray47);
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor35.visitMethod(100, "", "hi!", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor14.visitMethod(1, "hi!", "hi!", "", strArray53);
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (byte) 1, "hi!", "", "hi!", strArray53);
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list63 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter68 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor69 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter68);
        org.mockito.asm.FieldVisitor fieldVisitor75 = aSMifierClassVisitor69.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor69.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor1.visitField((-1), "", "", "hi!", (java.lang.Object) "");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 10);
        java.util.List list88 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list92 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list8 = aSMifierClassVisitor1.text;
        java.util.List list9 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor15.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor27 = aSMifierClassVisitor15.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor15.visitSource("hi!", "");
        java.util.List list31 = aSMifierClassVisitor15.text;
        java.util.List list32 = aSMifierClassVisitor15.text;
        java.util.List list33 = aSMifierClassVisitor15.getText();
        java.util.List list34 = aSMifierClassVisitor15.getText();
        aSMifierClassVisitor15.visitSource("hi!", "");
        aSMifierClassVisitor15.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        java.io.PrintWriter printWriter47 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter47);
        aSMifierClassVisitor48.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor48.visitSource("hi!", "hi!");
        java.util.List list57 = aSMifierClassVisitor48.text;
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor15.visitField((int) (short) 10, "hi!", "hi!", "hi!", (java.lang.Object) list57);
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor15.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor1.visitField((int) (byte) 0, "hi!", "", "", (java.lang.Object) "hi!");
        java.util.List list63 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor27);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(annotationVisitor66);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list20 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor27.visitAnnotation("", true);
        java.util.List list43 = aSMifierClassVisitor27.getText();
        aSMifierClassVisitor27.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor27.visitInnerClass("hi!", "", "", (int) (short) 10);
        aSMifierClassVisitor27.visitInnerClass("", "", "hi!", (int) (byte) 100);
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor64.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor64.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor64.visitSource("hi!", "");
        java.util.List list80 = aSMifierClassVisitor64.text;
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor64.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray86);
        org.mockito.asm.MethodVisitor methodVisitor88 = aSMifierClassVisitor27.visitMethod((-1), "hi!", "", "hi!", strArray86);
        aSMifierClassVisitor1.visit(0, (int) (short) 100, "hi!", "hi!", "hi!", strArray86);
        java.util.List list90 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute91 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(list90);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter35 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter35);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor36.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray48 = null;
        aSMifierClassVisitor36.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray48);
        java.lang.String[] strArray54 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor36.visitMethod(100, "", "hi!", "", strArray54);
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (byte) -1, "hi!", "", "hi!", strArray54);
        java.util.List list57 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor64.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor64.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor64.visitSource("hi!", "");
        java.util.List list80 = aSMifierClassVisitor64.text;
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor64.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray86);
        aSMifierClassVisitor1.visit((int) (short) -1, 0, "", "hi!", "", strArray86);
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list92 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter96 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(annotationVisitor91);
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list7 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list11 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter16 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter16);
        java.io.PrintWriter printWriter18 = null;
        aSMifierClassVisitor17.print(printWriter18);
        java.util.List list20 = aSMifierClassVisitor17.getText();
        java.io.PrintWriter printWriter21 = null;
        aSMifierClassVisitor17.print(printWriter21);
        aSMifierClassVisitor17.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor1.visitField((int) '4', "hi!", "", "hi!", (java.lang.Object) "");
        java.util.List list27 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter32 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter32);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor33.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor33.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor33.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierClassVisitor33.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter57 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter57);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor58.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor58.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = aSMifierClassVisitor58.visitAnnotation("", true);
        java.util.List list74 = aSMifierClassVisitor58.getText();
        aSMifierClassVisitor58.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray84 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor58.visit(1, (int) (short) 0, "hi!", "", "", strArray84);
        aSMifierClassVisitor33.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray84);
        java.util.List list87 = aSMifierClassVisitor33.text;
        org.mockito.asm.FieldVisitor fieldVisitor88 = aSMifierClassVisitor1.visitField((int) (byte) 10, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor33);
        java.util.List list89 = aSMifierClassVisitor1.text;
        org.mockito.asm.Attribute attribute90 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(fieldVisitor88);
        org.junit.Assert.assertNotNull(list89);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor14.visitSource("", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = null;
        aSMifierClassVisitor35.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray47);
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor35.visitMethod(100, "", "hi!", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor14.visitMethod(1, "hi!", "hi!", "", strArray53);
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (byte) 1, "hi!", "", "hi!", strArray53);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 10);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField((int) (byte) 10, "hi!", "", "", (java.lang.Object) true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor73);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) '#');
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (byte) 0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list36 = aSMifierClassVisitor1.text;
        java.lang.Class<?> wildcardClass37 = list36.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter35 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        java.util.List list13 = aSMifierClassVisitor1.text;
        java.util.List list14 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list21 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor27.visitAnnotation("", true);
        java.util.List list43 = aSMifierClassVisitor27.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor27.visitAnnotation("", true);
        aSMifierClassVisitor27.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor27.visitOuterClass("hi!", "hi!", "");
        aSMifierClassVisitor27.visitOuterClass("", "", "");
        aSMifierClassVisitor27.visitOuterClass("hi!", "hi!", "");
        aSMifierClassVisitor27.visitOuterClass("hi!", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor1.visitField((int) 'a', "hi!", "hi!", "", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor67);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.String[] strArray25 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor26 = aSMifierClassVisitor1.visitMethod((int) ' ', "", "hi!", "", strArray25);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", 1);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (short) -1);
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor42.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor42.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor42.visitAnnotation("", true);
        java.util.List list58 = aSMifierClassVisitor42.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor42.visitAnnotation("", true);
        java.lang.String[] strArray66 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor67 = aSMifierClassVisitor42.visitMethod((int) ' ', "", "hi!", "", strArray66);
        aSMifierClassVisitor42.visitSource("hi!", "");
        java.util.List list71 = aSMifierClassVisitor42.text;
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "", "hi!", (java.lang.Object) list71);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(fieldVisitor72);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        java.util.List list12 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        aSMifierClassVisitor53.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        aSMifierClassVisitor53.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit(1, 10, "hi!", "hi!", "hi!", strArray65);
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(annotationVisitor70);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor30.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor30.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass49 = aSMifierClassVisitor30.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField(10, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor30);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (byte) 1);
        java.util.List list63 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) '4');
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(list63);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list43 = aSMifierClassVisitor30.text;
        aSMifierClassVisitor30.visitSource("", "");
        java.util.List list47 = aSMifierClassVisitor30.getText();
        java.util.List list48 = aSMifierClassVisitor30.getText();
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor1.visitField((int) 'a', "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor30);
        aSMifierClassVisitor30.visitInnerClass("hi!", "", "", (int) (byte) 1);
        java.lang.Object obj59 = null;
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor30.visitField(100, "hi!", "", "hi!", obj59);
        aSMifierClassVisitor30.visitSource("hi!", "hi!");
        java.util.List list64 = aSMifierClassVisitor30.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray26 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor27 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "hi!", "", "", strArray26);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        aSMifierClassVisitor53.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        aSMifierClassVisitor53.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit(1, 10, "hi!", "hi!", "hi!", strArray65);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField((int) (byte) 1, "hi!", "hi!", "hi!", (java.lang.Object) 1.0d);
        java.util.List list74 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list79 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 100);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(list79);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list20 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        java.io.PrintWriter printWriter31 = null;
        aSMifierClassVisitor30.print(printWriter31);
        aSMifierClassVisitor30.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 0);
        aSMifierClassVisitor30.visitSource("hi!", "");
        aSMifierClassVisitor30.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor50.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor50.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierClassVisitor50.visitAnnotation("", true);
        java.util.List list66 = aSMifierClassVisitor50.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = aSMifierClassVisitor50.visitAnnotation("", true);
        java.lang.String[] strArray74 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor50.visitMethod((int) ' ', "", "hi!", "", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor30.visitMethod((int) (byte) 10, "", "", "hi!", strArray74);
        aSMifierClassVisitor1.visit(0, 0, "hi!", "hi!", "", strArray74);
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(annotationVisitor69);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor80);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list14 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor20.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor20.visitSource("hi!", "");
        java.util.List list36 = aSMifierClassVisitor20.getText();
        java.io.PrintWriter printWriter42 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor43.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor59 = aSMifierClassVisitor43.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray58);
        aSMifierClassVisitor20.visit((int) (short) 10, 1, "", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor61 = aSMifierClassVisitor1.visitMethod((int) (byte) 0, "", "", "", strArray58);
        java.util.List list62 = aSMifierClassVisitor1.getText();
        java.util.List list63 = aSMifierClassVisitor1.getText();
        java.util.List list64 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list20 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor27.visitAnnotation("", true);
        java.util.List list43 = aSMifierClassVisitor27.getText();
        aSMifierClassVisitor27.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor27.visitInnerClass("hi!", "", "", (int) (short) 10);
        aSMifierClassVisitor27.visitInnerClass("", "", "hi!", (int) (byte) 100);
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor64.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor64.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor64.visitSource("hi!", "");
        java.util.List list80 = aSMifierClassVisitor64.text;
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor64.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray86);
        org.mockito.asm.MethodVisitor methodVisitor88 = aSMifierClassVisitor27.visitMethod((-1), "hi!", "", "hi!", strArray86);
        aSMifierClassVisitor1.visit(0, (int) (short) 100, "hi!", "hi!", "hi!", strArray86);
        java.util.List list90 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) 100);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(list90);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (short) 100);
        java.util.List list12 = aSMifierClassVisitor1.text;
        java.util.List list13 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) (byte) 100);
        java.util.List list24 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.lang.String[] strArray25 = null;
        aSMifierClassVisitor1.visit((-1), (int) 'a', "", "", "hi!", strArray25);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) '4');
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list30 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) '#');
        org.mockito.asm.Attribute attribute39 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor33);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter17 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter17);
        aSMifierClassVisitor18.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor1.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        java.util.List list38 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        aSMifierClassVisitor53.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        aSMifierClassVisitor53.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit(1, 10, "hi!", "hi!", "hi!", strArray65);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField((int) (byte) 1, "hi!", "hi!", "hi!", (java.lang.Object) 1.0d);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list80 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.util.List list5 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter10 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor11 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        java.io.PrintWriter printWriter12 = null;
        aSMifierClassVisitor11.print(printWriter12);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor11.visitAnnotation("", false);
        java.util.List list17 = aSMifierClassVisitor11.getText();
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray35 = null;
        aSMifierClassVisitor23.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray35);
        aSMifierClassVisitor23.visitSource("hi!", "hi!");
        aSMifierClassVisitor23.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor23.visitAnnotation("", true);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        org.mockito.asm.FieldVisitor fieldVisitor59 = aSMifierClassVisitor53.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor65 = aSMifierClassVisitor53.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierClassVisitor53.visitAnnotation("", true);
        java.util.List list69 = aSMifierClassVisitor53.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = aSMifierClassVisitor53.visitAnnotation("", true);
        java.lang.String[] strArray77 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor53.visitMethod((int) ' ', "", "hi!", "", strArray77);
        aSMifierClassVisitor23.visit((int) (short) 100, (int) (byte) 100, "", "hi!", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor80 = aSMifierClassVisitor11.visitMethod(100, "", "hi!", "", strArray77);
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor1.visitField((int) (byte) 10, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor11);
        java.util.List list82 = aSMifierClassVisitor11.text;
        java.util.List list83 = aSMifierClassVisitor11.text;
        aSMifierClassVisitor11.visitSource("hi!", "hi!");
        java.util.List list87 = aSMifierClassVisitor11.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor90 = aSMifierClassVisitor11.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(annotationVisitor90);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list11 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list15 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.util.List list26 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 0);
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        java.io.PrintWriter printWriter38 = null;
        aSMifierClassVisitor37.print(printWriter38);
        java.util.List list40 = aSMifierClassVisitor37.getText();
        aSMifierClassVisitor37.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "", "", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(fieldVisitor44);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (-1));
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor20.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor20.visitAnnotation("", true);
        java.util.List list36 = aSMifierClassVisitor20.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierClassVisitor20.visitAnnotation("", true);
        java.lang.String[] strArray44 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor45 = aSMifierClassVisitor20.visitMethod((int) ' ', "", "hi!", "", strArray44);
        org.mockito.asm.MethodVisitor methodVisitor46 = aSMifierClassVisitor1.visitMethod((int) (byte) 1, "hi!", "hi!", "", strArray44);
        java.util.List list47 = aSMifierClassVisitor1.text;
        java.util.List list48 = aSMifierClassVisitor1.text;
        java.util.List list49 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        java.util.List list8 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor14.visitAnnotation("hi!", true);
        java.util.List list30 = aSMifierClassVisitor14.text;
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor37.visitSource("hi!", "");
        java.util.List list53 = aSMifierClassVisitor37.text;
        java.lang.String[] strArray59 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor37.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray59);
        aSMifierClassVisitor14.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor1.visitMethod((int) (short) 100, "", "", "", strArray59);
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list66 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor30.visitAnnotation("hi!", true);
        java.lang.String[] strArray51 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor30.visit(1, 100, "hi!", "", "hi!", strArray51);
        aSMifierClassVisitor1.visit(100, (int) (short) 0, "hi!", "", "", strArray51);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.util.List list58 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor64.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor64.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor64.visitSource("hi!", "");
        java.util.List list80 = aSMifierClassVisitor64.text;
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor64.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray86);
        org.mockito.asm.MethodVisitor methodVisitor88 = aSMifierClassVisitor1.visitMethod(0, "", "hi!", "", strArray86);
        java.lang.Class<?> wildcardClass89 = strArray86.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray13);
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.util.List list29 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list23 = aSMifierClassVisitor1.getText();
        java.lang.Class<?> wildcardClass24 = list23.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor34.visitAnnotation("hi!", true);
        java.lang.String[] strArray55 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor34.visit(1, 100, "hi!", "", "hi!", strArray55);
        aSMifierClassVisitor34.visitInnerClass("", "hi!", "hi!", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor34.visitAnnotation("", true);
        aSMifierClassVisitor34.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor69 = aSMifierClassVisitor1.visitField((int) ' ', "hi!", "", "hi!", (java.lang.Object) "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", 100);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertNotNull(fieldVisitor69);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list7 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter15 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor16 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        aSMifierClassVisitor16.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor28.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierClassVisitor28.visitAnnotation("hi!", true);
        java.lang.String[] strArray49 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor28.visit(1, 100, "hi!", "", "hi!", strArray49);
        aSMifierClassVisitor16.visit(100, (int) (byte) -1, "", "", "hi!", strArray49);
        java.util.List list52 = aSMifierClassVisitor16.text;
        java.lang.String[] strArray58 = null;
        aSMifierClassVisitor16.visit((-1), (int) (byte) 1, "", "hi!", "hi!", strArray58);
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor1.visitField(0, "", "hi!", "", (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(fieldVisitor60);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        java.util.List list8 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor14.visitAnnotation("hi!", true);
        java.util.List list30 = aSMifierClassVisitor14.text;
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor37.visitSource("hi!", "");
        java.util.List list53 = aSMifierClassVisitor37.text;
        java.lang.String[] strArray59 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor37.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray59);
        aSMifierClassVisitor14.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor1.visitMethod((int) (short) 100, "", "", "", strArray59);
        java.util.List list63 = aSMifierClassVisitor1.text;
        java.util.List list64 = aSMifierClassVisitor1.getText();
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        aSMifierClassVisitor53.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        aSMifierClassVisitor53.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit(1, 10, "hi!", "hi!", "hi!", strArray65);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField((int) (byte) 1, "hi!", "hi!", "hi!", (java.lang.Object) 1.0d);
        java.util.List list74 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list79 = aSMifierClassVisitor1.getText();
        java.util.List list80 = aSMifierClassVisitor1.getText();
        java.util.List list81 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(list81);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray34 = null;
        aSMifierClassVisitor22.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray34);
        java.lang.String[] strArray40 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor41 = aSMifierClassVisitor22.visitMethod(100, "", "hi!", "", strArray40);
        org.mockito.asm.MethodVisitor methodVisitor42 = aSMifierClassVisitor1.visitMethod(1, "hi!", "hi!", "", strArray40);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertNotNull(methodVisitor42);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        java.util.List list14 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray23 = null;
        org.mockito.asm.MethodVisitor methodVisitor24 = aSMifierClassVisitor1.visitMethod((int) 'a', "hi!", "hi!", "hi!", strArray23);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(methodVisitor24);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor31.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray43 = null;
        aSMifierClassVisitor31.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray43);
        aSMifierClassVisitor31.visitSource("hi!", "hi!");
        aSMifierClassVisitor31.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor31.visitAnnotation("", true);
        java.io.PrintWriter printWriter60 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor61 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter60);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor61.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor61.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor61.visitAnnotation("", true);
        java.util.List list77 = aSMifierClassVisitor61.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierClassVisitor61.visitAnnotation("", true);
        java.lang.String[] strArray85 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor86 = aSMifierClassVisitor61.visitMethod((int) ' ', "", "hi!", "", strArray85);
        aSMifierClassVisitor31.visit((int) (short) 100, (int) (byte) 100, "", "hi!", "hi!", strArray85);
        aSMifierClassVisitor1.visit((int) (byte) 0, (int) (short) 1, "hi!", "hi!", "hi!", strArray85);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) -1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list8 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", 0);
        java.io.PrintWriter printWriter18 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor19 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter18);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor19.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor31 = aSMifierClassVisitor19.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor19.visitSource("hi!", "");
        java.util.List list35 = aSMifierClassVisitor19.getText();
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor42.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor58 = aSMifierClassVisitor42.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray57);
        aSMifierClassVisitor19.visit((int) (short) 10, 1, "", "", "hi!", strArray57);
        java.io.PrintWriter printWriter64 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor65 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter64);
        java.io.PrintWriter printWriter66 = null;
        aSMifierClassVisitor65.print(printWriter66);
        aSMifierClassVisitor65.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray78 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor65.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor80 = aSMifierClassVisitor19.visitMethod((int) (short) 100, "hi!", "", "", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor81 = aSMifierClassVisitor1.visitMethod(1, "", "", "", strArray78);
        java.util.List list82 = aSMifierClassVisitor1.getText();
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor58);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(list82);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor28.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor28.visitSource("", "");
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor49.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray61 = null;
        aSMifierClassVisitor49.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray61);
        java.lang.String[] strArray67 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor68 = aSMifierClassVisitor49.visitMethod(100, "", "hi!", "", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor69 = aSMifierClassVisitor28.visitMethod(1, "hi!", "hi!", "", strArray67);
        aSMifierClassVisitor1.visit((int) (short) 1, (int) (byte) 1, "", "hi!", "hi!", strArray67);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list75 = aSMifierClassVisitor1.getText();
        java.lang.Class<?> wildcardClass76 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter24 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor25 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        org.mockito.asm.FieldVisitor fieldVisitor31 = aSMifierClassVisitor25.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor25.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor25.visitSource("hi!", "");
        java.util.List list41 = aSMifierClassVisitor25.getText();
        java.lang.Class<?> wildcardClass42 = list41.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor1.visitField((int) '4', "", "", "", (java.lang.Object) list41);
        java.util.List list44 = aSMifierClassVisitor1.text;
        java.util.List list45 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter37 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter37);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor38.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor38.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor38.visitSource("hi!", "");
        java.util.List list54 = aSMifierClassVisitor38.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor38.visitAnnotation("hi!", false);
        java.util.List list58 = aSMifierClassVisitor38.text;
        java.lang.String[] strArray64 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor38.visit((int) (byte) 10, 0, "", "", "hi!", strArray64);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        aSMifierClassVisitor38.visit((int) (short) -1, (int) (short) 100, "", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor1.visitMethod((int) '4', "", "", "", strArray73);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor75);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) '#');
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor31.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor31.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor31.visitAnnotation("hi!", true);
        java.lang.String[] strArray52 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor31.visit(1, 100, "hi!", "", "hi!", strArray52);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor31.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierClassVisitor31.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter64 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor65 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter64);
        java.io.PrintWriter printWriter66 = null;
        aSMifierClassVisitor65.print(printWriter66);
        aSMifierClassVisitor65.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray78 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor65.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor80 = aSMifierClassVisitor31.visitMethod((int) '4', "", "", "hi!", strArray78);
        aSMifierClassVisitor1.visit((int) (short) -1, (int) '#', "", "", "", strArray78);
        org.mockito.asm.AnnotationVisitor annotationVisitor84 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor87 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list88 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(annotationVisitor84);
        org.junit.Assert.assertNotNull(annotationVisitor87);
        org.junit.Assert.assertNotNull(list88);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list28 = aSMifierClassVisitor1.text;
        java.util.List list29 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = null;
        aSMifierClassVisitor35.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray47);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor35.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list55 = aSMifierClassVisitor35.getText();
        aSMifierClassVisitor35.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor35.visitInnerClass("", "hi!", "hi!", 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = aSMifierClassVisitor35.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor1.visitField((int) ' ', "", "hi!", "", (java.lang.Object) aSMifierClassVisitor35);
        java.util.List list69 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list9 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        aSMifierClassVisitor34.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list40 = aSMifierClassVisitor34.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierClassVisitor34.visitAnnotation("", false);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor1.visitField((int) (byte) -1, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor34);
        java.util.List list45 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor14.visitSource("", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = null;
        aSMifierClassVisitor35.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray47);
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor35.visitMethod(100, "", "hi!", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor14.visitMethod(1, "hi!", "hi!", "", strArray53);
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (byte) 1, "hi!", "", "hi!", strArray53);
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor62.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierClassVisitor62.visitAnnotation("", true);
        aSMifierClassVisitor62.visitOuterClass("hi!", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "", "", (java.lang.Object) "hi!");
        java.util.List list83 = aSMifierClassVisitor1.getText();
        java.util.List list84 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor87 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor90 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(annotationVisitor87);
        org.junit.Assert.assertNotNull(annotationVisitor90);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list27 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list28 = aSMifierClassVisitor1.text;
        java.util.List list29 = aSMifierClassVisitor1.getText();
        java.util.List list30 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list16 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter35 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter35);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor36.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor36.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor36.visitSource("hi!", "");
        java.util.List list52 = aSMifierClassVisitor36.text;
        java.util.List list53 = aSMifierClassVisitor36.text;
        java.util.List list54 = aSMifierClassVisitor36.getText();
        java.util.List list55 = aSMifierClassVisitor36.getText();
        aSMifierClassVisitor36.visitSource("", "");
        aSMifierClassVisitor36.visitInnerClass("hi!", "", "", 0);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor1.visitField(0, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(fieldVisitor64);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray40 = null;
        aSMifierClassVisitor28.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray40);
        aSMifierClassVisitor28.visitSource("hi!", "hi!");
        aSMifierClassVisitor28.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor28.visitMethod((int) (byte) 100, "hi!", "", "", strArray53);
        aSMifierClassVisitor1.visit(0, (int) '#', "hi!", "hi!", "hi!", strArray53);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list59 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(list59);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray34 = null;
        aSMifierClassVisitor22.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray34);
        java.lang.String[] strArray40 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor41 = aSMifierClassVisitor22.visitMethod(100, "", "hi!", "", strArray40);
        org.mockito.asm.MethodVisitor methodVisitor42 = aSMifierClassVisitor1.visitMethod(1, "hi!", "hi!", "", strArray40);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", 1);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) '4');
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list57 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.Attribute attribute28 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter20 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor21 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter20);
        org.mockito.asm.FieldVisitor fieldVisitor27 = aSMifierClassVisitor21.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor37 = aSMifierClassVisitor21.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray36);
        aSMifierClassVisitor21.visitInnerClass("", "hi!", "", (int) ' ');
        java.io.PrintWriter printWriter47 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter47);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor48.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor48.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor21.visitField(100, "", "", "", (java.lang.Object) "");
        java.io.PrintWriter printWriter66 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor67 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter66);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor67.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor67.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor67.visitSource("hi!", "");
        java.util.List list83 = aSMifierClassVisitor67.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = aSMifierClassVisitor67.visitAnnotation("", false);
        java.util.List list87 = aSMifierClassVisitor67.text;
        java.util.List list88 = aSMifierClassVisitor67.text;
        java.lang.Class<?> wildcardClass89 = aSMifierClassVisitor67.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor90 = aSMifierClassVisitor21.visitField(100, "hi!", "hi!", "hi!", (java.lang.Object) wildcardClass89);
        org.mockito.asm.FieldVisitor fieldVisitor91 = aSMifierClassVisitor1.visitField((int) (byte) 10, "", "", "hi!", (java.lang.Object) "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        java.io.PrintWriter printWriter97 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(fieldVisitor27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(fieldVisitor79);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(fieldVisitor90);
        org.junit.Assert.assertNotNull(fieldVisitor91);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.util.List list22 = aSMifierClassVisitor1.getText();
        java.util.List list23 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray41 = null;
        aSMifierClassVisitor29.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor29.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor1.visitField((int) ' ', "", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor29);
        java.io.PrintWriter printWriter54 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter54);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor55.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray67 = null;
        aSMifierClassVisitor55.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray67);
        aSMifierClassVisitor55.visitOuterClass("hi!", "hi!", "");
        java.lang.String[] strArray78 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor55.visit((int) (short) 0, (int) (byte) 0, "", "", "hi!", strArray78);
        java.util.List list80 = aSMifierClassVisitor55.getText();
        aSMifierClassVisitor55.visitOuterClass("hi!", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor85 = aSMifierClassVisitor29.visitField((int) (byte) 10, "hi!", "", "", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(fieldVisitor85);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor28.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierClassVisitor28.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor28.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        org.mockito.asm.FieldVisitor fieldVisitor59 = aSMifierClassVisitor53.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor65 = aSMifierClassVisitor53.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierClassVisitor53.visitAnnotation("", true);
        java.util.List list69 = aSMifierClassVisitor53.getText();
        aSMifierClassVisitor53.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray79 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor53.visit(1, (int) (short) 0, "hi!", "", "", strArray79);
        aSMifierClassVisitor28.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray79);
        aSMifierClassVisitor28.visitOuterClass("", "", "hi!");
        java.util.List list86 = aSMifierClassVisitor28.getText();
        aSMifierClassVisitor28.visitInnerClass("", "", "", 10);
        java.util.List list92 = aSMifierClassVisitor28.text;
        org.mockito.asm.FieldVisitor fieldVisitor93 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) aSMifierClassVisitor28);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertNotNull(list92);
        org.junit.Assert.assertNotNull(fieldVisitor93);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray19 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor20 = aSMifierClassVisitor1.visitMethod(100, "", "hi!", "", strArray19);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        aSMifierClassVisitor30.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        aSMifierClassVisitor30.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray42);
        aSMifierClassVisitor1.visit((int) '4', (int) '#', "", "", "", strArray42);
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        java.io.PrintWriter printWriter51 = null;
        aSMifierClassVisitor50.print(printWriter51);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierClassVisitor50.visitAnnotation("", false);
        java.util.List list56 = aSMifierClassVisitor50.getText();
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor62.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor62.visitSource("hi!", "");
        java.util.List list78 = aSMifierClassVisitor62.text;
        java.lang.String[] strArray84 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor62.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray84);
        org.mockito.asm.MethodVisitor methodVisitor86 = aSMifierClassVisitor50.visitMethod((int) (byte) 10, "", "", "", strArray84);
        org.mockito.asm.MethodVisitor methodVisitor87 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "", "", "hi!", strArray84);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (byte) 10);
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor22.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierClassVisitor22.visitAnnotation("hi!", true);
        java.util.List list38 = aSMifierClassVisitor22.text;
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor45.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor45.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor45.visitSource("hi!", "");
        java.util.List list61 = aSMifierClassVisitor45.text;
        java.lang.String[] strArray67 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor45.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray67);
        aSMifierClassVisitor22.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray67);
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (short) 1, "hi!", "", "", strArray67);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.String[] strArray30 = null;
        org.mockito.asm.MethodVisitor methodVisitor31 = aSMifierClassVisitor1.visitMethod((int) (short) 100, "", "hi!", "", strArray30);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(methodVisitor31);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor35.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor35.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor35.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor60.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor60.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor60.visitAnnotation("", true);
        java.util.List list76 = aSMifierClassVisitor60.getText();
        aSMifierClassVisitor60.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor60.visit(1, (int) (short) 0, "hi!", "", "", strArray86);
        aSMifierClassVisitor35.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray86);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) (short) 0, "hi!", "hi!", "hi!", strArray86);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass94 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (short) -1);
        java.util.List list26 = aSMifierClassVisitor1.text;
        org.mockito.asm.Attribute attribute27 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        java.util.List list6 = aSMifierClassVisitor1.text;
        java.util.List list7 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list21 = aSMifierClassVisitor14.getText();
        aSMifierClassVisitor14.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor14.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor14.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter38 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor39 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter38);
        java.io.PrintWriter printWriter40 = null;
        aSMifierClassVisitor39.print(printWriter40);
        java.util.List list42 = aSMifierClassVisitor39.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor39.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor39.visitAnnotation("", true);
        java.util.List list49 = aSMifierClassVisitor39.getText();
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor14.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor39);
        java.io.PrintWriter printWriter55 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor56 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor56.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor56.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = aSMifierClassVisitor56.visitAnnotation("hi!", true);
        java.lang.String[] strArray77 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor56.visit(1, 100, "hi!", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor79 = aSMifierClassVisitor14.visitMethod((-1), "hi!", "hi!", "hi!", strArray77);
        aSMifierClassVisitor1.visit(1, (int) (byte) 0, "hi!", "", "", strArray77);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor79);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list10 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter15 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor16 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor16.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray28 = null;
        aSMifierClassVisitor16.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray28);
        java.lang.String[] strArray34 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor35 = aSMifierClassVisitor16.visitMethod(100, "", "hi!", "", strArray34);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor16.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        aSMifierClassVisitor45.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        aSMifierClassVisitor45.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray57);
        aSMifierClassVisitor16.visit((int) '4', (int) '#', "", "", "", strArray57);
        org.mockito.asm.MethodVisitor methodVisitor60 = aSMifierClassVisitor1.visitMethod((int) (byte) 1, "", "hi!", "", strArray57);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(methodVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor60);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter24 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor25 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        aSMifierClassVisitor25.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor37.visitAnnotation("hi!", true);
        java.lang.String[] strArray58 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor37.visit(1, 100, "hi!", "", "hi!", strArray58);
        aSMifierClassVisitor25.visit(100, (int) (byte) -1, "", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor61 = aSMifierClassVisitor1.visitMethod((int) (short) 1, "", "", "hi!", strArray58);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) ' ');
        java.util.List list67 = aSMifierClassVisitor1.text;
        org.mockito.asm.Attribute attribute68 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(list67);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.lang.Class<?> wildcardClass25 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.io.PrintWriter printWriter37 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter37);
        java.io.PrintWriter printWriter39 = null;
        aSMifierClassVisitor38.print(printWriter39);
        java.util.List list41 = aSMifierClassVisitor38.getText();
        java.io.PrintWriter printWriter42 = null;
        aSMifierClassVisitor38.print(printWriter42);
        java.util.List list44 = aSMifierClassVisitor38.text;
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor50.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor50.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierClassVisitor50.visitAnnotation("", true);
        java.util.List list66 = aSMifierClassVisitor50.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = aSMifierClassVisitor50.visitAnnotation("", true);
        java.lang.String[] strArray74 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor50.visitMethod((int) ' ', "", "hi!", "", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor38.visitMethod((int) (short) -1, "", "hi!", "hi!", strArray74);
        aSMifierClassVisitor1.visit((int) (short) 100, (int) (short) 100, "hi!", "", "", strArray74);
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(annotationVisitor69);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor80);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        aSMifierClassVisitor53.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        aSMifierClassVisitor53.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit(1, 10, "hi!", "hi!", "hi!", strArray65);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list79 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter80 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(annotationVisitor78);
        org.junit.Assert.assertNotNull(list79);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor30.visitAnnotation("hi!", true);
        java.util.List list46 = aSMifierClassVisitor30.text;
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        org.mockito.asm.FieldVisitor fieldVisitor59 = aSMifierClassVisitor53.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor65 = aSMifierClassVisitor53.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor53.visitSource("hi!", "");
        java.util.List list69 = aSMifierClassVisitor53.text;
        java.lang.String[] strArray75 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor53.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray75);
        aSMifierClassVisitor30.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray75);
        aSMifierClassVisitor1.visit((int) (short) 100, (-1), "", "", "", strArray75);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter83 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(strArray75);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter32 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter32);
        aSMifierClassVisitor33.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        aSMifierClassVisitor33.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray45);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField(100, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor33);
        java.io.PrintWriter printWriter51 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        java.util.List list14 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor20.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor20.visitSource("hi!", "");
        java.util.List list36 = aSMifierClassVisitor20.text;
        aSMifierClassVisitor20.visitSource("hi!", "");
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor46.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor46.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor46.visitSource("hi!", "");
        java.util.List list62 = aSMifierClassVisitor46.getText();
        java.io.PrintWriter printWriter68 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor69 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter68);
        org.mockito.asm.FieldVisitor fieldVisitor75 = aSMifierClassVisitor69.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor85 = aSMifierClassVisitor69.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray84);
        aSMifierClassVisitor46.visit((int) (short) 10, 1, "", "", "hi!", strArray84);
        aSMifierClassVisitor20.visit((int) (short) 1, (int) (short) 1, "hi!", "hi!", "hi!", strArray84);
        org.mockito.asm.MethodVisitor methodVisitor88 = aSMifierClassVisitor1.visitMethod(1, "", "", "hi!", strArray84);
        java.util.List list89 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(list89);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor30.visitAnnotation("", true);
        java.util.List list46 = aSMifierClassVisitor30.getText();
        aSMifierClassVisitor30.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor30.visitInnerClass("hi!", "", "", (int) (short) 10);
        aSMifierClassVisitor30.visitInnerClass("", "", "hi!", (int) (byte) 100);
        java.io.PrintWriter printWriter66 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor67 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter66);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor67.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor67.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor67.visitSource("hi!", "");
        java.util.List list83 = aSMifierClassVisitor67.text;
        java.lang.String[] strArray89 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor67.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray89);
        org.mockito.asm.MethodVisitor methodVisitor91 = aSMifierClassVisitor30.visitMethod((-1), "hi!", "", "hi!", strArray89);
        org.mockito.asm.MethodVisitor methodVisitor92 = aSMifierClassVisitor1.visitMethod((int) (byte) 1, "hi!", "", "hi!", strArray89);
        org.mockito.asm.Attribute attribute93 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(fieldVisitor79);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.util.List list22 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor32.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor32.visitSource("hi!", "");
        java.util.List list48 = aSMifierClassVisitor32.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierClassVisitor32.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor32.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter60 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor61 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter60);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor61.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor61.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor61.visitAnnotation("hi!", true);
        java.lang.String[] strArray82 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor61.visit(1, 100, "hi!", "", "hi!", strArray82);
        aSMifierClassVisitor32.visit(100, (int) (short) 0, "hi!", "", "", strArray82);
        aSMifierClassVisitor1.visit((int) '#', (int) 'a', "", "hi!", "", strArray82);
        org.mockito.asm.AnnotationVisitor annotationVisitor88 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(annotationVisitor88);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list30 = aSMifierClassVisitor1.text;
        java.lang.Class<?> wildcardClass31 = list30.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.util.List list5 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        aSMifierClassVisitor14.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list20 = aSMifierClassVisitor14.getText();
        java.util.List list21 = aSMifierClassVisitor14.getText();
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor27.visitAnnotation("hi!", true);
        java.util.List list43 = aSMifierClassVisitor27.text;
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor50.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor50.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor50.visitSource("hi!", "");
        java.util.List list66 = aSMifierClassVisitor50.text;
        java.lang.String[] strArray72 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor50.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray72);
        aSMifierClassVisitor27.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor14.visitMethod((int) (short) 100, "", "", "", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor1.visitMethod(10, "", "", "", strArray72);
        java.io.PrintWriter printWriter77 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor8);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
    }
}

