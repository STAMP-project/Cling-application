import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
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
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.text;
        java.util.List list23 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) -1);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(annotationVisitor57);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        java.util.List list39 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 0);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        java.util.List list82 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) -1);
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
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter86 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.text;
        java.util.List list23 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor48 = aSMifierClassVisitor32.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray47);
        aSMifierClassVisitor32.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor59 = aSMifierClassVisitor32.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.util.List list60 = aSMifierClassVisitor32.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = aSMifierClassVisitor32.visitAnnotation("", false);
        aSMifierClassVisitor32.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list68 = aSMifierClassVisitor32.text;
        aSMifierClassVisitor32.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor1.visitField((int) (byte) 0, "hi!", "hi!", "", (java.lang.Object) "");
        java.util.List list73 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(list73);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.io.PrintWriter printWriter82 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        java.util.List list51 = aSMifierClassVisitor1.getText();
        java.util.List list52 = aSMifierClassVisitor1.text;
        org.mockito.asm.Attribute attribute53 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute53);
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
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.util.List list25 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor34.visitSource("hi!", "");
        java.util.List list50 = aSMifierClassVisitor34.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor34.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor34.visitAnnotation("", true);
        java.util.List list57 = aSMifierClassVisitor34.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor60 = aSMifierClassVisitor34.visitAnnotation("", false);
        java.util.List list61 = aSMifierClassVisitor34.text;
        java.util.List list62 = aSMifierClassVisitor34.text;
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor1.visitField((int) (byte) -1, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(annotationVisitor60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (byte) 0);
        java.util.List list13 = aSMifierClassVisitor1.getText();
        java.util.List list14 = aSMifierClassVisitor1.text;
        java.util.List list15 = aSMifierClassVisitor1.text;
        java.util.List list16 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        java.io.PrintWriter printWriter39 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor40 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter39);
        aSMifierClassVisitor40.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter51 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor52 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter51);
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor52.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor52.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = aSMifierClassVisitor52.visitAnnotation("hi!", true);
        java.lang.String[] strArray73 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor52.visit(1, 100, "hi!", "", "hi!", strArray73);
        aSMifierClassVisitor40.visit(100, (int) (byte) -1, "", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor1.visitMethod(0, "hi!", "hi!", "", strArray73);
        java.util.List list77 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor37.visitSource("", "");
        java.io.PrintWriter printWriter57 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter57);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor58.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray70 = null;
        aSMifierClassVisitor58.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray70);
        java.lang.String[] strArray76 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor77 = aSMifierClassVisitor58.visitMethod(100, "", "hi!", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor37.visitMethod(1, "hi!", "hi!", "", strArray76);
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) -1, "hi!", "", "", strArray76);
        java.util.List list80 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 0);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 100);
        java.util.List list23 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("", true);
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
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor13.visitAnnotation("hi!", true);
        java.lang.String[] strArray34 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor13.visit(1, 100, "hi!", "", "hi!", strArray34);
        aSMifierClassVisitor1.visit(100, (int) (byte) -1, "", "", "hi!", strArray34);
        java.util.List list37 = aSMifierClassVisitor1.text;
        java.lang.String[] strArray43 = null;
        aSMifierClassVisitor1.visit((-1), (int) (byte) 1, "", "hi!", "hi!", strArray43);
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor50.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor50.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor50.visitSource("hi!", "");
        java.util.List list66 = aSMifierClassVisitor50.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = aSMifierClassVisitor50.visitAnnotation("", false);
        java.util.List list70 = aSMifierClassVisitor50.text;
        org.mockito.asm.FieldVisitor fieldVisitor71 = aSMifierClassVisitor1.visitField((int) (short) 1, "", "", "", (java.lang.Object) list70);
        java.io.PrintWriter printWriter72 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(annotationVisitor69);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(fieldVisitor71);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
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
        org.junit.Assert.assertNotNull(annotationVisitor85);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 100);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter35 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
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
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(list67);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor61);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list24 = aSMifierClassVisitor1.getText();
        java.util.List list25 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        aSMifierClassVisitor26.visitSource("", "hi!");
        java.util.List list30 = aSMifierClassVisitor26.getText();
        aSMifierClassVisitor26.visitSource("hi!", "hi!");
        aSMifierClassVisitor26.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter42 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        aSMifierClassVisitor43.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor26.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        java.util.List list48 = aSMifierClassVisitor26.text;
        java.io.PrintWriter printWriter54 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter54);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor55.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor55.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierClassVisitor55.visitAnnotation("", true);
        java.util.List list71 = aSMifierClassVisitor55.getText();
        aSMifierClassVisitor55.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray81 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor55.visit(1, (int) (short) 0, "hi!", "", "", strArray81);
        aSMifierClassVisitor26.visit((int) (short) -1, (int) (byte) -1, "hi!", "", "hi!", strArray81);
        aSMifierClassVisitor1.visit((int) ' ', (int) (byte) 1, "", "hi!", "hi!", strArray81);
        java.util.List list85 = aSMifierClassVisitor1.text;
        java.util.List list86 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(annotationVisitor70);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNotNull(list86);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        java.io.PrintWriter printWriter16 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter16);
        aSMifierClassVisitor17.visitSource("", "hi!");
        aSMifierClassVisitor17.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor17.visitAnnotation("", false);
        java.util.List list27 = aSMifierClassVisitor17.getText();
        aSMifierClassVisitor17.visitSource("", "hi!");
        java.util.List list31 = aSMifierClassVisitor17.text;
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor1.visitField(10, "", "hi!", "", (java.lang.Object) list31);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(fieldVisitor32);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        java.util.List list40 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(list40);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list21 = aSMifierClassVisitor1.text;
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
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter37 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(annotationVisitor36);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list20 = aSMifierClassVisitor1.getText();
        java.util.List list21 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        java.util.List list59 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute60 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(list59);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray49 = null;
        aSMifierClassVisitor37.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray49);
        aSMifierClassVisitor37.visitSource("hi!", "hi!");
        aSMifierClassVisitor37.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor60 = aSMifierClassVisitor37.visitAnnotation("", true);
        aSMifierClassVisitor37.visitSource("", "hi!");
        java.util.List list64 = aSMifierClassVisitor37.text;
        java.util.List list65 = aSMifierClassVisitor37.getText();
        java.util.List list66 = aSMifierClassVisitor37.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = aSMifierClassVisitor37.visitAnnotation("", true);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor1.visitField((int) ' ', "hi!", "hi!", "", (java.lang.Object) "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor60);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(annotationVisitor69);
        org.junit.Assert.assertNotNull(fieldVisitor70);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list23 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.lang.String[] strArray29 = null;
        org.mockito.asm.MethodVisitor methodVisitor30 = aSMifierClassVisitor1.visitMethod(0, "", "hi!", "hi!", strArray29);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 1);
        org.mockito.asm.Attribute attribute36 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(methodVisitor30);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (byte) 100);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) 'a');
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list72 = aSMifierClassVisitor1.text;
        java.lang.String[] strArray78 = null;
        aSMifierClassVisitor1.visit(100, (int) (byte) 100, "", "hi!", "", strArray78);
        org.mockito.asm.Attribute attribute80 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(list72);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list89 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 10);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
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
        org.junit.Assert.assertNotNull(annotationVisitor85);
        org.junit.Assert.assertNotNull(list89);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.util.List list64 = aSMifierClassVisitor1.text;
        java.util.List list65 = aSMifierClassVisitor1.text;
        java.util.List list66 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.io.PrintWriter printWriter9 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter9);
        aSMifierClassVisitor10.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor22.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierClassVisitor22.visitAnnotation("hi!", true);
        java.lang.String[] strArray43 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor22.visit(1, 100, "hi!", "", "hi!", strArray43);
        aSMifierClassVisitor10.visit(100, (int) (byte) -1, "", "", "hi!", strArray43);
        aSMifierClassVisitor1.visit(10, (int) (byte) -1, "", "hi!", "", strArray43);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.Class<?> wildcardClass53 = annotationVisitor52.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor13.visitAnnotation("hi!", true);
        java.lang.String[] strArray34 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor13.visit(1, 100, "hi!", "", "hi!", strArray34);
        aSMifierClassVisitor1.visit(100, (int) (byte) -1, "", "", "hi!", strArray34);
        java.util.List list37 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.Attribute attribute42 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list14 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor20.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor20.visitSource("hi!", "");
        java.util.List list36 = aSMifierClassVisitor20.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierClassVisitor20.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor20.visitAnnotation("", true);
        java.util.List list43 = aSMifierClassVisitor20.getText();
        java.util.List list44 = aSMifierClassVisitor20.text;
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor1.visitField((int) (short) 1, "", "hi!", "hi!", (java.lang.Object) list44);
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(fieldVisitor45);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list82 = aSMifierClassVisitor1.getText();
        java.util.List list83 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor46);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor1.visitAnnotation("", false);
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
        org.junit.Assert.assertNotNull(annotationVisitor52);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.io.PrintWriter printWriter8 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor9 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter8);
        org.mockito.asm.FieldVisitor fieldVisitor15 = aSMifierClassVisitor9.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor9.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor9.visitSource("hi!", "");
        aSMifierClassVisitor9.visitSource("", "hi!");
        aSMifierClassVisitor9.visitOuterClass("", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor1.visitField((int) (byte) 10, "", "", "", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor15);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor35);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass43 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(annotationVisitor17);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray35 = null;
        aSMifierClassVisitor23.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray35);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor23.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor23.visitSource("hi!", "");
        java.io.PrintWriter printWriter50 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor51 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter50);
        aSMifierClassVisitor51.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter62 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor63 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter62);
        org.mockito.asm.FieldVisitor fieldVisitor69 = aSMifierClassVisitor63.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor75 = aSMifierClassVisitor63.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = aSMifierClassVisitor63.visitAnnotation("hi!", true);
        java.lang.String[] strArray84 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor63.visit(1, 100, "hi!", "", "hi!", strArray84);
        aSMifierClassVisitor51.visit(100, (int) (byte) -1, "", "", "hi!", strArray84);
        org.mockito.asm.MethodVisitor methodVisitor87 = aSMifierClassVisitor23.visitMethod(10, "hi!", "hi!", "", strArray84);
        aSMifierClassVisitor1.visit((int) (short) 10, (int) (short) -1, "hi!", "hi!", "", strArray84);
        java.util.List list89 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(fieldVisitor69);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(annotationVisitor78);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(list89);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        java.io.PrintWriter printWriter76 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor77 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter76);
        org.mockito.asm.FieldVisitor fieldVisitor83 = aSMifierClassVisitor77.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor89 = aSMifierClassVisitor77.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = aSMifierClassVisitor77.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor95 = aSMifierClassVisitor77.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor96 = aSMifierClassVisitor1.visitField(0, "hi!", "", "hi!", (java.lang.Object) "hi!");
        java.util.List list97 = aSMifierClassVisitor1.text;
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
        org.junit.Assert.assertNotNull(fieldVisitor83);
        org.junit.Assert.assertNotNull(fieldVisitor89);
        org.junit.Assert.assertNotNull(annotationVisitor92);
        org.junit.Assert.assertNotNull(annotationVisitor95);
        org.junit.Assert.assertNotNull(fieldVisitor96);
        org.junit.Assert.assertNotNull(list97);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        java.util.List list38 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list11 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 0);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor27.visitAnnotation("hi!", true);
        java.lang.String[] strArray48 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor27.visit(1, 100, "hi!", "", "hi!", strArray48);
        org.mockito.asm.MethodVisitor methodVisitor50 = aSMifierClassVisitor1.visitMethod((int) (byte) 0, "", "", "", strArray48);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor50);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.util.List list34 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.util.List list5 = aSMifierClassVisitor1.text;
        java.util.List list6 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.io.PrintWriter printWriter16 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter16);
        org.mockito.asm.FieldVisitor fieldVisitor23 = aSMifierClassVisitor17.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor17.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor17.visitAnnotation("hi!", true);
        java.lang.String[] strArray38 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor17.visit(1, 100, "hi!", "", "hi!", strArray38);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor17.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor17.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter51 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor52 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter51);
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor52.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray64 = null;
        aSMifierClassVisitor52.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray64);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor71 = aSMifierClassVisitor52.visitMethod(100, "", "hi!", "", strArray70);
        aSMifierClassVisitor17.visit((int) (byte) -1, (int) (byte) -1, "hi!", "", "hi!", strArray70);
        aSMifierClassVisitor1.visit((int) '4', (int) (short) 10, "hi!", "", "", strArray70);
        java.util.List list74 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(fieldVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.util.List list22 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor29.visitSource("hi!", "");
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (short) 0, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor29);
        java.util.List list47 = aSMifierClassVisitor29.text;
        aSMifierClassVisitor29.visitOuterClass("", "hi!", "");
        java.util.List list52 = aSMifierClassVisitor29.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
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
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter55 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor56 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        aSMifierClassVisitor56.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter67 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor68 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter67);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor68.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor80 = aSMifierClassVisitor68.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor68.visitSource("hi!", "");
        java.util.List list84 = aSMifierClassVisitor68.text;
        java.lang.String[] strArray90 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor68.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray90);
        aSMifierClassVisitor56.visit(0, (int) '4', "hi!", "hi!", "", strArray90);
        aSMifierClassVisitor1.visit((int) '#', (int) (byte) 1, "hi!", "", "", strArray90);
        java.util.List list94 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(fieldVisitor80);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(list94);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list20 = aSMifierClassVisitor1.getText();
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list26 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (byte) 0);
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor28.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierClassVisitor28.visitAnnotation("hi!", true);
        java.util.List list44 = aSMifierClassVisitor28.text;
        java.io.PrintWriter printWriter50 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor51 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter50);
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor51.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor51.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor51.visitSource("hi!", "");
        java.util.List list67 = aSMifierClassVisitor51.text;
        java.lang.String[] strArray73 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor51.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray73);
        aSMifierClassVisitor28.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor1.visitMethod(1, "hi!", "", "", strArray73);
        java.util.List list77 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter78 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 100);
        java.util.List list91 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(list91);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor28.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor1.visitField(100, "", "", "", (java.lang.Object) "");
        java.util.List list42 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter47 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter47);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor48.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor48.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = aSMifierClassVisitor48.visitAnnotation("hi!", true);
        java.lang.String[] strArray69 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor48.visit(1, 100, "hi!", "", "hi!", strArray69);
        aSMifierClassVisitor48.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.lang.Object obj80 = null;
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor48.visitField((int) (byte) 0, "", "hi!", "", obj80);
        aSMifierClassVisitor48.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor85 = aSMifierClassVisitor1.visitField((int) (short) 0, "hi!", "hi!", "", (java.lang.Object) "");
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor85);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor64);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 100);
        java.util.List list38 = aSMifierClassVisitor1.getText();
        java.util.List list39 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.Attribute attribute26 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor21);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) '4');
        java.io.PrintWriter printWriter54 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 100);
        java.lang.String[] strArray93 = null;
        org.mockito.asm.MethodVisitor methodVisitor94 = aSMifierClassVisitor1.visitMethod((int) (byte) 1, "hi!", "", "", strArray93);
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
        org.junit.Assert.assertNotNull(methodVisitor94);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list7 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list11 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list16 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list27 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) (byte) 10);
        java.io.PrintWriter printWriter38 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor39 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter38);
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor39.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor39.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray54);
        aSMifierClassVisitor1.visit((int) '#', (int) ' ', "", "hi!", "", strArray54);
        java.util.List list57 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray74 = null;
        aSMifierClassVisitor62.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray74);
        aSMifierClassVisitor62.visitOuterClass("hi!", "hi!", "");
        java.lang.String[] strArray85 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor62.visit((int) (short) 0, (int) (byte) 0, "", "", "hi!", strArray85);
        java.lang.Class<?> wildcardClass87 = strArray85.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor88 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "", "hi!", (java.lang.Object) strArray85);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(fieldVisitor88);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor13.visitSource("hi!", "");
        java.util.List list29 = aSMifierClassVisitor13.text;
        java.util.List list30 = aSMifierClassVisitor13.text;
        java.util.List list31 = aSMifierClassVisitor13.getText();
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        aSMifierClassVisitor37.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor49.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor49.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor49.visitAnnotation("hi!", true);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor49.visit(1, 100, "hi!", "", "hi!", strArray70);
        aSMifierClassVisitor37.visit(100, (int) (byte) -1, "", "", "hi!", strArray70);
        org.mockito.asm.MethodVisitor methodVisitor73 = aSMifierClassVisitor13.visitMethod((int) (short) 1, "", "", "hi!", strArray70);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor1.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "hi!");
        java.util.List list75 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(annotationVisitor78);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 0);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 0);
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        aSMifierClassVisitor26.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter37 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter37);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor38.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor38.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor38.visitAnnotation("hi!", true);
        java.lang.String[] strArray59 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor38.visit(1, 100, "hi!", "", "hi!", strArray59);
        aSMifierClassVisitor26.visit(100, (int) (byte) -1, "", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor1.visitMethod(10, "", "", "", strArray59);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list66 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor37.visitSource("", "");
        aSMifierClassVisitor37.visitSource("", "hi!");
        java.util.List list56 = aSMifierClassVisitor37.getText();
        aSMifierClassVisitor37.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor37.visitSource("hi!", "");
        java.lang.String[] strArray69 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor37.visit((int) '4', (int) ' ', "", "hi!", "", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor71 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray69);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor71);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.text;
        java.util.List list23 = aSMifierClassVisitor1.text;
        java.util.List list24 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray49 = null;
        aSMifierClassVisitor37.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray49);
        java.lang.String[] strArray56 = null;
        aSMifierClassVisitor37.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray56);
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        aSMifierClassVisitor64.visitSource("", "hi!");
        java.util.List list68 = aSMifierClassVisitor64.getText();
        aSMifierClassVisitor64.visitSource("hi!", "hi!");
        aSMifierClassVisitor64.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor64.visitSource("hi!", "hi!");
        aSMifierClassVisitor64.visitSource("", "hi!");
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor87 = aSMifierClassVisitor64.visitMethod((int) '4', "hi!", "hi!", "hi!", strArray86);
        aSMifierClassVisitor37.visit((-1), 0, "hi!", "hi!", "hi!", strArray86);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) '#', "hi!", "hi!", "hi!", strArray86);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(methodVisitor87);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.util.List list69 = aSMifierClassVisitor1.text;
        java.util.List list70 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (-1));
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
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(list70);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        java.lang.String[] strArray62 = null;
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) ' ', "", "", "hi!", strArray62);
        java.util.List list64 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list68 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.text;
        java.util.List list23 = aSMifierClassVisitor1.text;
        java.util.List list24 = aSMifierClassVisitor1.text;
        java.util.List list25 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list29 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.Object obj24 = null;
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor1.visitField(10, "hi!", "hi!", "hi!", obj24);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
    }
}

