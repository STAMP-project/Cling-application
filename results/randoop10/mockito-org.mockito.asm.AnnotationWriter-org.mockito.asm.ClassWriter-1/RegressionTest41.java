import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(100);
        byte[] byteArray2 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("hi!", "\007\000", "\007\000", (int) (byte) 0);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter14.visitEnd();
        byte[] byteArray16 = classWriter14.toByteArray();
        org.mockito.asm.ClassReader classReader17 = new org.mockito.asm.ClassReader(byteArray16);
        org.mockito.asm.ClassReader classReader18 = new org.mockito.asm.ClassReader(byteArray16);
        org.mockito.asm.ClassReader classReader21 = new org.mockito.asm.ClassReader(byteArray16, 2, (int) (short) -1);
        int int22 = classReader21.header;
        java.lang.String[] strArray23 = classReader21.getInterfaces();
        classWriter1.visit(256, (int) (short) 97, "", "\001", "hi!", strArray23);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitFieldInsn((int) (byte) 100, "hi!", "hi!", "");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int81 = classWriter76.newMethod("", "", "hi!", false);
        int int83 = classWriter76.newUTF8("");
        methodVisitor69.visitLdcInsn((java.lang.Object) int83);
        org.mockito.asm.Label label85 = null;
        org.mockito.asm.Label label86 = null;
        org.mockito.asm.Label label87 = null;
        methodVisitor69.visitTryCatchBlock(label85, label86, label87, "\007\000");
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = methodVisitor69.visitAnnotation("\001", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor93 = methodVisitor69.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor92);
        org.junit.Assert.assertNotNull(annotationVisitor93);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter1.visitAnnotation("", false);
        byte[] byteArray23 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray23);
        java.lang.String str25 = classReader24.getSuperName();
        int int27 = classReader24.readInt(10);
        int int28 = classReader24.header;
        int int30 = classReader24.readUnsignedShort(16);
        byte[] byteArray31 = classReader24.b;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassReader classReader34 = new org.mockito.asm.ClassReader(byteArray31, 154, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16778088 + "'", int27 == 16778088);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 103 + "'", int28 == 103);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 256 + "'", int30 == 256);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter1.visitAnnotation("", false);
        byte[] byteArray23 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray23);
        int int25 = classReader24.getAccess();
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(classReader24, (-1));
        java.lang.String str28 = classReader24.getClassName();
        java.lang.String str29 = classReader24.getSuperName();
        int int31 = classReader24.readUnsignedShort((int) (byte) 100);
        java.lang.String str32 = classReader24.getSuperName();
        java.lang.String str33 = classReader24.getClassName();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 28526 + "'", int31 == 28526);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitIincInsn(2, (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotation("", true);
        methodVisitor69.visitCode();
        methodVisitor69.visitFieldInsn(1, "", "hi!", "");
        methodVisitor69.visitIntInsn((-21316096), 132864);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = methodVisitor69.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor88 = annotationVisitor86.visitArray("\001");
        org.mockito.asm.AnnotationVisitor annotationVisitor90 = annotationVisitor86.visitArray("\007\000");
        annotationVisitor90.visitEnum("\001", "hi!", "\007\000");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertNotNull(annotationVisitor88);
        org.junit.Assert.assertNotNull(annotationVisitor90);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitTypeInsn(65210, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitIincInsn((int) (short) -1, (int) (byte) -1);
        methodVisitor69.visitInsn((int) (short) 0);
        methodVisitor69.visitEnd();
        methodVisitor69.visitMultiANewArrayInsn("hi!", (int) (byte) 0);
        org.mockito.asm.Label label83 = null;
        org.mockito.asm.Label label84 = null;
        org.mockito.asm.Label label85 = null;
        methodVisitor69.visitTryCatchBlock(label83, label84, label85, "");
        methodVisitor69.visitVarInsn((int) (short) 256, 103);
        methodVisitor69.visitVarInsn(872, 1768057957);
        methodVisitor69.visitInsn(192);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        int int5 = classWriter1.newField("", "", "hi!");
        int int7 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", true);
        classWriter1.visitEnd();
        classWriter1.visitSource("\007\000", "\007\000");
        int int19 = classWriter1.newMethod("\001", "hi!", "\001", true);
        int int24 = classWriter1.newMethod("\001", "", "hi!", true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        java.lang.String[] strArray5 = classReader4.getInterfaces();
        int int7 = classReader4.readInt((int) (byte) 0);
        java.lang.String str8 = classReader4.getSuperName();
        java.lang.String[] strArray9 = classReader4.getInterfaces();
        byte[] byteArray10 = classReader4.b;
        int int11 = classReader4.header;
        long long13 = classReader4.readLong((int) (byte) 0);
        byte[] byteArray14 = classReader4.b;
        int int15 = classReader4.getAccess();
        java.lang.String[] strArray16 = classReader4.getInterfaces();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-889275714) + "'", int7 == (-889275714));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3819410108757049344L) + "'", long13 == (-3819410108757049344L));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter26.visitEnd();
        classWriter26.visitSource("", "");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter26, 100);
        int int34 = classReader20.readByte(1);
        byte[] byteArray35 = classReader20.b;
        org.mockito.asm.ClassReader classReader38 = new org.mockito.asm.ClassReader(byteArray35, (int) (byte) 0, 100);
        int int40 = classReader38.readUnsignedShort(1);
        int int42 = classReader38.getItem(0);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int49 = classWriter44.newMethod("", "", "hi!", false);
        classWriter44.visitEnd();
        int int52 = classWriter44.newClass("");
        int int54 = classWriter44.newUTF8("\007\000");
        byte[] byteArray55 = classWriter44.toByteArray();
        classReader38.accept((org.mockito.asm.ClassVisitor) classWriter44, 3);
        java.lang.String str58 = classReader38.getClassName();
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter(classReader38, 7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 254 + "'", int34 == 254);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 65210 + "'", int40 == 65210);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 10, 0, 2, 0, 4, 1, 0, 3, 7, -64, -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        long long26 = classReader20.readLong(7);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = classWriter28.visitAnnotation("", true);
        int int34 = classWriter28.newNameType("hi!", "hi!");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter28, (int) (byte) 0);
        java.lang.String str37 = classReader20.getClassName();
        int int39 = classReader20.readInt(28);
        int int40 = classReader20.header;
        int int41 = classReader20.getAccess();
        int int43 = classReader20.getItem(7);
        java.lang.String[] strArray44 = classReader20.getInterfaces();
        int int46 = classReader20.readUnsignedShort(0);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 6989595422067222633L + "'", long26 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1399416686 + "'", int39 == 1399416686);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 73 + "'", int40 == 73);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 51 + "'", int43 == 51);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 51966 + "'", int46 == 51966);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitInnerClass("", "hi!", "hi!", 10);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter13.visitEnd();
        classWriter13.visitSource("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter13.visit((int) 'a', (int) '4', "", "hi!", "", strArray29);
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter37.visitEnd();
        classWriter37.visitSource("hi!", "");
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter37.visit((int) 'a', (int) '4', "", "hi!", "", strArray53);
        classWriter13.visit((int) (byte) 1, 100, "", "hi!", "", strArray53);
        classWriter1.visit((int) '4', (int) (short) 100, "", "", "", strArray53);
        int int59 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter66.visitEnd();
        byte[] byteArray68 = classWriter66.toByteArray();
        org.mockito.asm.ClassReader classReader69 = new org.mockito.asm.ClassReader(byteArray68);
        java.lang.String[] strArray70 = classReader69.getInterfaces();
        java.lang.String str71 = classReader69.getSuperName();
        int int72 = classReader69.header;
        java.lang.String[] strArray73 = classReader69.getInterfaces();
        classWriter1.visit((int) (byte) 100, 7, "hi!", "hi!", "hi!", strArray73);
        classWriter1.visitEnd();
        int int77 = classWriter1.newClass("\007\000");
        int int81 = classWriter1.newField("", "\007\000", "");
        classWriter1.visitInnerClass("hi!", "", "\007\000", 16779008);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 7 + "'", int77 == 7);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 9 + "'", int81 == 9);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int15 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int17 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        java.lang.String[] strArray21 = classReader20.getInterfaces();
        java.lang.String str22 = classReader20.getSuperName();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = classReader20.getItem(154);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 154");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 4, 0, 2, 0, 4, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = methodVisitor69.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor74 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitVarInsn(132864, 28263);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor74);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter26.visitEnd();
        classWriter26.visitSource("", "");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter26, 100);
        java.lang.String[] strArray33 = classReader20.getInterfaces();
        int int35 = classReader20.readInt(13);
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter37.visitEnd();
        classWriter37.visitSource("hi!", "");
        classWriter37.visitEnd();
        byte[] byteArray43 = classWriter37.toByteArray();
        int int47 = classWriter37.newField("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = classWriter37.visitAnnotation("", true);
        int int53 = classWriter37.newNameType("", "hi!");
        byte[] byteArray54 = classWriter37.toByteArray();
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter37, 13);
        java.lang.String str57 = classReader20.getClassName();
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter(classReader20, 0);
        int int61 = classReader20.readByte((int) (short) 10);
        long long63 = classReader20.readLong(51);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1751720193 + "'", int35 == 1751720193);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 7 + "'", int47 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 0, 7, 0, 4, 12, 0, 4, 0, 4, 9, 0, 5, 0, 6, 12, 0, 4, 0, 1, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0, 0, 9, 0, 0, 0, 6, 0, 1, 0, 4, 0, 0]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 5721237711119205L + "'", long63 == 5721237711119205L);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int6 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter16.visitAnnotation("", true);
        classWriter16.visitSource("", "");
        classWriter16.visitSource("", "hi!");
        int int29 = classWriter16.newField("hi!", "hi!", "hi!");
        int int33 = classWriter16.newField("hi!", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor34 = classWriter1.visitField((int) (byte) 100, "hi!", "", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = fieldVisitor34.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = fieldVisitor34.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = fieldVisitor34.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int13 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitInnerClass("", "\001", "", 15);
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor21);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(115);
        classWriter1.visitOuterClass("\001", "hi!", "");
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(10);
        methodVisitor69.visitVarInsn(0, 4);
        methodVisitor69.visitMultiANewArrayInsn("hi!", 26913);
        methodVisitor69.visitVarInsn((int) (short) 10, 88);
        methodVisitor69.visitIntInsn(0, (-1161953280));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter25.visitEnd();
        classWriter25.visitSource("hi!", "");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter25.visit((int) 'a', (int) '4', "", "hi!", "", strArray41);
        classWriter1.visit(2, 7, "", "", "hi!", strArray41);
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("\007\000", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = classWriter1.visitAnnotation("hi!", false);
        int int53 = classWriter1.newUTF8("\007\000");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor16 = classWriter1.visitField(10, "hi!", "hi!", "hi!", (java.lang.Object) 1);
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitSource("", "");
        int int26 = classWriter1.newNameType("", "");
        classWriter1.visitInnerClass("", "\007\000", "", 5);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int38 = classWriter33.newMethod("", "", "hi!", false);
        classWriter33.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = classWriter33.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = classWriter48.visitAnnotation("", true);
        classWriter48.visitSource("", "");
        classWriter48.visitSource("", "hi!");
        int int61 = classWriter48.newField("hi!", "hi!", "hi!");
        int int65 = classWriter48.newField("hi!", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor66 = classWriter33.visitField((int) (byte) 100, "hi!", "", "hi!", (java.lang.Object) "hi!");
        int int67 = classWriter1.newConst((java.lang.Object) "");
        classWriter1.visitOuterClass("", "\001", "hi!");
        java.lang.Class<?> wildcardClass72 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertNotNull(fieldVisitor16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 5 + "'", int65 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 8 + "'", int67 == 8);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        classWriter1.visitEnd();
        byte[] byteArray7 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = classWriter13.visitAnnotation("", true);
        classWriter13.visitSource("", "");
        classWriter13.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter13.visitField(10, "hi!", "hi!", "hi!", (java.lang.Object) 1);
        classWriter13.visitOuterClass("", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter1.visitField(100, "", "hi!", "", (java.lang.Object) "");
        fieldVisitor33.visitEnd();
        fieldVisitor33.visitEnd();
        fieldVisitor33.visitEnd();
        fieldVisitor33.visitEnd();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor33);
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitIincInsn(2, (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotation("", true);
        methodVisitor69.visitMethodInsn(65210, "", "", "hi!");
        methodVisitor69.visitCode();
        methodVisitor69.visitTypeInsn(51966, "hi!");
        methodVisitor69.visitVarInsn(6, 1);
        methodVisitor69.visitMultiANewArrayInsn("", 256);
        methodVisitor69.visitIincInsn(202, 16777217);
        methodVisitor69.visitMaxs((int) (short) 2, 48640);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassReader classReader21 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(classReader21, 256);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(classReader21, (int) (short) 100);
        byte[] byteArray26 = classWriter25.toByteArray();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int37 = classWriter32.newMethod("", "", "hi!", false);
        classWriter32.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter32.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = classWriter47.visitAnnotation("", true);
        classWriter47.visitSource("", "");
        classWriter47.visitSource("", "hi!");
        int int60 = classWriter47.newField("hi!", "hi!", "hi!");
        int int64 = classWriter47.newField("hi!", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor65 = classWriter32.visitField((int) (byte) 100, "hi!", "", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = fieldVisitor65.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = annotationVisitor68.visitAnnotation("hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor72 = classWriter25.visitField(9, "", "", "", (java.lang.Object) "hi!");
        classWriter25.visitEnd();
        org.mockito.asm.ClassWriter classWriter79 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter79.visitEnd();
        byte[] byteArray81 = classWriter79.toByteArray();
        org.mockito.asm.ClassReader classReader82 = new org.mockito.asm.ClassReader(byteArray81);
        int int84 = classReader82.readUnsignedShort((int) (short) 0);
        int int85 = classReader82.header;
        int int87 = classReader82.readByte(0);
        java.lang.String[] strArray88 = classReader82.getInterfaces();
        java.lang.String[] strArray89 = classReader82.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter25.visitMethod(33554688, "hi!", "hi!", "\001", strArray89);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor94 = methodVisitor90.visitParameterAnnotation(327680, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 5 + "'", int64 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 51966 + "'", int84 == 51966);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 202 + "'", int87 == 202);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(methodVisitor90);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitIincInsn(2, (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotation("", true);
        methodVisitor69.visitMethodInsn(65210, "", "", "hi!");
        methodVisitor69.visitCode();
        methodVisitor69.visitTypeInsn(51966, "hi!");
        org.mockito.asm.Label label86 = null;
        org.mockito.asm.Label label87 = null;
        org.mockito.asm.Label label88 = null;
        methodVisitor69.visitTryCatchBlock(label86, label87, label88, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitIincInsn((int) (short) -17730, (-1161953280));
        org.mockito.asm.AnnotationVisitor annotationVisitor95 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitVarInsn(17, 223337);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor91);
        org.junit.Assert.assertNotNull(annotationVisitor95);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        java.lang.String[] strArray5 = classReader4.getInterfaces();
        short short7 = classReader4.readShort((int) (byte) 1);
        java.lang.String str8 = classReader4.getSuperName();
        long long10 = classReader4.readLong(5);
        byte[] byteArray11 = classReader4.b;
        short short13 = classReader4.readShort(12);
        int int14 = classReader4.header;
        int int15 = classReader4.getAccess();
        int int16 = classReader4.header;
        int int18 = classReader4.readInt((int) (byte) 1);
        int int19 = classReader4.getAccess();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = classReader4.readByte(1536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -326 + "'", short7 == (short) -326);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 16777216L + "'", long10 == 16777216L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-21316096) + "'", int18 == (-21316096));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMultiANewArrayInsn("", (int) (short) -326);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitFieldInsn((int) (short) 256, "hi!", "", "");
        methodVisitor69.visitEnd();
        methodVisitor69.visitInsn(48640);
        methodVisitor69.visitIincInsn((int) (short) 26978, 16779008);
        methodVisitor69.visitIincInsn((int) (short) -326, 151060483);
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitCode();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor91);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("hi!", "", "hi!", 2);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter24.visitEnd();
        byte[] byteArray26 = classWriter24.toByteArray();
        org.mockito.asm.ClassReader classReader27 = new org.mockito.asm.ClassReader(byteArray26);
        java.lang.String[] strArray28 = classReader27.getInterfaces();
        int int29 = classReader27.getAccess();
        int int31 = classReader27.readUnsignedShort(4);
        int int33 = classReader27.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor34 = classWriter18.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        classWriter18.visit((int) (byte) 10, (-1), "", "", "", strArray42);
        classWriter1.visit((int) (short) 256, 8, "", "hi!", "hi!", strArray42);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = annotationVisitor47.visitArray("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = annotationVisitor49.visitArray("\001");
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = annotationVisitor51.visitArray("");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = annotationVisitor53.visitAnnotation("\001", "\001");
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = annotationVisitor56.visitAnnotation("\001", "");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(annotationVisitor59);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        java.lang.String[] strArray5 = classReader4.getInterfaces();
        int int6 = classReader4.getAccess();
        byte[] byteArray7 = classReader4.b;
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray7, 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = classReader10.getInterfaces();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", true);
        int int7 = classWriter1.newNameType("hi!", "hi!");
        int int9 = classWriter1.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classWriter1.visitAnnotation("", false);
        classWriter1.visitSource("\007\000", "");
        classWriter1.visitOuterClass("hi!", "\001", "\001");
        int int23 = classWriter1.newField("hi!", "\001", "\001");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("hi!", "", "hi!", 2);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("", false);
        int int16 = classWriter1.newUTF8("");
        int int18 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter25.visitEnd();
        byte[] byteArray27 = classWriter25.toByteArray();
        org.mockito.asm.ClassReader classReader28 = new org.mockito.asm.ClassReader(byteArray27);
        java.lang.String[] strArray29 = classReader28.getInterfaces();
        java.lang.String str30 = classReader28.getSuperName();
        long long32 = classReader28.readLong((int) (byte) 0);
        java.lang.String[] strArray33 = classReader28.getInterfaces();
        int int34 = classReader28.getAccess();
        java.lang.String str35 = classReader28.getSuperName();
        java.lang.String[] strArray36 = classReader28.getInterfaces();
        classWriter1.visit(1792, 2304, "hi!", "hi!", "\001", strArray36);
        int int40 = classWriter1.newNameType("\001", "\001");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter46.visitEnd();
        classWriter46.visitSource("hi!", "");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter46.visit((int) 'a', (int) '4', "", "hi!", "", strArray62);
        byte[] byteArray64 = classWriter46.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = classWriter46.visitAnnotation("", false);
        org.mockito.asm.FieldVisitor fieldVisitor68 = classWriter1.visitField((int) (short) -17730, "\001", "", "", (java.lang.Object) false);
        classWriter1.visitSource("\007\000", "\007\000");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3819410108757049344L) + "'", long32 == (-3819410108757049344L));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 7 + "'", int40 == 7);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor68);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        int int6 = classReader4.readUnsignedShort((int) (short) 0);
        byte[] byteArray7 = classReader4.b;
        byte[] byteArray8 = classReader4.b;
        int int10 = classReader4.readByte(15);
        int int11 = classReader4.header;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51966 + "'", int6 == 51966);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        int int10 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter16.visitAnnotation("", true);
        classWriter16.visitSource("", "");
        classWriter16.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter16.visitField(10, "hi!", "hi!", "hi!", (java.lang.Object) 1);
        classWriter16.visitOuterClass("", "", "");
        classWriter16.visitSource("", "");
        int int41 = classWriter16.newNameType("", "hi!");
        byte[] byteArray42 = classWriter16.toByteArray();
        int int46 = classWriter16.newField("", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor47 = classWriter1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "");
        byte[] byteArray48 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader49 = new org.mockito.asm.ClassReader(byteArray48);
        org.mockito.asm.ClassReader classReader50 = new org.mockito.asm.ClassReader(byteArray48);
        long long52 = classReader50.readLong(52);
        java.lang.String str53 = classReader50.getSuperName();
        java.lang.String str54 = classReader50.getSuperName();
        java.lang.String[] strArray55 = classReader50.getInterfaces();
        java.lang.Class<?> wildcardClass56 = strArray55.getClass();
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 7, 0, 1, 12, 0, 1, 0, 1, 12, 0, 1, 0, 2, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 2, 0, 2, 0, 2, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 2, 0, 2, 0, 0, 0, 4, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 0, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 13 + "'", int46 == 13);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 2, 0, 2, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 2, 0, 2, 0, 5, 0, 0, 0, 2, 0, 4, 0, 6, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 8462937704752632687L + "'", long52 == 8462937704752632687L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int6 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitOuterClass("hi!", "\007\000", "hi!");
        int int18 = classWriter1.newField("\007\000", "hi!", "\001");
        int int21 = classWriter1.newNameType("\001", "\001");
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int15 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int17 = classWriter1.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("hi!", "hi!", "", 9);
        classWriter1.visitInnerClass("hi!", "\007\000", "hi!", (int) (short) -1);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitOuterClass("", "\001", "");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor34);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        byte[] byteArray25 = classWriter22.toByteArray();
        org.mockito.asm.ClassReader classReader26 = new org.mockito.asm.ClassReader(byteArray25);
        int int28 = classReader26.readInt((int) (byte) 10);
        byte[] byteArray29 = classReader26.b;
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(classReader26, (int) (short) 26978);
        int int32 = classReader26.header;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = classReader26.getItem(2304);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2304");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 2, 0, 2, 0, 6, 0, 4, 0, 2, 0, 4, 0, 4, 0, 4, 0, 2, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16777223 + "'", int28 == 16777223);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 2, 0, 2, 0, 6, 0, 4, 0, 2, 0, 4, 0, 4, 0, 4, 0, 2, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 73 + "'", int32 == 73);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(1);
        classWriter1.visitInnerClass("", "", "hi!", 9);
        int int10 = classWriter1.newField("\007\000", "", "\007\000");
        byte[] byteArray11 = classWriter1.toByteArray();
        int int13 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "", "\007\000", (-1));
        classWriter1.visitInnerClass("", "", "hi!", 327680);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 3, 7, -64, -128, 7, 0, 4, 12, 0, 1, 0, 4, 9, 0, 5, 0, 6, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 9]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", true);
        int int7 = classWriter1.newNameType("hi!", "hi!");
        int int9 = classWriter1.newUTF8("hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", 73);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("\001", "\001");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitIincInsn(2, (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotation("", true);
        methodVisitor69.visitMethodInsn(65210, "", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor82 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = methodVisitor69.visitAnnotation("", false);
        methodVisitor69.visitTypeInsn(0, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = methodVisitor69.visitAnnotation("", false);
        methodVisitor69.visitIincInsn(1769171298, 262147);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor82);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertNotNull(annotationVisitor92);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitIincInsn(2, (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = methodVisitor69.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitVarInsn((-21316096), 186);
        methodVisitor69.visitIincInsn(24832, 1792);
        org.mockito.asm.Label label85 = null;
        org.mockito.asm.Label label86 = null;
        org.mockito.asm.Label label87 = null;
        methodVisitor69.visitTryCatchBlock(label85, label86, label87, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(annotationVisitor78);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        byte[] byteArray25 = classWriter22.toByteArray();
        org.mockito.asm.ClassReader classReader26 = new org.mockito.asm.ClassReader(byteArray25);
        int int28 = classReader26.readInt((int) (byte) 10);
        long long30 = classReader26.readLong(103);
        java.lang.String str31 = classReader26.getSuperName();
        int int32 = classReader26.header;
        java.lang.String str33 = classReader26.getSuperName();
        int int35 = classReader26.readUnsignedShort((int) (short) 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 2, 0, 2, 0, 6, 0, 4, 0, 2, 0, 4, 0, 4, 0, 4, 0, 2, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16777223 + "'", int28 == 16777223);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 562962838716416L + "'", long30 == 562962838716416L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 73 + "'", int32 == 73);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int6 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("\007\000", "hi!", "");
        int int18 = classWriter1.newField("\007\000", "\007\000", "hi!");
        int int22 = classWriter1.newField("", "hi!", "");
        int int26 = classWriter1.newField("\001", "hi!", "\007\000");
        int int30 = classWriter1.newField("\007\000", "hi!", "");
        int int32 = classWriter1.newClass("\001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 13 + "'", int32 == 13);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        int int26 = classReader20.readUnsignedShort((int) (short) 10);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter28.visitEnd();
        classWriter28.visitSource("hi!", "");
        classWriter28.visitEnd();
        classWriter28.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter28.visitAnnotation("hi!", false);
        classWriter28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter28.visitAnnotation("hi!", true);
        classWriter28.visitEnd();
        byte[] byteArray46 = classWriter28.toByteArray();
        byte[] byteArray47 = classWriter28.toByteArray();
        int int49 = classWriter28.newClass("");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter28, (int) (byte) 0);
        classWriter28.visitEnd();
        classWriter28.visitInnerClass("", "\001", "", 0);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 256 + "'", int26 == 256);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 7, 0, 1, 12, 0, 1, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 2, 0, 1, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, 0, 2, 0, 3, 0, 7, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 7, 0, 1, 12, 0, 1, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 2, 0, 1, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, 0, 2, 0, 3, 0, 7, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(0);
        methodVisitor69.visitVarInsn(0, 83886080);
        methodVisitor69.visitIntInsn((int) (short) 1280, 3);
        org.mockito.asm.Label label79 = null;
        org.mockito.asm.Label label80 = null;
        org.mockito.asm.Label label81 = null;
        methodVisitor69.visitTryCatchBlock(label79, label80, label81, "");
        methodVisitor69.visitMultiANewArrayInsn("\007\000", 20);
        methodVisitor69.visitIincInsn(21353, 0);
        org.mockito.asm.Label label90 = null;
        int[] intArray93 = new int[] { 134283267, (short) 29813 };
        org.mockito.asm.Label label94 = null;
        org.mockito.asm.Label[] labelArray95 = new org.mockito.asm.Label[] { label94 };
        // The following exception was thrown during execution in test generation
        try {
            methodVisitor69.visitLookupSwitchInsn(label90, intArray93, labelArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[134283267, 29813]");
        org.junit.Assert.assertNotNull(labelArray95);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int6 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter19.visitAnnotation("", true);
        classWriter19.visitSource("", "");
        classWriter19.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor34 = classWriter19.visitField(10, "hi!", "hi!", "hi!", (java.lang.Object) 1);
        classWriter19.visitOuterClass("", "", "");
        classWriter19.visitSource("", "");
        int int44 = classWriter19.newNameType("", "hi!");
        byte[] byteArray45 = classWriter19.toByteArray();
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter52.visitEnd();
        byte[] byteArray54 = classWriter52.toByteArray();
        org.mockito.asm.ClassReader classReader55 = new org.mockito.asm.ClassReader(byteArray54);
        java.lang.String[] strArray56 = classReader55.getInterfaces();
        int int58 = classReader55.readInt((int) (byte) 0);
        java.lang.String str59 = classReader55.getSuperName();
        java.lang.String[] strArray60 = classReader55.getInterfaces();
        classWriter19.visit(51966, (int) (short) -1, "", "hi!", "", strArray60);
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter68.visitEnd();
        byte[] byteArray70 = classWriter68.toByteArray();
        org.mockito.asm.ClassReader classReader71 = new org.mockito.asm.ClassReader(byteArray70);
        java.lang.String[] strArray72 = classReader71.getInterfaces();
        int int73 = classReader71.getAccess();
        int int75 = classReader71.readUnsignedShort(4);
        int int77 = classReader71.readByte(5);
        java.lang.String[] strArray78 = classReader71.getInterfaces();
        classWriter19.visit(1025, 256, "", "", "\001", strArray78);
        classWriter1.visit(9, 14, "", "", "", strArray78);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 1, 0, 3, 104, 105, 33, 3, 0, 0, 0, 1, 7, 0, 1, 12, 0, 1, 0, 1, 12, 0, 1, 0, 2, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 2, 0, 2, 0, 2, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 2, 0, 2, 0, 0, 0, 4, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 0, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-889275714) + "'", int58 == (-889275714));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(strArray78);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMultiANewArrayInsn("", (int) (short) -326);
        methodVisitor69.visitFieldInsn((int) (short) -326, "hi!", "hi!", "hi!");
        methodVisitor69.visitTypeInsn(0, "");
        methodVisitor69.visitInsn((int) (short) 26913);
        methodVisitor69.visitCode();
        methodVisitor69.visitIntInsn(33, 192);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        int int26 = classReader20.readUnsignedShort((int) (short) 10);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter28.visitEnd();
        classWriter28.visitSource("hi!", "");
        classWriter28.visitEnd();
        classWriter28.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter28.visitAnnotation("hi!", false);
        classWriter28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter28.visitAnnotation("hi!", true);
        classWriter28.visitEnd();
        byte[] byteArray46 = classWriter28.toByteArray();
        byte[] byteArray47 = classWriter28.toByteArray();
        int int49 = classWriter28.newClass("");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter28, (int) (byte) 0);
        int int52 = classReader20.getAccess();
        byte[] byteArray53 = classReader20.b;
        byte[] byteArray54 = classReader20.b;
        java.lang.String str55 = classReader20.getClassName();
        byte[] byteArray56 = classReader20.b;
        org.mockito.asm.ClassReader classReader57 = new org.mockito.asm.ClassReader(byteArray56);
        int int59 = classReader57.readUnsignedShort(4);
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter(classReader57, 1919222016);
        int int62 = classReader57.getAccess();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 256 + "'", int26 == 256);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 7, 0, 1, 12, 0, 1, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 2, 0, 1, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, 0, 2, 0, 3, 0, 7, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 7, 0, 1, 12, 0, 1, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 2, 0, 1, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, 0, 2, 0, 3, 0, 7, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(1);
        classWriter1.visitOuterClass("\007\000", "\007\000", "");
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        classWriter7.visitSource("hi!", "");
        classWriter7.visitEnd();
        classWriter7.visitEnd();
        byte[] byteArray14 = classWriter7.toByteArray();
        classWriter7.visitOuterClass("", "", "\007\000");
        int int19 = classWriter1.newConst((java.lang.Object) "");
        classWriter1.visitInnerClass("hi!", "\001", "", 1869967971);
        int int26 = classWriter1.newClass("\001");
        java.lang.String[] strArray32 = null;
        classWriter1.visit(134283267, 1025, "hi!", "\007\000", "", strArray32);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(10);
        methodVisitor69.visitInsn(3);
        methodVisitor69.visitEnd();
        methodVisitor69.visitIincInsn(0, 2305);
        methodVisitor69.visitCode();
        org.mockito.asm.Label label84 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodVisitor69.visitLineNumber(51, label84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter22.visitEnd();
        byte[] byteArray24 = classWriter22.toByteArray();
        org.mockito.asm.ClassReader classReader25 = new org.mockito.asm.ClassReader(byteArray24);
        java.lang.String[] strArray26 = classReader25.getInterfaces();
        classWriter1.visit(151060483, (int) (short) 1280, "hi!", "", "", strArray26);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(12);
        org.mockito.asm.FieldVisitor fieldVisitor34 = classWriter1.visitField(196613, "", "\001", "\001", (java.lang.Object) 12);
        int int39 = classWriter1.newMethod("\007\000", "\007\000", "", false);
        int int43 = classWriter1.newField("\001", "hi!", "");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11 + "'", int39 == 11);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 14 + "'", int43 == 14);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitTypeInsn(65210, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitIincInsn((int) (short) -1, (int) (byte) -1);
        methodVisitor69.visitInsn((int) (short) 0);
        methodVisitor69.visitIincInsn((-1), 7);
        methodVisitor69.visitEnd();
        methodVisitor69.visitMaxs((int) (short) 3, (-1107296256));
        methodVisitor69.visitVarInsn(3, 73);
        methodVisitor69.visitIntInsn(1025, 111);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        int int6 = classReader4.readByte(1);
        int int8 = classReader4.readUnsignedShort(1);
        byte[] byteArray9 = classReader4.b;
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        org.mockito.asm.ClassReader classReader11 = new org.mockito.asm.ClassReader(byteArray9);
        org.mockito.asm.ClassReader classReader12 = new org.mockito.asm.ClassReader(byteArray9);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 254 + "'", int6 == 254);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65210 + "'", int8 == 65210);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter12.visitEnd();
        classWriter12.visitSource("hi!", "");
        classWriter12.visitEnd();
        classWriter12.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter12.visitAnnotation("hi!", false);
        classWriter12.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = classWriter12.visitAnnotation("hi!", true);
        classWriter12.visitEnd();
        byte[] byteArray30 = classWriter12.toByteArray();
        classWriter12.visitEnd();
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter38.visitEnd();
        byte[] byteArray40 = classWriter38.toByteArray();
        org.mockito.asm.ClassReader classReader41 = new org.mockito.asm.ClassReader(byteArray40);
        java.lang.String[] strArray42 = classReader41.getInterfaces();
        java.lang.String str43 = classReader41.getSuperName();
        long long45 = classReader41.readLong((int) (byte) 0);
        java.lang.String[] strArray46 = classReader41.getInterfaces();
        int int47 = classReader41.getAccess();
        int int49 = classReader41.readUnsignedShort((int) (short) 0);
        int int51 = classReader41.readInt(4);
        java.lang.String[] strArray52 = classReader41.getInterfaces();
        classWriter12.visit(196612, 11, "hi!", "hi!", "", strArray52);
        classWriter1.visit(2049, (int) (short) 8449, "", "", "\007\000", strArray52);
        classWriter1.visitInnerClass("\007\000", "", "\007\000", (int) (short) 10);
        org.mockito.asm.Attribute attribute60 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 7, 0, 1, 12, 0, 1, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 2, 0, 1, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, 0, 2, 0, 3, 0, 7, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-3819410108757049344L) + "'", long45 == (-3819410108757049344L));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 51966 + "'", int49 == 51966);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        byte[] byteArray25 = classWriter22.toByteArray();
        org.mockito.asm.ClassReader classReader26 = new org.mockito.asm.ClassReader(byteArray25);
        int int28 = classReader26.readInt((int) (byte) 10);
        long long30 = classReader26.readLong(103);
        byte[] byteArray31 = classReader26.b;
        org.mockito.asm.ClassReader classReader32 = new org.mockito.asm.ClassReader(byteArray31);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(classReader32, 134283267);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 2, 0, 2, 0, 6, 0, 4, 0, 2, 0, 4, 0, 4, 0, 4, 0, 2, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16777223 + "'", int28 == 16777223);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 562962838716416L + "'", long30 == 562962838716416L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 2, 0, 2, 0, 6, 0, 4, 0, 2, 0, 4, 0, 4, 0, 4, 0, 2, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 0]");
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitMethodInsn(256, "", "hi!", "");
        methodVisitor69.visitMultiANewArrayInsn("\007\000", 65210);
        methodVisitor69.visitFieldInsn(3, "", "\001", "");
        org.mockito.asm.Label label87 = null;
        org.mockito.asm.Label label88 = null;
        org.mockito.asm.Label label89 = null;
        methodVisitor69.visitTryCatchBlock(label87, label88, label89, "\007\000");
        methodVisitor69.visitEnd();
        methodVisitor69.visitTypeInsn(26, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassReader classReader21 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(classReader21, 256);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(classReader21, (int) (short) 100);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(classReader21, (int) (short) 100);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter29.visitEnd();
        classWriter29.visitSource("", "");
        int int38 = classWriter29.newMethod("", "hi!", "hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter29.visitAnnotation("", false);
        int int43 = classWriter29.newUTF8("hi!");
        classReader21.accept((org.mockito.asm.ClassVisitor) classWriter29, (int) (short) -326);
        int int47 = classReader21.readInt(10);
        int int49 = classReader21.readByte((int) (short) 0);
        byte[] byteArray50 = classReader21.b;
        java.lang.String str51 = classReader21.getClassName();
        org.mockito.asm.ClassVisitor classVisitor52 = null;
        // The following exception was thrown during execution in test generation
        try {
            classReader21.accept(classVisitor52, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 16778088 + "'", int47 == 16778088);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 202 + "'", int49 == 202);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMultiANewArrayInsn("", (int) (short) -326);
        methodVisitor69.visitIincInsn(48640, (int) (byte) 100);
        methodVisitor69.visitIincInsn(1, 100);
        org.mockito.asm.Label label82 = null;
        org.mockito.asm.Label label83 = null;
        org.mockito.asm.Label label84 = null;
        methodVisitor69.visitTryCatchBlock(label82, label83, label84, "");
        methodVisitor69.visitMultiANewArrayInsn("", 254);
        methodVisitor69.visitTypeInsn(47806, "\007\000");
        org.mockito.asm.Label label93 = null;
        org.mockito.asm.Label label94 = null;
        org.mockito.asm.Label label95 = null;
        methodVisitor69.visitTryCatchBlock(label93, label94, label95, "\001");
        methodVisitor69.visitEnd();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", false);
        java.lang.Object obj15 = null;
        org.mockito.asm.FieldVisitor fieldVisitor16 = classWriter1.visitField((-1), "", "", "", obj15);
        int int19 = classWriter1.newNameType("hi!", "hi!");
        int int22 = classWriter1.newNameType("", "");
        int int25 = classWriter1.newNameType("\001", "\007\000");
        classWriter1.visitOuterClass("\001", "\001", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("\001", "", "\007\000", 7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(fieldVisitor16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(10);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = annotationVisitor76.visitAnnotation("hi!", "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor79);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMaxs((int) (short) 0, 48640);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitInsn(256);
        methodVisitor69.visitCode();
        methodVisitor69.visitMultiANewArrayInsn("", 186);
        methodVisitor69.visitInsn(17);
        org.mockito.asm.AnnotationVisitor annotationVisitor87 = methodVisitor69.visitAnnotation("\007\000", true);
        methodVisitor69.visitVarInsn(23, 341012341);
        methodVisitor69.visitIntInsn(16777223, (int) 'a');
        methodVisitor69.visitMethodInsn((-1), "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor87);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int15 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int19 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter1.visitAnnotation("hi!", true);
        int int24 = classWriter1.newClass("hi!");
        int int26 = classWriter1.newClass("hi!");
        int int29 = classWriter1.newNameType("\007\000", "\001");
        classWriter1.visitSource("\007\000", "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter38.visitEnd();
        classWriter38.visitSource("hi!", "");
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter38.visit((int) 'a', (int) '4', "", "hi!", "", strArray54);
        byte[] byteArray56 = classWriter38.toByteArray();
        org.mockito.asm.ClassReader classReader57 = new org.mockito.asm.ClassReader(byteArray56);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader57.accept((org.mockito.asm.ClassVisitor) classWriter59, 8);
        classWriter59.visitOuterClass("", "hi!", "hi!");
        int int67 = classWriter59.newUTF8("\007\000");
        org.mockito.asm.FieldVisitor fieldVisitor68 = classWriter1.visitField((int) (short) 2, "\001", "\001", "\001", (java.lang.Object) int67);
        fieldVisitor68.visitEnd();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 6 + "'", int67 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor68);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        long long26 = classReader20.readLong(7);
        byte[] byteArray27 = classReader20.b;
        int int29 = classReader20.readByte(33);
        byte[] byteArray30 = classReader20.b;
        org.mockito.asm.ClassReader classReader31 = new org.mockito.asm.ClassReader(byteArray30);
        java.lang.String str32 = classReader31.getClassName();
        short short34 = classReader31.readShort((int) (short) 2);
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter(classReader31, 8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 6989595422067222633L + "'", long26 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 116 + "'", int29 == 116);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) -17730 + "'", short34 == (short) -17730);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn((int) 'a', (int) (short) -1);
        methodVisitor69.visitTypeInsn(13, "hi!");
        methodVisitor69.visitMaxs((int) (short) 0, (int) '4');
        methodVisitor69.visitCode();
        methodVisitor69.visitFieldInsn(0, "\007\000", "\001", "");
        methodVisitor69.visitInsn(103);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int15 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int17 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter1.visitAnnotation("", false);
        classWriter1.visitInnerClass("", "\007\000", "", (int) (short) 1);
        byte[] byteArray27 = classWriter1.toByteArray();
        int int31 = classWriter1.newField("\001", "\001", "\001");
        classWriter1.visitOuterClass("", "", "\007\000");
        int int40 = classWriter1.newMethod("\001", "\007\000", "\001", false);
        byte[] byteArray41 = classWriter1.toByteArray();
        byte[] byteArray42 = classWriter1.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassReader classReader45 = new org.mockito.asm.ClassReader(byteArray42, 1399416686, 2304);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 1, 0, 3, 7, -64, -128, 7, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4, 0, 10, 0, 0, 0, 10, 0, 1, 0, 2, 0, 8, 0, 1, 0, 1, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 19 + "'", int40 == 19);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 20, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 1, 0, 3, 7, -64, -128, 7, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 1, 1, 7, 0, 13, 12, 0, 13, 0, 13, 9, 0, 14, 0, 15, 12, 0, 1, 0, 7, 12, 0, 7, 0, 13, 10, 0, 14, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 9, 0, 0, 0, 4, 0, 2, 0, 17, 0, 10, 0, 0, 0, 10, 0, 1, 0, 2, 0, 8, 0, 1, 0, 1, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 20, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 1, 0, 3, 7, -64, -128, 7, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 1, 1, 7, 0, 13, 12, 0, 13, 0, 13, 9, 0, 14, 0, 15, 12, 0, 1, 0, 7, 12, 0, 7, 0, 13, 10, 0, 14, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 9, 0, 0, 0, 4, 0, 2, 0, 17, 0, 10, 0, 0, 0, 10, 0, 1, 0, 2, 0, 8, 0, 1, 0, 1, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(0);
        methodVisitor69.visitVarInsn(3, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitIincInsn((int) (short) 256, (-1));
        methodVisitor69.visitMaxs((-889275714), 202);
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = methodVisitor69.visitAnnotation("hi!", false);
        methodVisitor69.visitVarInsn(458754, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor85);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        byte[] byteArray5 = classReader4.b;
        byte[] byteArray6 = classReader4.b;
        int int7 = classReader4.header;
        short short9 = classReader4.readShort((int) (short) 1);
        long long11 = classReader4.readLong((int) (short) 0);
        java.lang.String str12 = classReader4.getSuperName();
        int int13 = classReader4.getAccess();
        java.lang.String str14 = classReader4.getSuperName();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = classReader4.getItem(141);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 141");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -326 + "'", short9 == (short) -326);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3819410108757049344L) + "'", long11 == (-3819410108757049344L));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter26.visitEnd();
        classWriter26.visitSource("", "");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter26, 100);
        int int36 = classWriter26.newField("hi!", "", "");
        classWriter26.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter26.visitAnnotation("hi!", true);
        classWriter26.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor40);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("\001", "\001", "hi!");
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter29.visitEnd();
        classWriter29.visitSource("hi!", "");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter29.visit((int) 'a', (int) '4', "", "hi!", "", strArray45);
        byte[] byteArray47 = classWriter29.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = classWriter29.visitAnnotation("", false);
        byte[] byteArray51 = classWriter29.toByteArray();
        org.mockito.asm.ClassReader classReader52 = new org.mockito.asm.ClassReader(byteArray51);
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter(classReader52, 2);
        java.lang.String str55 = classReader52.getClassName();
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter(classReader52, 16778088);
        classWriter57.visitEnd();
        int int61 = classWriter57.newNameType("\007\000", "\007\000");
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter67.visitEnd();
        byte[] byteArray69 = classWriter67.toByteArray();
        org.mockito.asm.ClassReader classReader70 = new org.mockito.asm.ClassReader(byteArray69);
        java.lang.String[] strArray71 = classReader70.getInterfaces();
        java.lang.String str72 = classReader70.getSuperName();
        long long74 = classReader70.readLong((int) (byte) 0);
        java.lang.String[] strArray75 = classReader70.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter57.visitMethod((int) (short) 0, "", "hi!", "hi!", strArray75);
        classWriter1.visit((int) (short) 2049, 768, "hi!", "\001", "\007\000", strArray75);
        int int80 = classWriter1.newNameType("\001", "");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-3819410108757049344L) + "'", long74 == (-3819410108757049344L));
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 12 + "'", int80 == 12);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter25.visitEnd();
        classWriter25.visitSource("hi!", "");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter25.visit((int) 'a', (int) '4', "", "hi!", "", strArray41);
        classWriter1.visit(2, 7, "", "", "hi!", strArray41);
        classWriter1.visitEnd();
        int int46 = classWriter1.newUTF8("");
        classWriter1.visitInnerClass("", "hi!", "", (-1161953280));
        int int53 = classWriter1.newUTF8("\007\000");
        int int57 = classWriter1.newField("\007\000", "\007\000", "hi!");
        int int61 = classWriter1.newField("", "\001", "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 8 + "'", int57 == 8);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 11 + "'", int61 == 11);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn((int) 'a', (int) (short) -1);
        methodVisitor69.visitMethodInsn((int) (short) 100, "hi!", "hi!", "\007\000");
        org.mockito.asm.Label label78 = null;
        org.mockito.asm.Label label79 = null;
        org.mockito.asm.Label label80 = null;
        methodVisitor69.visitTryCatchBlock(label78, label79, label80, "");
        methodVisitor69.visitMethodInsn(0, "", "\007\000", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor88 = methodVisitor69.visitAnnotationDefault();
        annotationVisitor88.visitEnd();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor88);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitInnerClass("", "hi!", "hi!", 10);
        int int8 = classWriter1.newUTF8("hi!");
        classWriter1.visitInnerClass("hi!", "\007\000", "\007\000", (-1));
        classWriter1.visitEnd();
        java.lang.Object obj19 = null;
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter1.visitField((int) (short) 10, "", "", "hi!", obj19);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = fieldVisitor20.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = annotationVisitor23.visitAnnotation("\001", "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(0);
        methodVisitor69.visitVarInsn(3, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitFieldInsn(5, "hi!", "hi!", "");
        methodVisitor69.visitMethodInsn(65210, "hi!", "hi!", "");
        methodVisitor69.visitInsn(254);
        methodVisitor69.visitFieldInsn(73, "\007\000", "", "\007\000");
        methodVisitor69.visitVarInsn(16777217, 97);
        methodVisitor69.visitMaxs(190, 88);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int6 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("\007\000", "hi!", "");
        int int18 = classWriter1.newField("\007\000", "\007\000", "hi!");
        classWriter1.visitSource("", "");
        classWriter1.visitSource("\001", "");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("", "hi!");
        int int14 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitInnerClass("hi!", "", "", (int) ' ');
        classWriter1.visitSource("", "");
        int int24 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "", 1919222016);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (short) 3);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter1.visitAnnotation("\001", false);
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(annotationVisitor40);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        java.lang.String[] strArray5 = classReader4.getInterfaces();
        int int7 = classReader4.readUnsignedShort(1);
        long long9 = classReader4.readLong(0);
        byte[] byteArray10 = classReader4.b;
        short short12 = classReader4.readShort(17);
        java.lang.Class<?> wildcardClass13 = classReader4.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65210 + "'", int7 == 65210);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3819410108757049344L) + "'", long9 == (-3819410108757049344L));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        java.lang.String[] strArray5 = classReader4.getInterfaces();
        int int7 = classReader4.readInt((int) (byte) 0);
        java.lang.String str8 = classReader4.getSuperName();
        java.lang.String[] strArray9 = classReader4.getInterfaces();
        java.lang.String[] strArray10 = classReader4.getInterfaces();
        int int12 = classReader4.readInt(0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = classReader4.readUnsignedShort(262147);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-889275714) + "'", int7 == (-889275714));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-889275714) + "'", int12 == (-889275714));
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        byte[] byteArray25 = classWriter22.toByteArray();
        classWriter22.visitInnerClass("\007\000", "hi!", "hi!", 20);
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter36.visitEnd();
        byte[] byteArray38 = classWriter36.toByteArray();
        org.mockito.asm.ClassReader classReader39 = new org.mockito.asm.ClassReader(byteArray38);
        int int41 = classReader39.readUnsignedShort((int) (short) 0);
        byte[] byteArray42 = classReader39.b;
        byte[] byteArray43 = classReader39.b;
        int int44 = classReader39.header;
        org.mockito.asm.FieldVisitor fieldVisitor45 = classWriter22.visitField(6, "", "", "\001", (java.lang.Object) int44);
        classWriter22.visitSource("hi!", "\001");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 2, 0, 2, 0, 6, 0, 4, 0, 2, 0, 4, 0, 4, 0, 4, 0, 2, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 51966 + "'", int41 == 51966);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor45);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(256);
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter8.visitEnd();
        classWriter8.visitSource("hi!", "");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter8.visit((int) 'a', (int) '4', "", "hi!", "", strArray24);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        classWriter8.visit(2, 7, "", "", "hi!", strArray48);
        classWriter8.visitOuterClass("", "hi!", "\007\000");
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter61.visitEnd();
        byte[] byteArray63 = classWriter61.toByteArray();
        org.mockito.asm.ClassReader classReader64 = new org.mockito.asm.ClassReader(byteArray63);
        org.mockito.asm.ClassReader classReader65 = new org.mockito.asm.ClassReader(byteArray63);
        org.mockito.asm.ClassReader classReader68 = new org.mockito.asm.ClassReader(byteArray63, 2, (int) (short) -1);
        java.lang.String[] strArray69 = classReader68.getInterfaces();
        classWriter8.visit(0, 1751720193, "\007\000", "", "hi!", strArray69);
        org.mockito.asm.FieldVisitor fieldVisitor71 = classWriter1.visitField(256, "", "\007\000", "", (java.lang.Object) "hi!");
        fieldVisitor71.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = fieldVisitor71.visitAnnotation("\001", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = fieldVisitor71.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute79 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldVisitor71.visitAttribute(attribute79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(fieldVisitor71);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(annotationVisitor78);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMultiANewArrayInsn("", (int) (short) -326);
        methodVisitor69.visitIincInsn(1763770624, 4);
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = methodVisitor69.visitAnnotationDefault();
        org.mockito.asm.Label label82 = null;
        org.mockito.asm.Label[] labelArray83 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodVisitor69.visitTableSwitchInsn((int) (short) 97, 16784210, label82, labelArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor79);
        org.junit.Assert.assertNotNull(labelArray83);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("", "hi!");
        int int14 = classWriter1.newField("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter21.visitEnd();
        byte[] byteArray23 = classWriter21.toByteArray();
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray23);
        java.lang.String[] strArray25 = classReader24.getInterfaces();
        classWriter1.visit(5, (int) (short) 10, "", "hi!", "hi!", strArray25);
        int int29 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitInnerClass("", "", "", 47806);
        int int36 = classWriter1.newUTF8("");
        classWriter1.visitInnerClass("hi!", "", "hi!", 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter1.visitAnnotation("\007\000", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = classWriter1.visitAnnotation("\001", false);
        classWriter1.visitOuterClass("hi!", "", "\007\000");
        byte[] byteArray52 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter58.visitEnd();
        byte[] byteArray60 = classWriter58.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = classWriter58.visitAnnotation("", false);
        int int65 = classWriter58.newUTF8("\007\000");
        classWriter58.visitSource("\007\000", "");
        org.mockito.asm.FieldVisitor fieldVisitor69 = classWriter1.visitField((int) (byte) 0, "hi!", "\007\000", "\001", (java.lang.Object) "\007\000");
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter((int) (short) 24832);
        int int79 = classWriter75.newField("\001", "\001", "");
        org.mockito.asm.FieldVisitor fieldVisitor80 = classWriter1.visitField(16, "\007\000", "", "hi!", (java.lang.Object) "\001");
        org.mockito.asm.Attribute attribute81 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldVisitor80.visitAttribute(attribute81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor69);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5 + "'", int79 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor80);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-889275714));
        classWriter1.visitEnd();
        classWriter1.visitSource("", "\007\000");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(annotationVisitor9);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        int int9 = classWriter1.newField("", "hi!", "hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        byte[] byteArray15 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "", "hi!", (-1161953280));
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 9, 0, 3, 0, 4, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter1.visitAnnotation("", false);
        byte[] byteArray23 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray23);
        java.lang.String str25 = classReader24.getSuperName();
        int int27 = classReader24.readInt(10);
        short short29 = classReader24.readShort(11);
        java.lang.String str30 = classReader24.getClassName();
        byte[] byteArray31 = classReader24.b;
        org.mockito.asm.ClassReader classReader32 = new org.mockito.asm.ClassReader(byteArray31);
        java.lang.String[] strArray33 = classReader32.getInterfaces();
        int int35 = classReader32.readByte(100);
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter(classReader32, 10);
        classWriter37.visitInnerClass("", "", "hi!", 872);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classWriter37.visitAnnotation("\007\000", false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16778088 + "'", int27 == 16778088);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 3 + "'", short29 == (short) 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 111 + "'", int35 == 111);
        org.junit.Assert.assertNotNull(annotationVisitor45);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassReader classReader21 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(classReader21, 256);
        java.lang.String str24 = classReader21.getClassName();
        java.lang.String str25 = classReader21.getSuperName();
        java.lang.String str26 = classReader21.getSuperName();
        byte[] byteArray27 = classReader21.b;
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter30.visitEnd();
        classWriter30.visitSource("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter30.visit((int) 'a', (int) '4', "", "hi!", "", strArray46);
        byte[] byteArray48 = classWriter30.toByteArray();
        org.mockito.asm.ClassReader classReader49 = new org.mockito.asm.ClassReader(byteArray48);
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader49.accept((org.mockito.asm.ClassVisitor) classWriter51, 8);
        char[] charArray60 = new char[] { '4', ' ', 'a', '#', '4' };
        java.lang.Object obj61 = classReader49.readConst((int) (short) 1, charArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = classReader21.readConst(2048, charArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2048");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "\007\000a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "\007\000a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[\007, \000, a, #, 4]");
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "\007\000" + "'", obj61, "\007\000");
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        byte[] byteArray25 = classWriter22.toByteArray();
        int int27 = classWriter22.newClass("hi!");
        classWriter22.visitInnerClass("hi!", "", "hi!", (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = classWriter22.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute36 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter22.visitAttribute(attribute36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 2, 0, 2, 0, 6, 0, 4, 0, 2, 0, 4, 0, 4, 0, 4, 0, 2, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor35);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitMultiANewArrayInsn("", 196612);
        methodVisitor69.visitMultiANewArrayInsn("", 8449);
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = methodVisitor69.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor80);
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        byte[] byteArray5 = classReader4.b;
        byte[] byteArray6 = classReader4.b;
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter8.visitEnd();
        classWriter8.visitSource("hi!", "");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter8.visit((int) 'a', (int) '4', "", "hi!", "", strArray24);
        classWriter8.visitInnerClass("hi!", "", "", (int) 'a');
        byte[] byteArray31 = classWriter8.toByteArray();
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter33.visitEnd();
        classWriter33.visitSource("hi!", "");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter33.visit((int) 'a', (int) '4', "", "hi!", "", strArray49);
        classWriter33.visitInnerClass("hi!", "", "", (int) 'a');
        int int59 = classWriter33.newField("", "hi!", "hi!");
        int int64 = classWriter33.newMethod("", "hi!", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = classWriter33.visitAnnotation("hi!", false);
        classWriter33.visitOuterClass("", "hi!", "hi!");
        int int75 = classWriter33.newField("hi!", "", "");
        int int76 = classWriter8.newConst((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            classReader4.accept((org.mockito.asm.ClassVisitor) classWriter8, 2305);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 10, 0, 1, 0, 4, 0, 3, 0, 2, 0, 97]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 6 + "'", int59 == 6);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 7 + "'", int64 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 9 + "'", int76 == 9);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("", "");
        int int8 = classWriter1.newNameType("hi!", "");
        int int12 = classWriter1.newField("hi!", "hi!", "hi!");
        int int14 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter20.visitAnnotation("", true);
        classWriter20.visitSource("", "");
        classWriter20.visitSource("", "hi!");
        int int31 = classWriter20.newClass("\007\000");
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField(65536, "", "\007\000", "\007\000", (java.lang.Object) int31);
        classWriter1.visitInnerClass("hi!", "", "\007\000", (int) (short) -326);
        classWriter1.visitInnerClass("\001", "\007\000", "\007\000", (int) '4');
        java.lang.Class<?> wildcardClass43 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int15 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int19 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", 7);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        classWriter1.visitOuterClass("\007\000", "hi!", "\007\000");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter1.visitAnnotation("\007\000", false);
        int int39 = classWriter1.newNameType("\007\000", "");
        byte[] byteArray40 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader43 = new org.mockito.asm.ClassReader(byteArray40, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = classReader43.readUnsignedShort(65792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 13 + "'", int39 == 13);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 18, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 7, 0, 3, 9, 0, 7, 0, 4, 12, 0, 3, 0, 1, 1, 0, 3, 7, -64, -128, 7, 0, 10, 12, 0, 3, 0, 10, 12, 0, 10, 0, 1, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 14, 0, 0, 0, 4, 0, 11, 0, 12, 0, 15, 0, 0, 0, 10, 0, 1, 0, 7, 0, 7, 0, 1, 0, 7, 0, 16, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 17, 0, 0, 0, 6, 0, 1, 0, 10, 0, 0]");
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        classWriter1.visitInnerClass("hi!", "", "", (int) 'a');
        int int27 = classWriter1.newField("", "hi!", "hi!");
        int int32 = classWriter1.newMethod("", "hi!", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = classWriter1.visitAnnotation("", false);
        classWriter1.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter47.visitEnd();
        classWriter47.visitSource("hi!", "");
        classWriter47.visitEnd();
        classWriter47.visitEnd();
        byte[] byteArray54 = classWriter47.toByteArray();
        org.mockito.asm.ClassReader classReader55 = new org.mockito.asm.ClassReader(byteArray54);
        org.mockito.asm.ClassReader classReader56 = new org.mockito.asm.ClassReader(byteArray54);
        long long58 = classReader56.readLong(51);
        byte[] byteArray59 = classReader56.b;
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter(classReader56, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter1.visitField(1763770624, "hi!", "\007\000", "", (java.lang.Object) classReader56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassReader@10b6cdc6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 7926335344172072960L + "'", long58 == 7926335344172072960L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0]");
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        byte[] byteArray6 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader7 = new org.mockito.asm.ClassReader(byteArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(classReader7, 28);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter(classReader7, (int) '#');
        int int12 = classReader7.getAccess();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = classReader7.readLong(28263);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        int int6 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter16.visitAnnotation("", true);
        classWriter16.visitSource("", "");
        classWriter16.visitSource("", "hi!");
        int int29 = classWriter16.newField("hi!", "hi!", "hi!");
        int int33 = classWriter16.newField("hi!", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor34 = classWriter1.visitField((int) (byte) 100, "hi!", "", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = fieldVisitor34.visitAnnotation("hi!", false);
        fieldVisitor34.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = fieldVisitor34.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = fieldVisitor34.visitAnnotation("\007\000", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = fieldVisitor34.visitAnnotation("\001", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor47);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        long long26 = classReader20.readLong(7);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = classWriter28.visitAnnotation("", true);
        int int34 = classWriter28.newNameType("hi!", "hi!");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter28, (int) (byte) 0);
        byte[] byteArray37 = classReader20.b;
        java.lang.String str38 = classReader20.getClassName();
        int int40 = classReader20.readByte(0);
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(classReader20, (int) (short) 256);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter44.visitEnd();
        classWriter44.visitSource("hi!", "");
        classWriter44.visitEnd();
        byte[] byteArray50 = classWriter44.toByteArray();
        int int52 = classWriter44.newClass("hi!");
        classWriter44.visitInnerClass("\007\000", "\007\000", "", (-1));
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter63.visitEnd();
        classWriter63.visitSource("hi!", "");
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter63.visit((int) 'a', (int) '4', "", "hi!", "", strArray79);
        byte[] byteArray81 = classWriter63.toByteArray();
        org.mockito.asm.ClassReader classReader82 = new org.mockito.asm.ClassReader(byteArray81);
        org.mockito.asm.ClassReader classReader83 = new org.mockito.asm.ClassReader(byteArray81);
        org.mockito.asm.ClassWriter classWriter85 = new org.mockito.asm.ClassWriter(classReader83, 256);
        java.lang.String[] strArray86 = classReader83.getInterfaces();
        java.lang.String str87 = classReader83.getClassName();
        org.mockito.asm.FieldVisitor fieldVisitor88 = classWriter44.visitField((int) (short) -326, "", "hi!", "\007\000", (java.lang.Object) str87);
        classWriter44.visitEnd();
        int int94 = classWriter44.newMethod("\007\000", "", "\001", true);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter44, 4);
        java.lang.String str97 = classReader20.getSuperName();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 6989595422067222633L + "'", long26 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 202 + "'", int40 == 202);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(fieldVisitor88);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 11 + "'", int94 == 11);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitFieldInsn(3, "hi!", "", "");
        methodVisitor69.visitMethodInsn((-1), "hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitVarInsn((-889275714), (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor84 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitVarInsn(47806, 22);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(annotationVisitor84);
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMultiANewArrayInsn("", (int) (short) -326);
        methodVisitor69.visitCode();
        methodVisitor69.visitCode();
        org.mockito.asm.Label label78 = null;
        org.mockito.asm.Label label79 = null;
        org.mockito.asm.Label label80 = null;
        methodVisitor69.visitTryCatchBlock(label78, label79, label80, "\007\000");
        methodVisitor69.visitMultiANewArrayInsn("hi!", 134283267);
        methodVisitor69.visitTypeInsn((int) (short) 17509, "hi!");
        methodVisitor69.visitIincInsn(100664320, 254);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int15 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int19 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", (-1));
        int int33 = classWriter1.newMethod("\007\000", "", "", false);
        int int38 = classWriter1.newMethod("\007\000", "", "hi!", true);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 13 + "'", int38 == 13);
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMaxs((int) (short) 0, 48640);
        methodVisitor69.visitEnd();
        org.mockito.asm.Label label77 = null;
        org.mockito.asm.Label label78 = null;
        org.mockito.asm.Label label79 = null;
        methodVisitor69.visitTryCatchBlock(label77, label78, label79, "hi!");
        methodVisitor69.visitIntInsn((int) ' ', (int) (byte) 0);
        methodVisitor69.visitIincInsn(13, 16777223);
        methodVisitor69.visitEnd();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassReader classReader21 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(classReader21, 256);
        java.lang.String[] strArray24 = classReader21.getInterfaces();
        java.lang.String[] strArray25 = classReader21.getInterfaces();
        int int26 = classReader21.getAccess();
        int int28 = classReader21.readByte(17);
        int int29 = classReader21.getAccess();
        byte[] byteArray30 = classReader21.b;
        org.mockito.asm.ClassReader classReader31 = new org.mockito.asm.ClassReader(byteArray30);
        int int33 = classReader31.readByte((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 202 + "'", int33 == 202);
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter1.visitAnnotation("", false);
        byte[] byteArray23 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray23);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(classReader24, 2);
        int int28 = classWriter26.newClass("");
        classWriter26.visitInnerClass("\007\000", "\007\000", "hi!", 11);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter26.visitAnnotation("\007\000", false);
        int int38 = classWriter26.newClass("hi!");
        int int40 = classWriter26.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter26.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor43);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitIincInsn(9, (int) 'a');
        methodVisitor69.visitMultiANewArrayInsn("", (int) (short) -326);
        methodVisitor69.visitCode();
        methodVisitor69.visitMaxs(12, 65210);
        methodVisitor69.visitInsn(119);
        org.mockito.asm.Label label83 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodVisitor69.visitJumpInsn((int) (short) 1024, label83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter26.visitEnd();
        classWriter26.visitSource("", "");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter26, 100);
        int int37 = classWriter26.newMethod("\001", "", "\001", false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter44.visitEnd();
        byte[] byteArray46 = classWriter44.toByteArray();
        org.mockito.asm.ClassReader classReader47 = new org.mockito.asm.ClassReader(byteArray46);
        int int49 = classReader47.readUnsignedShort((int) (short) 0);
        java.lang.String str50 = classReader47.getSuperName();
        short short52 = classReader47.readShort(5);
        java.lang.String[] strArray53 = classReader47.getInterfaces();
        classWriter26.visit(26729, 7, "\001", "", "", strArray53);
        int int56 = classWriter26.newClass("\007\000");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter63.visitEnd();
        classWriter63.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter74 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter74.visitEnd();
        byte[] byteArray76 = classWriter74.toByteArray();
        org.mockito.asm.ClassReader classReader77 = new org.mockito.asm.ClassReader(byteArray76);
        byte[] byteArray78 = classReader77.b;
        byte[] byteArray79 = classReader77.b;
        int int80 = classReader77.header;
        short short82 = classReader77.readShort((int) (short) 1);
        long long84 = classReader77.readLong((int) (short) 0);
        java.lang.String[] strArray85 = classReader77.getInterfaces();
        classWriter63.visit(1025, 5, "\001", "hi!", "\007\000", strArray85);
        classWriter26.visit(33554688, 23, "\007\000", "hi!", "", strArray85);
        classWriter26.visitInnerClass("hi!", "\001", "", (int) (short) 2387);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 51966 + "'", int49 == 51966);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 0 + "'", short52 == (short) 0);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) -326 + "'", short82 == (short) -326);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-3819410108757049344L) + "'", long84 == (-3819410108757049344L));
        org.junit.Assert.assertNotNull(strArray85);
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter1.visitSource("", "hi!");
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter11.visitEnd();
        classWriter11.visitSource("hi!", "");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter11.visit((int) 'a', (int) '4', "", "hi!", "", strArray27);
        classWriter1.visit((int) ' ', 48640, "hi!", "", "", strArray27);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter39.visitEnd();
        classWriter39.visitSource("hi!", "");
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter39.visit((int) 'a', (int) '4', "", "hi!", "", strArray55);
        classWriter1.visit(9, (int) (short) -17730, "hi!", "\007\000", "\001", strArray55);
        int int59 = classWriter1.newUTF8("\007\000");
        int int62 = classWriter1.newNameType("", "\001");
        int int67 = classWriter1.newMethod("\001", "", "\007\000", false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(0);
        methodVisitor69.visitVarInsn(3, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitFieldInsn(5, "hi!", "hi!", "");
        methodVisitor69.visitMethodInsn(65210, "hi!", "hi!", "");
        methodVisitor69.visitIntInsn((int) (short) 24832, (int) (short) 1280);
        methodVisitor69.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitCode();
        methodVisitor69.visitMultiANewArrayInsn("", 26913);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor91);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader20 = new org.mockito.asm.ClassReader(byteArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter22, 8);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter26.visitEnd();
        classWriter26.visitSource("", "");
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter26, 100);
        int int34 = classReader20.readByte(1);
        int int36 = classReader20.readByte((int) '4');
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter38.visitEnd();
        byte[] byteArray40 = classWriter38.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter38.visitAnnotation("", true);
        classWriter38.visitOuterClass("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = classWriter38.visitAnnotation("hi!", false);
        classWriter38.visitSource("\007\000", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classWriter38.visitAnnotation("", false);
        classReader20.accept((org.mockito.asm.ClassVisitor) classWriter38, 7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 254 + "'", int34 == 254);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor56);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitInsn(0);
        methodVisitor69.visitVarInsn(3, (int) 'a');
        methodVisitor69.visitCode();
        methodVisitor69.visitFieldInsn(5, "hi!", "hi!", "");
        methodVisitor69.visitMethodInsn(65210, "hi!", "hi!", "");
        methodVisitor69.visitInsn(254);
        methodVisitor69.visitInsn(2);
        methodVisitor69.visitVarInsn(73, 768);
        org.mockito.asm.AnnotationVisitor annotationVisitor94 = methodVisitor69.visitAnnotationDefault();
        annotationVisitor94.visitEnum("hi!", "\007\000", "\007\000");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor94);
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter1.visitAnnotation("", false);
        byte[] byteArray23 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray23);
        java.lang.String[] strArray25 = classReader24.getInterfaces();
        byte[] byteArray26 = classReader24.b;
        long long28 = classReader24.readLong(100);
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter(151060483);
        classReader24.accept((org.mockito.asm.ClassVisitor) classWriter30, 88);
        byte[] byteArray33 = classReader24.b;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = classReader24.getItem((int) (short) 5203);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5203");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 8029481630357783296L + "'", long28 == 8029481630357783296L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader4 = new org.mockito.asm.ClassReader(byteArray3);
        java.lang.String[] strArray5 = classReader4.getInterfaces();
        int int7 = classReader4.readUnsignedShort(1);
        int int9 = classReader4.readUnsignedShort(0);
        short short11 = classReader4.readShort((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter(classReader4, 8460);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65210 + "'", int7 == 65210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51966 + "'", int9 == 51966);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -326 + "'", short11 == (short) -326);
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitTypeInsn(65210, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitIincInsn((int) (short) -1, (int) (byte) -1);
        methodVisitor69.visitInsn((int) (short) 0);
        methodVisitor69.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = methodVisitor69.visitAnnotationDefault();
        methodVisitor69.visitTypeInsn((int) (short) -1, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor80);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitCode();
        methodVisitor69.visitIincInsn(2, (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = methodVisitor69.visitAnnotation("", true);
        methodVisitor69.visitCode();
        methodVisitor69.visitEnd();
        methodVisitor69.visitMaxs(12, 202);
        methodVisitor69.visitCode();
        methodVisitor69.visitMultiANewArrayInsn("\007\000", (int) (short) 3);
        methodVisitor69.visitTypeInsn(2, "hi!");
        methodVisitor69.visitInsn((int) (short) -1);
        methodVisitor69.visitEnd();
        methodVisitor69.visitMultiANewArrayInsn("", (int) (short) 29813);
        methodVisitor69.visitEnd();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor76);
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(104);
        int int3 = classWriter1.newUTF8("\001");
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter9.visitEnd();
        classWriter9.visitSource("hi!", "");
        classWriter9.visitEnd();
        classWriter9.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter9.visitAnnotation("hi!", false);
        classWriter9.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classWriter9.visitAnnotation("hi!", true);
        classWriter9.visitEnd();
        classWriter9.visitEnd();
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter34.visitEnd();
        classWriter34.visitSource("", "");
        int int41 = classWriter34.newNameType("hi!", "");
        classWriter34.visitInnerClass("\007\000", "", "hi!", 202);
        byte[] byteArray47 = classWriter34.toByteArray();
        org.mockito.asm.ClassReader classReader48 = new org.mockito.asm.ClassReader(byteArray47);
        java.lang.String[] strArray49 = classReader48.getInterfaces();
        classWriter9.visit(65210, 151060483, "", "hi!", "\001", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter1.visitMethod(1768711425, "hi!", "", "\001", strArray49);
        int int54 = classWriter1.newNameType("\001", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 2, 0, 1, 1, 0, 3, 7, -64, -128, 7, 0, 4, 7, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 10, 0, 1, 0, 5, 0, 6, 0, 2, 0, -54]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter7.visitEnd();
        byte[] byteArray9 = classWriter7.toByteArray();
        org.mockito.asm.ClassReader classReader10 = new org.mockito.asm.ClassReader(byteArray9);
        java.lang.String[] strArray11 = classReader10.getInterfaces();
        int int12 = classReader10.getAccess();
        int int14 = classReader10.readUnsignedShort(4);
        int int16 = classReader10.readByte(5);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField(7, "", "hi!", "", (java.lang.Object) 5);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        classWriter1.visit((int) (byte) 10, (-1), "", "", "", strArray25);
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter32.visitEnd();
        classWriter32.visitSource("hi!", "");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter32.visit((int) 'a', (int) '4', "", "hi!", "", strArray48);
        byte[] byteArray50 = classWriter32.toByteArray();
        org.mockito.asm.ClassReader classReader51 = new org.mockito.asm.ClassReader(byteArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter53, 8);
        long long57 = classReader51.readLong(7);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = classWriter59.visitAnnotation("", true);
        int int65 = classWriter59.newNameType("hi!", "hi!");
        classReader51.accept((org.mockito.asm.ClassVisitor) classWriter59, (int) (byte) 0);
        java.lang.String[] strArray68 = classReader51.getInterfaces();
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter1.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray68);
        methodVisitor69.visitFieldInsn(3, "hi!", "", "");
        methodVisitor69.visitInsn((-1));
        methodVisitor69.visitTypeInsn((int) (short) 1792, "\007\000");
        methodVisitor69.visitVarInsn((int) (short) 256, (int) (byte) 100);
        methodVisitor69.visitFieldInsn((int) '#', "", "", "");
        methodVisitor69.visitMultiANewArrayInsn("\007\000", (int) (short) 100);
        methodVisitor69.visitIntInsn(512, (-1107296256));
        methodVisitor69.visitMultiANewArrayInsn("", (int) '#');
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 6989595422067222633L + "'", long57 == 6989595422067222633L);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "hi!");
        int int11 = classWriter1.newField("hi!", "\007\000", "\007\000");
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter17.visitEnd();
        byte[] byteArray19 = classWriter17.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter17.visitAnnotation("", true);
        classWriter17.visitOuterClass("", "", "hi!");
        int int31 = classWriter17.newMethod("", "hi!", "hi!", true);
        int int33 = classWriter17.newUTF8("hi!");
        classWriter17.visitEnd();
        byte[] byteArray35 = classWriter17.toByteArray();
        org.mockito.asm.ClassReader classReader36 = new org.mockito.asm.ClassReader(byteArray35);
        int int38 = classReader36.readUnsignedShort(5);
        int int40 = classReader36.getItem(5);
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter1.visitField((-1161953280), "", "\007\000", "", (java.lang.Object) int40);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitOuterClass("", "\001", "\001");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 4, 0, 2, 0, 4, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 28 + "'", int40 == 28);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        classWriter1.visit((int) 'a', (int) '4', "", "hi!", "", strArray17);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter1.visitAnnotation("", false);
        byte[] byteArray23 = classWriter1.toByteArray();
        org.mockito.asm.ClassReader classReader24 = new org.mockito.asm.ClassReader(byteArray23);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) (short) 1);
        org.mockito.asm.Attribute[] attributeArray27 = new org.mockito.asm.Attribute[] {};
        classReader24.accept((org.mockito.asm.ClassVisitor) classWriter26, attributeArray27, (int) (short) 0);
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(classReader24, 6);
        long long33 = classReader24.readLong(0);
        java.lang.Class<?> wildcardClass34 = classReader24.getClass();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 8, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 3, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 97, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 52, 0, 3, 0, 3, 0, 6, 0, 4, 0, 3, 0, 4, 0, 4, 0, 4, 0, 3, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(attributeArray27);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3819410108757049247L) + "'", long33 == (-3819410108757049247L));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 1);
        classWriter1.visitEnd();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("", "", "hi!");
        int int15 = classWriter1.newMethod("", "hi!", "hi!", true);
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", 0);
        classWriter1.visitSource("", "");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 256);
        byte[] byteArray29 = classWriter1.toByteArray();
        java.lang.Object obj34 = null;
        org.mockito.asm.FieldVisitor fieldVisitor35 = classWriter1.visitField((int) 'a', "hi!", "", "hi!", obj34);
        classWriter1.visitSource("hi!", "");
        byte[] byteArray39 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 7, 0, 3, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 8, 0, 0, 0, 2, 0, 1, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 4, 0, 2, 0, 4, 0, 11, 0, 0, 0, 18, 0, 2, 0, 7, 0, 7, 0, 3, 0, 0, 0, 7, 0, 7, 0, 3, 1, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 3, 11, 0, 2, 0, 5, 7, 0, 3, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 97, 0, 3, 0, 1, 0, 1, 0, 13, 0, 0, 0, 2, 0, 3, 0, 0, 0, 5, 0, 8, 0, 0, 0, 2, 0, 3, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 4, 0, 2, 0, 4, 0, 11, 0, 0, 0, 18, 0, 2, 0, 7, 0, 7, 0, 3, 0, 0, 0, 7, 0, 7, 0, 3, 1, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }
}

