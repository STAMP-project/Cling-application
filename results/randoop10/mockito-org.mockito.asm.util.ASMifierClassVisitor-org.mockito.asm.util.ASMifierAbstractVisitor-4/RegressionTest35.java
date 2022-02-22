import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor0.visitAnnotation("L1105153118", false);
        java.util.List list33 = aSMifierMethodVisitor0.getText();
        aSMifierMethodVisitor0.visitTypeInsn(15, "L601661571");
        aSMifierMethodVisitor0.visitMethodInsn(0, "L1236963294", "L1508718123", "L812886011");
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierMethodVisitor0.visitParameterAnnotation(2305, "L1105153118", false);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor49 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor49.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor49.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor49.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = aSMifierMethodVisitor49.visitAnnotation("hi!", false);
        aSMifierMethodVisitor49.visitCode();
        aSMifierMethodVisitor49.visitIntInsn(7, (int) 'a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor68 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor68.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor68.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor78 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor78.visitCode();
        aSMifierMethodVisitor78.visitIincInsn((int) (byte) -1, 2);
        aSMifierMethodVisitor78.visitEnd();
        aSMifierMethodVisitor78.visitTypeInsn(15, "L1669980843");
        org.mockito.asm.Label label88 = new org.mockito.asm.Label();
        aSMifierMethodVisitor78.visitJumpInsn(25, label88);
        java.lang.Object obj90 = label88.info;
        java.lang.String str91 = label88.toString();
        aSMifierMethodVisitor68.visitLineNumber(22, label88);
        aSMifierMethodVisitor49.visitLabel(label88);
        org.mockito.asm.Label label94 = null;
        aSMifierMethodVisitor0.visitLocalVariable("L2124203918", "L393540440", "L229091502", label88, label94, 33);
        label88.info = "L904580930";
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertNull(obj90);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "L280057033" + "'", str91, "L280057033");
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter11 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor12 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter11);
        aSMifierClassVisitor12.visitSource("", "hi!");
        int int16 = classWriter1.newConst((java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("L994489370", true);
        classWriter1.visitInnerClass("", "L142696279", "hi!", 7);
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("L343072732", "", "L1327104886", 203);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = aSMifierMethodVisitor0.visitAnnotation("", false);
        aSMifierMethodVisitor0.visitMaxs(12, (int) (short) 10);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter("hi!");
        printWriter8.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor11 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor11.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label17 = null;
        int[] intArray19 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray20 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor11.visitLookupSwitchInsn(label17, intArray19, labelArray20);
        java.util.List list22 = aSMifierMethodVisitor11.getText();
        printWriter8.println((java.lang.Object) list22);
        printWriter8.print((double) 10L);
        printWriter8.print(false);
        printWriter8.println(false);
        aSMifierMethodVisitor0.print(printWriter8);
        printWriter8.println((float) (byte) 10);
        printWriter8.println((long) 97);
        org.junit.Assert.assertNotNull(annotationVisitor3);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1]");
        org.junit.Assert.assertNotNull(labelArray20);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        aSMifierMethodVisitor0.visitLabel(label6);
        aSMifierMethodVisitor0.visitFieldInsn((int) '4', "", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierMethodVisitor0.visitParameterAnnotation(0, "L666971223", false);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor18 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor18.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor18.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierMethodVisitor18.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor18.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierMethodVisitor18.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        aSMifierMethodVisitor18.visitLabel(label38);
        java.lang.Object obj40 = label38.info;
        aSMifierMethodVisitor0.visitLineNumber(8, label38);
        aSMifierMethodVisitor0.visitVarInsn(28, 330);
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        aSMifierClassVisitor46.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor46.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor67 = classWriter61.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        classWriter61.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor69 = aSMifierClassVisitor46.visitField((int) (short) 1, "L142696279", "", "", (java.lang.Object) classWriter61);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = classWriter61.visitAnnotation("L2113189186", true);
        int int77 = classWriter61.newMethod("L326432149", "L967033583", "L61669440", false);
        classWriter61.visitSource("L265725697", "L723576843");
        int int82 = classWriter61.newClass("L697359787");
        classWriter61.visitOuterClass("L621056596", "L2099222213", "L1978431276");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "L621056596");
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitMethodInsn(234, "L1399028172", "L1459649577", "L63738833");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 9 + "'", int77 == 9);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 12 + "'", int82 == 12);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter6 = printWriter1.append('#');
        printWriter6.println((double) 51966);
        char[] charArray15 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter6.write(charArray15);
        java.util.Locale locale17 = null;
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter26.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter26.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter26.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray39 = classWriter26.toByteArray();
        org.mockito.asm.ByteVector byteVector42 = byteVector22.putByteArray(byteArray39, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader43 = new org.mockito.asm.ClassReader(byteArray39);
        long long45 = classReader43.readLong((int) (byte) 100);
        int int47 = classReader43.readUnsignedShort((int) (short) 0);
        java.lang.String[] strArray48 = classReader43.getInterfaces();
        java.io.PrintWriter printWriter49 = printWriter6.format(locale17, "L1434348811", (java.lang.Object[]) strArray48);
        printWriter6.flush();
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter((java.io.Writer) printWriter6);
        printWriter51.println('a');
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , a,  , #, #, a]");
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 8532477865490146625L + "'", long45 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 51966 + "'", int47 == 51966);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(printWriter49);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        org.mockito.asm.Label label4 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label2, label3, label4, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation(26, "L1556845882", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor15.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierMethodVisitor15.visitAnnotation("", true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor28.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor28.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierMethodVisitor28.visitAnnotation("hi!", false);
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        aSMifierMethodVisitor28.visitLineNumber(10, label44);
        aSMifierMethodVisitor15.visitLineNumber(1, label44);
        java.lang.Object obj47 = label44.info;
        java.lang.String str48 = label44.toString();
        java.lang.String str49 = label44.toString();
        java.lang.String str50 = label44.toString();
        java.lang.String str51 = label44.toString();
        aSMifierMethodVisitor0.visitLineNumber(225, label44);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNull(obj47);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L452350094" + "'", str48, "L452350094");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L452350094" + "'", str49, "L452350094");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L452350094" + "'", str50, "L452350094");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L452350094" + "'", str51, "L452350094");
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitIincInsn(1, 0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor13.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor13.visitMaxs((int) (short) 0, 1);
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor28.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierMethodVisitor28.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray43 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor45 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor45.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label51 = null;
        int[] intArray53 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor45.visitLookupSwitchInsn(label51, intArray53, labelArray54);
        aSMifierMethodVisitor28.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray43, (int) 'a', (java.lang.Object[]) labelArray54);
        aSMifierMethodVisitor13.visitTableSwitchInsn(8, (int) (byte) 1, label27, labelArray54);
        aSMifierMethodVisitor13.visitMaxs(3, 51966);
        aSMifierMethodVisitor13.visitIincInsn((-889275714), 9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor65 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor65.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor65.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor65.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = aSMifierMethodVisitor65.visitAnnotation("hi!", false);
        org.mockito.asm.Label label81 = new org.mockito.asm.Label();
        aSMifierMethodVisitor65.visitLineNumber(10, label81);
        aSMifierMethodVisitor13.visitLineNumber(4, label81);
        aSMifierMethodVisitor0.visitJumpInsn(10, label81);
        aSMifierMethodVisitor0.visitVarInsn(13, (int) (short) 1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor88 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor88.visitCode();
        aSMifierMethodVisitor88.visitIincInsn((int) (byte) -1, 2);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) 2);
        aSMifierMethodVisitor0.visitIntInsn(186, 1986622313);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(attributeArray43);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1]");
        org.junit.Assert.assertNotNull(labelArray54);
        org.junit.Assert.assertNotNull(annotationVisitor79);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.Label label18 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor19.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierMethodVisitor19.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray34 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label42 = null;
        int[] intArray44 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor36.visitLookupSwitchInsn(label42, intArray44, labelArray45);
        aSMifierMethodVisitor19.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray34, (int) 'a', (java.lang.Object[]) labelArray45);
        aSMifierMethodVisitor0.visitTableSwitchInsn(3, 2, label18, labelArray45);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierMethodVisitor0.visitParameterAnnotation(4, "L365115101", true);
        aSMifierMethodVisitor0.visitVarInsn((int) (short) 10, 14);
        aSMifierMethodVisitor0.visitIntInsn((int) (short) 1, (int) (short) 1);
        java.util.List list60 = aSMifierMethodVisitor0.getText();
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(attributeArray34);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1]");
        org.junit.Assert.assertNotNull(labelArray45);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println(8532477865490146625L);
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("hi!");
        printWriter35.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter35);
        printWriter35.print(0.0d);
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("hi!");
        char[] charArray49 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter42.print(charArray49);
        printWriter35.write(charArray49);
        printWriter1.print(charArray49);
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter("hi!");
        printWriter55.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        printWriter55.print(0.0d);
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter((java.io.Writer) printWriter55, true);
        printWriter62.write("L142696279");
        java.util.Locale locale65 = null;
        java.lang.String[] strArray67 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter68 = printWriter62.printf(locale65, "L1105153118", (java.lang.Object[]) strArray67);
        java.io.PrintWriter printWriter69 = printWriter1.format("L598840791", (java.lang.Object[]) strArray67);
        printWriter1.println('a');
        java.io.PrintWriter printWriter72 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        java.io.PrintWriter printWriter73 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(printWriter68);
        org.junit.Assert.assertNotNull(printWriter69);
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitMethodInsn((int) 'a', "", "", "");
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitParameterAnnotation(590080, "", false);
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 9, (int) (short) -1);
        aSMifierMethodVisitor0.visitMethodInsn(27, "L1692480988", "", "L1715840275");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierMethodVisitor0.visitAnnotation("L390977699", true);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn((int) '4', (int) 'a');
        aSMifierMethodVisitor0.visitTypeInsn(8, "");
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter15.visitOuterClass("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter15.visitAnnotation("", true);
        annotationVisitor22.visitEnd();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) annotationVisitor22);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitInsn((int) (short) 26913);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26913");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor22);
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitSource("L1669980843", "L1669980843");
        aSMifierClassVisitor1.visitSource("L2113189186", "");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter24.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter24.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor36 = classWriter24.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray37 = classWriter24.toByteArray();
        org.mockito.asm.ByteVector byteVector40 = byteVector20.putByteArray(byteArray37, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader41 = new org.mockito.asm.ClassReader(byteArray37);
        long long43 = classReader41.readLong((int) (byte) 100);
        long long45 = classReader41.readLong((int) (byte) 10);
        java.lang.String[] strArray46 = classReader41.getInterfaces();
        int int48 = classReader41.readByte((int) (short) 10);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter(classReader41, 0);
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter(classReader41, (int) (short) 1);
        classWriter52.visitSource("L1669980843", "L1669980843");
        int int57 = classWriter52.newUTF8("L459227517");
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor1.visitField(57174305, "L237245406", "L1216476214", "L298663367", (java.lang.Object) "L459227517");
        aSMifierClassVisitor1.visitInnerClass("L326432149", "L598840791", "", (int) (short) -326);
        aSMifierClassVisitor1.visitInnerClass("L1434348811", "", "L237245406", 65210);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor73 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor73.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor73.visitCode();
        aSMifierMethodVisitor73.visitIntInsn((int) '4', (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = aSMifierMethodVisitor73.visitAnnotation("hi!", false);
        aSMifierMethodVisitor73.visitMethodInsn(1, "L142696279", "L994489370", "L326432149");
        org.mockito.asm.FieldVisitor fieldVisitor91 = aSMifierClassVisitor1.visitField((-1161953280), "L139692246", "L994489370", "", (java.lang.Object) aSMifierMethodVisitor73);
        org.mockito.asm.AnnotationVisitor annotationVisitor94 = aSMifierClassVisitor1.visitAnnotation("L659269359", true);
        annotationVisitor94.visitEnd();
        annotationVisitor94.visitEnd();
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 8532477865490146625L + "'", long43 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 72057598333118569L + "'", long45 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(annotationVisitor85);
        org.junit.Assert.assertNotNull(fieldVisitor91);
        org.junit.Assert.assertNotNull(annotationVisitor94);
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        classWriter1.visitEnd();
        int int10 = classWriter1.newClass("");
        classWriter1.visitInnerClass("L142696279", "L326432149", "L142696279", 4);
        classWriter1.visitEnd();
        classWriter1.visitSource("L1669980843", "");
        classWriter1.visitOuterClass("L142696279", "L978789454", "L1931374313");
        classWriter1.visitSource("L1968646166", "L802852197");
        int int28 = classWriter1.newUTF8("L406814154");
        int int33 = classWriter1.newMethod("L674352908", "L1654109497", "L1653372446", false);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor34 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor34.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor34.visitCode();
        aSMifierMethodVisitor34.visitIntInsn((int) '4', (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierMethodVisitor34.visitAnnotation("hi!", false);
        aSMifierMethodVisitor34.visitMethodInsn(1, "L142696279", "L994489370", "L326432149");
        aSMifierMethodVisitor34.visitCode();
        aSMifierMethodVisitor34.visitIincInsn(29801, (-1));
        int int56 = classWriter1.newConst((java.lang.Object) (-1));
        classWriter1.visitSource("L117563695", "L2095066844");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 13 + "'", int28 == 13);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 20 + "'", int56 == 20);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor10.visitOuterClass("", "L1434348811", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierClassVisitor10.visitAnnotation("L1669980843", true);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter("hi!");
        printWriter23.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter23);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor26.visitAnnotation("", false);
        aSMifierClassVisitor26.visitEnd();
        aSMifierClassVisitor26.visitSource("L1749641217", "L994489370");
        aSMifierClassVisitor26.visitOuterClass("L137501116", "L2036836790", "L1230702653");
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(25);
        java.lang.String[] strArray49 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        classWriter43.visit((int) (short) 0, (-1107296256), "L834812042", "L1694926691", "L1544572272", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = aSMifierClassVisitor26.visitMethod((int) (short) -326, "L1004430080", "L1931374313", "L137136720", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor52 = aSMifierClassVisitor10.visitMethod(8, "L1608560463", "L96121905", "L1852655365", strArray49);
        java.util.List list53 = aSMifierClassVisitor10.text;
        aSMifierClassVisitor10.visitInnerClass("L1892091981", "L1206354579", "L1978431276", (int) (short) 256);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter21.print(false);
        printWriter21.println((long) (-889275714));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter21);
        printWriter21.println("L1669980843");
        printWriter21.print((double) (short) 30313);
        printWriter21.print((long) 10);
        printWriter21.print(true);
        java.io.PrintWriter printWriter65 = new java.io.PrintWriter((java.io.Writer) printWriter21);
        java.io.PrintWriter printWriter67 = printWriter21.append((java.lang.CharSequence) "L1532047758");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor68 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter67);
        java.io.PrintWriter printWriter70 = new java.io.PrintWriter((java.io.Writer) printWriter67, false);
        printWriter67.flush();
        java.io.PrintWriter printWriter73 = new java.io.PrintWriter((java.io.Writer) printWriter67, false);
        printWriter73.println('#');
        printWriter73.println();
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(printWriter67);
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "", label16, label17, 8);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter51.print((int) '4');
        aSMifierMethodVisitor0.print(printWriter51);
        printWriter51.println((long) 1986622313);
        printWriter51.println((int) (byte) 1);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter21.print(false);
        printWriter21.println((long) (-889275714));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter21);
        printWriter21.println("L1669980843");
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter21);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        printWriter59.println((double) 12);
        printWriter59.println('#');
        printWriter59.println((long) 22);
        printWriter59.flush();
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 9);
        int int3 = classWriter1.newUTF8("L967033583");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("L801849928", true);
        int int8 = classWriter1.newClass("L659269359");
        classWriter1.visitOuterClass("L723576843", "L174478886", "L997959795");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor13.visitMethodInsn((int) 'a', "", "", "");
        aSMifierMethodVisitor13.visitFieldInsn(4, "L994489370", "", "L326432149");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor30 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor30.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor30.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label40 = null;
        aSMifierMethodVisitor30.visitLineNumber((int) (byte) 10, label40);
        org.mockito.asm.Label label44 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor45 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor45.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label51 = null;
        int[] intArray53 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor45.visitLookupSwitchInsn(label51, intArray53, labelArray54);
        aSMifierMethodVisitor30.visitTableSwitchInsn((int) (byte) 0, 51966, label44, labelArray54);
        org.mockito.asm.Label label57 = null;
        aSMifierMethodVisitor30.visitLabel(label57);
        org.mockito.asm.Label label59 = new org.mockito.asm.Label();
        aSMifierMethodVisitor30.visitLabel(label59);
        aSMifierMethodVisitor13.visitJumpInsn(100, label59);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter("hi!");
        printWriter63.print((int) 'a');
        printWriter63.println("");
        printWriter63.print((float) 590080L);
        java.io.PrintWriter printWriter71 = new java.io.PrintWriter((java.io.Writer) printWriter63, true);
        label59.info = printWriter63;
        java.lang.String str73 = label59.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int74 = classWriter1.newConst((java.lang.Object) label59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value L494971948");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1]");
        org.junit.Assert.assertNotNull(labelArray54);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "L494971948" + "'", str73, "L494971948");
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitMethodInsn((int) 'a', "", "", "");
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitParameterAnnotation(590080, "", false);
        aSMifierMethodVisitor0.visitIincInsn(51966, (int) (byte) 10);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor19.visitMethodInsn((int) 'a', "", "", "");
        aSMifierMethodVisitor19.visitFieldInsn(4, "L994489370", "", "L326432149");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor36.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label46 = null;
        aSMifierMethodVisitor36.visitLineNumber((int) (byte) 10, label46);
        org.mockito.asm.Label label50 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor51 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor51.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label57 = null;
        int[] intArray59 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray60 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor51.visitLookupSwitchInsn(label57, intArray59, labelArray60);
        aSMifierMethodVisitor36.visitTableSwitchInsn((int) (byte) 0, 51966, label50, labelArray60);
        org.mockito.asm.Label label63 = null;
        aSMifierMethodVisitor36.visitLabel(label63);
        org.mockito.asm.Label label65 = new org.mockito.asm.Label();
        aSMifierMethodVisitor36.visitLabel(label65);
        aSMifierMethodVisitor19.visitJumpInsn(100, label65);
        java.lang.String str68 = label65.toString();
        java.lang.String str69 = label65.toString();
        aSMifierMethodVisitor0.visitLabel(label65);
        aSMifierMethodVisitor0.visitMaxs(28276, 169);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1]");
        org.junit.Assert.assertNotNull(labelArray60);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "L1342480378" + "'", str68, "L1342480378");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "L1342480378" + "'", str69, "L1342480378");
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter21.print(false);
        printWriter21.println((long) (-889275714));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter21);
        printWriter21.println("L1669980843");
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter21);
        java.io.PrintWriter printWriter61 = printWriter21.append('a');
        printWriter21.println(' ');
        printWriter21.print((float) 1869509376);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(printWriter61);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        byte[] byteArray39 = classWriter1.toByteArray();
        int int41 = classWriter1.newUTF8("L61669440");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter1.visitAnnotation("L801849928", false);
        java.lang.String[] strArray50 = null;
        classWriter1.visit((int) '#', 50331648, "L406814154", "L1441782014", "", strArray50);
        int int54 = classWriter1.newNameType("L365115101", "L1845262982");
        classWriter1.visitInnerClass("L2011797087", "L745195575", "L699807857", 136);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 13, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 4, 63, -128, 0, 0, 7, 0, 1, 7, 0, 2, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 35, 0, 5, 0, 6, 0, 3, 0, 6, 0, 5, 0, 5, 0, 2, 0, 0, 0, 1, 0, 1, 0, 2, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 2, 0, 2, -1, -1, 0, 2, 0, 1, 0, 3, 0, 7, 0, 0, 0, 2, 0, 4, 0, 9, 0, 0, 0, 0, 0, 8, 0, 0, 0, 2, 0, 2, 0, 0, 0, 4, 0, 8, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 13 + "'", int41 == 13);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20 + "'", int54 == 20);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor22 = classWriter16.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = fieldVisitor22.visitAnnotation("hi!", true);
        fieldVisitor22.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = fieldVisitor22.visitAnnotation("L994489370", true);
        annotationVisitor13.visit("L96121905", (java.lang.Object) true);
        annotationVisitor13.visitEnd();
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector((int) (short) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(16778088);
        annotationVisitor13.visit("L1931374313", (java.lang.Object) byteVector36);
        org.mockito.asm.ByteVector byteVector39 = byteVector36.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putShort(872);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putShort(1869509376);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list30 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitMaxs((-1), (int) (short) 100);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierMethodVisitor0.visitParameterAnnotation(2, "", true);
        aSMifierMethodVisitor0.visitMaxs((int) 'a', 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (byte) 10, "L2036836790");
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierMethodVisitor0.visitAnnotationDefault();
        annotationVisitor45.visitEnd();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor45);
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.println("hi!");
        printWriter1.flush();
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("hi!");
        printWriter6.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor9 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter22.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = classWriter22.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor34 = classWriter22.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray35 = classWriter22.toByteArray();
        org.mockito.asm.ByteVector byteVector38 = byteVector18.putByteArray(byteArray35, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader39 = new org.mockito.asm.ClassReader(byteArray35);
        long long41 = classReader39.readLong((int) (byte) 100);
        long long43 = classReader39.readLong((int) (byte) 10);
        java.lang.String[] strArray44 = classReader39.getInterfaces();
        aSMifierClassVisitor9.visit((int) (byte) 1, (-1), "", "hi!", "", strArray44);
        aSMifierClassVisitor9.visitOuterClass("L1434348811", "L326432149", "L994489370");
        aSMifierClassVisitor9.visitEnd();
        aSMifierClassVisitor9.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor9.visitAnnotation("L1418438756", true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor59 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor59.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor59.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = aSMifierMethodVisitor59.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = aSMifierMethodVisitor59.visitAnnotationDefault();
        org.mockito.asm.Label label73 = null;
        aSMifierMethodVisitor59.visitLabel(label73);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierMethodVisitor59.visitAnnotationDefault();
        aSMifierMethodVisitor59.visitIntInsn((int) (short) 9, 118);
        org.mockito.asm.AnnotationVisitor annotationVisitor81 = aSMifierMethodVisitor59.visitAnnotation("L1556230913", true);
        aSMifierMethodVisitor59.visitIincInsn((int) (short) 24942, 2817);
        aSMifierMethodVisitor59.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = aSMifierMethodVisitor59.visitAnnotationDefault();
        org.mockito.asm.FieldVisitor fieldVisitor87 = aSMifierClassVisitor9.visitField((int) (short) 29782, "L1788074348", "L967033583", "L1775421725", (java.lang.Object) annotationVisitor86);
        printWriter1.print((java.lang.Object) "L967033583");
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 8532477865490146625L + "'", long41 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 72057598333118569L + "'", long43 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(annotationVisitor81);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertNotNull(fieldVisitor87);
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor1.visit(2, (int) (byte) 0, "", "", "", strArray10);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "L1434348811");
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        aSMifierClassVisitor29.visitInnerClass("", "hi!", "", 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor29.visitField(100, "hi!", "", "", (java.lang.Object) 100);
        aSMifierClassVisitor29.visitInnerClass("L1434348811", "", "", 2);
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        aSMifierClassVisitor29.visitInnerClass("L142696279", "L1434348811", "", 1);
        aSMifierClassVisitor29.visitSource("L1441782014", "");
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor1.visitField((int) (byte) 0, "L1669980843", "L994489370", "L666971223", (java.lang.Object) "");
        aSMifierClassVisitor1.visitOuterClass("L601661571", "L2076399201", "L137136720");
        aSMifierClassVisitor1.visitOuterClass("L1531629739", "L395265253", "L1864077543");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor57);
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.write("");
        printWriter1.print(true);
        printWriter1.print((long) (short) 872);
        printWriter1.close();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.print((float) 590080L);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter9.println('a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitVarInsn(2, (int) (byte) -1);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter20.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter33.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor45 = classWriter33.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter33.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter33.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter58 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor59 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter58);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor59.visit(2, (int) (byte) 0, "", "", "", strArray68);
        classWriter33.visit((int) 'a', (int) '#', "", "", "hi!", strArray68);
        classWriter20.visit(7, (int) (byte) 0, "hi!", "", "", strArray68);
        org.mockito.asm.Attribute[] attributeArray73 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        aSMifierMethodVisitor13.visitFrame((-889275714), 51966, (java.lang.Object[]) strArray68, (int) (short) 0, (java.lang.Object[]) attributeArray73);
        java.io.PrintWriter printWriter75 = printWriter9.printf("", (java.lang.Object[]) attributeArray73);
        java.io.PrintWriter printWriter77 = printWriter9.append((java.lang.CharSequence) "L994489370");
        printWriter9.println((double) '#');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor80 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter9);
        java.io.PrintWriter printWriter81 = null;
        aSMifierClassVisitor80.print(printWriter81);
        aSMifierClassVisitor80.visitOuterClass("L838424803", "L1216476214", "L1808073265");
        aSMifierClassVisitor80.visitSource("L1284973471", "L834812042");
        aSMifierClassVisitor80.visitOuterClass("L1035698796", "L1111364207", "L1138164648");
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(attributeArray73);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(printWriter77);
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        java.lang.Object[] objArray33 = null;
        java.io.PrintWriter printWriter34 = printWriter1.printf("", objArray33);
        printWriter34.println(true);
        printWriter34.write(6);
        boolean boolean39 = printWriter34.checkError();
        printWriter34.println((double) 1869967971);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMaxs((int) '4', 0);
        org.mockito.asm.Label label10 = null;
        org.mockito.asm.Label label11 = null;
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label10, label11, label12, "hi!");
        aSMifierMethodVisitor0.visitIntInsn(2, (int) (short) -1);
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(annotationVisitor18);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.print((float) 590080L);
        java.lang.Object[] objArray9 = null;
        java.io.PrintWriter printWriter10 = printWriter1.printf("hi!", objArray9);
        printWriter10.println('a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor13.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierMethodVisitor13.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor13.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor13.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        aSMifierMethodVisitor13.visitLabel(label33);
        aSMifierMethodVisitor13.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor37.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor37.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierMethodVisitor37.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor37.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierMethodVisitor37.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label57 = new org.mockito.asm.Label();
        aSMifierMethodVisitor37.visitLabel(label57);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor59 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor59.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor59.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor59.visitIincInsn(1, 0);
        org.mockito.asm.Label label71 = null;
        aSMifierMethodVisitor59.visitLabel(label71);
        label57.info = aSMifierMethodVisitor59;
        aSMifierMethodVisitor13.visitLineNumber(24942, label57);
        java.lang.Object obj75 = label57.info;
        printWriter10.print((java.lang.Object) label57);
        printWriter10.print((float) 1125899906973699L);
        java.io.PrintWriter printWriter79 = new java.io.PrintWriter((java.io.Writer) printWriter10);
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        aSMifierMethodVisitor0.visitTypeInsn((int) '4', "");
        aSMifierMethodVisitor0.visitCode();
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitIntInsn(30313, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor0.visitFieldInsn(6, "L326432149", "L1434348811", "");
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 872, "L1703143512", false);
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter("hi!");
        printWriter29.print((-889275714));
        java.util.Locale locale32 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor34 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label35 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label42 = null;
        int[] intArray44 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor36.visitLookupSwitchInsn(label42, intArray44, labelArray45);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor47 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor47.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label53 = null;
        int[] intArray55 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor47.visitLookupSwitchInsn(label53, intArray55, labelArray56);
        aSMifierMethodVisitor34.visitLookupSwitchInsn(label35, intArray44, labelArray56);
        java.io.PrintWriter printWriter59 = printWriter29.format(locale32, "hi!", (java.lang.Object[]) labelArray56);
        printWriter29.println((int) (short) 1);
        java.lang.String[] strArray63 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter64 = printWriter29.format("hi!", (java.lang.Object[]) strArray63);
        java.lang.String[] strArray66 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.io.PrintWriter printWriter67 = printWriter29.printf("", (java.lang.Object[]) strArray66);
        printWriter29.println(false);
        printWriter29.println((long) 5);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter29);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1]");
        org.junit.Assert.assertNotNull(labelArray45);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1]");
        org.junit.Assert.assertNotNull(labelArray56);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(printWriter64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(printWriter67);
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter26.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter26.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter26.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter26.visitEnd();
        classWriter26.visitInnerClass("hi!", "hi!", "", (int) (byte) 10);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "hi!");
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitCode();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor38);
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "", label16, label17, 8);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter51.print((int) '4');
        aSMifierMethodVisitor0.print(printWriter51);
        printWriter51.print('a');
        printWriter51.write((int) '#');
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter51);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitAnnotation("L1544572272", false);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitIntInsn((int) (short) 1, (int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitFieldInsn((int) (short) 25970, "L1200596014", "L1366965889", "L1890580259");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor21);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitVarInsn(2, (int) (byte) -1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 100, "");
        aSMifierMethodVisitor0.visitInsn(8);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor13.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierMethodVisitor13.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor13.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor13.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        aSMifierMethodVisitor13.visitLabel(label33);
        aSMifierMethodVisitor0.visitLineNumber(57174305, label33);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L834812042", 6);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 10, "L1297264300", "L1297264300", "L1829941255");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierMethodVisitor0.visitAnnotation("L1728871576", false);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L252015005", 1986622313);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor46);
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.write((-889275714));
        printWriter1.println('a');
        printWriter1.print("L1000949368");
        printWriter1.println(' ');
        java.io.PrintWriter printWriter26 = printWriter1.append(' ');
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter27.println();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(printWriter26);
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println(8532477865490146625L);
        printWriter1.close();
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter36.println(true);
        printWriter36.write(2817);
        printWriter36.print((long) (-21316096));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor23 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor23.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor23.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor23.visitMaxs((int) (short) 0, 1);
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor38.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor38.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierMethodVisitor38.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray53 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor55 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor55.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label61 = null;
        int[] intArray63 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray64 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor55.visitLookupSwitchInsn(label61, intArray63, labelArray64);
        aSMifierMethodVisitor38.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray53, (int) 'a', (java.lang.Object[]) labelArray64);
        aSMifierMethodVisitor23.visitTableSwitchInsn(8, (int) (byte) 1, label37, labelArray64);
        aSMifierMethodVisitor0.visitTableSwitchInsn((-889275714), (int) '#', label22, labelArray64);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L96121905", (int) (short) -1);
        java.io.PrintWriter printWriter73 = new java.io.PrintWriter("hi!");
        printWriter73.print((int) 'a');
        printWriter73.println("");
        printWriter73.print((float) 590080L);
        java.io.PrintWriter printWriter81 = new java.io.PrintWriter((java.io.Writer) printWriter73, true);
        printWriter73.print((float) (short) 30313);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor84 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter73);
        aSMifierMethodVisitor0.print(printWriter73);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(attributeArray53);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[1]");
        org.junit.Assert.assertNotNull(labelArray64);
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label10);
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label21 = null;
        int[] intArray23 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor15.visitLookupSwitchInsn(label21, intArray23, labelArray24);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 0, 51966, label14, labelArray24);
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor0.visitLabel(label27);
        aSMifierMethodVisitor0.visitInsn(0);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter32.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter32.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor44 = classWriter32.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray45 = classWriter32.toByteArray();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) byteArray45);
        aSMifierMethodVisitor0.visitIincInsn(0, (int) (short) 10);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("hi!");
        printWriter51.print((-889275714));
        printWriter51.println((int) (short) 256);
        printWriter51.print((long) 1);
        aSMifierMethodVisitor0.print(printWriter51);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter60.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = classWriter60.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor72 = classWriter60.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter60.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor79 = classWriter60.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        classWriter60.visitEnd();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) classWriter60);
        aSMifierMethodVisitor0.visitMaxs((int) (short) 29793, 65210);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1940237921", (-889275714));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1]");
        org.junit.Assert.assertNotNull(labelArray24);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(fieldVisitor79);
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitIincInsn(1, 0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor13.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor13.visitMaxs((int) (short) 0, 1);
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor28.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierMethodVisitor28.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray43 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor45 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor45.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label51 = null;
        int[] intArray53 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor45.visitLookupSwitchInsn(label51, intArray53, labelArray54);
        aSMifierMethodVisitor28.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray43, (int) 'a', (java.lang.Object[]) labelArray54);
        aSMifierMethodVisitor13.visitTableSwitchInsn(8, (int) (byte) 1, label27, labelArray54);
        aSMifierMethodVisitor13.visitMaxs(3, 51966);
        aSMifierMethodVisitor13.visitIincInsn((-889275714), 9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor65 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor65.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor65.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor65.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = aSMifierMethodVisitor65.visitAnnotation("hi!", false);
        org.mockito.asm.Label label81 = new org.mockito.asm.Label();
        aSMifierMethodVisitor65.visitLineNumber(10, label81);
        aSMifierMethodVisitor13.visitLineNumber(4, label81);
        aSMifierMethodVisitor0.visitJumpInsn(10, label81);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitMaxs(16842765, 1699311222);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitCode();
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(attributeArray43);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1]");
        org.junit.Assert.assertNotNull(labelArray54);
        org.junit.Assert.assertNotNull(annotationVisitor79);
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.write("");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor34.visitEnd();
        aSMifierClassVisitor34.visitInnerClass("L2113189186", "L326432149", "", (int) (byte) 100);
        aSMifierClassVisitor34.visitOuterClass("L2036836790", "L1808073265", "L1297264300");
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierClassVisitor34.visitAnnotation("L767403187", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor34.visitAnnotation("L1375615036", false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("L1434348811", true);
        aSMifierClassVisitor1.visitSource("L994489370", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = aSMifierClassVisitor1.visitAnnotation("L491672583", true);
        aSMifierClassVisitor1.visitSource("L2109881748", "L1713827913");
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor18);
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label10);
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label21 = null;
        int[] intArray23 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor15.visitLookupSwitchInsn(label21, intArray23, labelArray24);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 0, 51966, label14, labelArray24);
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor0.visitLabel(label27);
        aSMifierMethodVisitor0.visitInsn(0);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter32.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter32.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor44 = classWriter32.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray45 = classWriter32.toByteArray();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) byteArray45);
        aSMifierMethodVisitor0.visitIincInsn(0, (int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor0.visitAnnotation("L1105153118", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitFieldInsn(118, "L1430933554", "L659269359", "L1461066057");
        aSMifierMethodVisitor0.visitMaxs(1818575214, (int) (short) 256);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1]");
        org.junit.Assert.assertNotNull(labelArray24);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(annotationVisitor62);
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor10.visitSource("L799304101", "L326432149");
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitSource("L614568462", "L337574950");
        aSMifierClassVisitor10.visitInnerClass("L139692246", "L978789454", "L598840791", 3);
        aSMifierClassVisitor10.visitOuterClass("hi!", "L981073027", "L128274680");
        aSMifierClassVisitor10.visitSource("L1829941255", "L1544572272");
        aSMifierClassVisitor10.visitEnd();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        int[] intArray8 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray9 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label6, intArray8, labelArray9);
        java.util.List list11 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '4', "", false);
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 0, (int) (short) 30313);
        aSMifierMethodVisitor0.visitIincInsn((-889275714), 17);
        org.mockito.asm.Label label22 = null;
        aSMifierMethodVisitor0.visitLabel(label22);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor25 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor25.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor25.visitIincInsn((int) (short) 100, (int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierMethodVisitor25.visitAnnotation("hi!", false);
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor25.visitJumpInsn((int) (short) 1, label38);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierMethodVisitor25.visitAnnotation("L96121905", true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor43 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor43.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor43.visitCode();
        aSMifierMethodVisitor43.visitIntInsn((int) '4', (int) 'a');
        aSMifierMethodVisitor43.visitTypeInsn(8, "");
        aSMifierMethodVisitor43.visitEnd();
        java.util.List list57 = aSMifierMethodVisitor43.getText();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor59 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor59.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor59.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = aSMifierMethodVisitor59.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor59.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = aSMifierMethodVisitor59.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label79 = new org.mockito.asm.Label();
        aSMifierMethodVisitor59.visitLabel(label79);
        aSMifierMethodVisitor43.visitLineNumber(24942, label79);
        aSMifierMethodVisitor25.visitLabel(label79);
        java.lang.String str83 = label79.toString();
        aSMifierMethodVisitor0.visitLineNumber(42, label79);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(labelArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertNotNull(annotationVisitor78);
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "L447808978" + "'", str83, "L447808978");
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter31.print((int) '4');
        printWriter31.println();
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.Writer) printWriter31, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter10 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor11 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor11.visit(2, (int) (byte) 0, "", "", "", strArray20);
        aSMifierClassVisitor1.visit((int) (short) 0, 5, "hi!", "hi!", "hi!", strArray20);
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        java.lang.String[] strArray33 = null;
        org.mockito.asm.MethodVisitor methodVisitor34 = aSMifierClassVisitor28.visitMethod((-1), "", "hi!", "", strArray33);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor1.visitField(0, "", "hi!", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitOuterClass("L1434348811", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "L142696279", "L142696279", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierClassVisitor1.visitAnnotation("L1845262982", true);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor47);
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn((int) '4', (int) 'a');
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", 151060480);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotationDefault();
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("hi!");
        char[] charArray23 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter16.print(charArray23);
        printWriter16.write("");
        printWriter16.println((double) (short) 100);
        printWriter16.println(false);
        java.io.PrintWriter printWriter32 = printWriter16.append((java.lang.CharSequence) "");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "");
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L711282579", 140);
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierMethodVisitor0.visitAnnotation("L189751204", false);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(annotationVisitor39);
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list30 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitMaxs((-1), (int) (short) 100);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor34 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label35 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label42 = null;
        int[] intArray44 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor36.visitLookupSwitchInsn(label42, intArray44, labelArray45);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor47 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor47.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label53 = null;
        int[] intArray55 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor47.visitLookupSwitchInsn(label53, intArray55, labelArray56);
        aSMifierMethodVisitor34.visitLookupSwitchInsn(label35, intArray44, labelArray56);
        aSMifierMethodVisitor34.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list64 = aSMifierMethodVisitor34.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierMethodVisitor34.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierMethodVisitor34.visitAnnotation("L1434348811", false);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor34);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 30313, "", true);
        aSMifierMethodVisitor0.visitIincInsn(50331648, 13);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) 2534374302089219L);
        aSMifierMethodVisitor0.visitInsn(35);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1]");
        org.junit.Assert.assertNotNull(labelArray45);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1]");
        org.junit.Assert.assertNotNull(labelArray56);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print(false);
        java.io.PrintWriter printWriter22 = printWriter1.append('a');
        java.util.Locale locale23 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor25 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor25.visitVarInsn(2, (int) (byte) -1);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter32.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter45.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = classWriter45.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor57 = classWriter45.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter45.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor64 = classWriter45.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter70 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor71 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter70);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor71.visit(2, (int) (byte) 0, "", "", "", strArray80);
        classWriter45.visit((int) 'a', (int) '#', "", "", "hi!", strArray80);
        classWriter32.visit(7, (int) (byte) 0, "hi!", "", "", strArray80);
        org.mockito.asm.Attribute[] attributeArray85 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        aSMifierMethodVisitor25.visitFrame((-889275714), 51966, (java.lang.Object[]) strArray80, (int) (short) 0, (java.lang.Object[]) attributeArray85);
        java.io.PrintWriter printWriter87 = printWriter22.printf(locale23, "L799304101", (java.lang.Object[]) attributeArray85);
        java.io.PrintWriter printWriter88 = new java.io.PrintWriter((java.io.Writer) printWriter87);
        java.io.PrintWriter printWriter90 = printWriter88.append((java.lang.CharSequence) "L2109987209");
        printWriter88.close();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(printWriter22);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(attributeArray85);
        org.junit.Assert.assertNotNull(printWriter87);
        org.junit.Assert.assertNotNull(printWriter90);
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "", label16, label17, 8);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter51.print((int) '4');
        aSMifierMethodVisitor0.print(printWriter51);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierMethodVisitor0.visitAnnotation("", false);
        aSMifierMethodVisitor0.visitTypeInsn(0, "L1216476214");
        aSMifierMethodVisitor0.visitTypeInsn(8, "L607677620");
        aSMifierMethodVisitor0.visitIincInsn(0, (int) (short) 24942);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitIntInsn(3395, 223337);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(annotationVisitor57);
    }

    @Test
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print('4');
        printWriter1.print("");
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        printWriter24.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor27.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label33 = null;
        int[] intArray35 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray36 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor27.visitLookupSwitchInsn(label33, intArray35, labelArray36);
        java.util.List list38 = aSMifierMethodVisitor27.getText();
        printWriter24.println((java.lang.Object) list38);
        printWriter24.print((double) 10L);
        printWriter24.print(false);
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor45.visit(2, (int) (byte) 0, "", "", "", strArray54);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor45.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor45.visitAnnotation("hi!", false);
        printWriter24.println((java.lang.Object) aSMifierClassVisitor45);
        printWriter1.print((java.lang.Object) printWriter24);
        printWriter1.print((double) (short) 1);
        printWriter1.close();
        printWriter1.println((float) 18);
        printWriter1.write(48640);
        printWriter1.print(65539);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1]");
        org.junit.Assert.assertNotNull(labelArray36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitVarInsn(2, (int) (byte) -1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 100, "");
        aSMifierMethodVisitor0.visitInsn(8);
        aSMifierMethodVisitor0.visitIntInsn(118, 2817);
        org.mockito.asm.Label label12 = null;
        int[] intArray19 = new int[] { 872, 1986622313, 2305, (short) -1, 20, 14 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor20 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor20.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor20.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor20.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Label label33 = null;
        int[] intArray40 = new int[] { 8, (short) -1, (-1), 4, 'a', 8 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor41.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor41.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierMethodVisitor41.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray56 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor58 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor58.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label64 = null;
        int[] intArray66 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray67 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor58.visitLookupSwitchInsn(label64, intArray66, labelArray67);
        aSMifierMethodVisitor41.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray56, (int) 'a', (java.lang.Object[]) labelArray67);
        aSMifierMethodVisitor20.visitLookupSwitchInsn(label33, intArray40, labelArray67);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label12, intArray19, labelArray67);
        org.mockito.asm.AnnotationVisitor annotationVisitor74 = aSMifierMethodVisitor0.visitAnnotation("L75574205", true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[872, 1986622313, 2305, -1, 20, 14]");
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[8, -1, -1, 4, 97, 8]");
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(attributeArray56);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1]");
        org.junit.Assert.assertNotNull(labelArray67);
        org.junit.Assert.assertNotNull(annotationVisitor74);
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor10.visitAnnotation("L326432149", false);
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor22.visit(2, (int) (byte) 0, "", "", "", strArray31);
        aSMifierClassVisitor10.visit(12, (int) (short) 0, "L1555790481", "L2101667039", "L137501116", strArray31);
        aSMifierClassVisitor10.visitSource("L1434348811", "L666971223");
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter49.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classWriter49.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter49.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray62 = classWriter49.toByteArray();
        org.mockito.asm.ByteVector byteVector65 = byteVector45.putByteArray(byteArray62, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader66 = new org.mockito.asm.ClassReader(byteArray62);
        long long68 = classReader66.readLong((int) (byte) 100);
        long long70 = classReader66.readLong((int) (byte) 10);
        java.lang.String[] strArray71 = classReader66.getInterfaces();
        int int73 = classReader66.readByte((int) '#');
        long long75 = classReader66.readLong(4);
        java.lang.String[] strArray76 = classReader66.getInterfaces();
        int int78 = classReader66.getItem(0);
        java.lang.String[] strArray79 = classReader66.getInterfaces();
        aSMifierClassVisitor10.visit(86, (-1161953280), "L290335602", "L540616366", "L1556845882", strArray79);
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = aSMifierClassVisitor10.visitAnnotation("L1578022509", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = aSMifierClassVisitor10.visitAnnotation("L1840320186", false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 8532477865490146625L + "'", long68 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 72057598333118569L + "'", long70 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 86 + "'", int73 == 86);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 590080L + "'", long75 == 590080L);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(annotationVisitor83);
        org.junit.Assert.assertNotNull(annotationVisitor86);
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        aSMifierMethodVisitor0.visitLabel(label20);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor24 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor24.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor24.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierMethodVisitor24.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor24.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierMethodVisitor24.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        aSMifierMethodVisitor24.visitLabel(label44);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor46 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor46.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor46.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor46.visitIincInsn(1, 0);
        org.mockito.asm.Label label58 = null;
        aSMifierMethodVisitor46.visitLabel(label58);
        label44.info = aSMifierMethodVisitor46;
        aSMifierMethodVisitor0.visitLineNumber(24942, label44);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L2113189186", 5);
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitTypeInsn(18, "");
        aSMifierMethodVisitor0.visitTypeInsn(1, "L1535101295");
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitVarInsn((int) (short) 25924, 1818575214);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25924");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor65);
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L96121905");
        printWriter1.write("L420329685");
        java.io.PrintWriter printWriter6 = new java.io.PrintWriter("hi!");
        char[] charArray13 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter6.print(charArray13);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor15.visitSource("L799304101", "L326432149");
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitSource("L614568462", "L337574950");
        aSMifierClassVisitor15.visitEnd();
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter37.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter37.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor49 = classWriter37.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray50 = classWriter37.toByteArray();
        org.mockito.asm.ByteVector byteVector53 = byteVector33.putByteArray(byteArray50, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader54 = new org.mockito.asm.ClassReader(byteArray50);
        long long56 = classReader54.readLong((int) (byte) 100);
        long long58 = classReader54.readLong((int) (byte) 10);
        int int60 = classReader54.readUnsignedShort(0);
        int int62 = classReader54.readUnsignedShort(3);
        java.lang.String[] strArray63 = classReader54.getInterfaces();
        aSMifierClassVisitor15.visit(65210, 320, "L2072201856", "L437863088", "L1482294079", strArray63);
        java.io.PrintWriter printWriter65 = printWriter1.format("L1266948289", (java.lang.Object[]) strArray63);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 8532477865490146625L + "'", long56 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 72057598333118569L + "'", long58 == 72057598333118569L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 51966 + "'", int60 == 51966);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 48640 + "'", int62 == 48640);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(printWriter65);
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField((int) (short) 1, "L1434348811", "hi!", "hi!", (java.lang.Object) 0L);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("L994489370", true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor15.visitLabel(label21);
        aSMifierMethodVisitor15.visitFieldInsn((int) '4', "", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierMethodVisitor15.visitParameterAnnotation(0, "L666971223", false);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor1.visitField(321, "L137501116", "L1289682213", "L1592299270", (java.lang.Object) aSMifierMethodVisitor15);
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = fieldVisitor32.visitAnnotation("L231657813", false);
        fieldVisitor32.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = fieldVisitor32.visitAnnotation("L1518649074", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor39);
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter5.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = fieldVisitor11.visitAnnotation("hi!", true);
        printWriter1.print((java.lang.Object) annotationVisitor14);
        printWriter1.println((float) (byte) 1);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter19.println(true);
        java.util.Locale locale22 = null;
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter("hi!");
        printWriter25.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        java.util.List list39 = aSMifierMethodVisitor28.getText();
        printWriter25.println((java.lang.Object) list39);
        printWriter25.print((double) 10L);
        printWriter25.print(false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        aSMifierClassVisitor45.visitInnerClass("L1434348811", "", "L142696279", 24942);
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter62.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = classWriter62.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor74 = classWriter62.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray75 = classWriter62.toByteArray();
        org.mockito.asm.ByteVector byteVector78 = byteVector58.putByteArray(byteArray75, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader79 = new org.mockito.asm.ClassReader(byteArray75);
        long long81 = classReader79.readLong((int) (byte) 100);
        long long83 = classReader79.readLong((int) (byte) 10);
        java.lang.String[] strArray84 = classReader79.getInterfaces();
        int int86 = classReader79.readInt(0);
        int int87 = classReader79.getAccess();
        java.lang.String[] strArray88 = classReader79.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor89 = aSMifierClassVisitor45.visitMethod((int) (byte) 100, "L142696279", "L601661571", "L1434348811", strArray88);
        java.io.PrintWriter printWriter90 = printWriter19.printf(locale22, "L456226115", (java.lang.Object[]) strArray88);
        printWriter19.println(2);
        org.junit.Assert.assertNotNull(fieldVisitor11);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 8532477865490146625L + "'", long81 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 72057598333118569L + "'", long83 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-889275714) + "'", int86 == (-889275714));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(printWriter90);
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn(7, (int) 'a');
        aSMifierMethodVisitor0.visitTypeInsn(2, "hi!");
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1434348811", 2817);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitIincInsn(24942, (int) 'a');
        aSMifierMethodVisitor0.visitIincInsn(51966, 50331648);
        aSMifierMethodVisitor0.visitMaxs(27, 0);
        org.junit.Assert.assertNotNull(annotationVisitor14);
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter26.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter26.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter26.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray39 = classWriter26.toByteArray();
        org.mockito.asm.ByteVector byteVector42 = byteVector22.putByteArray(byteArray39, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader43 = new org.mockito.asm.ClassReader(byteArray39);
        long long45 = classReader43.readLong((int) (byte) 100);
        long long47 = classReader43.readLong((int) (byte) 10);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter(classReader43, (int) (short) 30313);
        int int51 = classReader43.getItem(4);
        byte[] byteArray52 = classReader43.b;
        printWriter1.println((java.lang.Object) classReader43);
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        java.util.Locale locale56 = null;
        java.lang.Object[] objArray58 = null;
        java.io.PrintWriter printWriter59 = printWriter1.printf(locale56, "L1479479862", objArray58);
        printWriter1.println((double) 203);
        printWriter1.println((float) 152);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 8532477865490146625L + "'", long45 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 72057598333118569L + "'", long47 == 72057598333118569L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 25 + "'", int51 == 25);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(printWriter59);
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter("hi!");
        char[] charArray40 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter33.print(charArray40);
        printWriter31.print(charArray40);
        printWriter31.print((float) 10L);
        printWriter31.println();
        printWriter31.write("L1669980843");
        java.io.PrintWriter printWriter49 = printWriter31.append((java.lang.CharSequence) "L1691870655");
        java.io.PrintWriter printWriter51 = printWriter49.append((java.lang.CharSequence) "L48323983");
        java.io.PrintWriter printWriter53 = printWriter49.append(' ');
        printWriter53.print("L267810866");
        printWriter53.flush();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(printWriter53);
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter7.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter7.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter7.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray20 = classWriter7.toByteArray();
        org.mockito.asm.ByteVector byteVector23 = byteVector3.putByteArray(byteArray20, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray20);
        long long26 = classReader24.readLong((int) (byte) 100);
        long long28 = classReader24.readLong((int) (byte) 10);
        java.lang.String[] strArray29 = classReader24.getInterfaces();
        int int31 = classReader24.readInt(0);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(classReader24, (int) '4');
        classWriter33.visitOuterClass("L2113189186", "hi!", "L1669980843");
        byte[] byteArray38 = classWriter33.toByteArray();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor43 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor43.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor43.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor43.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor43.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor43.visitFieldInsn(6, "L326432149", "L1434348811", "");
        org.mockito.asm.FieldVisitor fieldVisitor65 = classWriter33.visitField((int) (byte) 0, "L601661571", "L454715523", "L601661571", (java.lang.Object) "L326432149");
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = classWriter33.visitAnnotation("L1691870655", true);
        int int70 = classWriter33.newUTF8("");
        classWriter33.visitInnerClass("L2072201856", "L943959020", "", 0);
        int int78 = classWriter33.newNameType("L1321861150", "L1289682213");
        classWriter33.visitOuterClass("L1533650022", "L1276244777", "L1198406086");
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = classWriter33.visitAnnotation("L1124481616", false);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8532477865490146625L + "'", long26 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 72057598333118569L + "'", long28 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-889275714) + "'", int31 == (-889275714));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 11, 76, 50, 49, 49, 51, 49, 56, 57, 49, 56, 54, 7, 0, 9, 1, 0, 11, 76, 49, 54, 54, 57, 57, 56, 48, 56, 52, 51, 12, 0, 2, 0, 11, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 13, 0, 0, 0, 4, 0, 10, 0, 12]");
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 25 + "'", int78 == 25);
        org.junit.Assert.assertNotNull(annotationVisitor85);
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter31.print((int) '4');
        boolean boolean34 = printWriter31.checkError();
        java.util.Locale locale35 = null;
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("hi!");
        char[] charArray45 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter38.print(charArray45);
        printWriter38.write("");
        printWriter38.println((double) (short) 100);
        printWriter38.println((float) (-1107296256));
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter("hi!");
        printWriter55.print((int) 'a');
        printWriter55.println("");
        java.io.PrintWriter printWriter60 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor61 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter60);
        aSMifierClassVisitor61.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = aSMifierClassVisitor61.visitAnnotation("", false);
        printWriter55.print((java.lang.Object) false);
        java.io.PrintWriter printWriter71 = new java.io.PrintWriter((java.io.Writer) printWriter55);
        java.io.PrintWriter printWriter73 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor74 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter73);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor74.visit(2, (int) (byte) 0, "", "", "", strArray83);
        java.io.PrintWriter printWriter85 = printWriter55.printf("hi!", (java.lang.Object[]) strArray83);
        java.io.PrintWriter printWriter86 = printWriter38.printf("L614568462", (java.lang.Object[]) strArray83);
        java.io.PrintWriter printWriter87 = printWriter31.printf(locale35, "L1555790481", (java.lang.Object[]) strArray83);
        java.io.PrintWriter printWriter88 = new java.io.PrintWriter((java.io.Writer) printWriter87);
        printWriter87.print((double) 3733320570729569L);
        boolean boolean91 = printWriter87.checkError();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor69);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertNotNull(printWriter86);
        org.junit.Assert.assertNotNull(printWriter87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.Label label14 = null;
        aSMifierMethodVisitor0.visitLabel(label14);
        java.lang.Object obj16 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj16);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierMethodVisitor0.visitAnnotation("L1669980843", false);
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter("hi!");
        printWriter22.print((-889275714));
        printWriter22.print(0.0d);
        aSMifierMethodVisitor0.print(printWriter22);
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter("hi!");
        printWriter29.print((-889275714));
        java.util.Locale locale32 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor34 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label35 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label42 = null;
        int[] intArray44 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor36.visitLookupSwitchInsn(label42, intArray44, labelArray45);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor47 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor47.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label53 = null;
        int[] intArray55 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor47.visitLookupSwitchInsn(label53, intArray55, labelArray56);
        aSMifierMethodVisitor34.visitLookupSwitchInsn(label35, intArray44, labelArray56);
        java.io.PrintWriter printWriter59 = printWriter29.format(locale32, "hi!", (java.lang.Object[]) labelArray56);
        printWriter29.println(8532477865490146625L);
        aSMifierMethodVisitor0.print(printWriter29);
        aSMifierMethodVisitor0.visitMaxs(16779859, (int) (short) 872);
        aSMifierMethodVisitor0.visitIntInsn(11, 16779859);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1]");
        org.junit.Assert.assertNotNull(labelArray45);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1]");
        org.junit.Assert.assertNotNull(labelArray56);
        org.junit.Assert.assertNotNull(printWriter59);
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.write((-889275714));
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter1.println((double) (-91551935198396416L));
        java.io.PrintWriter printWriter23 = printWriter1.append('4');
        printWriter23.write("L136332369");
        printWriter23.print(118);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(printWriter23);
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn(7, (int) 'a');
        aSMifierMethodVisitor0.visitTypeInsn(2, "hi!");
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1434348811", 2817);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitIincInsn((int) 'a', (-1));
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 0);
        aSMifierMethodVisitor0.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitTypeInsn((int) (short) 22113, "L1077931653");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor14);
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (byte) 10, "L454715523", false);
        aSMifierMethodVisitor0.visitInsn((int) (short) 1);
        aSMifierMethodVisitor0.visitMaxs(0, (int) '4');
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierMethodVisitor0.visitAnnotation("L2113189186", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1297264300", 51966);
        aSMifierMethodVisitor0.visitMaxs(22, 104);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L2048118842", (int) (short) 25970);
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (-1161953280));
        aSMifierMethodVisitor0.visitIincInsn(15, (int) (short) 29793);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor9 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor9.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label15 = null;
        int[] intArray17 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor9.visitLookupSwitchInsn(label15, intArray17, labelArray18);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField(1, "", "hi!", "", (java.lang.Object) label15);
        aSMifierClassVisitor1.visitOuterClass("L994489370", "L799304101", "L1434348811");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("L61669440", false);
        aSMifierClassVisitor1.visitSource("L666971223", "L1441782014");
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter43.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter43.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter43.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray56 = classWriter43.toByteArray();
        org.mockito.asm.ByteVector byteVector59 = byteVector39.putByteArray(byteArray56, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader60 = new org.mockito.asm.ClassReader(byteArray56);
        long long62 = classReader60.readLong((int) (byte) 100);
        long long64 = classReader60.readLong((int) (byte) 10);
        java.lang.String[] strArray65 = classReader60.getInterfaces();
        int int67 = classReader60.readByte((int) '#');
        long long69 = classReader60.readLong(4);
        int int71 = classReader60.readInt((int) (short) 9);
        long long73 = classReader60.readLong((int) '4');
        java.lang.String str74 = classReader60.getSuperName();
        int int76 = classReader60.readInt(10);
        int int78 = classReader60.readUnsignedShort(0);
        java.lang.String[] strArray79 = classReader60.getInterfaces();
        aSMifierClassVisitor1.visit(19, 262144, "L947063517", "L174478886", "L1737005341", strArray79);
        java.util.List list81 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1]");
        org.junit.Assert.assertNotNull(labelArray18);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 8532477865490146625L + "'", long62 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 72057598333118569L + "'", long64 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 86 + "'", int67 == 86);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 590080L + "'", long69 == 590080L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 151060480 + "'", int71 == 151060480);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 72068947506459235L + "'", long73 == 72068947506459235L);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 16777217 + "'", int76 == 16777217);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 51966 + "'", int78 == 51966);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(list81);
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(23);
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("hi!");
        printWriter7.print((-889275714));
        java.util.Locale locale10 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor14 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor14.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label20 = null;
        int[] intArray22 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray23 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor14.visitLookupSwitchInsn(label20, intArray22, labelArray23);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor25 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor25.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label31 = null;
        int[] intArray33 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray34 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor25.visitLookupSwitchInsn(label31, intArray33, labelArray34);
        aSMifierMethodVisitor12.visitLookupSwitchInsn(label13, intArray22, labelArray34);
        java.io.PrintWriter printWriter37 = printWriter7.format(locale10, "hi!", (java.lang.Object[]) labelArray34);
        printWriter7.write("");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor40 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter7);
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("hi!");
        printWriter47.print((-889275714));
        java.util.Locale locale50 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor52 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label53 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor54 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor54.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label60 = null;
        int[] intArray62 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray63 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor54.visitLookupSwitchInsn(label60, intArray62, labelArray63);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor65 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor65.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label71 = null;
        int[] intArray73 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray74 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor65.visitLookupSwitchInsn(label71, intArray73, labelArray74);
        aSMifierMethodVisitor52.visitLookupSwitchInsn(label53, intArray62, labelArray74);
        java.io.PrintWriter printWriter77 = printWriter47.format(locale50, "hi!", (java.lang.Object[]) labelArray74);
        printWriter47.println((int) (short) 1);
        java.lang.String[] strArray81 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter82 = printWriter47.format("hi!", (java.lang.Object[]) strArray81);
        java.lang.String[] strArray84 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.io.PrintWriter printWriter85 = printWriter47.printf("", (java.lang.Object[]) strArray84);
        aSMifierClassVisitor40.visit((int) (short) 9, 5, "hi!", "", "", strArray84);
        org.mockito.asm.FieldVisitor fieldVisitor87 = classWriter1.visitField(23, "L1544572272", "L1321861150", "L1479479862", (java.lang.Object) "");
        classWriter1.visitInnerClass("L1174087069", "L767403187", "L1775421725", 145);
        int int95 = classWriter1.newNameType("L1123989782", "L136029544");
        classWriter1.visitEnd();
        classWriter1.visitSource("L465750741", "L1774932664");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1]");
        org.junit.Assert.assertNotNull(labelArray23);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1]");
        org.junit.Assert.assertNotNull(labelArray34);
        org.junit.Assert.assertNotNull(printWriter37);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1]");
        org.junit.Assert.assertNotNull(labelArray63);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1]");
        org.junit.Assert.assertNotNull(labelArray74);
        org.junit.Assert.assertNotNull(printWriter77);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(printWriter82);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertNotNull(fieldVisitor87);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 13 + "'", int95 == 13);
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor0.visitFieldInsn(6, "L326432149", "L1434348811", "");
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitMaxs(6, (-889275714));
        aSMifierMethodVisitor0.visitTypeInsn(10, "L96121905");
        aSMifierMethodVisitor0.visitCode();
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("L97937772");
        aSMifierMethodVisitor0.print(printWriter31);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter40.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classWriter40.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter40.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray53 = classWriter40.toByteArray();
        org.mockito.asm.ByteVector byteVector56 = byteVector36.putByteArray(byteArray53, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader57 = new org.mockito.asm.ClassReader(byteArray53);
        long long59 = classReader57.readLong((int) (byte) 100);
        long long61 = classReader57.readLong((int) (byte) 10);
        java.lang.String[] strArray62 = classReader57.getInterfaces();
        int int64 = classReader57.readInt(0);
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter(classReader57, (int) '4');
        classWriter66.visitOuterClass("L2113189186", "hi!", "L1669980843");
        byte[] byteArray71 = classWriter66.toByteArray();
        int int74 = classWriter66.newNameType("L237245406", "L237245406");
        classWriter66.visitOuterClass("L139692246", "L1931374313", "L1230702653");
        int int83 = classWriter66.newMethod("L1105153118", "L1123989782", "L752233668", false);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "L752233668");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1788074348", 28270);
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = aSMifierMethodVisitor0.visitAnnotation("L316134190", false);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 8532477865490146625L + "'", long59 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 72057598333118569L + "'", long61 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-889275714) + "'", int64 == (-889275714));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 11, 76, 50, 49, 49, 51, 49, 56, 57, 49, 56, 54, 7, 0, 9, 1, 0, 11, 76, 49, 54, 54, 57, 57, 56, 48, 56, 52, 51, 12, 0, 2, 0, 11, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 13, 0, 0, 0, 4, 0, 10, 0, 12]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 15 + "'", int74 == 15);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 26 + "'", int83 == 26);
        org.junit.Assert.assertNotNull(annotationVisitor92);
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println((int) (short) 1);
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter36 = printWriter1.format("hi!", (java.lang.Object[]) strArray35);
        java.lang.String[] strArray38 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.io.PrintWriter printWriter39 = printWriter1.printf("", (java.lang.Object[]) strArray38);
        java.io.PrintWriter printWriter41 = new java.io.PrintWriter("hi!");
        printWriter41.print((int) 'a');
        printWriter41.println("");
        java.io.PrintWriter printWriter46 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor47 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter46);
        aSMifierClassVisitor47.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierClassVisitor47.visitAnnotation("", false);
        printWriter41.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor57 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        java.io.PrintWriter printWriter59 = printWriter41.append(' ');
        printWriter41.println(true);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter("hi!");
        char[] charArray70 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter63.print(charArray70);
        printWriter41.print(charArray70);
        printWriter1.println(charArray70);
        java.io.PrintWriter printWriter75 = printWriter1.append(' ');
        printWriter1.close();
        printWriter1.print("L2099222213");
        printWriter1.print((int) (byte) 1);
        printWriter1.print(72057598333118569L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter86 = printWriter1.append((java.lang.CharSequence) "L1159625657", 26913, 24942);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 24942");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter75);
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitMaxs((int) (short) 0, 1);
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "", "hi!", label15, label16, 3);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitTypeInsn(12, "L1853824624");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierMethodVisitor0.visitParameterAnnotation(48640, "L1669980843", true);
        aSMifierMethodVisitor0.visitIntInsn(190, (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor0.visitAnnotation("L888698528", false);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitFieldInsn(28526, "L1402540955", "L684377782", "L909836912");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        aSMifierMethodVisitor0.visitIntInsn((int) (short) 0, (int) '4');
        aSMifierMethodVisitor0.visitIincInsn((-1), 24942);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitFieldInsn((int) 'a', "L432974808", "L1271562021", "L919036820");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor33 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor33.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor33.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierMethodVisitor33.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor33.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor33.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label53 = new org.mockito.asm.Label();
        aSMifierMethodVisitor33.visitLabel(label53);
        java.lang.Object obj55 = label53.info;
        java.lang.String str56 = label53.toString();
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label53);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNull(obj55);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L1078864243" + "'", str56, "L1078864243");
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L1473861125");
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("hi!");
        printWriter3.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor6.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label12 = null;
        int[] intArray14 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label12, intArray14, labelArray15);
        java.util.List list17 = aSMifierMethodVisitor6.getText();
        printWriter3.println((java.lang.Object) list17);
        printWriter3.write((-889275714));
        printWriter3.println('a');
        printWriter3.print("L1000949368");
        printWriter3.println(' ');
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.Writer) printWriter3);
        printWriter27.write(16);
        printWriter27.write("L1236963294");
        java.io.PrintWriter printWriter32 = new java.io.PrintWriter((java.io.Writer) printWriter27);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter("hi!");
        printWriter34.print((-889275714));
        printWriter34.print(0.0d);
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter((java.io.Writer) printWriter34, false);
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("hi!");
        char[] charArray49 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter42.print(charArray49);
        printWriter34.write(charArray49);
        printWriter27.write(charArray49);
        printWriter1.println(charArray49);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
        org.junit.Assert.assertNotNull(labelArray15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte(2);
        annotationVisitor12.visit("", (java.lang.Object) byteVector15);
        org.mockito.asm.ByteVector byteVector22 = byteVector15.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("L614568462");
        byte[] byteArray25 = null;
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByteArray(byteArray25, (int) (short) 1, (-1107296256));
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) -1, 2);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitTypeInsn(15, "L1669980843");
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitParameterAnnotation((-889275714), "L997959795", false);
        aSMifierMethodVisitor0.visitTypeInsn(22, "L821985585");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor17 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor17.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor17.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor17.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor17.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor17.visitCode();
        aSMifierMethodVisitor17.visitIincInsn(25, (int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierMethodVisitor17.visitAnnotation("L1555790481", false);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor17);
        aSMifierMethodVisitor17.visitFieldInsn(31, "L651671359", "L1722902851", "L615939697");
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor40);
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        annotationVisitor14.visitEnum("L1434348811", "L994489370", "L994489370");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor27 = classWriter21.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter21.visitAnnotation("", true);
        classWriter21.visitSource("", "");
        annotationVisitor14.visit("L454715523", (java.lang.Object) classWriter21);
        classWriter21.visitInnerClass("L799304101", "L1441782014", "L1434348811", 57174305);
        int int42 = classWriter21.newNameType("L1592299270", "L834812042");
        classWriter21.visitSource("L2113189186", "L1808073265");
        int int47 = classWriter21.newClass("L1228713414");
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter60.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = classWriter60.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor72 = classWriter60.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray73 = classWriter60.toByteArray();
        org.mockito.asm.ByteVector byteVector76 = byteVector56.putByteArray(byteArray73, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader77 = new org.mockito.asm.ClassReader(byteArray73);
        long long79 = classReader77.readLong((int) (byte) 100);
        long long81 = classReader77.readLong((int) (byte) 10);
        java.lang.String str82 = classReader77.getSuperName();
        java.lang.String[] strArray83 = classReader77.getInterfaces();
        java.lang.String[] strArray84 = classReader77.getInterfaces();
        classWriter21.visit(24, (int) (short) 10, "L1775421725", "L173581797", "L1174303418", strArray84);
        int int87 = classWriter21.newUTF8("L1608972287");
        classWriter21.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(fieldVisitor27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 13 + "'", int47 == 13);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(annotationVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 8532477865490146625L + "'", long79 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 72057598333118569L + "'", long81 == 72057598333118569L);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 19 + "'", int87 == 19);
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list12 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitIincInsn(16, 14);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L337574950", 1);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIincInsn((int) (short) -13570, 1751720195);
        aSMifierMethodVisitor0.visitMaxs(223337, (int) (short) 18798);
        java.util.List list29 = aSMifierMethodVisitor0.text;
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter16.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter16.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter16.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray29 = classWriter16.toByteArray();
        org.mockito.asm.ByteVector byteVector32 = byteVector12.putByteArray(byteArray29, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader33 = new org.mockito.asm.ClassReader(byteArray29);
        long long35 = classReader33.readLong((int) (byte) 100);
        long long37 = classReader33.readLong((int) (byte) 10);
        java.lang.String[] strArray38 = classReader33.getInterfaces();
        int int40 = classReader33.readInt(0);
        byte[] byteArray41 = classReader33.b;
        java.lang.String[] strArray42 = classReader33.getInterfaces();
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter51.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = classWriter51.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter51.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray64 = classWriter51.toByteArray();
        org.mockito.asm.ByteVector byteVector67 = byteVector47.putByteArray(byteArray64, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader68 = new org.mockito.asm.ClassReader(byteArray64);
        long long70 = classReader68.readLong((int) (byte) 100);
        int int72 = classReader68.readInt(8);
        java.lang.String[] strArray73 = classReader68.getInterfaces();
        aSMifierMethodVisitor0.visitFrame(872, (int) (short) 10, (java.lang.Object[]) strArray42, (-1), (java.lang.Object[]) strArray73);
        aSMifierMethodVisitor0.visitTypeInsn(6, "L1761736395");
        aSMifierMethodVisitor0.visitMethodInsn(21, "L4743655", "L231657813", "L836986691");
        aSMifierMethodVisitor0.visitMaxs(25929, 1853030400);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = aSMifierMethodVisitor0.visitAnnotationDefault();
        annotationVisitor86.visitEnd();
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 8532477865490146625L + "'", long35 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 72057598333118569L + "'", long37 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-889275714) + "'", int40 == (-889275714));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 8532477865490146625L + "'", long70 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 590080 + "'", int72 == 590080);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(annotationVisitor86);
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor32.visitLabel(label52);
        printWriter31.println((java.lang.Object) label52);
        printWriter31.print((int) (byte) 100);
        printWriter31.println(false);
        printWriter31.println((float) 7298486125984967010L);
        printWriter31.write(15);
        printWriter31.println((-1161953280));
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor65 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        printWriter31.print((float) 245561770196860928L);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println((int) (short) 1);
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter36 = printWriter1.format("hi!", (java.lang.Object[]) strArray35);
        java.lang.String[] strArray38 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.io.PrintWriter printWriter39 = printWriter1.printf("", (java.lang.Object[]) strArray38);
        boolean boolean40 = printWriter1.checkError();
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("hi!");
        printWriter42.print((-889275714));
        java.util.Locale locale45 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor47 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label48 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor49 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor49.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label55 = null;
        int[] intArray57 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray58 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor49.visitLookupSwitchInsn(label55, intArray57, labelArray58);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor60 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor60.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label66 = null;
        int[] intArray68 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray69 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor60.visitLookupSwitchInsn(label66, intArray68, labelArray69);
        aSMifierMethodVisitor47.visitLookupSwitchInsn(label48, intArray57, labelArray69);
        java.io.PrintWriter printWriter72 = printWriter42.format(locale45, "hi!", (java.lang.Object[]) labelArray69);
        java.io.PrintWriter printWriter74 = new java.io.PrintWriter("hi!");
        char[] charArray81 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter74.print(charArray81);
        printWriter72.print(charArray81);
        printWriter1.print(charArray81);
        printWriter1.print(0);
        printWriter1.println((float) 15);
        java.io.PrintWriter printWriter90 = printWriter1.append((java.lang.CharSequence) "L298663367");
        printWriter1.println();
        printWriter1.println((long) (short) 25929);
        java.io.PrintWriter printWriter95 = printWriter1.append((java.lang.CharSequence) "L1689939746");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor96 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter95);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1]");
        org.junit.Assert.assertNotNull(labelArray58);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1]");
        org.junit.Assert.assertNotNull(labelArray69);
        org.junit.Assert.assertNotNull(printWriter72);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter90);
        org.junit.Assert.assertNotNull(printWriter95);
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        printWriter1.println(true);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter("hi!");
        char[] charArray30 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter23.print(charArray30);
        printWriter1.print(charArray30);
        printWriter1.println(true);
        printWriter1.print(' ');
        printWriter1.close();
        java.io.PrintWriter printWriter39 = printWriter1.append((java.lang.CharSequence) "L555214098");
        printWriter39.println(1970431233);
        java.io.PrintWriter printWriter43 = printWriter39.append('4');
        java.io.PrintWriter printWriter45 = new java.io.PrintWriter((java.io.Writer) printWriter39, true);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertNotNull(printWriter43);
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor22 = classWriter16.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        classWriter16.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor24 = aSMifierClassVisitor1.visitField((int) (short) 1, "L142696279", "", "", (java.lang.Object) classWriter16);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classWriter16.visitAnnotation("L2113189186", true);
        java.lang.Object obj32 = null;
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter16.visitField((int) (short) 30313, "L2113189186", "L1434348811", "L61669440", obj32);
        int int37 = classWriter16.newField("L1703143512", "L137501116", "L2018459260");
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter50.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classWriter50.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter50.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray63 = classWriter50.toByteArray();
        org.mockito.asm.ByteVector byteVector66 = byteVector46.putByteArray(byteArray63, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader67 = new org.mockito.asm.ClassReader(byteArray63);
        long long69 = classReader67.readLong((int) (byte) 100);
        long long71 = classReader67.readLong((int) (byte) 10);
        java.lang.String[] strArray72 = classReader67.getInterfaces();
        int int74 = classReader67.readByte((int) (short) 10);
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter(classReader67, 0);
        int int78 = classReader67.readByte((int) (short) 0);
        java.lang.String[] strArray79 = classReader67.getInterfaces();
        classWriter16.visit(16777217, 118, "L704540978", "L1289682213", "L836986691", strArray79);
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = classWriter16.visitAnnotation("L801849928", false);
        classWriter16.visitInnerClass("L1978431276", "L247779944", "L1301840882", 100);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 11 + "'", int37 == 11);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 8532477865490146625L + "'", long69 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 72057598333118569L + "'", long71 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 202 + "'", int78 == 202);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(annotationVisitor83);
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter31.print((int) '4');
        java.io.PrintWriter printWriter35 = printWriter31.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter35, true);
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter("hi!");
        printWriter40.print((int) 'a');
        printWriter40.println("");
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        aSMifierClassVisitor46.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor46.visitAnnotation("", false);
        printWriter40.print((java.lang.Object) false);
        java.io.PrintWriter printWriter56 = new java.io.PrintWriter((java.io.Writer) printWriter40);
        java.io.PrintWriter printWriter58 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor59 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter58);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor59.visit(2, (int) (byte) 0, "", "", "", strArray68);
        java.io.PrintWriter printWriter70 = printWriter40.printf("hi!", (java.lang.Object[]) strArray68);
        java.io.PrintWriter printWriter71 = printWriter35.printf("L1703143512", (java.lang.Object[]) strArray68);
        java.io.PrintWriter printWriter73 = printWriter71.append('#');
        printWriter73.print((float) (short) 29782);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(printWriter71);
        org.junit.Assert.assertNotNull(printWriter73);
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor10.visitOuterClass("", "L1434348811", "hi!");
        aSMifierClassVisitor10.visitSource("", "L237245406");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor10.visitAnnotation("L395265253", true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter7.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter7.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter7.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray20 = classWriter7.toByteArray();
        org.mockito.asm.ByteVector byteVector23 = byteVector3.putByteArray(byteArray20, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray20);
        long long26 = classReader24.readLong((int) (byte) 100);
        long long28 = classReader24.readLong((int) (byte) 10);
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter(classReader24, (int) (short) 30313);
        classWriter30.visitInnerClass("L1691870655", "L2113189186", "L1669980843", (-1161953280));
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter30.visitAnnotation("L2112385861", false);
        classWriter30.visitSource("L997959795", "L836986691");
        java.io.PrintWriter printWriter46 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor47 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter46);
        aSMifierClassVisitor47.visitSource("", "hi!");
        java.io.PrintWriter printWriter56 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor57 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter56);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor57.visit(2, (int) (byte) 0, "", "", "", strArray66);
        aSMifierClassVisitor47.visit((int) (short) 0, 5, "hi!", "hi!", "hi!", strArray66);
        java.io.PrintWriter printWriter73 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor74 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter73);
        java.lang.String[] strArray79 = null;
        org.mockito.asm.MethodVisitor methodVisitor80 = aSMifierClassVisitor74.visitMethod((-1), "", "hi!", "", strArray79);
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor47.visitField(0, "", "hi!", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor47.visitInnerClass("L1669980843", "L142696279", "", (int) (byte) 100);
        aSMifierClassVisitor47.visitSource("L326432149", "L1715840275");
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = aSMifierClassVisitor47.visitAnnotation("L1829941255", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor95 = aSMifierClassVisitor47.visitAnnotation("L231657813", false);
        org.mockito.asm.FieldVisitor fieldVisitor96 = classWriter30.visitField(324, "L365115101", "L483311603", "L1398906509", (java.lang.Object) "L231657813");
        fieldVisitor96.visitEnd();
        fieldVisitor96.visitEnd();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8532477865490146625L + "'", long26 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 72057598333118569L + "'", long28 == 72057598333118569L);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(annotationVisitor92);
        org.junit.Assert.assertNotNull(annotationVisitor95);
        org.junit.Assert.assertNotNull(fieldVisitor96);
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        printWriter1.print(0.0d);
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        boolean boolean8 = printWriter1.checkError();
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        java.io.PrintWriter printWriter12 = printWriter10.append((java.lang.CharSequence) "L1532047758");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        printWriter10.print((java.lang.Object) "L1321861150");
        printWriter10.println("L293242397");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(printWriter12);
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list12 = aSMifierMethodVisitor0.text;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor16 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor16.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label22 = null;
        aSMifierMethodVisitor16.visitLabel(label22);
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor25 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor27.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label33 = null;
        int[] intArray35 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray36 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor27.visitLookupSwitchInsn(label33, intArray35, labelArray36);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor38.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label44 = null;
        int[] intArray46 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray47 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor38.visitLookupSwitchInsn(label44, intArray46, labelArray47);
        aSMifierMethodVisitor25.visitLookupSwitchInsn(label26, intArray35, labelArray47);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor50 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label51 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor52 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor52.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label58 = null;
        int[] intArray60 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray61 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor52.visitLookupSwitchInsn(label58, intArray60, labelArray61);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor63 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor63.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label69 = null;
        int[] intArray71 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray72 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor63.visitLookupSwitchInsn(label69, intArray71, labelArray72);
        aSMifierMethodVisitor50.visitLookupSwitchInsn(label51, intArray60, labelArray72);
        aSMifierMethodVisitor16.visitLookupSwitchInsn(label24, intArray35, labelArray72);
        aSMifierMethodVisitor0.visitTableSwitchInsn(51966, 51966, label15, labelArray72);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor78 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor78.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor78.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor78.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list90 = aSMifierMethodVisitor78.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = aSMifierMethodVisitor78.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor94 = aSMifierMethodVisitor78.visitAnnotation("L978789454", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor97 = aSMifierMethodVisitor78.visitAnnotation("L2026303857", false);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor78);
        aSMifierMethodVisitor0.visitCode();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1]");
        org.junit.Assert.assertNotNull(labelArray36);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1]");
        org.junit.Assert.assertNotNull(labelArray47);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1]");
        org.junit.Assert.assertNotNull(labelArray61);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1]");
        org.junit.Assert.assertNotNull(labelArray72);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(list90);
        org.junit.Assert.assertNotNull(annotationVisitor91);
        org.junit.Assert.assertNotNull(annotationVisitor94);
        org.junit.Assert.assertNotNull(annotationVisitor97);
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor10.visitAnnotation("L1555790481", false);
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitSource("L1320473481", "L870080724");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println(8532477865490146625L);
        printWriter1.close();
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter43.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter43.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter43.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray56 = classWriter43.toByteArray();
        org.mockito.asm.ByteVector byteVector59 = byteVector39.putByteArray(byteArray56, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader60 = new org.mockito.asm.ClassReader(byteArray56);
        long long62 = classReader60.readLong((int) (byte) 100);
        long long64 = classReader60.readLong((int) (byte) 10);
        short short66 = classReader60.readShort(1);
        int int68 = classReader60.readUnsignedShort(0);
        java.lang.String[] strArray69 = classReader60.getInterfaces();
        java.io.PrintWriter printWriter70 = printWriter1.format("L298663367", (java.lang.Object[]) strArray69);
        printWriter70.write((int) (short) -13570);
        printWriter70.println('4');
        java.io.PrintWriter printWriter75 = new java.io.PrintWriter((java.io.Writer) printWriter70);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 8532477865490146625L + "'", long62 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 72057598333118569L + "'", long64 == 72057598333118569L);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) -326 + "'", short66 == (short) -326);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 51966 + "'", int68 == 51966);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(printWriter70);
    }

    @Test
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitInsn(10);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 0, "L1703143512", "hi!", "L799304101");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 256, 12);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L207321209", 16778088);
        aSMifierMethodVisitor0.visitEnd();
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.print(false);
        printWriter1.println((long) (-889275714));
        java.io.PrintWriter printWriter37 = printWriter1.append(' ');
        printWriter1.flush();
        printWriter1.println((float) 69);
        printWriter1.println('4');
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter37);
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print('4');
        printWriter1.print("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter31.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter31.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter31.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray44 = classWriter31.toByteArray();
        org.mockito.asm.ByteVector byteVector47 = byteVector27.putByteArray(byteArray44, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader48 = new org.mockito.asm.ClassReader(byteArray44);
        long long50 = classReader48.readLong((int) (byte) 100);
        int int52 = classReader48.readUnsignedShort((int) (short) 0);
        java.lang.String[] strArray53 = classReader48.getInterfaces();
        java.io.PrintWriter printWriter54 = printWriter1.printf("", (java.lang.Object[]) strArray53);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor56 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor56.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor56.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierMethodVisitor56.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray71 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor73 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor73.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label79 = null;
        int[] intArray81 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray82 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor73.visitLookupSwitchInsn(label79, intArray81, labelArray82);
        aSMifierMethodVisitor56.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray71, (int) 'a', (java.lang.Object[]) labelArray82);
        java.io.PrintWriter printWriter85 = printWriter54.format("hi!", (java.lang.Object[]) attributeArray71);
        boolean boolean86 = printWriter85.checkError();
        printWriter85.println(28270);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 8532477865490146625L + "'", long50 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 51966 + "'", int52 == 51966);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(attributeArray71);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1]");
        org.junit.Assert.assertNotNull(labelArray82);
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierMethodVisitor0.visitParameterAnnotation(25929, "L799304101", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 100, "L1749641217", false);
        aSMifierMethodVisitor0.visitFieldInsn((int) '#', "L1736155405", "L852338205", "L954744343");
        aSMifierMethodVisitor0.visitMaxs((int) (short) 24940, 0);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor14);
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor10.visitOuterClass("", "L1434348811", "hi!");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter27.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classWriter27.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter27.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray40 = classWriter27.toByteArray();
        org.mockito.asm.ByteVector byteVector43 = byteVector23.putByteArray(byteArray40, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader44 = new org.mockito.asm.ClassReader(byteArray40);
        long long46 = classReader44.readLong((int) (byte) 100);
        int int48 = classReader44.readUnsignedShort((int) (short) 0);
        java.lang.String[] strArray49 = classReader44.getInterfaces();
        aSMifierClassVisitor10.visit(151060480, (-1), "L142696279", "L61669440", "L2113189186", strArray49);
        aSMifierClassVisitor10.visitSource("hi!", "L1722902851");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor10.visitAnnotation("L365115101", true);
        aSMifierClassVisitor10.visitOuterClass("L804028497", "", "L1805444800");
        aSMifierClassVisitor10.visitInnerClass("L1770606705", "L767394981", "L1714647436", 33619981);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 8532477865490146625L + "'", long46 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 51966 + "'", int48 == 51966);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(annotationVisitor56);
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor0.visitFieldInsn(6, "L326432149", "L1434348811", "");
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitMaxs(6, (-889275714));
        aSMifierMethodVisitor0.visitTypeInsn(10, "L96121905");
        aSMifierMethodVisitor0.visitCode();
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("L97937772");
        aSMifierMethodVisitor0.print(printWriter31);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter40.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classWriter40.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter40.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray53 = classWriter40.toByteArray();
        org.mockito.asm.ByteVector byteVector56 = byteVector36.putByteArray(byteArray53, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader57 = new org.mockito.asm.ClassReader(byteArray53);
        long long59 = classReader57.readLong((int) (byte) 100);
        long long61 = classReader57.readLong((int) (byte) 10);
        java.lang.String[] strArray62 = classReader57.getInterfaces();
        int int64 = classReader57.readInt(0);
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter(classReader57, (int) '4');
        classWriter66.visitOuterClass("L2113189186", "hi!", "L1669980843");
        byte[] byteArray71 = classWriter66.toByteArray();
        int int74 = classWriter66.newNameType("L237245406", "L237245406");
        classWriter66.visitOuterClass("L139692246", "L1931374313", "L1230702653");
        int int83 = classWriter66.newMethod("L1105153118", "L1123989782", "L752233668", false);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "L752233668");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn(51, 1970430821);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 8532477865490146625L + "'", long59 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 72057598333118569L + "'", long61 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-889275714) + "'", int64 == (-889275714));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 11, 76, 50, 49, 49, 51, 49, 56, 57, 49, 56, 54, 7, 0, 9, 1, 0, 11, 76, 49, 54, 54, 57, 57, 56, 48, 56, 52, 51, 12, 0, 2, 0, 11, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 13, 0, 0, 0, 4, 0, 10, 0, 12]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 15 + "'", int74 == 15);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 26 + "'", int83 == 26);
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor32.visitLabel(label52);
        printWriter31.println((java.lang.Object) label52);
        java.io.PrintWriter printWriter56 = printWriter31.append('a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor57 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        aSMifierClassVisitor57.visitInnerClass("", "L237245406", "", 15);
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierClassVisitor57.visitAnnotation("L1749641217", true);
        aSMifierClassVisitor57.visitOuterClass("L1216476214", "L1847055122", "L337574950");
        aSMifierClassVisitor57.visitOuterClass("L1284973471", "L1939891096", "L1301153355");
        aSMifierClassVisitor57.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierClassVisitor57.visitAnnotation("L752233668", false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor77);
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.flush();
        java.io.PrintWriter printWriter8 = printWriter1.append((java.lang.CharSequence) "L61669440");
        printWriter1.write("L2113189186");
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("hi!");
        printWriter12.print((int) 'a');
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor22 = classWriter16.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = fieldVisitor22.visitAnnotation("hi!", true);
        printWriter12.print((java.lang.Object) annotationVisitor25);
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("hi!");
        printWriter28.print((int) 'a');
        printWriter28.println("");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        aSMifierClassVisitor34.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor34.visitAnnotation("", false);
        printWriter28.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor44 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        java.io.PrintWriter printWriter46 = printWriter28.append(' ');
        printWriter28.println(true);
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter("hi!");
        char[] charArray57 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter50.print(charArray57);
        printWriter28.print(charArray57);
        printWriter12.write(charArray57);
        printWriter1.print(charArray57);
        printWriter1.println((int) (short) 872);
        printWriter1.println(22);
        printWriter1.println("L1067926277");
        org.junit.Assert.assertNotNull(printWriter8);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(printWriter46);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor32.visitLabel(label52);
        printWriter31.println((java.lang.Object) label52);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor56 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label57 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor58 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor58.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label64 = null;
        int[] intArray66 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray67 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor58.visitLookupSwitchInsn(label64, intArray66, labelArray67);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor69 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor69.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label75 = null;
        int[] intArray77 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray78 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor69.visitLookupSwitchInsn(label75, intArray77, labelArray78);
        aSMifierMethodVisitor56.visitLookupSwitchInsn(label57, intArray66, labelArray78);
        aSMifierMethodVisitor56.visitMaxs((int) (short) 1, 86);
        printWriter31.print((java.lang.Object) 86);
        printWriter31.print(false);
        java.util.Locale locale87 = null;
        java.lang.Object[] objArray89 = null;
        java.io.PrintWriter printWriter90 = printWriter31.format(locale87, "L48323983", objArray89);
        printWriter90.print((float) (-4755801206503240959L));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1]");
        org.junit.Assert.assertNotNull(labelArray67);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[1]");
        org.junit.Assert.assertNotNull(labelArray78);
        org.junit.Assert.assertNotNull(printWriter90);
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.print((float) 590080L);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter9.println('a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitVarInsn(2, (int) (byte) -1);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter20.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter33.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor45 = classWriter33.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter33.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter33.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter58 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor59 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter58);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor59.visit(2, (int) (byte) 0, "", "", "", strArray68);
        classWriter33.visit((int) 'a', (int) '#', "", "", "hi!", strArray68);
        classWriter20.visit(7, (int) (byte) 0, "hi!", "", "", strArray68);
        org.mockito.asm.Attribute[] attributeArray73 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        aSMifierMethodVisitor13.visitFrame((-889275714), 51966, (java.lang.Object[]) strArray68, (int) (short) 0, (java.lang.Object[]) attributeArray73);
        java.io.PrintWriter printWriter75 = printWriter9.printf("", (java.lang.Object[]) attributeArray73);
        printWriter75.println((double) 100);
        printWriter75.print(10L);
        printWriter75.println((long) 116);
        printWriter75.println("L1398906509");
        printWriter75.println();
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(attributeArray73);
        org.junit.Assert.assertNotNull(printWriter75);
    }

    @Test
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter10 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor11 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor11.visit(2, (int) (byte) 0, "", "", "", strArray20);
        aSMifierClassVisitor1.visit((int) (short) 0, 5, "hi!", "hi!", "hi!", strArray20);
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        java.lang.String[] strArray33 = null;
        org.mockito.asm.MethodVisitor methodVisitor34 = aSMifierClassVisitor28.visitMethod((-1), "", "hi!", "", strArray33);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor1.visitField(0, "", "hi!", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitInnerClass("L1669980843", "L142696279", "", (int) (byte) 100);
        aSMifierClassVisitor1.visitSource("L326432149", "L1715840275");
        aSMifierClassVisitor1.visitSource("L142696279", "L666971223");
        java.io.PrintWriter printWriter52 = new java.io.PrintWriter("hi!");
        printWriter52.print((-889275714));
        printWriter52.write("");
        printWriter52.write("L994489370");
        java.io.PrintWriter printWriter60 = printWriter52.append((java.lang.CharSequence) "L237245406");
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor1.visitField((int) 'a', "L2113189186", "L142696279", "L1691870655", (java.lang.Object) printWriter52);
        printWriter52.println(' ');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        java.io.PrintWriter printWriter65 = new java.io.PrintWriter((java.io.Writer) printWriter52);
        printWriter52.println(false);
        java.io.PrintWriter printWriter70 = new java.io.PrintWriter("hi!");
        printWriter70.println("hi!");
        printWriter70.close();
        printWriter70.println((double) 3);
        java.util.Locale locale76 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor78 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor78.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label84 = null;
        int[] intArray86 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray87 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor78.visitLookupSwitchInsn(label84, intArray86, labelArray87);
        java.io.PrintWriter printWriter89 = printWriter70.printf(locale76, "L1749641217", (java.lang.Object[]) labelArray87);
        java.io.PrintWriter printWriter90 = printWriter52.format("L1973785860", (java.lang.Object[]) labelArray87);
        printWriter52.write("L2080075526");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(printWriter60);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1]");
        org.junit.Assert.assertNotNull(labelArray87);
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(printWriter90);
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        printWriter1.print((double) 10.0f);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter19.print((long) 1);
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.Writer) printWriter19);
        boolean boolean23 = printWriter19.checkError();
        java.io.PrintWriter printWriter25 = printWriter19.append((java.lang.CharSequence) "L2113189186");
        printWriter19.println(' ');
        java.io.PrintWriter printWriter29 = printWriter19.append(' ');
        printWriter19.println((double) (short) 29556);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(printWriter25);
        org.junit.Assert.assertNotNull(printWriter29);
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L1931374313");
        java.io.PrintWriter printWriter3 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter3);
        aSMifierClassVisitor4.visitSource("hi!", "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor12.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label18 = null;
        int[] intArray20 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray21 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor12.visitLookupSwitchInsn(label18, intArray20, labelArray21);
        org.mockito.asm.FieldVisitor fieldVisitor23 = aSMifierClassVisitor4.visitField(1, "", "hi!", "", (java.lang.Object) label18);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        aSMifierClassVisitor29.visitInnerClass("", "hi!", "", 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor29.visitField(100, "hi!", "", "", (java.lang.Object) 100);
        aSMifierClassVisitor29.visitInnerClass("L1434348811", "", "", 2);
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter("hi!");
        printWriter55.println("hi!");
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter66.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = classWriter66.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor78 = classWriter66.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray79 = classWriter66.toByteArray();
        org.mockito.asm.ByteVector byteVector82 = byteVector62.putByteArray(byteArray79, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader83 = new org.mockito.asm.ClassReader(byteArray79);
        long long85 = classReader83.readLong((int) (byte) 100);
        long long87 = classReader83.readLong((int) (byte) 10);
        java.lang.String[] strArray88 = classReader83.getInterfaces();
        java.io.PrintWriter printWriter89 = printWriter55.format("", (java.lang.Object[]) strArray88);
        aSMifierClassVisitor29.visit(24942, 1, "L799304101", "L459227517", "L1669980843", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor91 = aSMifierClassVisitor4.visitMethod(254, "L943959020", "L1592299270", "L2036836790", strArray88);
        java.io.PrintWriter printWriter92 = printWriter1.format("L1829941255", (java.lang.Object[]) strArray88);
        printWriter92.flush();
        printWriter92.print('a');
        java.io.PrintWriter printWriter97 = new java.io.PrintWriter((java.io.Writer) printWriter92, false);
        printWriter92.println((float) 1952543849);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1]");
        org.junit.Assert.assertNotNull(labelArray21);
        org.junit.Assert.assertNotNull(fieldVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertNotNull(fieldVisitor78);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 8532477865490146625L + "'", long85 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 72057598333118569L + "'", long87 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(printWriter92);
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        java.util.Locale locale20 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor22 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor22.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor22.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor22.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list34 = aSMifierMethodVisitor22.text;
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter38.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter38.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor50 = classWriter38.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter38.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor57 = classWriter38.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor64.visit(2, (int) (byte) 0, "", "", "", strArray73);
        classWriter38.visit((int) 'a', (int) '#', "", "", "hi!", strArray73);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor77 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor77.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label83 = null;
        int[] intArray85 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray86 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor77.visitLookupSwitchInsn(label83, intArray85, labelArray86);
        aSMifierMethodVisitor22.visitFrame((int) (byte) 1, (int) (byte) -1, (java.lang.Object[]) strArray73, (int) (short) 100, (java.lang.Object[]) labelArray86);
        java.io.PrintWriter printWriter89 = printWriter1.format(locale20, "hi!", (java.lang.Object[]) labelArray86);
        printWriter1.println();
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1]");
        org.junit.Assert.assertNotNull(labelArray86);
        org.junit.Assert.assertNotNull(printWriter89);
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor22 = classWriter16.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        classWriter16.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor24 = aSMifierClassVisitor1.visitField((int) (short) 1, "L142696279", "", "", (java.lang.Object) classWriter16);
        classWriter16.visitEnd();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter32.visitInnerClass("L298663367", "L1715840275", "L614568462", 18);
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter50.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classWriter50.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter50.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray63 = classWriter50.toByteArray();
        org.mockito.asm.ByteVector byteVector66 = byteVector46.putByteArray(byteArray63, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader67 = new org.mockito.asm.ClassReader(byteArray63);
        long long69 = classReader67.readLong((int) (byte) 100);
        long long71 = classReader67.readLong((int) (byte) 10);
        java.lang.String str72 = classReader67.getSuperName();
        java.lang.String[] strArray73 = classReader67.getInterfaces();
        classWriter32.visit((int) (byte) 1, 1869480192, "L1911123705", "L173581797", "", strArray73);
        classWriter16.visit(104, 0, "L1668224641", "L1228713414", "L590041901", strArray73);
        int int78 = classWriter16.newNameType("L1715840275", "L2063859988");
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 8532477865490146625L + "'", long69 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 72057598333118569L + "'", long71 == 72057598333118569L);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
    }

    @Test
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.Label label18 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor19.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierMethodVisitor19.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray34 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label42 = null;
        int[] intArray44 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor36.visitLookupSwitchInsn(label42, intArray44, labelArray45);
        aSMifierMethodVisitor19.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray34, (int) 'a', (java.lang.Object[]) labelArray45);
        aSMifierMethodVisitor0.visitTableSwitchInsn(3, 2, label18, labelArray45);
        aSMifierMethodVisitor0.visitEnd();
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("hi!");
        printWriter51.print((-889275714));
        printWriter51.print(0.0d);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter((java.io.Writer) printWriter51, false);
        aSMifierMethodVisitor0.print(printWriter51);
        aSMifierMethodVisitor0.visitTypeInsn(0, "L1284973471");
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierMethodVisitor0.visitAnnotation("L659269359", false);
        aSMifierMethodVisitor0.visitMaxs(1, 2305);
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitMethodInsn(97, "L2101667039", "L4743655", "L615340472");
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(attributeArray34);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1]");
        org.junit.Assert.assertNotNull(labelArray45);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertNotNull(annotationVisitor68);
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list30 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitMaxs((-1), (int) (short) 100);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierMethodVisitor0.visitParameterAnnotation((-889275714), "hi!", true);
        aSMifierMethodVisitor0.visitTypeInsn(118, "hi!");
        java.lang.Object obj42 = new java.lang.Object();
        aSMifierMethodVisitor0.visitLdcInsn(obj42);
        aSMifierMethodVisitor0.visitIntInsn(6, 254);
        java.util.List list47 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierMethodVisitor0.visitAnnotation("L1869964633", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierMethodVisitor0.visitParameterAnnotation(6, "L1103251756", false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor54);
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray15 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor17 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor17.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label23 = null;
        int[] intArray25 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor17.visitLookupSwitchInsn(label23, intArray25, labelArray26);
        aSMifierMethodVisitor0.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray15, (int) 'a', (java.lang.Object[]) labelArray26);
        aSMifierMethodVisitor0.visitInsn(0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = new org.mockito.asm.Label();
        aSMifierMethodVisitor32.visitLabel(label52);
        aSMifierMethodVisitor0.visitLineNumber((int) '#', label52);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Attribute attribute56 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(attributeArray15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1]");
        org.junit.Assert.assertNotNull(labelArray26);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
    }

    @Test
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list30 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = aSMifierMethodVisitor0.visitAnnotation("L1434348811", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L142696279", (-889275714));
        aSMifierMethodVisitor0.visitInsn((int) (byte) 10);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor0.visitParameterAnnotation(16, "L515915968", false);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor46 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor46.visitCode();
        aSMifierMethodVisitor46.visitIincInsn((int) (byte) -1, 2);
        aSMifierMethodVisitor46.visitEnd();
        aSMifierMethodVisitor46.visitTypeInsn(15, "L1669980843");
        org.mockito.asm.Label label56 = new org.mockito.asm.Label();
        aSMifierMethodVisitor46.visitJumpInsn(25, label56);
        java.lang.Object obj58 = label56.info;
        aSMifierMethodVisitor0.visitLineNumber(35, label56);
        java.lang.String str60 = label56.toString();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNull(obj58);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "L1299227597" + "'", str60, "L1299227597");
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) 100, 5);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L2113189186", 25929);
        aSMifierMethodVisitor0.visitTypeInsn(22, "L1004430080");
        aSMifierMethodVisitor0.visitIincInsn((int) '#', 12);
        java.util.List list37 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitFieldInsn(20, "L78149900", "L1289682213", "L997959795");
        java.util.List list43 = aSMifierMethodVisitor0.getText();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label10);
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label21 = null;
        int[] intArray23 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor15.visitLookupSwitchInsn(label21, intArray23, labelArray24);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 0, 51966, label14, labelArray24);
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor0.visitLabel(label27);
        aSMifierMethodVisitor0.visitInsn(0);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter32.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter32.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor44 = classWriter32.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray45 = classWriter32.toByteArray();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) byteArray45);
        org.mockito.asm.ClassReader classReader47 = new org.mockito.asm.ClassReader(byteArray45);
        byte[] byteArray48 = classReader47.b;
        byte[] byteArray49 = classReader47.b;
        short short51 = classReader47.readShort(115);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = classReader47.readByte(256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1]");
        org.junit.Assert.assertNotNull(labelArray24);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 28526 + "'", short51 == (short) 28526);
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.Label label18 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor19.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierMethodVisitor19.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray34 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label42 = null;
        int[] intArray44 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor36.visitLookupSwitchInsn(label42, intArray44, labelArray45);
        aSMifierMethodVisitor19.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray34, (int) 'a', (java.lang.Object[]) labelArray45);
        aSMifierMethodVisitor0.visitTableSwitchInsn(3, 2, label18, labelArray45);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor0.visitAnnotation("L454715523", true);
        aSMifierMethodVisitor0.visitMethodInsn(11, "L326432149", "L142696279", "L96121905");
        aSMifierMethodVisitor0.visitFieldInsn(1, "L2113189186", "L1669980843", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierMethodVisitor0.visitAnnotation("L836986691", false);
        aSMifierMethodVisitor0.visitVarInsn(0, (int) (short) 1);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "L1855806886", "L1248424270", "L1642595643");
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(attributeArray34);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1]");
        org.junit.Assert.assertNotNull(labelArray45);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor64);
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        aSMifierMethodVisitor0.visitLabel(label6);
        org.mockito.asm.Label label9 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) '4', label9);
        aSMifierMethodVisitor0.visitMaxs(3, 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) (short) 22113);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) (short) 22113);
        aSMifierMethodVisitor0.visitIincInsn(8, 25);
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierMethodVisitor0.visitParameterAnnotation(0, "L1605751355", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = annotationVisitor25.visitArray("L1458772522");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitVarInsn(2, (int) (byte) -1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 100, "");
        aSMifierMethodVisitor0.visitInsn(8);
        aSMifierMethodVisitor0.visitIntInsn(118, 2817);
        org.mockito.asm.Label label12 = null;
        int[] intArray19 = new int[] { 872, 1986622313, 2305, (short) -1, 20, 14 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor20 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor20.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor20.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor20.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Label label33 = null;
        int[] intArray40 = new int[] { 8, (short) -1, (-1), 4, 'a', 8 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor41.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor41.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierMethodVisitor41.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray56 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor58 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor58.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label64 = null;
        int[] intArray66 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray67 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor58.visitLookupSwitchInsn(label64, intArray66, labelArray67);
        aSMifierMethodVisitor41.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray56, (int) 'a', (java.lang.Object[]) labelArray67);
        aSMifierMethodVisitor20.visitLookupSwitchInsn(label33, intArray40, labelArray67);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label12, intArray19, labelArray67);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMaxs(123, 65792);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[872, 1986622313, 2305, -1, 20, 14]");
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[8, -1, -1, 4, 97, 8]");
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(attributeArray56);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1]");
        org.junit.Assert.assertNotNull(labelArray67);
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        printWriter1.println(true);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter("hi!");
        char[] charArray30 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter23.print(charArray30);
        printWriter1.print(charArray30);
        java.util.Locale locale33 = null;
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter36.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter49.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classWriter49.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter49.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter49.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor68 = classWriter49.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter74 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor75 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter74);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor75.visit(2, (int) (byte) 0, "", "", "", strArray84);
        classWriter49.visit((int) 'a', (int) '#', "", "", "hi!", strArray84);
        classWriter36.visit(7, (int) (byte) 0, "hi!", "", "", strArray84);
        java.io.PrintWriter printWriter88 = printWriter1.format(locale33, "hi!", (java.lang.Object[]) strArray84);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor89 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter88);
        java.io.PrintWriter printWriter90 = new java.io.PrintWriter((java.io.Writer) printWriter88);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(printWriter88);
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        int int41 = classWriter1.newNameType("", "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor42 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor42.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor42.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierMethodVisitor42.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray57 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor59 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor59.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label65 = null;
        int[] intArray67 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray68 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor59.visitLookupSwitchInsn(label65, intArray67, labelArray68);
        aSMifierMethodVisitor42.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray57, (int) 'a', (java.lang.Object[]) labelArray68);
        int int71 = classWriter1.newConst((java.lang.Object) 'a');
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitInnerClass("L389484434", "L1852655365", "L1000949368", (-889275714));
        classWriter1.visitSource("", "L109855375");
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(attributeArray57);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1]");
        org.junit.Assert.assertNotNull(labelArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println(8532477865490146625L);
        printWriter1.close();
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        java.util.Locale locale37 = null;
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter(25);
        java.lang.String[] strArray46 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        classWriter40.visit((int) (short) 0, (-1107296256), "L834812042", "L1694926691", "L1544572272", strArray46);
        java.io.PrintWriter printWriter48 = printWriter1.printf(locale37, "L1592299270", (java.lang.Object[]) strArray46);
        printWriter48.println(false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(printWriter48);
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitMethodInsn((int) 'a', "", "", "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor11 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor11.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor11.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierMethodVisitor11.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor11.visitMultiANewArrayInsn("", (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = aSMifierMethodVisitor11.getClass();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) wildcardClass27);
        java.util.List list29 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitInsn(1);
        aSMifierMethodVisitor0.visitVarInsn(0, (int) (short) 0);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) 0.0d);
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) 0, 57174305);
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor41.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) 'a');
        aSMifierMethodVisitor41.visitLdcInsn((java.lang.Object) 'a');
        org.mockito.asm.Label label56 = null;
        int[] intArray62 = new int[] { (byte) 10, 4, (short) 10, (byte) 1, ' ' };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor63 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor63.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor63.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label73 = null;
        aSMifierMethodVisitor63.visitLineNumber((int) (byte) 10, label73);
        org.mockito.asm.Label label77 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor78 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor78.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label84 = null;
        int[] intArray86 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray87 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor78.visitLookupSwitchInsn(label84, intArray86, labelArray87);
        aSMifierMethodVisitor63.visitTableSwitchInsn((int) (byte) 0, 51966, label77, labelArray87);
        aSMifierMethodVisitor41.visitLookupSwitchInsn(label56, intArray62, labelArray87);
        org.mockito.asm.Label[] labelArray91 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label40, intArray62, labelArray91);
        aSMifierMethodVisitor0.visitIntInsn(33, 47806);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[10, 4, 10, 1, 32]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1]");
        org.junit.Assert.assertNotNull(labelArray87);
        org.junit.Assert.assertNotNull(labelArray91);
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitVarInsn(2, (int) (byte) -1);
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter7.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter20.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classWriter20.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter20.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter20.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter20.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor46.visit(2, (int) (byte) 0, "", "", "", strArray55);
        classWriter20.visit((int) 'a', (int) '#', "", "", "hi!", strArray55);
        classWriter7.visit(7, (int) (byte) 0, "hi!", "", "", strArray55);
        org.mockito.asm.Attribute[] attributeArray60 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        aSMifierMethodVisitor0.visitFrame((-889275714), 51966, (java.lang.Object[]) strArray55, (int) (short) 0, (java.lang.Object[]) attributeArray60);
        org.mockito.asm.Label label63 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) '#', label63);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitVarInsn(0, (int) (byte) 0);
        java.util.List list69 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierMethodVisitor0.visitAnnotationDefault();
        java.io.PrintWriter printWriter73 = new java.io.PrintWriter("L139692246");
        printWriter73.println(10.0d);
        annotationVisitor70.visit("L384579388", (java.lang.Object) printWriter73);
        printWriter73.println();
        printWriter73.println(false);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(attributeArray60);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(annotationVisitor70);
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter31.print((int) '4');
        java.io.PrintWriter printWriter35 = printWriter31.append((java.lang.CharSequence) "hi!");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("hi!");
        printWriter38.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor41.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label47 = null;
        int[] intArray49 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor41.visitLookupSwitchInsn(label47, intArray49, labelArray50);
        java.util.List list52 = aSMifierMethodVisitor41.getText();
        printWriter38.println((java.lang.Object) list52);
        printWriter38.print((double) 10L);
        printWriter38.print(false);
        java.io.PrintWriter printWriter58 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor59 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter58);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor59.visit(2, (int) (byte) 0, "", "", "", strArray68);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = aSMifierClassVisitor59.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor59.visitAnnotation("hi!", false);
        printWriter38.println((java.lang.Object) aSMifierClassVisitor59);
        char[] charArray79 = new char[] { 'a', '#' };
        printWriter38.println(charArray79);
        printWriter31.print(charArray79);
        printWriter31.print("L1805888593");
        printWriter31.close();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter88 = printWriter31.append((java.lang.CharSequence) "L1549311922", 136, 16779859);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 16779859");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1]");
        org.junit.Assert.assertNotNull(labelArray50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[a, #]");
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label10);
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label21 = null;
        int[] intArray23 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor15.visitLookupSwitchInsn(label21, intArray23, labelArray24);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 0, 51966, label14, labelArray24);
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor0.visitLabel(label27);
        aSMifierMethodVisitor0.visitTypeInsn(0, "hi!");
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1398906509", (int) '4');
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1281777590", 34);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierMethodVisitor0.visitAnnotation("L1710847389", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierMethodVisitor0.visitAnnotation("L392705655", false);
        annotationVisitor43.visitEnum("L917265559", "L1967058536", "L448733331");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1]");
        org.junit.Assert.assertNotNull(labelArray24);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray15 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor17 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor17.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label23 = null;
        int[] intArray25 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor17.visitLookupSwitchInsn(label23, intArray25, labelArray26);
        aSMifierMethodVisitor0.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray15, (int) 'a', (java.lang.Object[]) labelArray26);
        aSMifierMethodVisitor0.visitInsn(0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = new org.mockito.asm.Label();
        aSMifierMethodVisitor32.visitLabel(label52);
        aSMifierMethodVisitor0.visitLineNumber((int) '#', label52);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = annotationVisitor55.visitArray("L2008752917");
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(attributeArray15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1]");
        org.junit.Assert.assertNotNull(labelArray26);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(annotationVisitor57);
    }

    @Test
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label10);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", 0);
        aSMifierMethodVisitor0.visitFieldInsn(7, "L1434348811", "L1434348811", "L1434348811");
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        aSMifierMethodVisitor0.visitLineNumber(4, label21);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitMaxs((int) (short) 2305, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitInsn(28275);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28275");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor24);
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println((int) (short) 1);
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter36 = printWriter1.format("hi!", (java.lang.Object[]) strArray35);
        java.lang.String[] strArray38 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.io.PrintWriter printWriter39 = printWriter1.printf("", (java.lang.Object[]) strArray38);
        printWriter1.println(false);
        java.io.PrintWriter printWriter43 = new java.io.PrintWriter("hi!");
        printWriter43.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor46 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor46.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label52 = null;
        int[] intArray54 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray55 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor46.visitLookupSwitchInsn(label52, intArray54, labelArray55);
        java.util.List list57 = aSMifierMethodVisitor46.getText();
        printWriter43.println((java.lang.Object) list57);
        printWriter43.print((double) 10L);
        printWriter43.println(false);
        java.io.PrintWriter printWriter64 = new java.io.PrintWriter("hi!");
        printWriter64.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor67 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter64);
        printWriter64.print(0.0d);
        java.io.PrintWriter printWriter71 = new java.io.PrintWriter("hi!");
        char[] charArray78 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter71.print(charArray78);
        printWriter64.write(charArray78);
        printWriter43.print(charArray78);
        printWriter1.write(charArray78);
        printWriter1.println(1869509492);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(printWriter39);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1]");
        org.junit.Assert.assertNotNull(labelArray55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        byte[] byteArray39 = classWriter1.toByteArray();
        int int41 = classWriter1.newUTF8("L61669440");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter1.visitAnnotation("L801849928", false);
        java.lang.String[] strArray50 = null;
        classWriter1.visit((int) '#', 50331648, "L406814154", "L1441782014", "", strArray50);
        int int54 = classWriter1.newNameType("L365115101", "L1845262982");
        java.io.PrintWriter printWriter60 = new java.io.PrintWriter("hi!");
        printWriter60.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor63 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor63.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label69 = null;
        int[] intArray71 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray72 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor63.visitLookupSwitchInsn(label69, intArray71, labelArray72);
        java.util.List list74 = aSMifierMethodVisitor63.getText();
        printWriter60.println((java.lang.Object) list74);
        printWriter60.write((-889275714));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor78 = classWriter1.visitField((int) (short) 24940, "L2094741384", "L909836912", "L63440873", (java.lang.Object) printWriter60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value java.io.PrintWriter@515cc04d");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 13, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 4, 63, -128, 0, 0, 7, 0, 1, 7, 0, 2, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 35, 0, 5, 0, 6, 0, 3, 0, 6, 0, 5, 0, 5, 0, 2, 0, 0, 0, 1, 0, 1, 0, 2, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 2, 0, 2, -1, -1, 0, 2, 0, 1, 0, 3, 0, 7, 0, 0, 0, 2, 0, 4, 0, 9, 0, 0, 0, 0, 0, 8, 0, 0, 0, 2, 0, 2, 0, 0, 0, 4, 0, 8, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 13 + "'", int41 == 13);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20 + "'", int54 == 20);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1]");
        org.junit.Assert.assertNotNull(labelArray72);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitIincInsn(1, 0);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitLabel(label12);
        aSMifierMethodVisitor0.visitIntInsn(8, (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIincInsn(0, (int) (short) 100);
        aSMifierMethodVisitor0.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor17);
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("L1434348811", true);
        aSMifierClassVisitor1.visitSource("L994489370", "");
        aSMifierClassVisitor1.visitOuterClass("L1284973471", "L394842588", "L1103251756");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierClassVisitor1.visitAnnotation("L1930290201", true);
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter("hi!");
        printWriter29.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        printWriter29.print(0.0d);
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.Writer) printWriter29, true);
        printWriter36.write("L142696279");
        java.util.Locale locale39 = null;
        java.lang.String[] strArray41 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter42 = printWriter36.printf(locale39, "L1105153118", (java.lang.Object[]) strArray41);
        aSMifierClassVisitor1.visit((int) '#', 254, "L1189356974", "L1486003347", "L2109987209", strArray41);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter55.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = classWriter55.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor67 = classWriter55.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray68 = classWriter55.toByteArray();
        org.mockito.asm.ByteVector byteVector71 = byteVector51.putByteArray(byteArray68, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader72 = new org.mockito.asm.ClassReader(byteArray68);
        long long74 = classReader72.readLong((int) (byte) 100);
        long long76 = classReader72.readLong((int) (byte) 10);
        java.lang.String[] strArray77 = classReader72.getInterfaces();
        int int79 = classReader72.readByte((int) (short) 10);
        org.mockito.asm.ClassWriter classWriter81 = new org.mockito.asm.ClassWriter(classReader72, 0);
        int int83 = classWriter81.newClass("hi!");
        classWriter81.visitSource("L1749641217", "L1441782014");
        org.mockito.asm.AnnotationVisitor annotationVisitor89 = classWriter81.visitAnnotation("L666971223", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = classWriter81.visitAnnotation("L1829941255", false);
        org.mockito.asm.FieldVisitor fieldVisitor93 = aSMifierClassVisitor1.visitField(118, "L1965819980", "L1355584678", "L2069736809", (java.lang.Object) classWriter81);
        int int95 = classWriter81.newUTF8("L194658678");
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 8532477865490146625L + "'", long74 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 72057598333118569L + "'", long76 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 9 + "'", int83 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor89);
        org.junit.Assert.assertNotNull(annotationVisitor92);
        org.junit.Assert.assertNotNull(fieldVisitor93);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 13 + "'", int95 == 13);
    }

    @Test
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list30 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitMaxs((-1), (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierMethodVisitor0.visitParameterAnnotation((-889275714), "", false);
        aSMifierMethodVisitor0.visitIntInsn(2, 2817);
        aSMifierMethodVisitor0.visitInsn((int) (short) 9);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierMethodVisitor0.visitParameterAnnotation(12, "", false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor47);
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.print((float) 590080L);
        java.lang.Object[] objArray9 = null;
        java.io.PrintWriter printWriter10 = printWriter1.printf("hi!", objArray9);
        printWriter10.println('a');
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter((java.io.Writer) printWriter10);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor15.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label25 = null;
        aSMifierMethodVisitor15.visitLineNumber((int) (byte) 10, label25);
        aSMifierMethodVisitor15.visitMultiANewArrayInsn("", 0);
        aSMifierMethodVisitor15.visitFieldInsn(7, "L1434348811", "L1434348811", "L1434348811");
        aSMifierMethodVisitor15.visitIincInsn((int) (byte) -1, (-1107296256));
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter("hi!");
        printWriter39.print((-889275714));
        java.util.Locale locale42 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor44 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label45 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor46 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor46.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label52 = null;
        int[] intArray54 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray55 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor46.visitLookupSwitchInsn(label52, intArray54, labelArray55);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor57 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor57.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label63 = null;
        int[] intArray65 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray66 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor57.visitLookupSwitchInsn(label63, intArray65, labelArray66);
        aSMifierMethodVisitor44.visitLookupSwitchInsn(label45, intArray54, labelArray66);
        java.io.PrintWriter printWriter69 = printWriter39.format(locale42, "hi!", (java.lang.Object[]) labelArray66);
        aSMifierMethodVisitor15.visitLdcInsn((java.lang.Object) labelArray66);
        java.io.PrintWriter printWriter71 = printWriter10.format("L61669440", (java.lang.Object[]) labelArray66);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor72 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        aSMifierClassVisitor72.visitEnd();
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1]");
        org.junit.Assert.assertNotNull(labelArray55);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1]");
        org.junit.Assert.assertNotNull(labelArray66);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printWriter71);
    }

    @Test
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        classWriter1.visitInnerClass("hi!", "", "", 3);
        classWriter1.visitSource("L994489370", "L1669980843");
        org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter1.visitField(28526, "L298663367", "L326432149", "L1715840275", (java.lang.Object) "L994489370");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter1.visitAnnotation("L298663367", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("L96121905", false);
        int int29 = classWriter1.newMethod("L1694926691", "L192302291", "L1544572272", false);
        int int31 = classWriter1.newUTF8("L422154835");
        int int35 = classWriter1.newField("L119989099", "L1605751355", "");
        java.io.PrintWriter printWriter41 = new java.io.PrintWriter("hi!");
        printWriter41.print((-889275714));
        printWriter41.write("");
        printWriter41.write("L994489370");
        java.io.PrintWriter printWriter49 = printWriter41.append((java.lang.CharSequence) "L237245406");
        printWriter49.print((float) (short) 22113);
        java.io.PrintWriter printWriter53 = printWriter49.append('#');
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter("hi!");
        printWriter55.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor58 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor58.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label64 = null;
        int[] intArray66 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray67 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor58.visitLookupSwitchInsn(label64, intArray66, labelArray67);
        java.util.List list69 = aSMifierMethodVisitor58.getText();
        printWriter55.println((java.lang.Object) list69);
        printWriter55.print((double) 10L);
        printWriter55.print(false);
        printWriter55.println((double) 2817);
        printWriter55.print((float) (byte) 1);
        java.io.PrintWriter printWriter79 = new java.io.PrintWriter((java.io.Writer) printWriter55);
        printWriter53.print((java.lang.Object) printWriter79);
        java.io.PrintWriter printWriter82 = new java.io.PrintWriter("hi!");
        char[] charArray89 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter82.print(charArray89);
        printWriter79.println(charArray89);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor92 = classWriter1.visitField(202, "L231657813", "L265757830", "L79355481", (java.lang.Object) charArray89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [C@45757d09");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 16 + "'", int29 == 16);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 17 + "'", int31 == 17);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[1]");
        org.junit.Assert.assertNotNull(labelArray67);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        printWriter1.println(true);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter("hi!");
        char[] charArray30 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter23.print(charArray30);
        printWriter1.print(charArray30);
        java.io.PrintWriter printWriter34 = printWriter1.append((java.lang.CharSequence) "L96121905");
        printWriter34.println(false);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter34);
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter7.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter7.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter7.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray20 = classWriter7.toByteArray();
        org.mockito.asm.ByteVector byteVector23 = byteVector3.putByteArray(byteArray20, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray20);
        long long26 = classReader24.readLong((int) (byte) 100);
        long long28 = classReader24.readLong((int) (byte) 10);
        java.lang.String[] strArray29 = classReader24.getInterfaces();
        int int31 = classReader24.readByte((int) '#');
        long long33 = classReader24.readLong(4);
        int int34 = classReader24.header;
        byte[] byteArray35 = classReader24.b;
        org.mockito.asm.ClassReader classReader38 = new org.mockito.asm.ClassReader(byteArray35, (-1), 13);
        org.mockito.asm.ClassReader classReader39 = new org.mockito.asm.ClassReader(byteArray35);
        java.lang.String[] strArray40 = classReader39.getInterfaces();
        int int42 = classReader39.readUnsignedShort(17);
        byte[] byteArray43 = classReader39.b;
        java.lang.String str44 = classReader39.getSuperName();
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("hi!");
        printWriter47.print((int) 'a');
        printWriter47.println("");
        printWriter47.print((float) 590080L);
        java.lang.Object[] objArray55 = null;
        java.io.PrintWriter printWriter56 = printWriter47.printf("hi!", objArray55);
        printWriter56.println('a');
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter56);
        printWriter59.print(false);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter("hi!");
        printWriter63.print((-889275714));
        printWriter63.println((int) (short) 256);
        printWriter63.print((long) 1);
        java.io.PrintWriter printWriter71 = new java.io.PrintWriter("hi!");
        printWriter71.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor74 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter71);
        java.io.PrintWriter printWriter76 = printWriter71.append('#');
        printWriter76.println((double) 51966);
        char[] charArray85 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter76.write(charArray85);
        printWriter63.print(charArray85);
        printWriter59.println(charArray85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = classReader39.readClass(1536, charArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1536");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8532477865490146625L + "'", long26 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 72057598333118569L + "'", long28 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 86 + "'", int31 == 86);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 590080L + "'", long33 == 590080L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 118 + "'", int34 == 118);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 26913 + "'", int42 == 26913);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(printWriter76);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[ , a,  , #, #, a]");
    }

    @Test
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter7.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter7.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter7.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray20 = classWriter7.toByteArray();
        org.mockito.asm.ByteVector byteVector23 = byteVector3.putByteArray(byteArray20, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray20);
        long long26 = classReader24.readLong((int) (byte) 100);
        long long28 = classReader24.readLong((int) (byte) 10);
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        aSMifierClassVisitor30.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor30.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor30.visitInnerClass("L1722902851", "L2113189186", "L142696279", 9);
        // The following exception was thrown during execution in test generation
        try {
            classReader24.accept((org.mockito.asm.ClassVisitor) aSMifierClassVisitor30, 1634497893);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51966");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8532477865490146625L + "'", long26 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 72057598333118569L + "'", long28 == 72057598333118569L);
    }

    @Test
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.write("");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter36 = printWriter1.append('#');
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter37.print((long) 16780108);
        printWriter37.println(true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter36);
    }

    @Test
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print('4');
        printWriter1.print("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter31.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter31.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter31.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray44 = classWriter31.toByteArray();
        org.mockito.asm.ByteVector byteVector47 = byteVector27.putByteArray(byteArray44, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader48 = new org.mockito.asm.ClassReader(byteArray44);
        long long50 = classReader48.readLong((int) (byte) 100);
        int int52 = classReader48.readUnsignedShort((int) (short) 0);
        java.lang.String[] strArray53 = classReader48.getInterfaces();
        java.io.PrintWriter printWriter54 = printWriter1.printf("", (java.lang.Object[]) strArray53);
        printWriter54.println(false);
        boolean boolean57 = printWriter54.checkError();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter61 = printWriter54.append((java.lang.CharSequence) "L768432089", 1751720195, 1869509492);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1869509492");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 8532477865490146625L + "'", long50 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 51966 + "'", int52 == 51966);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter17.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter17.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter17.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray30 = classWriter17.toByteArray();
        org.mockito.asm.ByteVector byteVector33 = byteVector13.putByteArray(byteArray30, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader34 = new org.mockito.asm.ClassReader(byteArray30);
        long long36 = classReader34.readLong((int) (byte) 100);
        long long38 = classReader34.readLong((int) (byte) 10);
        java.lang.String[] strArray39 = classReader34.getInterfaces();
        aSMifierClassVisitor4.visit((int) (byte) 1, (-1), "", "hi!", "", strArray39);
        aSMifierClassVisitor4.visitOuterClass("L1434348811", "L326432149", "L994489370");
        aSMifierClassVisitor4.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor4.visitAnnotation("L2113189186", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = annotationVisitor48.visitArray("L666971223");
        java.io.PrintWriter printWriter53 = new java.io.PrintWriter("hi!");
        printWriter53.print((-889275714));
        java.util.Locale locale56 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor58 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label59 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor60 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor60.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label66 = null;
        int[] intArray68 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray69 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor60.visitLookupSwitchInsn(label66, intArray68, labelArray69);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor71 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor71.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label77 = null;
        int[] intArray79 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray80 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor71.visitLookupSwitchInsn(label77, intArray79, labelArray80);
        aSMifierMethodVisitor58.visitLookupSwitchInsn(label59, intArray68, labelArray80);
        java.io.PrintWriter printWriter83 = printWriter53.format(locale56, "hi!", (java.lang.Object[]) labelArray80);
        printWriter53.println((int) (short) 1);
        java.lang.String[] strArray87 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter88 = printWriter53.format("hi!", (java.lang.Object[]) strArray87);
        java.io.PrintWriter printWriter89 = new java.io.PrintWriter((java.io.Writer) printWriter53);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor90 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter53);
        annotationVisitor48.visit("", (java.lang.Object) aSMifierClassVisitor90);
        aSMifierClassVisitor90.visitInnerClass("L406814154", "L1848839374", "L1526989973", 65792);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 8532477865490146625L + "'", long36 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 72057598333118569L + "'", long38 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1]");
        org.junit.Assert.assertNotNull(labelArray69);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1]");
        org.junit.Assert.assertNotNull(labelArray80);
        org.junit.Assert.assertNotNull(printWriter83);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(printWriter88);
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor1.visit(2, (int) (byte) 0, "", "", "", strArray10);
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter17.visitOuterClass("hi!", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor1.visitField((int) (byte) 10, "", "L1434348811", "", (java.lang.Object) "");
        aSMifierClassVisitor1.visitInnerClass("L2113189186", "L326432149", "L61669440", 51966);
        aSMifierClassVisitor1.visitInnerClass("L1441782014", "L1749641217", "", (-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor50 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor50.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label56 = null;
        int[] intArray58 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray59 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor50.visitLookupSwitchInsn(label56, intArray58, labelArray59);
        aSMifierMethodVisitor37.visitLookupSwitchInsn(label38, intArray47, labelArray59);
        aSMifierMethodVisitor37.visitMethodInsn(4, "", "hi!", "");
        aSMifierMethodVisitor37.visitIntInsn(3, 0);
        aSMifierMethodVisitor37.visitCode();
        aSMifierMethodVisitor37.visitMaxs(0, 254);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor1.visitField(25, "L1749641217", "L1703143512", "L174478886", (java.lang.Object) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = fieldVisitor74.visitAnnotation("L767403187", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = fieldVisitor74.visitAnnotation("L1719622935", false);
        annotationVisitor80.visitEnd();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1]");
        org.junit.Assert.assertNotNull(labelArray59);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(annotationVisitor80);
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        int[] intArray8 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray9 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label6, intArray8, labelArray9);
        java.util.List list11 = aSMifierMethodVisitor0.getText();
        aSMifierMethodVisitor0.visitMethodInsn((int) (byte) 100, "L326432149", "", "L142696279");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L133657978", 26913);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(labelArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(annotationVisitor17);
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        int int42 = classWriter1.newField("L1284973471", "L1284973471", "L1216476214");
        classWriter1.visitOuterClass("L1105153118", "L1544572272", "");
        classWriter1.visitSource("L1931374313", "L544338606");
        byte[] byteArray50 = classWriter1.toByteArray();
        int int53 = classWriter1.newNameType("L1843076310", "L1289682213");
        int int58 = classWriter1.newMethod("L1579098349", "L1641107942", "L1610282393", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = classWriter1.visitAnnotation("L718998512", false);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 26 + "'", int53 == 26);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32 + "'", int58 == 32);
        org.junit.Assert.assertNotNull(annotationVisitor61);
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print(false);
        printWriter1.println(false);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter23.print((long) 118);
        java.lang.Object[] objArray27 = null;
        java.io.PrintWriter printWriter28 = printWriter23.format("L1852655365", objArray27);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("hi!");
        printWriter30.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor33 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor33.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label39 = null;
        int[] intArray41 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray42 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor33.visitLookupSwitchInsn(label39, intArray41, labelArray42);
        java.util.List list44 = aSMifierMethodVisitor33.getText();
        printWriter30.println((java.lang.Object) list44);
        printWriter30.write((-889275714));
        java.io.PrintWriter printWriter48 = new java.io.PrintWriter((java.io.Writer) printWriter30);
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter("hi!");
        printWriter50.print((int) 'a');
        printWriter50.println("");
        printWriter50.print((float) 590080L);
        java.lang.Object[] objArray58 = null;
        java.io.PrintWriter printWriter59 = printWriter50.printf("hi!", objArray58);
        printWriter59.println('a');
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter((java.io.Writer) printWriter59);
        printWriter62.print(false);
        java.io.PrintWriter printWriter66 = new java.io.PrintWriter("hi!");
        printWriter66.print((-889275714));
        printWriter66.println((int) (short) 256);
        printWriter66.print((long) 1);
        java.io.PrintWriter printWriter74 = new java.io.PrintWriter("hi!");
        printWriter74.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor77 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter74);
        java.io.PrintWriter printWriter79 = printWriter74.append('#');
        printWriter79.println((double) 51966);
        char[] charArray88 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter79.write(charArray88);
        printWriter66.print(charArray88);
        printWriter62.println(charArray88);
        printWriter30.println(charArray88);
        printWriter23.write(charArray88);
        printWriter23.print((double) (byte) 100);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1]");
        org.junit.Assert.assertNotNull(labelArray42);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(printWriter79);
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[ , a,  , #, #, a]");
    }

    @Test
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.print(0.0d);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter8.println(true);
        printWriter8.print(9);
        printWriter8.println('4');
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        aSMifierMethodVisitor0.visitLabel(label6);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (byte) -1);
        org.mockito.asm.Label label11 = null;
        org.mockito.asm.Label label12 = null;
        org.mockito.asm.Label label13 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label11, label12, label13, "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor17 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor17.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor17.visitCode();
        aSMifierMethodVisitor17.visitMaxs((int) '4', 0);
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        org.mockito.asm.Label label29 = null;
        aSMifierMethodVisitor17.visitTryCatchBlock(label27, label28, label29, "hi!");
        aSMifierMethodVisitor17.visitIntInsn(2, (int) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor35.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor35.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label45 = null;
        aSMifierMethodVisitor35.visitLineNumber((int) (byte) 10, label45);
        org.mockito.asm.Label label49 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor50 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor50.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label56 = null;
        int[] intArray58 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray59 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor50.visitLookupSwitchInsn(label56, intArray58, labelArray59);
        aSMifierMethodVisitor35.visitTableSwitchInsn((int) (byte) 0, 51966, label49, labelArray59);
        org.mockito.asm.Label label62 = null;
        aSMifierMethodVisitor35.visitLabel(label62);
        org.mockito.asm.Label label64 = new org.mockito.asm.Label();
        aSMifierMethodVisitor35.visitLabel(label64);
        org.mockito.asm.Label label66 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor67 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor67.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor67.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor67.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor81 = aSMifierMethodVisitor67.visitAnnotation("hi!", false);
        org.mockito.asm.Label label83 = new org.mockito.asm.Label();
        aSMifierMethodVisitor67.visitLineNumber(10, label83);
        aSMifierMethodVisitor17.visitTryCatchBlock(label64, label66, label83, "L1434348811");
        aSMifierMethodVisitor0.visitLineNumber(1, label64);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitFieldInsn(105, "", "L1535101295", "L761224899");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1]");
        org.junit.Assert.assertNotNull(labelArray59);
        org.junit.Assert.assertNotNull(annotationVisitor81);
    }

    @Test
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Label label13 = null;
        int[] intArray20 = new int[] { 8, (short) -1, (-1), 4, 'a', 8 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor21 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor21.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor21.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierMethodVisitor21.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray36 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor38.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label44 = null;
        int[] intArray46 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray47 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor38.visitLookupSwitchInsn(label44, intArray46, labelArray47);
        aSMifierMethodVisitor21.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray36, (int) 'a', (java.lang.Object[]) labelArray47);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label13, intArray20, labelArray47);
        aSMifierMethodVisitor0.visitMaxs(100, (int) '#');
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter61.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = classWriter61.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor73 = classWriter61.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray74 = classWriter61.toByteArray();
        org.mockito.asm.ByteVector byteVector77 = byteVector57.putByteArray(byteArray74, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader78 = new org.mockito.asm.ClassReader(byteArray74);
        long long80 = classReader78.readLong((int) (byte) 100);
        long long82 = classReader78.readLong((int) (byte) 10);
        java.lang.String[] strArray83 = classReader78.getInterfaces();
        int int85 = classReader78.readInt(0);
        int int86 = classReader78.header;
        java.lang.String[] strArray87 = classReader78.getInterfaces();
        int int89 = classReader78.readByte(4);
        byte[] byteArray90 = classReader78.b;
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) byteArray90);
        org.mockito.asm.ClassReader classReader92 = new org.mockito.asm.ClassReader(byteArray90);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[8, -1, -1, 4, 97, 8]");
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(attributeArray36);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1]");
        org.junit.Assert.assertNotNull(labelArray47);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 8532477865490146625L + "'", long80 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 72057598333118569L + "'", long82 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-889275714) + "'", int85 == (-889275714));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 118 + "'", int86 == 118);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn((int) '4', (int) 'a');
        java.util.List list10 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitLabel(label12);
        aSMifierMethodVisitor0.visitMaxs(18, 18798);
        aSMifierMethodVisitor0.visitMaxs(1751720195, 590080);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(annotationVisitor11);
    }

    @Test
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.write((-889275714));
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((int) 'a');
        printWriter21.println("");
        printWriter21.print((float) 590080L);
        java.lang.Object[] objArray29 = null;
        java.io.PrintWriter printWriter30 = printWriter21.printf("hi!", objArray29);
        printWriter30.println('a');
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter((java.io.Writer) printWriter30);
        printWriter33.print(false);
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter("hi!");
        printWriter37.print((-889275714));
        printWriter37.println((int) (short) 256);
        printWriter37.print((long) 1);
        java.io.PrintWriter printWriter45 = new java.io.PrintWriter("hi!");
        printWriter45.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        java.io.PrintWriter printWriter50 = printWriter45.append('#');
        printWriter50.println((double) 51966);
        char[] charArray59 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter50.write(charArray59);
        printWriter37.print(charArray59);
        printWriter33.println(charArray59);
        printWriter1.println(charArray59);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ , a,  , #, #, a]");
    }

    @Test
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L323026369");
        java.io.PrintWriter printWriter4 = new java.io.PrintWriter("hi!");
        printWriter4.print((-889275714));
        java.util.Locale locale7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor9 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label10 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor11 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor11.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label17 = null;
        int[] intArray19 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray20 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor11.visitLookupSwitchInsn(label17, intArray19, labelArray20);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor22 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor22.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label28 = null;
        int[] intArray30 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray31 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor22.visitLookupSwitchInsn(label28, intArray30, labelArray31);
        aSMifierMethodVisitor9.visitLookupSwitchInsn(label10, intArray19, labelArray31);
        java.io.PrintWriter printWriter34 = printWriter4.format(locale7, "hi!", (java.lang.Object[]) labelArray31);
        printWriter34.println("L799304101");
        java.io.PrintWriter printWriter38 = printWriter34.append('#');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor39 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        aSMifierClassVisitor39.visitOuterClass("", "L407895089", "L2101667039");
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        aSMifierClassVisitor49.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor49.visitInnerClass("", "hi!", "hi!", (int) (short) 9);
        aSMifierClassVisitor49.visitInnerClass("L1813264043", "L834812042", "L142696279", 16);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor49.visit(30313, 14, "L389484434", "L166496538", "L1009311081", strArray70);
        org.mockito.asm.MethodVisitor methodVisitor72 = aSMifierClassVisitor39.visitMethod(105, "L1784767575", "L1035698796", "L1646758677", strArray70);
        java.io.PrintWriter printWriter73 = printWriter1.format("L762652875", (java.lang.Object[]) strArray70);
        java.lang.Object obj74 = null;
        printWriter1.print(obj74);
        printWriter1.println((long) 40);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1]");
        org.junit.Assert.assertNotNull(labelArray20);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1]");
        org.junit.Assert.assertNotNull(labelArray31);
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(printWriter38);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(printWriter73);
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 22113);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) 4);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("L1533650022");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte(6);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) 'a');
        byte[] byteArray22 = classWriter21.toByteArray();
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putByteArray(byteArray22, 5, (int) (byte) 0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor26.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor26.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierMethodVisitor26.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putByte(2);
        annotationVisitor38.visit("", (java.lang.Object) byteVector41);
        org.mockito.asm.ByteVector byteVector48 = byteVector41.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector50 = byteVector41.putByte(3);
        org.mockito.asm.ByteVector byteVector52 = byteVector41.putInt((-889275714));
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter60.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = classWriter60.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor72 = classWriter60.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray73 = classWriter60.toByteArray();
        org.mockito.asm.ByteVector byteVector76 = byteVector56.putByteArray(byteArray73, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader77 = new org.mockito.asm.ClassReader(byteArray73);
        org.mockito.asm.ClassReader classReader78 = new org.mockito.asm.ClassReader(byteArray73);
        org.mockito.asm.ClassReader classReader79 = new org.mockito.asm.ClassReader(byteArray73);
        byte[] byteArray80 = classReader79.b;
        org.mockito.asm.ByteVector byteVector83 = byteVector52.putByteArray(byteArray80, 0, 5);
        org.mockito.asm.ClassReader classReader84 = new org.mockito.asm.ClassReader(byteArray80);
        org.mockito.asm.ByteVector byteVector87 = byteVector25.putByteArray(byteArray80, 25, (int) (short) 0);
        org.mockito.asm.ClassReader classReader88 = new org.mockito.asm.ClassReader(byteArray80);
        org.mockito.asm.ClassWriter classWriter90 = new org.mockito.asm.ClassWriter(classReader88, 872);
        short short92 = classReader88.readShort(6);
        byte[] byteArray93 = classReader88.b;
        org.mockito.asm.ClassReader classReader94 = new org.mockito.asm.ClassReader(byteArray93);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector97 = byteVector7.putByteArray(byteArray93, 28526, 47806);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(annotationVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertTrue("'" + short92 + "' != '" + (short) 0 + "'", short92 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.print((float) 590080L);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        printWriter9.println('a');
        java.io.PrintWriter printWriter13 = printWriter9.append((java.lang.CharSequence) "hi!");
        printWriter13.flush();
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("hi!");
        printWriter16.print((int) 'a');
        printWriter16.println("");
        printWriter16.print((float) 590080L);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter((java.io.Writer) printWriter16, true);
        printWriter16.print((float) (short) 30313);
        java.util.Locale locale27 = null;
        java.lang.Object[] objArray29 = null;
        java.io.PrintWriter printWriter30 = printWriter16.printf(locale27, "", objArray29);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter((java.io.Writer) printWriter16);
        java.io.PrintWriter printWriter33 = printWriter31.append((java.lang.CharSequence) "L1924143761");
        printWriter33.println((long) 202);
        printWriter33.flush();
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("hi!");
        printWriter38.print((int) 'a');
        printWriter38.println("");
        printWriter38.print((float) 590080L);
        java.lang.Object[] objArray46 = null;
        java.io.PrintWriter printWriter47 = printWriter38.printf("hi!", objArray46);
        printWriter47.println('a');
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter((java.io.Writer) printWriter47);
        printWriter50.print(false);
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter("hi!");
        printWriter54.print((-889275714));
        printWriter54.println((int) (short) 256);
        printWriter54.print((long) 1);
        java.io.PrintWriter printWriter62 = new java.io.PrintWriter("hi!");
        printWriter62.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor65 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter62);
        java.io.PrintWriter printWriter67 = printWriter62.append('#');
        printWriter67.println((double) 51966);
        char[] charArray76 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter67.write(charArray76);
        printWriter54.print(charArray76);
        printWriter50.println(charArray76);
        printWriter33.write(charArray76);
        printWriter13.write(charArray76);
        org.junit.Assert.assertNotNull(printWriter13);
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(printWriter33);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[ , a,  , #, #, a]");
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L1479479862");
        java.util.Locale locale2 = null;
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("hi!");
        printWriter5.print((-889275714));
        java.util.Locale locale8 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor10 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label11 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor12.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label18 = null;
        int[] intArray20 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray21 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor12.visitLookupSwitchInsn(label18, intArray20, labelArray21);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor23 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor23.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label29 = null;
        int[] intArray31 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray32 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor23.visitLookupSwitchInsn(label29, intArray31, labelArray32);
        aSMifierMethodVisitor10.visitLookupSwitchInsn(label11, intArray20, labelArray32);
        java.io.PrintWriter printWriter35 = printWriter5.format(locale8, "hi!", (java.lang.Object[]) labelArray32);
        printWriter5.print(false);
        printWriter5.println(true);
        java.io.PrintWriter printWriter41 = printWriter5.append('#');
        printWriter41.print((long) 25929);
        printWriter41.write((-1107296256));
        java.util.Locale locale46 = null;
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putShort((int) (short) 10);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) 'a');
        byte[] byteArray60 = classWriter59.toByteArray();
        org.mockito.asm.ByteVector byteVector63 = byteVector57.putByteArray(byteArray60, 7, 0);
        org.mockito.asm.ClassReader classReader66 = new org.mockito.asm.ClassReader(byteArray60, 2, 51966);
        int int68 = classReader66.readByte((int) (short) 10);
        java.lang.String[] strArray69 = classReader66.getInterfaces();
        java.io.PrintWriter printWriter70 = printWriter41.format(locale46, "L1905158729", (java.lang.Object[]) strArray69);
        java.io.PrintWriter printWriter71 = printWriter1.format(locale2, "L939261813", (java.lang.Object[]) strArray69);
        java.io.PrintWriter printWriter73 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        printWriter73.print('a');
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1]");
        org.junit.Assert.assertNotNull(labelArray21);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1]");
        org.junit.Assert.assertNotNull(labelArray32);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(printWriter71);
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitMaxs((int) (short) 0, 1);
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "", "hi!", label15, label16, 3);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMaxs(100, 0);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 256, "L1138164648", false);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        aSMifierClassVisitor30.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor30.visitInnerClass("", "hi!", "hi!", (int) (short) 9);
        aSMifierMethodVisitor28.visitLdcInsn((java.lang.Object) "hi!");
        aSMifierMethodVisitor28.visitEnd();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor43 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor43.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor43.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label53 = null;
        aSMifierMethodVisitor43.visitLineNumber((int) (byte) 10, label53);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierMethodVisitor43.visitAnnotation("hi!", true);
        aSMifierMethodVisitor43.visitIntInsn((int) '4', (int) 'a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor62 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor62.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor62.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label72 = null;
        aSMifierMethodVisitor62.visitLineNumber((int) (byte) 10, label72);
        org.mockito.asm.Label label76 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor77 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor77.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label83 = null;
        int[] intArray85 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray86 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor77.visitLookupSwitchInsn(label83, intArray85, labelArray86);
        aSMifierMethodVisitor62.visitTableSwitchInsn((int) (byte) 0, 51966, label76, labelArray86);
        org.mockito.asm.Label label89 = null;
        aSMifierMethodVisitor62.visitLabel(label89);
        org.mockito.asm.Label label91 = new org.mockito.asm.Label();
        aSMifierMethodVisitor62.visitLabel(label91);
        aSMifierMethodVisitor43.visitJumpInsn((int) (short) 10, label91);
        java.lang.String str94 = label91.toString();
        java.lang.String str95 = label91.toString();
        aSMifierMethodVisitor28.visitLabel(label91);
        java.lang.String str97 = label91.toString();
        aSMifierMethodVisitor0.visitLabel(label91);
        java.lang.String str99 = label91.toString();
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1]");
        org.junit.Assert.assertNotNull(labelArray86);
