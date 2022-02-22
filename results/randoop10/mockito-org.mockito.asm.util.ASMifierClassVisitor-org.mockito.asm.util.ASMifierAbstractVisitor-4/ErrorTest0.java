import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        classWriter1.visitInnerClass("hi!", "", "", 3);
        classWriter1.visitSource("L994489370", "L1669980843");
        int int15 = classWriter1.newNameType("L326432149", "");
        int int19 = classWriter1.newField("L834812042", "L1749641217", "L1105153118");
        classWriter1.visitInnerClass("L1544572272", "L801849928", "L911973346", 3);
        classWriter1.visitInnerClass("L1532047758", "L298663367", "L575352164", (int) (byte) 10);
        java.io.PrintWriter printWriter35 = new java.io.PrintWriter("hi!");
        printWriter35.print((-889275714));
        printWriter35.write("");
        printWriter35.write("L994489370");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter35);
        java.io.PrintWriter printWriter49 = new java.io.PrintWriter("hi!");
        printWriter49.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor52 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter65.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = classWriter65.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor77 = classWriter65.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray78 = classWriter65.toByteArray();
        org.mockito.asm.ByteVector byteVector81 = byteVector61.putByteArray(byteArray78, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader82 = new org.mockito.asm.ClassReader(byteArray78);
        long long84 = classReader82.readLong((int) (byte) 100);
        long long86 = classReader82.readLong((int) (byte) 10);
        java.lang.String[] strArray87 = classReader82.getInterfaces();
        aSMifierClassVisitor52.visit((int) (byte) 1, (-1), "", "hi!", "", strArray87);
        java.lang.String[] strArray93 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor94 = aSMifierClassVisitor52.visitMethod((int) (short) 0, "L459227517", "L1715840275", "L96121905", strArray93);
        aSMifierClassVisitor42.visit((int) (short) 100, 2, "L326432149", "L1434348811", "hi!", strArray93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter1.visitMethod(11, "L821985585", "L61669440", "L1441782014", strArray93);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter("hi!");
        printWriter19.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        printWriter19.print(0.0d);
        printWriter19.print((float) (-3819410108757049344L));
        printWriter19.write(13);
        printWriter19.flush();
        printWriter19.println(true);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter("hi!");
        printWriter34.print((-889275714));
        printWriter34.write("");
        printWriter34.write("L994489370");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor41 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        java.io.PrintWriter printWriter48 = new java.io.PrintWriter("hi!");
        printWriter48.print((int) 'a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor51 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putByte((int) ' ');
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter64.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = classWriter64.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor76 = classWriter64.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        byte[] byteArray77 = classWriter64.toByteArray();
        org.mockito.asm.ByteVector byteVector80 = byteVector60.putByteArray(byteArray77, (int) (byte) 1, 0);
        org.mockito.asm.ClassReader classReader81 = new org.mockito.asm.ClassReader(byteArray77);
        long long83 = classReader81.readLong((int) (byte) 100);
        long long85 = classReader81.readLong((int) (byte) 10);
        java.lang.String[] strArray86 = classReader81.getInterfaces();
        aSMifierClassVisitor51.visit((int) (byte) 1, (-1), "", "hi!", "", strArray86);
        java.lang.String[] strArray92 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor93 = aSMifierClassVisitor51.visitMethod((int) (short) 0, "L459227517", "L1715840275", "L96121905", strArray92);
        aSMifierClassVisitor41.visit((int) (short) 100, 2, "L326432149", "L1434348811", "hi!", strArray92);
        java.io.PrintWriter printWriter95 = printWriter19.printf("L1853824624", (java.lang.Object[]) strArray92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter1.visitMethod(16780108, "L1968646166", "L1813264043", "L954744343", strArray92);
    }
}

