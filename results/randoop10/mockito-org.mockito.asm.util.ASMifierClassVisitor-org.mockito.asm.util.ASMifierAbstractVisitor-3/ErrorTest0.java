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
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor13 = classWriter1.visitField(0, "", "", "hi!", (java.lang.Object) 1);
        classWriter1.visitEnd();
        classWriter1.visitSource("L1005534082", "L811736860");
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.MethodVisitor methodVisitor23 = classWriter1.visitMethod(0, "L93236838", "L1955027908", "L824798475", strArray22);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", true);
        java.lang.String[] strArray15 = org.mockito.asm.util.AbstractVisitor.TYPES;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.MethodVisitor methodVisitor16 = classWriter1.visitMethod((int) (short) 8451, "L849350632", "L1771350166", "L248576614", strArray15);
    }
}