// flaky:         org.junit.Assert.assertEquals("'" + str94 + "' != '" + "L631010346" + "'", str94, "L631010346");
// flaky:         org.junit.Assert.assertEquals("'" + str95 + "' != '" + "L631010346" + "'", str95, "L631010346");
// flaky:         org.junit.Assert.assertEquals("'" + str97 + "' != '" + "L631010346" + "'", str97, "L631010346");
// flaky:         org.junit.Assert.assertEquals("'" + str99 + "' != '" + "L631010346" + "'", str99, "L631010346");
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter11 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor12 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter11);
        aSMifierClassVisitor12.visitSource("", "hi!");
        int int16 = classWriter1.newConst((java.lang.Object) "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor22 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor22.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor22.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor22.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list34 = aSMifierMethodVisitor22.text;
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter38.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter38.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor50 = classWriter38.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter38.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor57 = classWriter38.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor64.visit(2, (int) (byte) 0, "", "", "", strArray73);
        classWriter38.visit((int) 'a', (int) '#', "", "", "hi!", strArray73);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor77 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor77.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label83 = null;
        int[] intArray85 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray86 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor77.visitLookupSwitchInsn(label83, intArray85, labelArray86);
        aSMifierMethodVisitor22.visitFrame((int) (byte) 1, (int) (byte) -1, (java.lang.Object[]) strArray73, (int) (short) 100, (java.lang.Object[]) labelArray86);
        classWriter1.visit((int) ' ', 9, "", "", "", strArray73);
        org.mockito.asm.Attribute attribute90 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1]");
        org.junit.Assert.assertNotNull(labelArray86);
    }

    @Test
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor18 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor18.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor18.visitCode();
        aSMifierMethodVisitor18.visitMaxs((int) '4', 0);
        org.mockito.asm.Label label28 = null;
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.Label label30 = null;
        aSMifierMethodVisitor18.visitTryCatchBlock(label28, label29, label30, "hi!");
        aSMifierMethodVisitor18.visitIntInsn(2, (int) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor36.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor36.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label46 = null;
        aSMifierMethodVisitor36.visitLineNumber((int) (byte) 10, label46);
        org.mockito.asm.Label label50 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor51 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor51.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label57 = null;
        int[] intArray59 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray60 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor51.visitLookupSwitchInsn(label57, intArray59, labelArray60);
        aSMifierMethodVisitor36.visitTableSwitchInsn((int) (byte) 0, 51966, label50, labelArray60);
        org.mockito.asm.Label label63 = null;
        aSMifierMethodVisitor36.visitLabel(label63);
        org.mockito.asm.Label label65 = new org.mockito.asm.Label();
        aSMifierMethodVisitor36.visitLabel(label65);
        org.mockito.asm.Label label67 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor68 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor68.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor68.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor68.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor82 = aSMifierMethodVisitor68.visitAnnotation("hi!", false);
        org.mockito.asm.Label label84 = new org.mockito.asm.Label();
        aSMifierMethodVisitor68.visitLineNumber(10, label84);
        aSMifierMethodVisitor18.visitTryCatchBlock(label65, label67, label84, "L1434348811");
        aSMifierMethodVisitor0.visitLabel(label67);
        aSMifierMethodVisitor0.visitIincInsn(22, 32);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitVarInsn((int) (short) 30313, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30313");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1]");
        org.junit.Assert.assertNotNull(labelArray60);
        org.junit.Assert.assertNotNull(annotationVisitor82);
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = aSMifierMethodVisitor0.visitAnnotation("", true);
        aSMifierMethodVisitor0.visitIntInsn(0, 0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor16 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor16.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor16.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label26 = null;
        aSMifierMethodVisitor16.visitLineNumber((int) (byte) 10, label26);
        org.mockito.asm.Label label30 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor31 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor31.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label37 = null;
        int[] intArray39 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray40 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor31.visitLookupSwitchInsn(label37, intArray39, labelArray40);
        aSMifierMethodVisitor16.visitTableSwitchInsn((int) (byte) 0, 51966, label30, labelArray40);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierMethodVisitor16.visitAnnotation("hi!", true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor46 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor46.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor46.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label56 = null;
        aSMifierMethodVisitor46.visitLineNumber((int) (byte) 10, label56);
        aSMifierMethodVisitor46.visitMultiANewArrayInsn("", 0);
        aSMifierMethodVisitor46.visitFieldInsn(7, "L1434348811", "L1434348811", "L1434348811");
        org.mockito.asm.Label label67 = new org.mockito.asm.Label();
        aSMifierMethodVisitor46.visitLineNumber(4, label67);
        aSMifierMethodVisitor16.visitLabel(label67);
        java.lang.Object obj70 = label67.info;
        aSMifierMethodVisitor0.visitLineNumber(151060480, label67);
        aSMifierMethodVisitor0.visitIincInsn(1853118049, 28);
        aSMifierMethodVisitor0.visitTypeInsn(35, "L1108808500");
        aSMifierMethodVisitor0.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1]");
        org.junit.Assert.assertNotNull(labelArray40);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter7.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter7.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter7.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray20 = classWriter7.toByteArray();
        org.mockito.asm.ByteVector byteVector23 = byteVector3.putByteArray(byteArray20, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray20);
        long long26 = classReader24.readLong((int) (byte) 100);
        long long28 = classReader24.readLong((int) (byte) 10);
        java.lang.String[] strArray29 = classReader24.getInterfaces();
        int int31 = classReader24.readInt(0);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(classReader24, (int) '4');
        classWriter33.visitOuterClass("L2113189186", "hi!", "L1669980843");
        byte[] byteArray38 = classWriter33.toByteArray();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor43 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor43.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor43.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor43.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor43.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor43.visitFieldInsn(6, "L326432149", "L1434348811", "");
        org.mockito.asm.FieldVisitor fieldVisitor65 = classWriter33.visitField((int) (byte) 0, "L601661571", "L454715523", "L601661571", (java.lang.Object) "L326432149");
        int int70 = classWriter33.newMethod("L477731576", "L911973346", "L1321861150", false);
        int int73 = classWriter33.newNameType("L1770505064", "L836986691");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor74 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.io.PrintWriter printWriter75 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor76 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter75);
        aSMifierClassVisitor76.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor76.visitInnerClass("", "hi!", "hi!", (int) (short) 9);
        aSMifierMethodVisitor74.visitLdcInsn((java.lang.Object) "hi!");
        aSMifierMethodVisitor74.visitEnd();
        aSMifierMethodVisitor74.visitIntInsn(0, 12);
        int int92 = classWriter33.newConst((java.lang.Object) 12);
        int int94 = classWriter33.newClass("L955027613");
        byte[] byteArray95 = classWriter33.toByteArray();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8532477865490146625L + "'", long26 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 72057598333118569L + "'", long28 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-889275714) + "'", int31 == (-889275714));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 11, 76, 50, 49, 49, 51, 49, 56, 57, 49, 56, 54, 7, 0, 9, 1, 0, 11, 76, 49, 54, 54, 57, 57, 56, 48, 56, 52, 51, 12, 0, 2, 0, 11, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 13, 0, 0, 0, 4, 0, 10, 0, 12]");
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 23 + "'", int70 == 23);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 26 + "'", int73 == 26);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 27 + "'", int92 == 27);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 29 + "'", int94 == 29);
        org.junit.Assert.assertNotNull(byteArray95);
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 9);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("L454715523", false);
        classWriter1.visitOuterClass("", "L1691870655", "L1216476214");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter14.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter14.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter14.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter14.visitEnd();
        classWriter14.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = classWriter14.visitAnnotation("L422154835", false);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField(57174305, "L1421508585", "L1855853747", "L914596724", (java.lang.Object) "L422154835");
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("hi!");
        printWriter38.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor41 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter38);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor41.visitAnnotation("", false);
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter56 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter56.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter56.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor68 = classWriter56.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray69 = classWriter56.toByteArray();
        org.mockito.asm.ByteVector byteVector72 = byteVector52.putByteArray(byteArray69, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader73 = new org.mockito.asm.ClassReader(byteArray69);
        long long75 = classReader73.readLong((int) (byte) 100);
        int int77 = classReader73.readUnsignedShort((int) (short) 0);
        java.lang.String[] strArray78 = classReader73.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor79 = aSMifierClassVisitor41.visitMethod(0, "hi!", "L994489370", "hi!", strArray78);
        aSMifierClassVisitor41.visitOuterClass("L1749641217", "L1216476214", "L666971223");
        aSMifierClassVisitor41.visitEnd();
        aSMifierClassVisitor41.visitInnerClass("L2101667039", "L96121905", "", 20);
        org.mockito.asm.FieldVisitor fieldVisitor90 = classWriter1.visitField(256, "L1359835451", "L389484434", "L1533650022", (java.lang.Object) 20);
        classWriter1.visitInnerClass("L555140717", "L1654109497", "L1957730982", 18798);
        org.mockito.asm.AnnotationVisitor annotationVisitor98 = classWriter1.visitAnnotation("L34197324", false);
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 8532477865490146625L + "'", long75 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 51966 + "'", int77 == 51966);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(fieldVisitor90);
        org.junit.Assert.assertNotNull(annotationVisitor98);
    }

    @Test
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor1.visit(2, (int) (byte) 0, "", "", "", strArray10);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "L1434348811");
        aSMifierClassVisitor1.visitInnerClass("L61669440", "hi!", "L2113189186", 10);
        aSMifierClassVisitor1.visitSource("L1669980843", "L666971223");
        java.util.List list32 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("L834812042", "");
        aSMifierClassVisitor1.visitSource("L943959020", "L1853824624");
        aSMifierClassVisitor1.visitOuterClass("L1601831013", "L1344346170", "L1271688136");
        aSMifierClassVisitor1.visitOuterClass("L2056285805", "L1220566173", "L303751449");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitIincInsn(1, 0);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitLabel(label12);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter21.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classWriter21.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter21.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray34 = classWriter21.toByteArray();
        org.mockito.asm.ByteVector byteVector37 = byteVector17.putByteArray(byteArray34, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader38 = new org.mockito.asm.ClassReader(byteArray34);
        long long40 = classReader38.readLong((int) (byte) 100);
        long long42 = classReader38.readLong((int) (byte) 10);
        java.lang.String[] strArray43 = classReader38.getInterfaces();
        int int45 = classReader38.readByte((int) '#');
        long long47 = classReader38.readLong(4);
        int int48 = classReader38.header;
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter(classReader38, (int) (byte) 0);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) classWriter50);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitVarInsn(5, (int) (short) 24940);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitIntInsn(2817, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 8532477865490146625L + "'", long40 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 72057598333118569L + "'", long42 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 86 + "'", int45 == 86);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 590080L + "'", long47 == 590080L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 118 + "'", int48 == 118);
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitOuterClass("L727344959", "L351643771", "L915213100");
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println(7);
        printWriter1.println(true);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor36.visitEnd();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
    }

    @Test
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitMaxs((int) (short) 0, 1);
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor15.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierMethodVisitor15.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray30 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label38 = null;
        int[] intArray40 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray41 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor32.visitLookupSwitchInsn(label38, intArray40, labelArray41);
        aSMifierMethodVisitor15.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray30, (int) 'a', (java.lang.Object[]) labelArray41);
        aSMifierMethodVisitor0.visitTableSwitchInsn(8, (int) (byte) 1, label14, labelArray41);
        aSMifierMethodVisitor0.visitMaxs(3, 51966);
        aSMifierMethodVisitor0.visitIincInsn((-889275714), 9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor52 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor52.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor52.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor52.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = aSMifierMethodVisitor52.visitAnnotation("hi!", false);
        org.mockito.asm.Label label68 = new org.mockito.asm.Label();
        aSMifierMethodVisitor52.visitLineNumber(10, label68);
        aSMifierMethodVisitor0.visitLineNumber(4, label68);
        aSMifierMethodVisitor0.visitTypeInsn(17, "L1555790481");
        aSMifierMethodVisitor0.visitVarInsn(0, 134);
        aSMifierMethodVisitor0.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(attributeArray30);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1]");
        org.junit.Assert.assertNotNull(labelArray41);
        org.junit.Assert.assertNotNull(annotationVisitor66);
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter6 = printWriter1.append('#');
        printWriter6.println((double) 51966);
        char[] charArray15 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter6.write(charArray15);
        printWriter6.print('a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor19 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter("hi!");
        printWriter25.print((int) 'a');
        printWriter25.println("");
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        aSMifierClassVisitor31.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierClassVisitor31.visitAnnotation("", false);
        printWriter25.print((java.lang.Object) false);
        printWriter25.print((double) 10.0f);
        java.io.PrintWriter printWriter43 = new java.io.PrintWriter((java.io.Writer) printWriter25);
        printWriter43.print((int) (short) 0);
        printWriter43.close();
        printWriter43.write(0);
        printWriter43.println((int) (byte) 10);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor19.visitField(53, "L1853312656", "L895464062", "L1174087069", (java.lang.Object) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor19.visitAnnotation("L2113189186", false);
        annotationVisitor54.visitEnum("L1475462582", "L371985395", "L1264545153");
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , a,  , #, #, a]");
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor54);
    }

    @Test
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list12 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor14 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor14.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor14.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor14.visitMaxs((int) (short) 0, 1);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor14);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierMethodVisitor0.visitAnnotation("L1853824624", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 872, "L174478886", true);
        aSMifierMethodVisitor0.visitTypeInsn(134, "L1230702653");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor37.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor37.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label47 = null;
        aSMifierMethodVisitor37.visitLineNumber((int) (byte) 10, label47);
        org.mockito.asm.Label label51 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor52 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor52.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label58 = null;
        int[] intArray60 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray61 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor52.visitLookupSwitchInsn(label58, intArray60, labelArray61);
        aSMifierMethodVisitor37.visitTableSwitchInsn((int) (byte) 0, 51966, label51, labelArray61);
        org.mockito.asm.Label label64 = null;
        aSMifierMethodVisitor37.visitLabel(label64);
        org.mockito.asm.Label label66 = new org.mockito.asm.Label();
        aSMifierMethodVisitor37.visitLabel(label66);
        java.lang.Object obj68 = label66.info;
        aSMifierMethodVisitor0.visitLabel(label66);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1]");
        org.junit.Assert.assertNotNull(labelArray61);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label10);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", 0);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor17 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor17.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor17.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor17.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.Label label32 = null;
        org.mockito.asm.Label label33 = null;
        aSMifierMethodVisitor17.visitLocalVariable("hi!", "hi!", "hi!", label32, label33, 1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor37.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor37.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierMethodVisitor37.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor37.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierMethodVisitor37.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label57 = new org.mockito.asm.Label();
        aSMifierMethodVisitor37.visitLabel(label57);
        java.lang.String str59 = label57.toString();
        aSMifierMethodVisitor17.visitJumpInsn(5, label57);
        java.lang.Object obj61 = label57.info;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label57);
        java.lang.Object obj63 = label57.info;
        java.lang.String str64 = label57.toString();
        java.lang.Class<?> wildcardClass65 = label57.getClass();
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor56);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "L1696757434" + "'", str59, "L1696757434");
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "L1696757434" + "'", str64, "L1696757434");
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter31.print((int) '4');
        java.io.PrintWriter printWriter35 = printWriter31.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter35, false);
        boolean boolean38 = printWriter37.checkError();
        boolean boolean39 = printWriter37.checkError();
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(25);
        java.lang.String[] strArray48 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        classWriter42.visit((int) (short) 0, (-1107296256), "L834812042", "L1694926691", "L1544572272", strArray48);
        java.io.PrintWriter printWriter50 = printWriter37.format("L1669980843", (java.lang.Object[]) strArray48);
        printWriter50.print(190);
        printWriter50.print(true);
        printWriter50.print("L767403187");
        printWriter50.print('a');
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter50);
        printWriter50.close();
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor68 = classWriter62.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        classWriter62.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = classWriter62.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classWriter62.visitAnnotation("", false);
        classWriter62.visitInnerClass("L55453359", "L20866424", "L1930290201", 254);
        classWriter62.visitEnd();
        printWriter50.print((java.lang.Object) classWriter62);
        int int87 = classWriter62.newMethod("L123314814", "L954744343", "L491653916", false);
        classWriter62.visitInnerClass("L1141916607", "L1224063616", "L1843076310", 210);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 14 + "'", int87 == 14);
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter21.print(false);
        printWriter21.println((long) (-889275714));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter21);
        printWriter21.println("L1669980843");
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter21);
        java.io.PrintWriter printWriter61 = printWriter21.append('a');
        printWriter21.println(' ');
        printWriter21.println((double) 1869480192);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(printWriter61);
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        int int42 = classWriter1.newField("L1284973471", "L1284973471", "L1216476214");
        classWriter1.visitOuterClass("L1105153118", "L1544572272", "");
        classWriter1.visitSource("L1931374313", "L544338606");
        byte[] byteArray50 = classWriter1.toByteArray();
        int int53 = classWriter1.newNameType("L1843076310", "L1289682213");
        int int58 = classWriter1.newMethod("L1579098349", "L1641107942", "L1610282393", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = classWriter1.visitAnnotation("L1555790481", false);
        annotationVisitor61.visit("L1514525409", (java.lang.Object) "L1508691945");
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 26 + "'", int53 == 26);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32 + "'", int58 == 32);
        org.junit.Assert.assertNotNull(annotationVisitor61);
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter21.print(false);
        printWriter21.println((long) (-889275714));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter21);
        printWriter21.print('#');
        printWriter21.println();
        java.io.PrintWriter printWriter61 = new java.io.PrintWriter((java.io.Writer) printWriter21, false);
        printWriter21.print('#');
        printWriter21.print((long) 590080);
        printWriter21.close();
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 100);
        org.mockito.asm.FieldVisitor fieldVisitor12 = aSMifierClassVisitor1.visitField(100, "hi!", "", "", (java.lang.Object) 100);
        aSMifierClassVisitor1.visitInnerClass("L1434348811", "", "", 2);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("L519300220", "L978789454");
        aSMifierClassVisitor1.visitSource("L2020972680", "L1536756937");
        aSMifierClassVisitor1.visitInnerClass("L477422003", "L111016143", "L119989099", (int) (short) 872);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor38.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label44 = null;
        int[] intArray46 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray47 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor38.visitLookupSwitchInsn(label44, intArray46, labelArray47);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor49 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor49.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label55 = null;
        int[] intArray57 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray58 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor49.visitLookupSwitchInsn(label55, intArray57, labelArray58);
        aSMifierMethodVisitor36.visitLookupSwitchInsn(label37, intArray46, labelArray58);
        aSMifierMethodVisitor36.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list66 = aSMifierMethodVisitor36.text;
        aSMifierMethodVisitor36.visitMaxs((-1), (int) (short) 100);
        aSMifierMethodVisitor36.visitCode();
        aSMifierMethodVisitor36.visitEnd();
        aSMifierMethodVisitor36.visitInsn(0);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor1.visitField(1869967971, "L1258012511", "L1357739554", "L1581863962", (java.lang.Object) aSMifierMethodVisitor36);
        aSMifierMethodVisitor36.visitMaxs(12, 65792);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1]");
        org.junit.Assert.assertNotNull(labelArray47);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1]");
        org.junit.Assert.assertNotNull(labelArray58);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(fieldVisitor74);
    }

    @Test
    public void test17670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17670");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.print(false);
        printWriter1.println(true);
        printWriter1.print((float) (short) 0);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.println((float) 8);
        java.io.PrintWriter printWriter42 = printWriter1.append((java.lang.CharSequence) "L1813264043");
        printWriter42.println((float) 7298486125984967010L);
        printWriter42.println(0);
        printWriter42.print((float) 118);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter42);
    }

    @Test
    public void test17671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17671");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor10 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor10.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor10.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierMethodVisitor10.visitParameterAnnotation(25929, "L799304101", false);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putShort((int) '4');
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter31.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter31.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter31.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter31.visitEnd();
        classWriter31.visitInnerClass("hi!", "hi!", "", (int) (byte) 10);
        classWriter31.visitSource("hi!", "hi!");
        byte[] byteArray53 = classWriter31.toByteArray();
        org.mockito.asm.ByteVector byteVector56 = byteVector25.putByteArray(byteArray53, (int) (short) 10, (int) '4');
        annotationVisitor20.visit("L598840791", (java.lang.Object) byteArray53);
        org.mockito.asm.ClassReader classReader58 = new org.mockito.asm.ClassReader(byteArray53);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter(classReader58, 0);
        byte[] byteArray61 = classReader58.b;
        java.lang.String[] strArray62 = classReader58.getInterfaces();
        aSMifierClassVisitor1.visit(0, (int) (byte) 0, "", "L406814154", "L1688081168", strArray62);
        aSMifierClassVisitor1.visitInnerClass("L2058942103", "L1163352429", "L1062074562", (int) (short) 8451);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 7, 0, 2, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 2, 0, 0, 0, 4, 0, 7, 0, 0, 0, 2, 0, 2, 0, 8, 0, 0, 0, 3, 104, 105, 33, 0, 9, 0, 0, 0, 10, 0, 1, 0, 4, 0, 4, 0, 1, 0, 10, 0, 10, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 7, 0, 2, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 2, 0, 0, 0, 4, 0, 7, 0, 0, 0, 2, 0, 2, 0, 8, 0, 0, 0, 3, 104, 105, 33, 0, 9, 0, 0, 0, 10, 0, 1, 0, 4, 0, 4, 0, 1, 0, 10, 0, 10, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(strArray62);
    }

    @Test
    public void test17672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17672");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        int int41 = classWriter1.newNameType("", "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor42 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor42.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor42.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierMethodVisitor42.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray57 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor59 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor59.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label65 = null;
        int[] intArray67 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray68 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor59.visitLookupSwitchInsn(label65, intArray67, labelArray68);
        aSMifierMethodVisitor42.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray57, (int) 'a', (java.lang.Object[]) labelArray68);
        int int71 = classWriter1.newConst((java.lang.Object) 'a');
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitSource("L2113189186", "hi!");
        int int80 = classWriter1.newUTF8("L1434348811");
        int int82 = classWriter1.newClass("L61669440");
        classWriter1.visitEnd();
        int int86 = classWriter1.newNameType("L714880249", "L1440030271");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(attributeArray57);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1]");
        org.junit.Assert.assertNotNull(labelArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 12 + "'", int82 == 12);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 15 + "'", int86 == 15);
    }

    @Test
    public void test17673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17673");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter17.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter17.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter17.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray30 = classWriter17.toByteArray();
        org.mockito.asm.ByteVector byteVector33 = byteVector13.putByteArray(byteArray30, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader34 = new org.mockito.asm.ClassReader(byteArray30);
        long long36 = classReader34.readLong((int) (byte) 100);
        long long38 = classReader34.readLong((int) (byte) 10);
        java.lang.String[] strArray39 = classReader34.getInterfaces();
        aSMifierClassVisitor4.visit((int) (byte) 1, (-1), "", "hi!", "", strArray39);
        aSMifierClassVisitor4.visitOuterClass("L1434348811", "L326432149", "L994489370");
        aSMifierClassVisitor4.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor4.visitAnnotation("L2113189186", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierClassVisitor4.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor4.visitAnnotation("L598840791", false);
        aSMifierClassVisitor4.visitInnerClass("L1301153355", "L519300220", "L1276244777", 25);
        aSMifierClassVisitor4.visitEnd();
        aSMifierClassVisitor4.visitInnerClass("L1847055122", "L1473861125", "", 15);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 8532477865490146625L + "'", long36 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 72057598333118569L + "'", long38 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor54);
    }

    @Test
    public void test17674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17674");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        int int41 = classWriter1.newNameType("", "");
        int int45 = classWriter1.newField("", "", "L1434348811");
        int int49 = classWriter1.newField("L1536756937", "", "L407895089");
        classWriter1.visitSource("L1906590307", "L406965428");
        int int57 = classWriter1.newMethod("L519300220", "L1191453385", "L1449203555", false);
        org.mockito.asm.Attribute attribute58 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 22 + "'", int57 == 22);
    }

    @Test
    public void test17675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17675");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.print(0.0d);
        printWriter1.print(9);
        java.util.Locale locale9 = null;
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter12.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor24 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor24.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor24.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor24.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list36 = aSMifierMethodVisitor24.text;
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter40.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classWriter40.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter40.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter40.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor59 = classWriter40.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter65 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor66 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter65);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor66.visit(2, (int) (byte) 0, "", "", "", strArray75);
        classWriter40.visit((int) 'a', (int) '#', "", "", "hi!", strArray75);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor79 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor79.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label85 = null;
        int[] intArray87 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray88 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor79.visitLookupSwitchInsn(label85, intArray87, labelArray88);
        aSMifierMethodVisitor24.visitFrame((int) (byte) 1, (int) (byte) -1, (java.lang.Object[]) strArray75, (int) (short) 100, (java.lang.Object[]) labelArray88);
        classWriter12.visit(7, (-889275714), "", "hi!", "hi!", strArray75);
        java.io.PrintWriter printWriter92 = printWriter1.format(locale9, "L1434348811", (java.lang.Object[]) strArray75);
        printWriter1.println((long) (short) 1);
        printWriter1.println(1.0f);
        printWriter1.println((long) (short) 100);
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[1]");
        org.junit.Assert.assertNotNull(labelArray88);
        org.junit.Assert.assertNotNull(printWriter92);
    }

    @Test
    public void test17676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17676");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor10.visitSource("L799304101", "L326432149");
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitSource("L614568462", "L337574950");
        aSMifierClassVisitor10.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierClassVisitor10.visitAnnotation("L389484434", true);
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("hi!");
        printWriter28.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor31 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor31.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label37 = null;
        int[] intArray39 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray40 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor31.visitLookupSwitchInsn(label37, intArray39, labelArray40);
        java.util.List list42 = aSMifierMethodVisitor31.getText();
        printWriter28.println((java.lang.Object) list42);
        printWriter28.print((double) 10L);
        printWriter28.print(false);
        printWriter28.println((double) 2817);
        java.io.PrintWriter printWriter51 = printWriter28.append((java.lang.CharSequence) "L1845262982");
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor10.visitField(22, "L72088178", "L1800049467", "L2033982530", (java.lang.Object) printWriter28);
        java.lang.Class<?> wildcardClass53 = aSMifierClassVisitor10.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1]");
        org.junit.Assert.assertNotNull(labelArray40);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test17677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17677");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        printWriter1.print((double) 10.0f);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter19.print((long) 1);
        printWriter19.print(0.0d);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter31.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter31.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter31.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray44 = classWriter31.toByteArray();
        org.mockito.asm.ByteVector byteVector47 = byteVector27.putByteArray(byteArray44, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader48 = new org.mockito.asm.ClassReader(byteArray44);
        long long50 = classReader48.readLong((int) (byte) 100);
        long long52 = classReader48.readLong((int) (byte) 10);
        java.lang.String[] strArray53 = classReader48.getInterfaces();
        int int54 = classReader48.getAccess();
        int int55 = classReader48.getAccess();
        printWriter19.println((java.lang.Object) int55);
        printWriter19.print("L1344346170");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor59 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = aSMifierClassVisitor59.visitAnnotation("L1570018250", false);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 8532477865490146625L + "'", long50 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 72057598333118569L + "'", long52 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(annotationVisitor62);
    }

    @Test
    public void test17678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17678");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte(2);
        annotationVisitor12.visit("", (java.lang.Object) byteVector15);
        org.mockito.asm.ByteVector byteVector22 = byteVector15.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector15.putByte(3);
        org.mockito.asm.ByteVector byteVector26 = byteVector15.putByte((int) (short) 256);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(316);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt(116);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt(27);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putShort(116);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong((long) 1763771136);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
    }

    @Test
    public void test17679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17679");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list30 = aSMifierMethodVisitor0.text;
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter32.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = fieldVisitor38.visitAnnotation("hi!", true);
        fieldVisitor38.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = fieldVisitor38.visitAnnotation("", true);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "");
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1749641217", 4);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor0.visitAnnotation("L1271688136", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = annotationVisitor52.visitAnnotation("L1847055122", "L912991706");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor55);
    }

    @Test
    public void test17680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17680");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        org.mockito.asm.Label label4 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label2, label3, label4, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitCode();
        java.util.List list10 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((-889275714));
        int int14 = classWriter12.newClass("");
        classWriter12.visitSource("", "hi!");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter23.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = classWriter23.visitAnnotation("hi!", false);
        byte[] byteArray30 = classWriter23.toByteArray();
        classWriter23.visitSource("L994489370", "L459227517");
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter45.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = classWriter45.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor57 = classWriter45.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray58 = classWriter45.toByteArray();
        org.mockito.asm.ByteVector byteVector61 = byteVector41.putByteArray(byteArray58, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader62 = new org.mockito.asm.ClassReader(byteArray58);
        long long64 = classReader62.readLong((int) (byte) 100);
        long long66 = classReader62.readLong((int) (byte) 10);
        int int68 = classReader62.readUnsignedShort(0);
        int int70 = classReader62.readUnsignedShort(3);
        org.mockito.asm.ClassWriter classWriter72 = new org.mockito.asm.ClassWriter(classReader62, (int) (short) 30313);
        classWriter72.visitSource("L2036836790", "L1544572272");
        org.mockito.asm.FieldVisitor fieldVisitor76 = classWriter23.visitField((int) (short) 872, "L1321861150", "L298663367", "L1289682213", (java.lang.Object) "L2036836790");
        org.mockito.asm.FieldVisitor fieldVisitor77 = classWriter12.visitField(1634628694, "L1862425937", "L961424524", "L1929462322", (java.lang.Object) "L2036836790");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) fieldVisitor77);
        org.mockito.asm.Attribute attribute79 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldVisitor77.visitAttribute(attribute79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 2, 0, 1, 0, 4, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 8532477865490146625L + "'", long64 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 72057598333118569L + "'", long66 == 72057598333118569L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 51966 + "'", int68 == 51966);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 48640 + "'", int70 == 48640);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(fieldVisitor77);
    }

    @Test
    public void test17681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17681");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.AnnotationVisitor annotationVisitor3 = aSMifierMethodVisitor0.visitAnnotation("", false);
        java.util.List list4 = aSMifierMethodVisitor0.text;
        java.util.List list5 = aSMifierMethodVisitor0.text;
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("hi!");
        printWriter7.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter7);
        java.io.PrintWriter printWriter12 = printWriter7.append('#');
        printWriter12.print((float) ' ');
        printWriter12.println('4');
        java.io.PrintWriter printWriter18 = printWriter12.append(' ');
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter((java.io.Writer) printWriter18, false);
        printWriter20.print(true);
        aSMifierMethodVisitor0.print(printWriter20);
        org.junit.Assert.assertNotNull(annotationVisitor3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertNotNull(printWriter18);
    }

    @Test
    public void test17682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17682");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitVarInsn(2, (int) (byte) -1);
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter7.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter20.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classWriter20.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter20.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter20.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter20.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor46.visit(2, (int) (byte) 0, "", "", "", strArray55);
        classWriter20.visit((int) 'a', (int) '#', "", "", "hi!", strArray55);
        classWriter7.visit(7, (int) (byte) 0, "hi!", "", "", strArray55);
        org.mockito.asm.Attribute[] attributeArray60 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        aSMifierMethodVisitor0.visitFrame((-889275714), 51966, (java.lang.Object[]) strArray55, (int) (short) 0, (java.lang.Object[]) attributeArray60);
        org.mockito.asm.Label label63 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) '#', label63);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitVarInsn(0, (int) (byte) 0);
        java.util.List list69 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L621056596", 6);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(attributeArray60);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(annotationVisitor70);
    }

    @Test
    public void test17683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17683");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.write("");
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("hi!");
        printWriter35.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter35);
        printWriter35.print(0.0d);
        printWriter35.println();
        java.io.PrintWriter printWriter43 = new java.io.PrintWriter("hi!");
        printWriter43.print((int) 'a');
        printWriter43.println("");
        printWriter43.print((float) 590080L);
        java.lang.Object[] objArray51 = null;
        java.io.PrintWriter printWriter52 = printWriter43.printf("hi!", objArray51);
        printWriter52.println('a');
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter((java.io.Writer) printWriter52);
        printWriter55.print(false);
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("hi!");
        printWriter59.print((-889275714));
        printWriter59.println((int) (short) 256);
        printWriter59.print((long) 1);
        java.io.PrintWriter printWriter67 = new java.io.PrintWriter("hi!");
        printWriter67.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor70 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter67);
        java.io.PrintWriter printWriter72 = printWriter67.append('#');
        printWriter72.println((double) 51966);
        char[] charArray81 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter72.write(charArray81);
        printWriter59.print(charArray81);
        printWriter55.println(charArray81);
        printWriter35.println(charArray81);
        printWriter1.print((java.lang.Object) printWriter35);
        printWriter1.println((double) 1449225333);
        printWriter1.println("L1428686501");
        printWriter1.write("L477422003");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter52);
        org.junit.Assert.assertNotNull(printWriter72);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[ , a,  , #, #, a]");
    }

    @Test
    public void test17684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17684");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((long) (byte) 10);
        printWriter1.println('4');
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter29.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = classWriter29.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter29.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray42 = classWriter29.toByteArray();
        org.mockito.asm.ByteVector byteVector45 = byteVector25.putByteArray(byteArray42, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader46 = new org.mockito.asm.ClassReader(byteArray42);
        long long48 = classReader46.readLong((int) (byte) 100);
        long long50 = classReader46.readLong((int) (byte) 10);
        java.lang.String[] strArray51 = classReader46.getInterfaces();
        int int53 = classReader46.readByte((int) '#');
        long long55 = classReader46.readLong(4);
        java.lang.String[] strArray56 = classReader46.getInterfaces();
        java.io.PrintWriter printWriter57 = printWriter1.format("L1669980843", (java.lang.Object[]) strArray56);
        java.io.PrintWriter printWriter59 = printWriter1.append('#');
        printWriter59.println(30313);
        printWriter59.print("L1620118107");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 8532477865490146625L + "'", long48 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 72057598333118569L + "'", long50 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 86 + "'", int53 == 86);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 590080L + "'", long55 == 590080L);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(printWriter57);
        org.junit.Assert.assertNotNull(printWriter59);
    }

    @Test
    public void test17685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17685");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) -1, 2);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitTypeInsn(15, "L1669980843");
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        aSMifierMethodVisitor0.visitJumpInsn(25, label10);
        java.lang.Object obj12 = label10.info;
        java.lang.String str13 = label10.toString();
        java.lang.String str14 = label10.toString();
        java.lang.String str15 = label10.toString();
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter17.visitInnerClass("L298663367", "L1715840275", "L614568462", 18);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter35.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter35.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor47 = classWriter35.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray48 = classWriter35.toByteArray();
        org.mockito.asm.ByteVector byteVector51 = byteVector31.putByteArray(byteArray48, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader52 = new org.mockito.asm.ClassReader(byteArray48);
        long long54 = classReader52.readLong((int) (byte) 100);
        long long56 = classReader52.readLong((int) (byte) 10);
        java.lang.String str57 = classReader52.getSuperName();
        java.lang.String[] strArray58 = classReader52.getInterfaces();
        classWriter17.visit((int) (byte) 1, 1869480192, "L1911123705", "L173581797", "", strArray58);
        label10.info = strArray58;
        java.lang.String str61 = label10.toString();
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter(151060480);
        classWriter63.visitSource("L1675715472", "L1482294079");
        int int69 = classWriter63.newNameType("L1689719368", "L601661571");
        classWriter63.visitEnd();
        byte[] byteArray71 = classWriter63.toByteArray();
        int int75 = classWriter63.newField("L1532047758", "L648105835", "L532245627");
        label10.info = "L532245627";
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1409775804" + "'", str13, "L1409775804");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1409775804" + "'", str14, "L1409775804");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1409775804" + "'", str15, "L1409775804");
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 8532477865490146625L + "'", long54 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 72057598333118569L + "'", long56 == 72057598333118569L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strArray58);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "L1409775804" + "'", str61, "L1409775804");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 4 + "'", int69 == 4);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 11, 76, 49, 54, 55, 53, 55, 49, 53, 52, 55, 50, 1, 0, 11, 76, 49, 54, 56, 57, 55, 49, 57, 51, 54, 56, 1, 0, 10, 76, 54, 48, 49, 54, 54, 49, 53, 55, 49, 12, 0, 2, 0, 3, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 11, 76, 49, 52, 56, 50, 50, 57, 52, 48, 55, 57]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 12 + "'", int75 == 12);
    }

    @Test
    public void test17686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17686");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        java.io.PrintWriter printWriter21 = printWriter1.append(' ');
        printWriter21.write(24942);
        printWriter21.print(false);
        printWriter21.println(false);
        printWriter21.println(0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter38.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter38.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor50 = classWriter38.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray51 = classWriter38.toByteArray();
        org.mockito.asm.ByteVector byteVector54 = byteVector34.putByteArray(byteArray51, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader55 = new org.mockito.asm.ClassReader(byteArray51);
        long long57 = classReader55.readLong((int) (byte) 100);
        long long59 = classReader55.readLong((int) (byte) 10);
        java.lang.String[] strArray60 = classReader55.getInterfaces();
        int int62 = classReader55.readInt(0);
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter(classReader55, (int) '4');
        int int66 = classReader55.readByte(18);
        java.lang.String[] strArray67 = classReader55.getInterfaces();
        java.io.PrintWriter printWriter68 = printWriter21.printf("L140707071", (java.lang.Object[]) strArray67);
        printWriter68.print('#');
        printWriter68.println((float) 86);
        printWriter68.println("L231244560");
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 8532477865490146625L + "'", long57 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 72057598333118569L + "'", long59 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-889275714) + "'", int62 == (-889275714));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 33 + "'", int66 == 33);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(printWriter68);
    }

    @Test
    public void test17687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17687");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter31.print((int) '4');
        java.io.PrintWriter printWriter35 = printWriter31.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter35, false);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor41.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label47 = null;
        int[] intArray49 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor41.visitLookupSwitchInsn(label47, intArray49, labelArray50);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor52 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor52.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label58 = null;
        int[] intArray60 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray61 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor52.visitLookupSwitchInsn(label58, intArray60, labelArray61);
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label40, intArray49, labelArray61);
        java.io.PrintWriter printWriter64 = printWriter37.format("L1669980843", (java.lang.Object[]) labelArray61);
        java.io.PrintWriter printWriter66 = printWriter37.append('a');
        printWriter37.println();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1]");
        org.junit.Assert.assertNotNull(labelArray50);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1]");
        org.junit.Assert.assertNotNull(labelArray61);
        org.junit.Assert.assertNotNull(printWriter64);
        org.junit.Assert.assertNotNull(printWriter66);
    }

    @Test
    public void test17688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17688");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter("hi!");
        char[] charArray40 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter33.print(charArray40);
        printWriter31.print(charArray40);
        printWriter31.print(true);
        printWriter31.println('#');
        java.io.PrintWriter printWriter48 = printWriter31.append('a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter((java.io.Writer) printWriter48, false);
        printWriter48.write("L967033583");
        java.io.PrintWriter printWriter55 = new java.io.PrintWriter((java.io.Writer) printWriter48, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter48);
    }

    @Test
    public void test17689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17689");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println((int) (short) 1);
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter36 = printWriter1.format("hi!", (java.lang.Object[]) strArray35);
        printWriter1.println('#');
        printWriter1.println((float) 18);
        printWriter1.print("L1715840275");
        printWriter1.println(false);
        printWriter1.println((long) 872);
        java.io.PrintWriter printWriter48 = new java.io.PrintWriter((java.io.Writer) printWriter1, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(printWriter36);
    }

    @Test
    public void test17690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17690");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor26.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor26.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor26.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor26.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierMethodVisitor26.visitAnnotation("L1544572272", false);
        aSMifierMethodVisitor26.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor47 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor47.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor47.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label57 = null;
        aSMifierMethodVisitor47.visitLineNumber((int) (byte) 10, label57);
        aSMifierMethodVisitor47.visitMultiANewArrayInsn("", 0);
        aSMifierMethodVisitor47.visitFieldInsn(7, "L1434348811", "L1434348811", "L1434348811");
        org.mockito.asm.Label label68 = new org.mockito.asm.Label();
        aSMifierMethodVisitor47.visitLineNumber(4, label68);
        aSMifierMethodVisitor26.visitLabel(label68);
        aSMifierMethodVisitor0.visitLineNumber(1751720195, label68);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(annotationVisitor45);
    }

    @Test
    public void test17691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17691");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label20 = null;
        aSMifierMethodVisitor0.visitLabel(label20);
        org.mockito.asm.Label label25 = null;
        org.mockito.asm.Label label26 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "hi!", label25, label26, 51966);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor0.visitParameterAnnotation(5, "L1434348811", true);
        aSMifierMethodVisitor0.visitIincInsn((int) (short) -326, (int) (short) -326);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L459227517", (int) (short) 256);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L614568462", (int) (short) -13570);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor0.visitAnnotation("L1250170942", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierMethodVisitor0.visitAnnotation("L1029736927", true);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitInsn(257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 257");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor47);
    }

    @Test
    public void test17692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17692");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitMethodInsn(4, "", "hi!", "");
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Label label32 = null;
        aSMifierMethodVisitor0.visitLineNumber(51966, label32);
        aSMifierMethodVisitor0.visitMaxs(1869480192, 26);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L109855375", 1698981218);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
    }

    @Test
    public void test17693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17693");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter31.print((int) '4');
        java.io.PrintWriter printWriter35 = printWriter31.append((java.lang.CharSequence) "hi!");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        printWriter31.write("L994489370");
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter((java.io.Writer) printWriter31, true);
        printWriter40.close();
        printWriter40.print((double) 590080L);
        printWriter40.println((long) 30313);
        printWriter40.println(51966);
        java.io.PrintWriter printWriter49 = new java.io.PrintWriter((java.io.Writer) printWriter40, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(printWriter35);
    }

    @Test
    public void test17694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17694");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn((int) '4', (int) 'a');
        aSMifierMethodVisitor0.visitTypeInsn(8, "");
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierMethodVisitor0.visitAnnotation("L943959020", false);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMaxs(18, 29);
        org.junit.Assert.assertNotNull(annotationVisitor16);
    }

    @Test
    public void test17695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17695");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter21.print(false);
        printWriter21.println((long) (-889275714));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter21);
        printWriter21.println("L1669980843");
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter21);
        printWriter59.print('a');
        printWriter59.println("L2117337292");
        printWriter59.println((long) 524298);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
    }

    @Test
    public void test17696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17696");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        java.io.PrintWriter printWriter21 = printWriter1.append(' ');
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter24.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter24.visitAnnotation("hi!", false);
        classWriter24.visitOuterClass("hi!", "", "hi!");
        classWriter24.visitEnd();
        java.lang.String[] strArray45 = new java.lang.String[] { "L61669440", "L666971223", "L1434348811", "L1715840275" };
        classWriter24.visit(3, (int) (short) 10, "L1441782014", "L326432149", "hi!", strArray45);
        java.io.PrintWriter printWriter47 = printWriter1.printf("L601661571", (java.lang.Object[]) strArray45);
        printWriter1.flush();
        java.io.PrintWriter printWriter50 = printWriter1.append((java.lang.CharSequence) "L448733331");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor51 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.print(' ');
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(printWriter50);
    }

    @Test
    public void test17697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17697");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        printWriter1.println(true);
        printWriter1.println(false);
        java.io.PrintWriter printWriter25 = printWriter1.append((java.lang.CharSequence) "L1669980843");
        java.lang.Object obj26 = null;
        printWriter25.println(obj26);
        java.util.Locale locale28 = null;
        java.lang.Object[] objArray30 = null;
        java.io.PrintWriter printWriter31 = printWriter25.format(locale28, "", objArray30);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter39.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classWriter39.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor51 = classWriter39.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray52 = classWriter39.toByteArray();
        org.mockito.asm.ByteVector byteVector55 = byteVector35.putByteArray(byteArray52, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader56 = new org.mockito.asm.ClassReader(byteArray52);
        long long58 = classReader56.readLong((int) (byte) 100);
        long long60 = classReader56.readLong((int) (byte) 10);
        java.lang.String[] strArray61 = classReader56.getInterfaces();
        int int63 = classReader56.readInt(0);
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter(classReader56, (int) '4');
        byte[] byteArray66 = classReader56.b;
        printWriter25.print((java.lang.Object) byteArray66);
        org.mockito.asm.ByteVector byteVector69 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector73 = byteVector69.putByte(2);
        org.mockito.asm.ByteVector byteVector75 = byteVector69.putLong((long) 7);
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putUTF8("L1418438756");
        org.mockito.asm.ByteVector byteVector79 = byteVector75.putLong(0L);
        org.mockito.asm.ByteVector byteVector81 = byteVector75.putInt((int) (byte) 0);
        printWriter25.println((java.lang.Object) byteVector75);
        java.io.PrintWriter printWriter84 = new java.io.PrintWriter("hi!");
        char[] charArray91 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter84.print(charArray91);
        printWriter25.print(charArray91);
        printWriter25.print((double) 7298486125984967010L);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(printWriter25);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 8532477865490146625L + "'", long58 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 72057598333118569L + "'", long60 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-889275714) + "'", int63 == (-889275714));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17698");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray15 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor17 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor17.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label23 = null;
        int[] intArray25 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor17.visitLookupSwitchInsn(label23, intArray25, labelArray26);
        aSMifierMethodVisitor0.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray15, (int) 'a', (java.lang.Object[]) labelArray26);
        aSMifierMethodVisitor0.visitInsn(0);
        java.util.List list31 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label42 = null;
        aSMifierMethodVisitor32.visitLineNumber((int) (byte) 10, label42);
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierMethodVisitor32.visitAnnotation("hi!", true);
        aSMifierMethodVisitor32.visitIntInsn((int) '4', (int) 'a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor51 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor51.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor51.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label61 = null;
        aSMifierMethodVisitor51.visitLineNumber((int) (byte) 10, label61);
        org.mockito.asm.Label label65 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor66 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor66.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label72 = null;
        int[] intArray74 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray75 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor66.visitLookupSwitchInsn(label72, intArray74, labelArray75);
        aSMifierMethodVisitor51.visitTableSwitchInsn((int) (byte) 0, 51966, label65, labelArray75);
        org.mockito.asm.Label label78 = null;
        aSMifierMethodVisitor51.visitLabel(label78);
        org.mockito.asm.Label label80 = new org.mockito.asm.Label();
        aSMifierMethodVisitor51.visitLabel(label80);
        aSMifierMethodVisitor32.visitJumpInsn((int) (short) 10, label80);
        aSMifierMethodVisitor0.visitLabel(label80);
        aSMifierMethodVisitor0.visitVarInsn(10, (int) (short) 10);
        aSMifierMethodVisitor0.visitInsn((int) (short) 100);
        aSMifierMethodVisitor0.visitInsn(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor94 = aSMifierMethodVisitor0.visitParameterAnnotation(110, "L20866424", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor96 = annotationVisitor94.visitArray("L296208662");
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(attributeArray15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1]");
        org.junit.Assert.assertNotNull(labelArray26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1]");
        org.junit.Assert.assertNotNull(labelArray75);
        org.junit.Assert.assertNotNull(annotationVisitor94);
        org.junit.Assert.assertNotNull(annotationVisitor96);
    }

    @Test
    public void test17699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17699");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn((int) '4', (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (-889275714));
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor16);
    }

    @Test
    public void test17700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17700");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L1845262982");
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter("hi!");
        printWriter3.print((-889275714));
        boolean boolean6 = printWriter3.checkError();
        printWriter3.print((double) 14);
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter("hi!");
        printWriter10.print((int) 'a');
        printWriter10.println("");
        java.io.PrintWriter printWriter15 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor16 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        aSMifierClassVisitor16.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor16.visitAnnotation("", false);
        printWriter10.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        java.io.PrintWriter printWriter28 = printWriter10.append(' ');
        printWriter10.println(true);
        java.io.PrintWriter printWriter32 = new java.io.PrintWriter("hi!");
        char[] charArray39 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter32.print(charArray39);
        printWriter10.print(charArray39);
        printWriter3.write(charArray39);
        printWriter1.print(charArray39);
        printWriter1.flush();
        java.io.PrintWriter printWriter46 = printWriter1.append('#');
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter1.flush();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter46);
    }

    @Test
    public void test17701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17701");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L1749641217");
        printWriter1.write(97);
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter("hi!");
        printWriter5.println("hi!");
        printWriter5.close();
        printWriter5.print(13);
        printWriter5.println(false);
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("hi!");
        printWriter14.print((int) 'a');
        printWriter14.println("");
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        aSMifierClassVisitor20.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor20.visitAnnotation("", false);
        printWriter14.print((java.lang.Object) false);
        printWriter14.print((double) 10.0f);
        java.io.PrintWriter printWriter32 = new java.io.PrintWriter((java.io.Writer) printWriter14);
        printWriter32.print((long) 1);
        printWriter32.print('#');
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter("hi!");
        printWriter38.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor41.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label47 = null;
        int[] intArray49 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor41.visitLookupSwitchInsn(label47, intArray49, labelArray50);
        java.util.List list52 = aSMifierMethodVisitor41.getText();
        printWriter38.println((java.lang.Object) list52);
        printWriter38.print((double) 10L);
        printWriter38.println(false);
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("hi!");
        printWriter59.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        printWriter59.print(0.0d);
        java.io.PrintWriter printWriter66 = new java.io.PrintWriter("hi!");
        char[] charArray73 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter66.print(charArray73);
        printWriter59.write(charArray73);
        printWriter38.print(charArray73);
        printWriter32.print(charArray73);
        printWriter5.write(charArray73, (int) (short) 13, 0);
        // The following exception was thrown during execution in test generation
        try {
            printWriter1.write(charArray73, 118, (int) (short) 18798);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1]");
        org.junit.Assert.assertNotNull(labelArray50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17702");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor32.visitLabel(label52);
        printWriter31.println((java.lang.Object) label52);
        java.io.PrintWriter printWriter56 = new java.io.PrintWriter((java.io.Writer) printWriter31, false);
        printWriter56.print((long) 17);
        java.io.PrintWriter printWriter60 = printWriter56.append('a');
        printWriter60.print('4');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter66 = printWriter60.append((java.lang.CharSequence) "L1661274428", 1536, (int) (short) -16896);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -18432");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(printWriter60);
    }

    @Test
    public void test17703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17703");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        printWriter1.write("");
        java.io.PrintWriter printWriter13 = printWriter1.append('#');
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter((java.io.Writer) printWriter13);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("hi!");
        printWriter16.print((int) 'a');
        printWriter16.println("");
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        aSMifierClassVisitor22.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor22.visitAnnotation("", false);
        printWriter16.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter16);
        java.io.PrintWriter printWriter34 = printWriter16.append(' ');
        java.io.PrintWriter printWriter36 = printWriter16.append(' ');
        printWriter36.println();
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter("hi!");
        printWriter39.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter39);
        printWriter39.print(0.0d);
        printWriter39.println();
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("hi!");
        printWriter47.print((int) 'a');
        printWriter47.println("");
        printWriter47.print((float) 590080L);
        java.lang.Object[] objArray55 = null;
        java.io.PrintWriter printWriter56 = printWriter47.printf("hi!", objArray55);
        printWriter56.println('a');
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter56);
        printWriter59.print(false);
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter("hi!");
        printWriter63.print((-889275714));
        printWriter63.println((int) (short) 256);
        printWriter63.print((long) 1);
        java.io.PrintWriter printWriter71 = new java.io.PrintWriter("hi!");
        printWriter71.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor74 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter71);
        java.io.PrintWriter printWriter76 = printWriter71.append('#');
        printWriter76.println((double) 51966);
        char[] charArray85 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter76.write(charArray85);
        printWriter63.print(charArray85);
        printWriter59.println(charArray85);
        printWriter39.println(charArray85);
        printWriter36.println(charArray85);
        // The following exception was thrown during execution in test generation
        try {
            printWriter13.write(charArray85, 114, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(printWriter13);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(printWriter76);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[ , a,  , #, #, a]");
    }

    @Test
    public void test17704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17704");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list12 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor14 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor14.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor14.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor14.visitMaxs((int) (short) 0, 1);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor14);
        aSMifierMethodVisitor0.visitFieldInsn(14, "L142696279", "L61669440", "");
        aSMifierMethodVisitor0.visitInsn((int) '#');
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1715840275", 24942);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "L967033583");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor40 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor40.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor40.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor40.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor40.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierMethodVisitor40.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label60 = new org.mockito.asm.Label();
        aSMifierMethodVisitor40.visitLabel(label60);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor62 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor62.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor62.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor62.visitIincInsn(1, 0);
        org.mockito.asm.Label label74 = null;
        aSMifierMethodVisitor62.visitLabel(label74);
        label60.info = aSMifierMethodVisitor62;
        aSMifierMethodVisitor0.visitLabel(label60);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor82 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 24942, "L1320473481", false);
        aSMifierMethodVisitor0.visitVarInsn(118, (int) (short) 26995);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1296855558", 262144);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitMethodInsn(1768910451, "", "L964262760", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(annotationVisitor82);
    }

    @Test
    public void test17705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17705");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitParameterAnnotation((-1), "", false);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((-889275714));
        java.util.Locale locale24 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor28.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label34 = null;
        int[] intArray36 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray37 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor28.visitLookupSwitchInsn(label34, intArray36, labelArray37);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        aSMifierMethodVisitor26.visitLookupSwitchInsn(label27, intArray36, labelArray48);
        java.io.PrintWriter printWriter51 = printWriter21.format(locale24, "hi!", (java.lang.Object[]) labelArray48);
        printWriter21.print(false);
        printWriter21.println((long) (-889275714));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter21);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter((java.io.Writer) printWriter21);
        java.io.PrintWriter printWriter58 = new java.io.PrintWriter((java.io.Writer) printWriter21);
        printWriter58.print("L972180261");
        printWriter58.flush();
        printWriter58.print("L246301320");
        java.io.PrintWriter printWriter65 = printWriter58.append((java.lang.CharSequence) "L1289682213");
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1]");
        org.junit.Assert.assertNotNull(labelArray37);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(printWriter51);
        org.junit.Assert.assertNotNull(printWriter65);
    }

    @Test
    public void test17706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17706");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        java.io.PrintWriter printWriter21 = printWriter1.append(' ');
        printWriter1.println(16779859);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor24 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor24.visitAnnotation("L1587148073", true);
        aSMifierClassVisitor24.visitSource("", "L1450497477");
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test17707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17707");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter7.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter7.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter7.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray20 = classWriter7.toByteArray();
        org.mockito.asm.ByteVector byteVector23 = byteVector3.putByteArray(byteArray20, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray20);
        long long26 = classReader24.readLong((int) (byte) 100);
        long long28 = classReader24.readLong((int) (byte) 10);
        java.lang.String[] strArray29 = classReader24.getInterfaces();
        int int31 = classReader24.readInt(0);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(classReader24, (int) '4');
        classWriter33.visitOuterClass("L2113189186", "hi!", "L1669980843");
        byte[] byteArray38 = classWriter33.toByteArray();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor43 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor43.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor43.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor43.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor43.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor43.visitFieldInsn(6, "L326432149", "L1434348811", "");
        org.mockito.asm.FieldVisitor fieldVisitor65 = classWriter33.visitField((int) (byte) 0, "L601661571", "L454715523", "L601661571", (java.lang.Object) "L326432149");
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = classWriter33.visitAnnotation("L1691870655", true);
        int int70 = classWriter33.newUTF8("");
        classWriter33.visitInnerClass("L2072201856", "L943959020", "", 0);
        int int78 = classWriter33.newNameType("L1321861150", "L1289682213");
        int int83 = classWriter33.newMethod("L752233668", "L1003926609", "L601058011", false);
        int int87 = classWriter33.newField("", "L911973346", "L1004720247");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8532477865490146625L + "'", long26 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 72057598333118569L + "'", long28 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-889275714) + "'", int31 == (-889275714));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 11, 76, 50, 49, 49, 51, 49, 56, 57, 49, 56, 54, 7, 0, 9, 1, 0, 11, 76, 49, 54, 54, 57, 57, 56, 48, 56, 52, 51, 12, 0, 2, 0, 11, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 13, 0, 0, 0, 4, 0, 10, 0, 12]");
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 25 + "'", int78 == 25);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 31 + "'", int83 == 31);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 36 + "'", int87 == 36);
    }

    @Test
    public void test17708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17708");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitInsn(10);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 0, "L1703143512", "hi!", "L799304101");
        aSMifierMethodVisitor0.visitMethodInsn((int) (short) 0, "L139692246", "L1669980843", "L1749641217");
        org.mockito.asm.Label label14 = null;
        aSMifierMethodVisitor0.visitLineNumber((-21316096), label14);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("L454715523");
        java.util.Locale locale18 = null;
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor24 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor24.visitAnnotation("", false);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter39.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classWriter39.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor51 = classWriter39.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray52 = classWriter39.toByteArray();
        org.mockito.asm.ByteVector byteVector55 = byteVector35.putByteArray(byteArray52, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader56 = new org.mockito.asm.ClassReader(byteArray52);
        long long58 = classReader56.readLong((int) (byte) 100);
        int int60 = classReader56.readUnsignedShort((int) (short) 0);
        java.lang.String[] strArray61 = classReader56.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor24.visitMethod(0, "hi!", "L994489370", "hi!", strArray61);
        java.io.PrintWriter printWriter63 = printWriter17.format(locale18, "L1715840275", (java.lang.Object[]) strArray61);
        java.io.PrintWriter printWriter65 = new java.io.PrintWriter((java.io.Writer) printWriter17, false);
        printWriter17.write("L598840791");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "L598840791");
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 8532477865490146625L + "'", long58 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 51966 + "'", int60 == 51966);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(printWriter63);
    }

    @Test
    public void test17709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17709");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        printWriter1.write("");
        printWriter1.println((double) (short) 100);
        printWriter1.println((float) (-1107296256));
        printWriter1.println();
        printWriter1.close();
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.println(true);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter21.println(true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
    }

    @Test
    public void test17710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17710");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print(false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor21 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.println((float) 590080L);
        printWriter1.print((float) 4);
        printWriter1.println();
        char[] charArray29 = new char[] { '#', '4' };
        printWriter1.println(charArray29);
        printWriter1.print((long) 339);
        java.io.PrintWriter printWriter34 = printWriter1.append((java.lang.CharSequence) "L721189988");
        java.io.PrintWriter printWriter36 = printWriter34.append('a');
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, 4]");
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(printWriter36);
    }

    @Test
    public void test17711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17711");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        java.lang.Object obj25 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj25);
        aSMifierMethodVisitor0.visitVarInsn(2, 256);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("hi!");
        printWriter31.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor34 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor34.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label40 = null;
        int[] intArray42 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray43 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor34.visitLookupSwitchInsn(label40, intArray42, labelArray43);
        java.util.List list45 = aSMifierMethodVisitor34.getText();
        printWriter31.println((java.lang.Object) list45);
        printWriter31.write((-889275714));
        java.io.PrintWriter printWriter49 = new java.io.PrintWriter((java.io.Writer) printWriter31);
        printWriter31.println((double) (-91551935198396416L));
        printWriter31.println("L1669980843");
        aSMifierMethodVisitor0.print(printWriter31);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierMethodVisitor0.visitAnnotation("L697359787", false);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitIntInsn((int) (short) 25857, (int) (short) 29782);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1]");
        org.junit.Assert.assertNotNull(labelArray43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(annotationVisitor57);
    }

    @Test
    public void test17712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17712");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.print((float) 590080L);
        java.lang.Object[] objArray9 = null;
        java.io.PrintWriter printWriter10 = printWriter1.printf("hi!", objArray9);
        java.util.Locale locale11 = null;
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("hi!");
        printWriter14.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        java.io.PrintWriter printWriter19 = printWriter14.append('#');
        printWriter19.println((double) 51966);
        char[] charArray28 = new char[] { ' ', 'a', ' ', '#', '#', 'a' };
        printWriter19.write(charArray28);
        java.util.Locale locale30 = null;
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter39.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classWriter39.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor51 = classWriter39.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray52 = classWriter39.toByteArray();
        org.mockito.asm.ByteVector byteVector55 = byteVector35.putByteArray(byteArray52, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader56 = new org.mockito.asm.ClassReader(byteArray52);
        long long58 = classReader56.readLong((int) (byte) 100);
        int int60 = classReader56.readUnsignedShort((int) (short) 0);
        java.lang.String[] strArray61 = classReader56.getInterfaces();
        java.io.PrintWriter printWriter62 = printWriter19.format(locale30, "L1434348811", (java.lang.Object[]) strArray61);
        java.io.PrintWriter printWriter63 = printWriter1.format(locale11, "L1555790481", (java.lang.Object[]) strArray61);
        java.io.PrintWriter printWriter65 = new java.io.PrintWriter((java.io.Writer) printWriter63, false);
        printWriter65.print('#');
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " a ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " a ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , a,  , #, #, a]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 8532477865490146625L + "'", long58 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 51966 + "'", int60 == 51966);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(printWriter63);
    }

    @Test
    public void test17713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17713");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("L1004430080");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor2 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.write(28);
    }

    @Test
    public void test17714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17714");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte(2);
        annotationVisitor12.visit("", (java.lang.Object) byteVector15);
        org.mockito.asm.ByteVector byteVector22 = byteVector15.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector15.putByte(3);
        org.mockito.asm.ByteVector byteVector26 = byteVector15.putByte((int) (short) 256);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) '#');
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) (short) -1);
        classWriter30.visitInnerClass("L215000262", "L575352164", "L1103251756", (int) '4');
        byte[] byteArray36 = classWriter30.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector39 = byteVector28.putByteArray(byteArray36, 4, 28275);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 10, 76, 50, 49, 53, 48, 48, 48, 50, 54, 50, 7, 0, 1, 1, 0, 10, 76, 53, 55, 53, 51, 53, 50, 49, 54, 52, 7, 0, 3, 1, 0, 11, 76, 49, 49, 48, 51, 50, 53, 49, 55, 53, 54, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 10, 0, 1, 0, 2, 0, 4, 0, 5, 0, 52]");
    }

    @Test
    public void test17715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17715");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        int[] intArray8 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray9 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label6, intArray8, labelArray9);
        java.util.List list11 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '4', "", false);
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 0, (int) (short) 30313);
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierMethodVisitor0.visitAnnotation("", false);
        java.util.List list22 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitTypeInsn((int) (byte) 1, "L237245406");
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierMethodVisitor0.visitParameterAnnotation(254, "L78149900", false);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L897124199", 14);
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = annotationVisitor34.visitAnnotation("L909438963", "L992490396");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(labelArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
    }

    @Test
    public void test17716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17716");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor1.visit(2, (int) (byte) 0, "", "", "", strArray10);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("L1691870655", "L96121905", "L994489370");
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        printWriter24.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        java.io.PrintWriter printWriter29 = printWriter24.append('#');
        printWriter29.print((float) ' ');
        printWriter29.println('4');
        java.util.Locale locale34 = null;
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter43.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter43.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter43.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray56 = classWriter43.toByteArray();
        org.mockito.asm.ByteVector byteVector59 = byteVector39.putByteArray(byteArray56, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader60 = new org.mockito.asm.ClassReader(byteArray56);
        long long62 = classReader60.readLong((int) (byte) 100);
        long long64 = classReader60.readLong((int) (byte) 10);
        java.lang.String[] strArray65 = classReader60.getInterfaces();
        int int67 = classReader60.readByte((int) '#');
        long long69 = classReader60.readLong(4);
        int int71 = classReader60.readInt((int) (short) 9);
        long long73 = classReader60.readLong((int) '4');
        java.lang.String str74 = classReader60.getSuperName();
        int int76 = classReader60.readByte((int) (byte) 1);
        org.mockito.asm.ClassWriter classWriter78 = new org.mockito.asm.ClassWriter(classReader60, 0);
        java.lang.String[] strArray79 = classReader60.getInterfaces();
        java.io.PrintWriter printWriter80 = printWriter29.format(locale34, "L1962766465", (java.lang.Object[]) strArray79);
        org.mockito.asm.MethodVisitor methodVisitor81 = aSMifierClassVisitor1.visitMethod(57174305, "L121647365", "L1556230913", "L523399549", strArray79);
        org.mockito.asm.AnnotationVisitor annotationVisitor84 = aSMifierClassVisitor1.visitAnnotation("L1601501049", true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 8532477865490146625L + "'", long62 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 72057598333118569L + "'", long64 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 86 + "'", int67 == 86);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 590080L + "'", long69 == 590080L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 151060480 + "'", int71 == 151060480);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 72068947506459235L + "'", long73 == 72068947506459235L);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 254 + "'", int76 == 254);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(printWriter80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(annotationVisitor84);
    }

    @Test
    public void test17717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17717");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print('4');
        printWriter1.print("");
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        printWriter24.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor27.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label33 = null;
        int[] intArray35 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray36 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor27.visitLookupSwitchInsn(label33, intArray35, labelArray36);
        java.util.List list38 = aSMifierMethodVisitor27.getText();
        printWriter24.println((java.lang.Object) list38);
        printWriter24.print((double) 10L);
        printWriter24.print(false);
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor45.visit(2, (int) (byte) 0, "", "", "", strArray54);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor45.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor45.visitAnnotation("hi!", false);
        printWriter24.println((java.lang.Object) aSMifierClassVisitor45);
        printWriter1.print((java.lang.Object) printWriter24);
        printWriter1.print((double) (short) 1);
        printWriter1.print("L454715523");
        java.io.PrintWriter printWriter69 = printWriter1.append('a');
        java.io.PrintWriter printWriter71 = printWriter1.append('4');
        printWriter1.print((long) (short) 22113);
        printWriter1.println('a');
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1]");
        org.junit.Assert.assertNotNull(labelArray36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printWriter71);
    }

    @Test
    public void test17718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17718");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor4 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        printWriter1.print(0.0d);
        printWriter1.print((float) (-3819410108757049344L));
        printWriter1.write(13);
        printWriter1.flush();
        printWriter1.print((long) ' ');
        printWriter1.println('#');
    }

    @Test
    public void test17719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17719");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        printWriter1.print((float) 590080L);
        java.lang.Object[] objArray9 = null;
        java.io.PrintWriter printWriter10 = printWriter1.printf("hi!", objArray9);
        printWriter10.println('a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor13.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierMethodVisitor13.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor13.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor13.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        aSMifierMethodVisitor13.visitLabel(label33);
        aSMifierMethodVisitor13.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor37.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor37.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierMethodVisitor37.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor37.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierMethodVisitor37.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label57 = new org.mockito.asm.Label();
        aSMifierMethodVisitor37.visitLabel(label57);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor59 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor59.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor59.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor59.visitIincInsn(1, 0);
        org.mockito.asm.Label label71 = null;
        aSMifierMethodVisitor59.visitLabel(label71);
        label57.info = aSMifierMethodVisitor59;
        aSMifierMethodVisitor13.visitLineNumber(24942, label57);
        java.lang.Object obj75 = label57.info;
        printWriter10.print((java.lang.Object) label57);
        printWriter10.print((float) 1125899906973699L);
        boolean boolean79 = printWriter10.checkError();
        org.junit.Assert.assertNotNull(printWriter10);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test17720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17720");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierMethodVisitor0.visitParameterAnnotation(25929, "L799304101", false);
        aSMifierMethodVisitor0.visitMethodInsn(136, "L137136720", "L464564430", "L2076399201");
        java.io.PrintWriter printWriter16 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter16);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor17.visit(2, (int) (byte) 0, "", "", "", strArray26);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor17.visitAnnotation("", false);
        aSMifierClassVisitor17.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor40 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor40.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor40.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor40.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor40.visitMultiANewArrayInsn("", (int) (short) 100);
        java.util.List list56 = aSMifierMethodVisitor40.text;
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor17.visitField((int) (byte) 1, "L1434348811", "hi!", "hi!", (java.lang.Object) aSMifierMethodVisitor40);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierMethodVisitor40.visitAnnotationDefault();
        aSMifierMethodVisitor40.visitInsn((int) (short) 1);
        aSMifierMethodVisitor40.visitTypeInsn(3, "L139692246");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor64 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor64.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label70 = null;
        int[] intArray72 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray73 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor64.visitLookupSwitchInsn(label70, intArray72, labelArray73);
        java.util.List list75 = aSMifierMethodVisitor64.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = aSMifierMethodVisitor64.visitParameterAnnotation((int) '4', "", false);
        aSMifierMethodVisitor64.visitVarInsn((int) (byte) 0, (int) (short) 30313);
        org.mockito.asm.Label label84 = new org.mockito.asm.Label();
        java.lang.Object obj85 = label84.info;
        java.lang.String str86 = label84.toString();
        aSMifierMethodVisitor64.visitLineNumber((int) '#', label84);
        java.lang.String str88 = label84.toString();
        aSMifierMethodVisitor40.visitLabel(label84);
        aSMifierMethodVisitor0.visitLabel(label84);
        java.lang.String str91 = label84.toString();
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1]");
        org.junit.Assert.assertNotNull(labelArray73);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(annotationVisitor79);
        org.junit.Assert.assertNull(obj85);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "L1214423432" + "'", str86, "L1214423432");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "L1214423432" + "'", str88, "L1214423432");
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "L1214423432" + "'", str91, "L1214423432");
    }

    @Test
    public void test17721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17721");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor10.visitSource("L799304101", "L326432149");
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitSource("L614568462", "L337574950");
        aSMifierClassVisitor10.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierClassVisitor10.visitAnnotation("L389484434", true);
        aSMifierClassVisitor10.visitEnd();
        aSMifierClassVisitor10.visitSource("L911891502", "L1047010670");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
    }

    @Test
    public void test17722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17722");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list12 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor14 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor14.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor14.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor14.visitMaxs((int) (short) 0, 1);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor14);
        aSMifierMethodVisitor0.visitFieldInsn(14, "L142696279", "L61669440", "");
        aSMifierMethodVisitor0.visitInsn((int) '#');
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L1715840275", 24942);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "L967033583");
        aSMifierMethodVisitor0.visitMaxs(17, 22113);
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter50.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classWriter50.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter50.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray63 = classWriter50.toByteArray();
        org.mockito.asm.ByteVector byteVector66 = byteVector46.putByteArray(byteArray63, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader67 = new org.mockito.asm.ClassReader(byteArray63);
        long long69 = classReader67.readLong((int) (byte) 100);
        long long71 = classReader67.readLong((int) (byte) 10);
        java.lang.String[] strArray72 = classReader67.getInterfaces();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) classReader67);
        int int74 = classReader67.getAccess();
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.FieldVisitor fieldVisitor82 = classWriter76.visitField((int) 'a', "", "", "", (java.lang.Object) (byte) 0);
        classWriter76.visitEnd();
        int int85 = classWriter76.newClass("");
        classWriter76.visitInnerClass("L142696279", "L326432149", "L142696279", 4);
        classWriter76.visitEnd();
        classWriter76.visitEnd();
        int int94 = classWriter76.newClass("L1556230913");
        // The following exception was thrown during execution in test generation
        try {
            classReader67.accept((org.mockito.asm.ClassVisitor) classWriter76, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51966");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 8532477865490146625L + "'", long69 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 72057598333118569L + "'", long71 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 9 + "'", int94 == 9);
    }

    @Test
    public void test17723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17723");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor4.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label10 = null;
        int[] intArray12 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor4.visitLookupSwitchInsn(label10, intArray12, labelArray13);
        java.util.List list15 = aSMifierMethodVisitor4.getText();
        printWriter1.println((java.lang.Object) list15);
        printWriter1.print((double) 10L);
        printWriter1.print(false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor21 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor26 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor26.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label32 = null;
        aSMifierMethodVisitor26.visitLabel(label32);
        aSMifierMethodVisitor26.visitFieldInsn((int) '4', "", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierMethodVisitor26.visitParameterAnnotation(0, "L666971223", false);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor21.visitField(8, "L994489370", "L1703143512", "L1434348811", (java.lang.Object) aSMifierMethodVisitor26);
        aSMifierClassVisitor21.visitEnd();
        aSMifierClassVisitor21.visitOuterClass("", "L911973346", "");
        aSMifierClassVisitor21.visitSource("L2112385861", "L389484434");
        aSMifierClassVisitor21.visitInnerClass("L1454236833", "L1004430080", "L659269359", (-1107296256));
        aSMifierClassVisitor21.visitOuterClass("L1761736395", "L845352536", "");
        aSMifierClassVisitor21.visitOuterClass("L55453359", "L503616188", "L143420361");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(fieldVisitor43);
    }

    @Test
    public void test17724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17724");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println((int) (short) 1);
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter36 = printWriter1.format("hi!", (java.lang.Object[]) strArray35);
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter37.print(14);
        printWriter37.println();
        printWriter37.print((long) 47806);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter51.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = classWriter51.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter51.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray64 = classWriter51.toByteArray();
        org.mockito.asm.ByteVector byteVector67 = byteVector47.putByteArray(byteArray64, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader68 = new org.mockito.asm.ClassReader(byteArray64);
        long long70 = classReader68.readLong((int) (byte) 100);
        long long72 = classReader68.readLong((int) (byte) 10);
        java.lang.String[] strArray73 = classReader68.getInterfaces();
        int int75 = classReader68.readByte((int) (short) 10);
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter(classReader68, 0);
        int int79 = classReader68.readByte((int) (short) 0);
        java.lang.String[] strArray80 = classReader68.getInterfaces();
        java.lang.String[] strArray81 = classReader68.getInterfaces();
        java.io.PrintWriter printWriter82 = printWriter37.format("L1634458015", (java.lang.Object[]) strArray81);
        printWriter37.print(3073);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 8532477865490146625L + "'", long70 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 72057598333118569L + "'", long72 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 202 + "'", int79 == 202);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(printWriter82);
    }

    @Test
    public void test17725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17725");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 100);
        org.mockito.asm.FieldVisitor fieldVisitor12 = aSMifierClassVisitor1.visitField(100, "hi!", "", "", (java.lang.Object) 100);
        aSMifierClassVisitor1.visitInnerClass("L1434348811", "", "", 2);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitOuterClass("L1438609464", "L1105153118", "L1689719368");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor29.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor29.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor29.visitLineNumber((int) (byte) 10, label39);
        aSMifierMethodVisitor29.visitMultiANewArrayInsn("", 0);
        aSMifierMethodVisitor29.visitFieldInsn(7, "L1434348811", "L1434348811", "L1434348811");
        aSMifierMethodVisitor29.visitMultiANewArrayInsn("L326432149", (int) (short) -1);
        aSMifierMethodVisitor29.visitTypeInsn(2, "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor55 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label56 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor57 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor57.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label63 = null;
        int[] intArray65 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray66 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor57.visitLookupSwitchInsn(label63, intArray65, labelArray66);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor68 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor68.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label74 = null;
        int[] intArray76 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray77 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor68.visitLookupSwitchInsn(label74, intArray76, labelArray77);
        aSMifierMethodVisitor55.visitLookupSwitchInsn(label56, intArray65, labelArray77);
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierMethodVisitor55.visitAnnotationDefault();
        aSMifierMethodVisitor29.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor55);
        aSMifierMethodVisitor55.visitIincInsn((int) (short) 872, 0);
        aSMifierMethodVisitor55.visitInsn(0);
        aSMifierMethodVisitor55.visitTypeInsn(5, "L1715840275");
        aSMifierMethodVisitor55.visitMultiANewArrayInsn("L1284973471", (int) (byte) 100);
        aSMifierMethodVisitor55.visitCode();
        org.mockito.asm.FieldVisitor fieldVisitor94 = aSMifierClassVisitor1.visitField(47806, "L1924143761", "L911973346", "L459227517", (java.lang.Object) aSMifierMethodVisitor55);
        org.mockito.asm.AnnotationVisitor annotationVisitor95 = aSMifierMethodVisitor55.visitAnnotationDefault();
        annotationVisitor95.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1]");
        org.junit.Assert.assertNotNull(labelArray66);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1]");
        org.junit.Assert.assertNotNull(labelArray77);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(fieldVisitor94);
        org.junit.Assert.assertNotNull(annotationVisitor95);
    }

    @Test
    public void test17726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17726");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte(2);
        annotationVisitor12.visit("", (java.lang.Object) byteVector15);
        org.mockito.asm.ByteVector byteVector22 = byteVector15.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector15.putByte(3);
        org.mockito.asm.ByteVector byteVector26 = byteVector15.putInt((-889275714));
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter34.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter34.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor46 = classWriter34.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray47 = classWriter34.toByteArray();
        org.mockito.asm.ByteVector byteVector50 = byteVector30.putByteArray(byteArray47, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray47);
        org.mockito.asm.ClassReader classReader52 = new org.mockito.asm.ClassReader(byteArray47);
        org.mockito.asm.ClassReader classReader53 = new org.mockito.asm.ClassReader(byteArray47);
        byte[] byteArray54 = classReader53.b;
        org.mockito.asm.ByteVector byteVector57 = byteVector26.putByteArray(byteArray54, 0, 5);
        org.mockito.asm.ClassReader classReader58 = new org.mockito.asm.ClassReader(byteArray54);
        org.mockito.asm.ClassReader classReader59 = new org.mockito.asm.ClassReader(byteArray54);
        byte[] byteArray60 = classReader59.b;
        int int62 = classReader59.readByte(6);
        java.lang.String str63 = classReader59.getSuperName();
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter(classReader59, (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = classWriter65.visitAnnotation("L834812042", false);
        org.mockito.asm.ByteVector byteVector74 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putUTF8("L61669440");
        org.mockito.asm.ByteVector byteVector80 = byteVector78.putLong((long) 24942);
        org.mockito.asm.ByteVector byteVector82 = byteVector78.putInt((int) (short) -17730);
        org.mockito.asm.ByteVector byteVector84 = byteVector78.putUTF8("");
        org.mockito.asm.ByteVector byteVector86 = byteVector78.putByte(16777217);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor87 = classWriter65.visitField(65792, "L650066291", "L876659615", "L1962374298", (java.lang.Object) byteVector78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ByteVector@69da52bb");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector86);
    }

    @Test
    public void test17727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17727");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        printWriter1.println(true);
        printWriter1.println(false);
        printWriter1.println();
        printWriter1.close();
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor26.visitInnerClass("", "L723576843", "", 16);
        aSMifierClassVisitor26.visitInnerClass("L104358438", "L119989099", "L1150302951", 123);
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierClassVisitor26.visitAnnotation("L519300220", false);
        aSMifierClassVisitor26.visitInnerClass("L111851498", "L1177558162", "L1228713414", (int) (short) -1);
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter("hi!");
        printWriter50.print((int) 'a');
        printWriter50.println("");
        printWriter50.print((float) 590080L);
        java.io.PrintWriter printWriter58 = new java.io.PrintWriter((java.io.Writer) printWriter50, true);
        printWriter58.println('a');
        printWriter58.print(9);
        printWriter58.print(118);
        boolean boolean65 = printWriter58.checkError();
        printWriter58.print((long) 4);
        java.io.PrintWriter printWriter69 = printWriter58.append((java.lang.CharSequence) "L1749641217");
        printWriter69.println((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor26.visitField(5, "L1852655365", "L1849458793", "L2048731948", (java.lang.Object) '4');
        fieldVisitor72.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(fieldVisitor72);
    }

    @Test
    public void test17728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17728");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitSource("L1669980843", "L1669980843");
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        java.lang.String[] strArray20 = null;
        org.mockito.asm.MethodVisitor methodVisitor21 = aSMifierClassVisitor15.visitMethod((-1), "", "hi!", "", strArray20);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter34.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter34.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor46 = classWriter34.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray47 = classWriter34.toByteArray();
        org.mockito.asm.ByteVector byteVector50 = byteVector30.putByteArray(byteArray47, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray47);
        long long53 = classReader51.readLong((int) (byte) 100);
        long long55 = classReader51.readLong((int) (byte) 10);
        java.lang.String[] strArray56 = classReader51.getInterfaces();
        int int58 = classReader51.readInt(0);
        int int59 = classReader51.getAccess();
        int int61 = classReader51.getItem(2);
        java.lang.String[] strArray62 = classReader51.getInterfaces();
        aSMifierClassVisitor15.visit(51966, (int) '4', "L2113189186", "", "L326432149", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor64 = aSMifierClassVisitor1.visitMethod((int) '4', "L666971223", "L326432149", "L666971223", strArray62);
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = methodVisitor64.visitParameterAnnotation(3841, "L1344346170", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = methodVisitor64.visitAnnotation("L169779857", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = methodVisitor64.visitAnnotationDefault();
        methodVisitor64.visitMaxs(254, 0);
        org.junit.Assert.assertNotNull(methodVisitor21);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 8532477865490146625L + "'", long53 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 72057598333118569L + "'", long55 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-889275714) + "'", int58 == (-889275714));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 14 + "'", int61 == 14);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertNotNull(annotationVisitor72);
    }

    @Test
    public void test17729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17729");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray15 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor17 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor17.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label23 = null;
        int[] intArray25 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray26 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor17.visitLookupSwitchInsn(label23, intArray25, labelArray26);
        aSMifierMethodVisitor0.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray15, (int) 'a', (java.lang.Object[]) labelArray26);
        aSMifierMethodVisitor0.visitInsn(0);
        java.util.List list31 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitVarInsn(24, 0);
        aSMifierMethodVisitor0.visitMaxs(225, (int) (short) 8451);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(attributeArray15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1]");
        org.junit.Assert.assertNotNull(labelArray26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test17730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17730");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.write("");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor35.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) 'a');
        aSMifierMethodVisitor35.visitLdcInsn((java.lang.Object) 'a');
        org.mockito.asm.Label label50 = null;
        int[] intArray56 = new int[] { (byte) 10, 4, (short) 10, (byte) 1, ' ' };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor57 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor57.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor57.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label67 = null;
        aSMifierMethodVisitor57.visitLineNumber((int) (byte) 10, label67);
        org.mockito.asm.Label label71 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor72 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor72.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label78 = null;
        int[] intArray80 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray81 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor72.visitLookupSwitchInsn(label78, intArray80, labelArray81);
        aSMifierMethodVisitor57.visitTableSwitchInsn((int) (byte) 0, 51966, label71, labelArray81);
        aSMifierMethodVisitor35.visitLookupSwitchInsn(label50, intArray56, labelArray81);
        java.io.PrintWriter printWriter85 = printWriter1.printf("L61669440", (java.lang.Object[]) labelArray81);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor86 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter88 = printWriter1.append(' ');
        printWriter1.println('#');
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 4, 10, 1, 32]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1]");
        org.junit.Assert.assertNotNull(labelArray81);
        org.junit.Assert.assertNotNull(printWriter85);
        org.junit.Assert.assertNotNull(printWriter88);
    }

    @Test
    public void test17731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17731");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitAnnotation("L1544572272", false);
        aSMifierMethodVisitor0.visitMethodInsn((int) (short) 1, "L767403187", "L911973346", "L994489370");
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitMaxs(26729, 15);
        java.util.List list29 = aSMifierMethodVisitor0.text;
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test17732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17732");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor19.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor19.visitTypeInsn((int) (short) 1, "hi!");
        java.util.List list31 = aSMifierMethodVisitor19.text;
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter35.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter35.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor47 = classWriter35.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter35.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor54 = classWriter35.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter60 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor61 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter60);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor61.visit(2, (int) (byte) 0, "", "", "", strArray70);
        classWriter35.visit((int) 'a', (int) '#', "", "", "hi!", strArray70);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor74 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor74.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label80 = null;
        int[] intArray82 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray83 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor74.visitLookupSwitchInsn(label80, intArray82, labelArray83);
        aSMifierMethodVisitor19.visitFrame((int) (byte) 1, (int) (byte) -1, (java.lang.Object[]) strArray70, (int) (short) 100, (java.lang.Object[]) labelArray83);
        classWriter1.visit((int) 'a', (int) (short) 30313, "hi!", "hi!", "", strArray70);
        int int88 = classWriter1.newUTF8("L2113189186");
        classWriter1.visitOuterClass("L2113189186", "L1715840275", "L1284973471");
        classWriter1.visitEnd();
        byte[] byteArray94 = classWriter1.toByteArray();
        int int96 = classWriter1.newClass("L1558544675");
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1]");
        org.junit.Assert.assertNotNull(labelArray83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 6 + "'", int88 == 6);
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 18 + "'", int96 == 18);
    }

    @Test
    public void test17733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17733");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn((int) '4', (int) 'a');
        aSMifierMethodVisitor0.visitTypeInsn(8, "");
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter15.visitOuterClass("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter15.visitAnnotation("", true);
        annotationVisitor22.visitEnd();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) annotationVisitor22);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor25 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor25.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor25.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierMethodVisitor25.visitAnnotation("", true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor38.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor38.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor38.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor38.visitAnnotation("hi!", false);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        aSMifierMethodVisitor38.visitLineNumber(10, label54);
        aSMifierMethodVisitor25.visitLineNumber(1, label54);
        aSMifierMethodVisitor0.visitLabel(label54);
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter("hi!");
        printWriter59.print((-889275714));
        java.util.Locale locale62 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor64 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label65 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor66 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor66.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label72 = null;
        int[] intArray74 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray75 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor66.visitLookupSwitchInsn(label72, intArray74, labelArray75);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor77 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor77.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label83 = null;
        int[] intArray85 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray86 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor77.visitLookupSwitchInsn(label83, intArray85, labelArray86);
        aSMifierMethodVisitor64.visitLookupSwitchInsn(label65, intArray74, labelArray86);
        java.io.PrintWriter printWriter89 = printWriter59.format(locale62, "hi!", (java.lang.Object[]) labelArray86);
        printWriter59.write("");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor92 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        java.io.PrintWriter printWriter94 = printWriter59.append((java.lang.CharSequence) "L821985585");
        printWriter94.print(65210);
        label54.info = printWriter94;
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1]");
        org.junit.Assert.assertNotNull(labelArray75);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1]");
        org.junit.Assert.assertNotNull(labelArray86);
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(printWriter94);
    }

    @Test
    public void test17734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17734");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Label label13 = null;
        int[] intArray20 = new int[] { 8, (short) -1, (-1), 4, 'a', 8 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor21 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor21.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor21.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierMethodVisitor21.visitParameterAnnotation((int) '#', "", false);
        org.mockito.asm.Attribute[] attributeArray36 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor38.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label44 = null;
        int[] intArray46 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray47 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor38.visitLookupSwitchInsn(label44, intArray46, labelArray47);
        aSMifierMethodVisitor21.visitFrame((int) '4', 4, (java.lang.Object[]) attributeArray36, (int) 'a', (java.lang.Object[]) labelArray47);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label13, intArray20, labelArray47);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("L174478886", 33);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter61.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = classWriter61.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor73 = classWriter61.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray74 = classWriter61.toByteArray();
        org.mockito.asm.ByteVector byteVector77 = byteVector57.putByteArray(byteArray74, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader78 = new org.mockito.asm.ClassReader(byteArray74);
        long long80 = classReader78.readLong((int) (byte) 100);
        long long82 = classReader78.readLong((int) (byte) 10);
        java.lang.String[] strArray83 = classReader78.getInterfaces();
        int int85 = classReader78.readByte((int) '#');
        org.mockito.asm.ClassWriter classWriter87 = new org.mockito.asm.ClassWriter(classReader78, 590080);
        org.mockito.asm.ClassWriter classWriter89 = new org.mockito.asm.ClassWriter(classReader78, 2);
        classWriter89.visitEnd();
        classWriter89.visitInnerClass("L1165266040", "L1276244777", "", 2);
        org.mockito.asm.AnnotationVisitor annotationVisitor98 = classWriter89.visitAnnotation("L1971845046", false);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) annotationVisitor98);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[8, -1, -1, 4, 97, 8]");
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(attributeArray36);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1]");
        org.junit.Assert.assertNotNull(labelArray47);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 8532477865490146625L + "'", long80 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 72057598333118569L + "'", long82 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 86 + "'", int85 == 86);
        org.junit.Assert.assertNotNull(annotationVisitor98);
    }

    @Test
    public void test17735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17735");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor27.visit(2, (int) (byte) 0, "", "", "", strArray36);
        classWriter1.visit((int) 'a', (int) '#', "", "", "hi!", strArray36);
        byte[] byteArray39 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader40 = new org.mockito.asm.ClassReader(byteArray39);
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("hi!");
        printWriter42.print((int) 'a');
        printWriter42.println("");
        printWriter42.print((float) 590080L);
        java.io.PrintWriter printWriter50 = new java.io.PrintWriter((java.io.Writer) printWriter42, true);
        printWriter42.print((float) (short) 30313);
        java.util.Locale locale53 = null;
        java.lang.Object[] objArray55 = null;
        java.io.PrintWriter printWriter56 = printWriter42.printf(locale53, "", objArray55);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter((java.io.Writer) printWriter42);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter57);
        classReader40.accept((org.mockito.asm.ClassVisitor) aSMifierClassVisitor58, (int) '#');
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter(classReader40, 116);
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter(classReader40, 0);
        int int66 = classWriter64.newUTF8("L1017243937");
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 13, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 4, 63, -128, 0, 0, 7, 0, 1, 7, 0, 2, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 35, 0, 5, 0, 6, 0, 3, 0, 6, 0, 5, 0, 5, 0, 2, 0, 0, 0, 1, 0, 1, 0, 2, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 2, 0, 2, -1, -1, 0, 2, 0, 1, 0, 3, 0, 7, 0, 0, 0, 2, 0, 4, 0, 9, 0, 0, 0, 0, 0, 8, 0, 0, 0, 2, 0, 2, 0, 0, 0, 4, 0, 8, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 13 + "'", int66 == 13);
    }

    @Test
    public void test17736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17736");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor2 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor2.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label8 = null;
        int[] intArray10 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor2.visitLookupSwitchInsn(label8, intArray10, labelArray11);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor13.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label19 = null;
        int[] intArray21 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor13.visitLookupSwitchInsn(label19, intArray21, labelArray22);
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label1, intArray10, labelArray22);
        aSMifierMethodVisitor0.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list30 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = aSMifierMethodVisitor0.visitAnnotation("L1434348811", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierMethodVisitor0.visitAnnotation("L1281777590", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitInsn(18);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierMethodVisitor0.visitAnnotation("L265725697", true);
        annotationVisitor43.visitEnd();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(labelArray11);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1]");
        org.junit.Assert.assertNotNull(labelArray22);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor43);
    }

    @Test
    public void test17737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17737");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        printWriter1.println(7);
        printWriter1.write("L834812042");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("hi!");
        printWriter42.print((int) 'a');
        printWriter42.println("");
        java.io.PrintWriter printWriter47 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter47);
        aSMifierClassVisitor48.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor48.visitAnnotation("", false);
        printWriter42.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        java.io.PrintWriter printWriter60 = printWriter42.append(' ');
        java.io.PrintWriter printWriter62 = printWriter42.append(' ');
        printWriter62.write(24942);
        printWriter62.print(false);
        java.lang.String[] strArray68 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.io.PrintWriter printWriter69 = printWriter62.format("L1518460396", (java.lang.Object[]) strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = aSMifierClassVisitor36.visitMethod(0, "L2026303857", "L1284973471", "L1716111915", strArray68);
        java.lang.Object obj75 = null;
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor36.visitField(100, "L543552110", "L1544572272", "L265725697", obj75);
        fieldVisitor76.visitEnd();
        fieldVisitor76.visitEnd();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(printWriter60);
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(fieldVisitor76);
    }

    @Test
    public void test17738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17738");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        char[] charArray8 = new char[] { '#', 'a', ' ', 'a', ' ', '#' };
        printWriter1.print(charArray8);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor10.visitAnnotation("L1691870655", true);
        java.lang.String[] strArray19 = null;
        aSMifierClassVisitor10.visit(19, 2305, "L1216476214", "L1532047758", "L1434348811", strArray19);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter33.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor45 = classWriter33.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray46 = classWriter33.toByteArray();
        org.mockito.asm.ByteVector byteVector49 = byteVector29.putByteArray(byteArray46, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader50 = new org.mockito.asm.ClassReader(byteArray46);
        long long52 = classReader50.readLong((int) (byte) 100);
        long long54 = classReader50.readLong((int) (byte) 10);
        short short56 = classReader50.readShort(1);
        java.lang.String[] strArray57 = classReader50.getInterfaces();
        aSMifierClassVisitor10.visit((int) (byte) 100, 7, "L1749641217", "L779142371", "L2099222213", strArray57);
        aSMifierClassVisitor10.visitInnerClass("L1083567291", "L1962374298", "L392705655", 26913);
        aSMifierClassVisitor10.visitOuterClass("L2109881748", "L1829941255", "L1111733530");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , a,  , #]");
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 8532477865490146625L + "'", long52 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 72057598333118569L + "'", long54 == 72057598333118569L);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) -326 + "'", short56 == (short) -326);
        org.junit.Assert.assertNotNull(strArray57);
    }

    @Test
    public void test17739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17739");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitVarInsn(2, (int) (byte) -1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 100, "");
        aSMifierMethodVisitor0.visitInsn(8);
        java.util.List list9 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotation("", false);
        aSMifierMethodVisitor0.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitFieldInsn(1952543849, "L1137971275", "L1492849950", "L397123845");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test17740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17740");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitMaxs((int) (short) 0, 1);
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "", "hi!", label15, label16, 3);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitInsn(16);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierMethodVisitor0.visitParameterAnnotation(115, "L1862425937", true);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test17741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17741");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        printWriter1.write("");
        printWriter1.write("L994489370");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor8 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter("hi!");
        printWriter15.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter31.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter31.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter31.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray44 = classWriter31.toByteArray();
        org.mockito.asm.ByteVector byteVector47 = byteVector27.putByteArray(byteArray44, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader48 = new org.mockito.asm.ClassReader(byteArray44);
        long long50 = classReader48.readLong((int) (byte) 100);
        long long52 = classReader48.readLong((int) (byte) 10);
        java.lang.String[] strArray53 = classReader48.getInterfaces();
        aSMifierClassVisitor18.visit((int) (byte) 1, (-1), "", "hi!", "", strArray53);
        java.lang.String[] strArray59 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor60 = aSMifierClassVisitor18.visitMethod((int) (short) 0, "L459227517", "L1715840275", "L96121905", strArray59);
        aSMifierClassVisitor8.visit((int) (short) 100, 2, "L326432149", "L1434348811", "hi!", strArray59);
        aSMifierClassVisitor8.visitInnerClass("L821985585", "L555214098", "L575352164", 202);
        aSMifierClassVisitor8.visitEnd();
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter((int) '4');
        int int78 = classWriter73.newMethod("hi!", "L326432149", "hi!", true);
        int int83 = classWriter73.newMethod("L1289682213", "L1853824624", "L1479479862", true);
        org.mockito.asm.FieldVisitor fieldVisitor84 = aSMifierClassVisitor8.visitField(316, "L97937772", "L326432149", "L290335602", (java.lang.Object) "L1479479862");
        aSMifierClassVisitor8.visitSource("L337574950", "L77953979");
        java.util.List list88 = aSMifierClassVisitor8.text;
        aSMifierClassVisitor8.visitEnd();
        aSMifierClassVisitor8.visitEnd();
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 8532477865490146625L + "'", long50 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 72057598333118569L + "'", long52 == 72057598333118569L);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 11 + "'", int83 == 11);
        org.junit.Assert.assertNotNull(fieldVisitor84);
        org.junit.Assert.assertNotNull(list88);
    }

    @Test
    public void test17742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17742");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor1.visit(2, (int) (byte) 0, "", "", "", strArray10);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor24 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor24.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor24.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierMethodVisitor24.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor24.visitMultiANewArrayInsn("", (int) (short) 100);
        java.util.List list40 = aSMifierMethodVisitor24.text;
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor1.visitField((int) (byte) 1, "L1434348811", "hi!", "hi!", (java.lang.Object) aSMifierMethodVisitor24);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierMethodVisitor24.visitAnnotationDefault();
        aSMifierMethodVisitor24.visitInsn((int) (short) 1);
        java.util.List list45 = aSMifierMethodVisitor24.getText();
        aSMifierMethodVisitor24.visitMultiANewArrayInsn("L2072201856", 22);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor49 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label50 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor51 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor51.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label57 = null;
        int[] intArray59 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray60 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor51.visitLookupSwitchInsn(label57, intArray59, labelArray60);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor62 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor62.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label68 = null;
        int[] intArray70 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray71 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor62.visitLookupSwitchInsn(label68, intArray70, labelArray71);
        aSMifierMethodVisitor49.visitLookupSwitchInsn(label50, intArray59, labelArray71);
        aSMifierMethodVisitor49.visitFieldInsn((int) (short) 100, "", "", "");
        java.util.List list79 = aSMifierMethodVisitor49.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierMethodVisitor49.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = aSMifierMethodVisitor49.visitAnnotation("L1434348811", false);
        aSMifierMethodVisitor49.visitMultiANewArrayInsn("L142696279", (-889275714));
        aSMifierMethodVisitor49.visitIntInsn(16, 203);
        org.mockito.asm.AnnotationVisitor annotationVisitor93 = aSMifierMethodVisitor49.visitParameterAnnotation(7, "L2076399201", false);
        aSMifierMethodVisitor24.visitLdcInsn((java.lang.Object) "L2076399201");
        aSMifierMethodVisitor24.visitFieldInsn(105, "L679540244", "L169779857", "L1787587171");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1]");
        org.junit.Assert.assertNotNull(labelArray60);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1]");
        org.junit.Assert.assertNotNull(labelArray71);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(annotationVisitor83);
        org.junit.Assert.assertNotNull(annotationVisitor93);
    }

    @Test
    public void test17743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17743");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter7.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter7.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter7.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray20 = classWriter7.toByteArray();
        org.mockito.asm.ByteVector byteVector23 = byteVector3.putByteArray(byteArray20, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray20);
        long long26 = classReader24.readLong((int) (byte) 100);
        long long28 = classReader24.readLong((int) (byte) 10);
        int int30 = classReader24.readUnsignedShort(0);
        int int32 = classReader24.readUnsignedShort(3);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(classReader24, (int) (short) 30313);
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter("hi!");
        printWriter36.print((-889275714));
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label45 = null;
        int[] intArray47 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor39.visitLookupSwitchInsn(label45, intArray47, labelArray48);
        java.util.List list50 = aSMifierMethodVisitor39.getText();
        printWriter36.println((java.lang.Object) list50);
        printWriter36.print((double) 10L);
        printWriter36.println(false);
        int int56 = classWriter34.newConst((java.lang.Object) false);
        classWriter34.visitOuterClass("L2099222213", "L407895089", "L454715523");
        int int63 = classWriter34.newNameType("L1931374313", "L1829941255");
        classWriter34.visitEnd();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8532477865490146625L + "'", long26 == 8532477865490146625L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 72057598333118569L + "'", long28 == 72057598333118569L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 51966 + "'", int30 == 51966);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48640 + "'", int32 == 48640);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 17 + "'", int63 == 17);
    }

    @Test
    public void test17744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17744");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label10);
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label21 = null;
        int[] intArray23 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor15.visitLookupSwitchInsn(label21, intArray23, labelArray24);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 0, 51966, label14, labelArray24);
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor0.visitLabel(label27);
        aSMifierMethodVisitor0.visitInsn(0);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter32.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter32.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor44 = classWriter32.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray45 = classWriter32.toByteArray();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) byteArray45);
        aSMifierMethodVisitor0.visitIincInsn(0, (int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor0.visitAnnotation("L1105153118", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitFieldInsn(118, "L1430933554", "L659269359", "L1461066057");
        aSMifierMethodVisitor0.visitMaxs(1818575214, (int) (short) 256);
        aSMifierMethodVisitor0.visitEnd();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1]");
        org.junit.Assert.assertNotNull(labelArray24);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor53);
    }

    @Test
    public void test17745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17745");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor32.visitLabel(label52);
        printWriter31.println((java.lang.Object) label52);
        printWriter31.print((int) (byte) 100);
        printWriter31.println(false);
        printWriter31.println();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
    }

    @Test
    public void test17746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17746");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        int[] intArray8 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray9 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label6, intArray8, labelArray9);
        aSMifierMethodVisitor0.visitTypeInsn((int) 'a', "L237245406");
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor0.visitLineNumber((-889275714), label15);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(labelArray9);
    }

    @Test
    public void test17747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17747");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor1.visit(2, (int) (byte) 0, "", "", "", strArray10);
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter17.visitOuterClass("hi!", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor1.visitField((int) (byte) 10, "", "L1434348811", "", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierClassVisitor1.visitAnnotation("L1434348811", true);
        aSMifierClassVisitor1.visitOuterClass("L801849928", "L1486003347", "L503616188");
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("hi!");
        printWriter35.print((int) 'a');
        printWriter35.println("");
        printWriter35.flush();
        java.io.PrintWriter printWriter42 = printWriter35.append((java.lang.CharSequence) "L61669440");
        printWriter35.write("L2113189186");
        java.io.PrintWriter printWriter46 = new java.io.PrintWriter((java.io.Writer) printWriter35, true);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor1.visitField(16, "L1150302951", "L1931374313", "L919036820", (java.lang.Object) printWriter46);
        printWriter46.println((-1.0d));
        char[] charArray50 = null;
        // The following exception was thrown during execution in test generation
        try {
            printWriter46.write(charArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(fieldVisitor47);
    }

    @Test
    public void test17748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17748");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label6 = null;
        int[] intArray8 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray9 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor0.visitLookupSwitchInsn(label6, intArray8, labelArray9);
        java.util.List list11 = aSMifierMethodVisitor0.getText();
        aSMifierMethodVisitor0.visitMethodInsn((int) (byte) 100, "L326432149", "", "L142696279");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor18 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor18.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) 'a');
        aSMifierMethodVisitor18.visitLdcInsn((java.lang.Object) 'a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor34 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor34.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor34.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor34.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.Label label49 = null;
        org.mockito.asm.Label label50 = null;
        aSMifierMethodVisitor34.visitLocalVariable("hi!", "hi!", "hi!", label49, label50, 1);
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        aSMifierMethodVisitor34.visitLineNumber(8, label54);
        aSMifierMethodVisitor18.visitLineNumber(118, label54);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor58 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor58.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor58.visitIincInsn((int) (short) 100, (int) (short) 1);
        aSMifierMethodVisitor58.visitTypeInsn((int) (short) 1, "hi!");
        org.mockito.asm.Label label73 = null;
        org.mockito.asm.Label label74 = null;
        aSMifierMethodVisitor58.visitLocalVariable("hi!", "hi!", "hi!", label73, label74, 1);
        org.mockito.asm.Label label78 = new org.mockito.asm.Label();
        aSMifierMethodVisitor58.visitLineNumber(8, label78);
        aSMifierMethodVisitor18.visitLineNumber(151060480, label78);
        java.lang.Object obj81 = label78.info;
        aSMifierMethodVisitor0.visitLineNumber((int) ' ', label78);
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 30066, 1231976041);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(labelArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test17749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17749");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitVarInsn(2, (int) (byte) -1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 100, "");
        aSMifierMethodVisitor0.visitInsn(8);
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter("hi!");
        printWriter10.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        printWriter10.print(0.0d);
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter((java.io.Writer) printWriter10, true);
        printWriter17.write("L142696279");
        java.util.Locale locale20 = null;
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter23 = printWriter17.printf(locale20, "L1105153118", (java.lang.Object[]) strArray22);
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter33.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor45 = classWriter33.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter33.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter33.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) 1.0f);
        java.io.PrintWriter printWriter58 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor59 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter58);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor59.visit(2, (int) (byte) 0, "", "", "", strArray68);
        classWriter33.visit((int) 'a', (int) '#', "", "", "hi!", strArray68);
        aSMifierClassVisitor26.visit((int) (byte) -1, 1, "hi!", "hi!", "hi!", strArray68);
        java.io.PrintWriter printWriter72 = printWriter17.format("", (java.lang.Object[]) strArray68);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) strArray68);
        org.mockito.asm.Label label75 = null;
        aSMifierMethodVisitor0.visitLineNumber(15, label75);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 13, "L1473861125");
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitVarInsn((int) (short) 25929, 332);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25929");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(printWriter72);
    }

    @Test
    public void test17750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17750");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((int) 'a');
        printWriter1.println("");
        java.io.PrintWriter printWriter6 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor7 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter6);
        aSMifierClassVisitor7.visitInnerClass("", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor7.visitAnnotation("", false);
        printWriter1.print((java.lang.Object) false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter19 = printWriter1.append(' ');
        printWriter1.println(true);
        printWriter1.println(false);
        printWriter1.println();
        printWriter1.close();
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor26.visitInnerClass("", "L723576843", "", 16);
        aSMifierClassVisitor26.visitInnerClass("L104358438", "L119989099", "L1150302951", 123);
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierClassVisitor26.visitAnnotation("L519300220", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor26.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
    }

    @Test
    public void test17751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17751");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter10 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor11 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "" };
        aSMifierClassVisitor11.visit(2, (int) (byte) 0, "", "", "", strArray20);
        aSMifierClassVisitor1.visit((int) (short) 0, 5, "hi!", "hi!", "hi!", strArray20);
        aSMifierClassVisitor1.visitSource("L834812042", "L1775421725");
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor1.visitAnnotation("L351643771", false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(annotationVisitor28);
    }

    @Test
    public void test17752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17752");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((-889275714));
        java.util.Locale locale4 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor6 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor8.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label14 = null;
        int[] intArray16 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor8.visitLookupSwitchInsn(label14, intArray16, labelArray17);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor19.visitMethodInsn(100, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label25 = null;
        int[] intArray27 = new int[] { 1 };
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor19.visitLookupSwitchInsn(label25, intArray27, labelArray28);
        aSMifierMethodVisitor6.visitLookupSwitchInsn(label7, intArray16, labelArray28);
        java.io.PrintWriter printWriter31 = printWriter1.format(locale4, "hi!", (java.lang.Object[]) labelArray28);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor32.visitMethodInsn(100, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor32.visitIntInsn((int) ' ', (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierMethodVisitor32.visitParameterAnnotation((int) '#', "", false);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor32.visitParameterAnnotation((-1), "", false);
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor32.visitLabel(label52);
        printWriter31.println((java.lang.Object) label52);
        java.io.PrintWriter printWriter56 = printWriter31.append('a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor57 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        aSMifierClassVisitor57.visitInnerClass("", "L237245406", "", 15);
        aSMifierClassVisitor57.visitInnerClass("L836986691", "L459227517", "L834812042", 0);
        aSMifierClassVisitor57.visitSource("L1905158729", "L821985585");
        aSMifierClassVisitor57.visitSource("L1103251756", "L1544572272");
        aSMifierClassVisitor57.visitOuterClass("L1869964633", "L603155286", "L628367935");
        java.util.List list78 = aSMifierClassVisitor57.getText();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
        org.junit.Assert.assertNotNull(labelArray17);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1]");
        org.junit.Assert.assertNotNull(labelArray28);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(list78);
    }
}
